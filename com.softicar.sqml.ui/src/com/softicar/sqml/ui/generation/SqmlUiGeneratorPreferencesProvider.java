package com.softicar.sqml.ui.generation;

import com.google.inject.Inject;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferencesProvider;
import com.softicar.sqml.ui.preferences.SqmlPreferences;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;

public class SqmlUiGeneratorPreferencesProvider implements ISqmlGeneratorPreferencesProvider {

	@Inject private IPreferenceStoreAccess preferenceStoreAccess;

	@Override
	public ISqmlGeneratorPreferences getPreferences(Resource resource) {

		return new SqmlUiGeneratorPreferences(SqmlPreferences.getProjectPreferenceStore(resource, preferenceStoreAccess));
	}
}
