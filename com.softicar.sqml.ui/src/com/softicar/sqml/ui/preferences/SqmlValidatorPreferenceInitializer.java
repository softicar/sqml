package com.softicar.sqml.ui.preferences;

import com.softicar.sqml.model.validation.SqmlDefaultValidationConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;

public class SqmlValidatorPreferenceInitializer implements IPreferenceStoreInitializer {

	@Override
	public void initialize(IPreferenceStoreAccess preferenceStoreAccess) {

		SqmlDefaultValidationConfiguration defaultPreferences = SqmlDefaultValidationConfiguration.get();
		IPreferenceStore preferenceStore = preferenceStoreAccess.getWritablePreferenceStore();
		preferenceStore.setDefault(SqmlPreferences.MANDATORY_ID_COLUMN, defaultPreferences.isMandatoryIdColumn());
		preferenceStore.setDefault(SqmlPreferences.MAXIMUM_IDENTIFIER_LENGTH, defaultPreferences.getMaximumIdentifierLength());
	}
}
