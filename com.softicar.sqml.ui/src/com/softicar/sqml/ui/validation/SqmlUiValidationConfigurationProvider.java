package com.softicar.sqml.ui.validation;

import com.google.inject.Inject;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import com.softicar.sqml.ui.preferences.SqmlPreferences;
import com.softicar.sqml.validation.ISqmlValidationConfigurationProvider;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;

public class SqmlUiValidationConfigurationProvider implements ISqmlValidationConfigurationProvider {

	@Inject private IPreferenceStoreAccess preferenceStoreAccess;

	@Override
	public ISqmlValidationConfiguration getConfiguration(Resource resource) {

		return new SqmlUiValidationConfiguration(SqmlPreferences.getProjectPreferenceStore(resource, preferenceStoreAccess));
	}
}
