
package org.csu.idl.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class IDLStandaloneSetup extends IDLStandaloneSetupGenerated{

	public static void doSetup() {
		new IDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

