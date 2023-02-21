package com.softicar.sqml.ui.preferences;

import com.softicar.sqml.generator.preferences.SqmlDefaultGeneratorPreferences;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;

public class SqmlGeneratorPreferenceInitializer implements IPreferenceStoreInitializer {

	@Override
	public void initialize(IPreferenceStoreAccess preferenceStoreAccess) {

		SqmlDefaultGeneratorPreferences defaultPreferences = SqmlDefaultGeneratorPreferences.get();
		IPreferenceStore preferenceStore = preferenceStoreAccess.getWritablePreferenceStore();
		preferenceStore.setDefault(SqmlPreferences.GENERATE_JAVA_FOR_QUERIES, defaultPreferences.isGenerateQueries());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_JAVA_FOR_TABLES, defaultPreferences.isGenerateTables());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_SUPPRESS_ALL_WARNINGS_FOR_QUERIES, defaultPreferences.isGenerateSuppressAllWarningsForQueries());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_SUPPRESS_ALL_WARNINGS_FOR_TABLES, defaultPreferences.isGenerateSuppressAllWarningsForTables());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_GET_BY_ID_METHOD, defaultPreferences.isGenerateGetByIdMethod());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_GET_ID_METHODS, defaultPreferences.isGenerateGetIdMethods());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_NULLABLE_GETTER, defaultPreferences.isGenerateNullableGetter());
		preferenceStore.setDefault(SqmlPreferences.NULLABLE_GETTER_SUFFIX, defaultPreferences.getNullableGetterSuffix());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_OPTIONAL_GETTER, defaultPreferences.isGenerateOptionalGetter());
		preferenceStore.setDefault(SqmlPreferences.OPTIONAL_GETTER_SUFFIX, defaultPreferences.getOptionalGetterSuffix());
		preferenceStore.setDefault(SqmlPreferences.GENERATE_THROWING_GETTER, defaultPreferences.isGenerateThrowingGetter());
		preferenceStore.setDefault(SqmlPreferences.THROWING_GETTER_SUFFIX, defaultPreferences.getThrowingGetterSuffix());
		preferenceStore.setDefault(SqmlPreferences.GENERATED_QUERY_CODE_VERSION, defaultPreferences.getGeneratedQueryCodeVersion().getValue());
		preferenceStore.setDefault(SqmlPreferences.GENERATED_TABLE_CODE_VERSION, defaultPreferences.getGeneratedTableCodeVersion().getValue());
		preferenceStore.setDefault(SqmlPreferences.ANNOTATION_FOR_GENERATED_CLASSES, defaultPreferences.getAnnotationForGeneratedClasses());
		preferenceStore.setDefault(SqmlPreferences.I18N_CLASS, defaultPreferences.getI18nClass());
		preferenceStore.setDefault(SqmlPreferences.PREFIX_FOR_CLASS_FIELDS, defaultPreferences.getPrefixForClassFields());
		preferenceStore.setDefault(SqmlPreferences.PREFIX_FOR_LOAD_BY_METHODS, defaultPreferences.getPrefixForLoadByMethods());
		preferenceStore.setDefault(SqmlPreferences.TABLE_CLASS_NAME_PREFIXES, defaultPreferences.getTableClassNamePrefixes());
	}
}
