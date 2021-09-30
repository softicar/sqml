package com.softicar.sqml.generator.preferences;

import org.eclipse.emf.ecore.resource.Resource;

public class SqmlDefaultGeneratorPreferencesProvider implements ISqmlGeneratorPreferencesProvider {

	@Override
	public ISqmlGeneratorPreferences getPreferences(Resource resource) {

		return SqmlDefaultGeneratorPreferences.get();
	}
}
