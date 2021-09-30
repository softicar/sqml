package com.softicar.sqml.test.preferences;

import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferencesProvider;
import org.eclipse.emf.ecore.resource.Resource;

public class SqmlTestGeneratorPreferencesProvider implements ISqmlGeneratorPreferencesProvider {

	@Override
	public ISqmlGeneratorPreferences getPreferences(Resource resource) {

		return new SqmlTestGeneratorPreferences();
	}
}
