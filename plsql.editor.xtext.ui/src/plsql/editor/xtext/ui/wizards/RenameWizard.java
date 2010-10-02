package plsql.editor.xtext.ui.wizards;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ltk.core.refactoring.DocumentChange;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import plsql.editor.xtext.plSql.Name;
import plsql.editor.xtext.plSql.NameDeclaration;
import plsql.editor.xtext.ui.internal.PlSqlActivator;

import com.google.inject.Injector;

public class RenameWizard extends Wizard {

	private final TextSelection textSelection;

	private RenameWizardPage renameWizardPage;

	public RenameWizard(TextSelection textSelection) {
		this.textSelection = textSelection;

		setWindowTitle("Rename");
	}

	@Override
	public void addPages() {
		renameWizardPage = new RenameWizardPage();
		addPage(renameWizardPage);
	}

	@Override
	public boolean performFinish() {
		Injector injector = PlSqlActivator.getInstance().getInjector("plsql.editor.xtext.PlSql");
		IDocumentEditor documentEditor = injector.getInstance(IDocumentEditor.class);

		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor();
		IXtextDocument document = xtextEditor.getDocument();

		IAnnotationModel annotationModel = xtextEditor.getDocumentProvider().getAnnotationModel(
		    xtextEditor.getEditorInput());
		annotationModel.addAnnotation(
		    new Annotation("plsql.editor.ui.occurrences", false, "none"),
		    new Position(textSelection.getOffset(), textSelection.getLength()));
		annotationModel.connect(document);

		String newName = renameWizardPage.getNewName();
		documentEditor.process(new RenameUnitOfWork(document, newName), document);

		return true;
	}

	private final class RenameUnitOfWork extends IUnitOfWork.Void<XtextResource> {

		private final IXtextDocument document;

		private final String newName;

		public RenameUnitOfWork(IXtextDocument document, String newName) {
			this.document = document;
			this.newName = newName;
		}

		@Override
		public void process(XtextResource resource) {
			try {
				IParseResult parseResult = resource.getParseResult();
				if (parseResult != null) {
					// TODO: Change the selected node as the last one to make sure that an
					// undo keeps the focus on that one (seems to be that way...)?
					NameDeclaration nameDeclaration = getSelectedNameDeclaration(resource);
					if (nameDeclaration != null) {
						MultiTextEdit textEdit = new MultiTextEdit();

						CompositeNode nameDeclarationNode = NodeUtil.getNode(nameDeclaration);
						textEdit.addChild(new ReplaceEdit(nameDeclarationNode.getOffset(), nameDeclaration
						    .getName().length(), newName));

						Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(parseResult.getRootNode());
						for (AbstractNode node : allNodes) {
							EObject element = node.getElement();
							if (element instanceof Name) {
								Name nameRef = (Name) element;
								if (nameRef.getDeclaration() == nameDeclaration) {
									CompositeNode nameNode = NodeUtil.getNode(nameRef);
									textEdit.addChild(new ReplaceEdit(nameNode.getOffset(), nameNode.getLength(),
									    newName));
								}
							}
						}

						DocumentChange documentChange = new DocumentChange("rename", document);
						documentChange.setEdit(textEdit);
						documentChange.perform(new NullProgressMonitor());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		private NameDeclaration getSelectedNameDeclaration(XtextResource resource) {
			int offset = textSelection.getOffset();
			EObject object = EObjectAtOffsetHelper.resolveContainedElementAt(resource, offset, null);

			if (object instanceof NameDeclaration) {
				return (NameDeclaration) object;
			} else if (object instanceof Name) {
				Name name = (Name) object;
				return name.getDeclaration();
			}
			return null;
		}
	}
}
