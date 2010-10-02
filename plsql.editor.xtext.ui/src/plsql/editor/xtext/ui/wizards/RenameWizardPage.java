package plsql.editor.xtext.ui.wizards;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/* package */class RenameWizardPage extends WizardPage {

	private Text newNameText;

	protected RenameWizardPage() {
		super(RenameWizardPage.class.getName());

		setTitle("Rename");
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout(2, false));

		new Label(container, SWT.LEFT).setText("New name");
		newNameText = new Text(container, SWT.SINGLE | SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(newNameText);

		setControl(container);
	}

	public String getNewName() {
		return newNameText.getText();
	}
}
