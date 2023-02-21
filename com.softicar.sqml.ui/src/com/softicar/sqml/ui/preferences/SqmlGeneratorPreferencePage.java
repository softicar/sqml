package com.softicar.sqml.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.xtext.ui.editor.preferences.AbstractPreferencePage;

public class SqmlGeneratorPreferencePage extends AbstractPreferencePage {

	@Override
	protected String qualifiedName() {

		return SqmlPreferences.GENERATOR_PREFIX;
	}

	@Override
	protected void createFieldEditors() {

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_JAVA_FOR_QUERIES,
				"Generate Java for Sqml &Queries",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_JAVA_FOR_TABLES,
				"Generate Java for Sqml &Tables",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_SUPPRESS_ALL_WARNINGS_FOR_QUERIES,
				"Generate @SuppressWarnings for Query Classes",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_SUPPRESS_ALL_WARNINGS_FOR_TABLES,
				"Generate @SuppressWarnings for Table Classes",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_GET_BY_ID_METHOD,
				"Generate get(Integer id) Method (legacy feature)",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_GET_ID_METHODS,
				"Generate get...ID Methods (legacy feature)",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_NULLABLE_GETTER,
				"Generate get...OrNull Methods",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.NULLABLE_GETTER_SUFFIX,
				"Suffix for get...OrNull Methods",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_OPTIONAL_GETTER,
				"Generate get...AsOptional Methods",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.OPTIONAL_GETTER_SUFFIX,
				"Suffix for get...AsOptional Methods",
				getFieldEditorParent()));

		addField(
			new BooleanFieldEditor(//
				SqmlPreferences.GENERATE_THROWING_GETTER,
				"Generate get...OrThrow Methods",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.THROWING_GETTER_SUFFIX,
				"Suffix for get...OrThrow Methods",
				getFieldEditorParent()));

		addField(
			new IntegerFieldEditor(//
				SqmlPreferences.GENERATED_QUERY_CODE_VERSION,
				"Generated Query Code Version",
				getFieldEditorParent()));

		addField(
			new IntegerFieldEditor(//
				SqmlPreferences.GENERATED_TABLE_CODE_VERSION,
				"Generated Table Code Version",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.ANNOTATION_FOR_GENERATED_CLASSES,
				"Annotation for Generated Classes",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.PREFIX_FOR_CLASS_FIELDS,
				"Prefix for Class Fields",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.PREFIX_FOR_LOAD_BY_METHODS,
				"Prefix for Load By Methods",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.TABLE_CLASS_NAME_PREFIXES,
				"Table Class Name Prefixes",
				getFieldEditorParent()));

		addField(
			new StringFieldEditor(//
				SqmlPreferences.I18N_CLASS,
				"I18n Class",
				getFieldEditorParent()));

		addField(new SqmlImportOverridesEditor(getFieldEditorParent()));
	}
}
