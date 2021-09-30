package com.softicar.sqml.generator.preferences;

import com.softicar.sqml.generator.common.SqmlImportOverrides;
import com.softicar.sqml.generator.query.clazz.version.SqmlQueryClassVersion;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersion;

public class SqmlDefaultGeneratorPreferences implements ISqmlGeneratorPreferences {

	private static final SqmlDefaultGeneratorPreferences SINGLETON = new SqmlDefaultGeneratorPreferences();

	public static SqmlDefaultGeneratorPreferences get() {

		return SINGLETON;
	}

	@Override
	public boolean isGenerateQueries() {

		return true;
	}

	@Override
	public boolean isGenerateTables() {

		return true;
	}

	@Override
	public boolean isGenerateSuppressAllWarningsForQueries() {

		return false;
	}

	@Override
	public boolean isGenerateSuppressAllWarningsForTables() {

		return false;
	}

	@Override
	public boolean isGenerateGetByIdMethod() {

		return true;
	}

	@Override
	public boolean isGenerateGetIdMethods() {

		return true;
	}

	@Override
	public SqmlQueryClassVersion getGeneratedQueryCodeVersion() {

		return SqmlQueryClassVersion.getLatest();
	}

	@Override
	public SqmlTableClassVersion getGeneratedTableCodeVersion() {

		return SqmlTableClassVersion.getLatest();
	}

	@Override
	public String getPrefixForClassFields() {

		return "m_";
	}

	@Override
	public String getPrefixForLoadByMethods() {

		return "getBy";
	}

	@Override
	public String getAnnotationForGeneratedClasses() {

		return "";
	}

	@Override
	public String getI18nClass() {

		return "";
	}

	@Override
	public String getTableClassNamePrefixes() {

		return "";
	}

	@Override
	public SqmlImportOverrides getImportOverrides() {

		return new SqmlImportOverrides();
	}
}
