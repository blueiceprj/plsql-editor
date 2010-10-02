package plsql.editor.xtext.ui.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import plsql.editor.xtext.ui.wizards.RenameWizard;

public class RenameAction implements IWorkbenchWindowActionDelegate {

	private TextSelection textSelection;

	@Override
	public void run(IAction action) {
		if (textSelection != null) {
			RenameWizard renameWizard = new RenameWizard(textSelection);
			new WizardDialog(Display.getCurrent().getActiveShell(), renameWizard).open();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// Track the latest TextSelection.
		this.textSelection = (selection instanceof TextSelection) ? (TextSelection) selection : null;
	}

	@Override
	public void init(IWorkbenchWindow window) {
		// do nothing
	}

	@Override
	public void dispose() {
		// do nothing
	}
}
