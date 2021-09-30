package com.softicar.sqml.ui.generation;

import com.softicar.sqml.generator.common.SqmlImportOverrides;
import com.softicar.sqml.generator.common.SqmlImportOverridesParser;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.query.clazz.version.SqmlQueryClassVersion;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersion;
import com.softicar.sqml.ui.preferences.SqmlPreferences;
import org.eclipse.jface.preference.IPreferenceStore;

public class SqmlUiGeneratorPreferences implements ISqmlGeneratorPreferences {

	private final IPreferenceStore preferenceStore;

	public SqmlUiGeneratorPreferences(IPreferenceStore preferenceStore) {

		this.preferenceStore = preferenceStore;
	}

	@Override
	public boolean isGenerateQueries() {

		return preferenceStore.getBoolean(SqmlPreferences.GENERATE_JAVA_FOR_QUERIES);
	}

	@Override
	public boolean isGenerateTables() {

		return preferenceStore.getBoolean(SqmlPreferences.GENERATE_JAVA_FOR_TABLES);
	}

	@Override
	public boolean isGenerateSuppressAllWarningsForQueries() {

		return preferenceStore.getBoolean(SqmlPreferences.GENERATE_SUPPRESS_ALL_WARNINGS_FOR_QUERIES);
	}

	@Override
	public boolean isGenerateSuppressAllWarningsForTables() {

		return preferenceStore.getBoolean(SqmlPreferences.GENERATE_SUPPRESS_ALL_WARNINGS_FOR_TABLES);
	}

	@Override
	public boolean isGenerateGetByIdMethod() {

		return preferenceStore.getBoolean(SqmlPreferences.GENERATE_GET_BY_ID_METHOD);
	}

	@Override
	public boolean isGenerateGetIdMethods() {

		return preferenceStore.getBoolean(SqmlPreferences.GENERATE_GET_ID_METHODS);
	}

	@Override
	public SqmlQueryClassVersion getGeneratedQueryCodeVersion() {

		return new SqmlQueryClassVersion(preferenceStore.getInt(SqmlPreferences.GENERATED_QUERY_CODE_VERSION));
	}

	@Override
	public SqmlTableClassVersion getGeneratedTableCodeVersion() {

		return new SqmlTableClassVersion(preferenceStore.getInt(SqmlPreferences.GENERATED_TABLE_CODE_VERSION));
	}

	@Override
	public String getAnnotationForGeneratedClasses() {

		return preferenceStore.getString(SqmlPreferences.ANNOTATION_FOR_GENERATED_CLASSES);
	}

	@Override
	public String getI18nClass() {

		return preferenceStore.getString(SqmlPreferences.I18N_CLASS);
	}

	@Override
	public String getTableClassNamePrefixes() {

		return preferenceStore.getString(SqmlPreferences.TABLE_CLASS_NAME_PREFIXES);
	}

	@Override
	public String getPrefixForClassFields() {

		return preferenceStore.getString(SqmlPreferences.PREFIX_FOR_CLASS_FIELDS);
	}

	@Override
	public String getPrefixForLoadByMethods() {

		return preferenceStore.getString(SqmlPreferences.PREFIX_FOR_LOAD_BY_METHODS);
	}

	@Override
	public SqmlImportOverrides getImportOverrides() {

		return new SqmlImportOverridesParser(preferenceStore.getString(SqmlPreferences.IMPORT_OVERRIDES)).parse().getOverrides();
	}
}
