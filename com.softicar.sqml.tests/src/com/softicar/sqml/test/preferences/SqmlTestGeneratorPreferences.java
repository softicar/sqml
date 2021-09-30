package com.softicar.sqml.test.preferences;

import com.softicar.sqml.generator.preferences.SqmlDefaultGeneratorPreferences;

public class SqmlTestGeneratorPreferences extends SqmlDefaultGeneratorPreferences {

	@Override
	public String getI18nClass() {

		return "com.softicar.TestI18n";
	}
}
