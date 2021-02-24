/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.MetaTemplatingRuntimeModule;
import org.xtext.example.mydsl.MetaTemplatingStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class MetaTemplatingIdeSetup extends MetaTemplatingStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new MetaTemplatingRuntimeModule(), new MetaTemplatingIdeModule()));
	}
	
}
