/*
 * generated by Xtext
 */
package com.softicar.sqml.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.softicar.sqml.SqmlRuntimeModule;
import com.softicar.sqml.SqmlStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class SqmlIdeSetup extends SqmlStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new SqmlRuntimeModule(), new SqmlIdeModule()));
	}
	
}
