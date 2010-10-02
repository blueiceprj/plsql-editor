package plsql.editor.xtext.ui.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import plsql.editor.xtext.plSql.Name;
import plsql.editor.xtext.plSql.VariableAssignmentTarget;
import plsql.editor.xtext.plSql.VariableDeclaration;
import plsql.editor.xtext.ui.labeling.PlSqlLabelProvider;

import com.google.inject.Inject;

public class PlSqlEditor extends XtextEditor {

	@Inject
	private PlSqlLabelProvider plSqlLabelProvider;

	private AnnotationModel occurrencesAnnotationModel;

	private MarkOccurrencesJob markOccurrencesJob;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		occurrencesAnnotationModel = new AnnotationModel();

		markOccurrencesJob = new MarkOccurrencesJob();
		markOccurrencesJob.setPriority(Job.DECORATE);

		AnnotationModel annotationModel = (AnnotationModel) getDocumentProvider().getAnnotationModel(
		    getEditorInput());
		annotationModel.addAnnotationModel("occurrences", occurrencesAnnotationModel);
	}

	@Override
	protected void handleCursorPositionChanged() {
		super.handleCursorPositionChanged();

		markOccurrencesJob.cancel();
		markOccurrencesJob.schedule();
	}

	private final class MarkOccurrencesUnitOfWork extends IUnitOfWork.Void<XtextResource> {

		private final TextSelection textSelection;

		private final IProgressMonitor monitor;

		public MarkOccurrencesUnitOfWork(TextSelection textSelection, IProgressMonitor monitor) {
			this.textSelection = textSelection;
			this.monitor = monitor;
		}

		@Override
		public void process(XtextResource resource) throws Exception {
			IParseResult parseResult = resource.getParseResult();
			if (parseResult != null) {
				VariableDeclaration nameDeclaration = getSelectedNameDeclaration(resource);
				if (nameDeclaration != null) {
					CompositeNode nameDeclarationNode = NodeUtil.getNode(nameDeclaration);

					if (monitor.isCanceled()) {
						return;
					}

					occurrencesAnnotationModel.removeAllAnnotations();

					if (monitor.isCanceled()) {
						return;
					}

					occurrencesAnnotationModel.addAnnotation(
					    new Annotation("plsql.editor.ui.occurrences.write", false, plSqlLabelProvider
					        .getText(nameDeclaration)),
					    new Position(nameDeclarationNode.getOffset(), nameDeclaration.getName().length()));

					if (monitor.isCanceled()) {
						return;
					}

					Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(parseResult.getRootNode());
					for (AbstractNode node : allNodes) {
						EObject element = node.getElement();
						if (element instanceof Name) {
							Name nameRef = (Name) element;
							if (nameRef.getDeclaration() == nameDeclaration) {
								CompositeNode nameNode = NodeUtil.getNode(nameRef);

								if (monitor.isCanceled()) {
									return;
								}

								String annotationType = nameRef.eContainer().eContainer().eContainer() instanceof VariableAssignmentTarget ? "plsql.editor.ui.occurrences.write"
								    : "plsql.editor.ui.occurrences";
								occurrencesAnnotationModel.addAnnotation(new Annotation(annotationType, false,
								    plSqlLabelProvider.getText(nameDeclaration)), new Position(
								    nameNode.getOffset(), nameRef.getDeclaration().getName().length()));
							}
						}
					}
				}
			}
		}

		private VariableDeclaration getSelectedNameDeclaration(XtextResource resource) {
			int offset = textSelection.getOffset();
			EObject object = EObjectAtOffsetHelper.resolveContainedElementAt(resource, offset, null);

			if (object instanceof VariableDeclaration) {
				return (VariableDeclaration) object;
			} else if (object instanceof Name) {
				Name name = (Name) object;
				if (name.getDeclaration() instanceof VariableDeclaration) {
					return (VariableDeclaration) name.getDeclaration();
				}
			}
			return null;
		}
	}

	private final class MarkOccurrencesJob extends Job {

		public MarkOccurrencesJob() {
			super("PL/SQL Editor - mark occurrences");
		}

		@Override
		protected IStatus run(final IProgressMonitor monitor) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					if (monitor.isCanceled()) {
						return;
					}

					getDocument().readOnly(
					    new MarkOccurrencesUnitOfWork((TextSelection) doGetSelection(), monitor));
				}
			});
			return Status.OK_STATUS;
		}
	}
}
