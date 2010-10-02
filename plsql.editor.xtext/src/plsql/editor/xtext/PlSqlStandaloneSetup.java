
package plsql.editor.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PlSqlStandaloneSetup extends PlSqlStandaloneSetupGenerated{

	public static void doSetup() {
		new PlSqlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

