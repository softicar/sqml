package com.softicar.sqml.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.xtext.ui.editor.preferences.AbstractPreferencePage;

public class SqmlValidatorPreferencePage extends AbstractPreferencePage {

	@Override
	protected String qualifiedName() {

		return SqmlPreferences.VALIDATOR_PREFIX;
	}

	@Override
	protected void createFieldEditors() {

		addField(new BooleanFieldEditor(SqmlPreferences.MANDATORY_ID_COLUMN, "Id Column is Mandatory", getFieldEditorParent()));
		addField(new IntegerFieldEditor(SqmlPreferences.MAXIMUM_IDENTIFIER_LENGTH, "Maximum Identifier Length", getFieldEditorParent()));
	}
}
