package com.softicar.sqml.generator.preferences;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.generator.common.SqmlImportOverrides;
import com.softicar.sqml.generator.query.clazz.version.SqmlQueryClassVersion;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersion;
import java.util.Optional;

public interface ISqmlGeneratorPreferences {

	boolean isGenerateQueries();

	boolean isGenerateTables();

	boolean isGenerateSuppressAllWarningsForQueries();

	boolean isGenerateSuppressAllWarningsForTables();

	boolean isGenerateGetByIdMethod();

	boolean isGenerateGetIdMethods();

	boolean isGenerateNullableGetter();

	String getNullableGetterSuffix();

	boolean isGenerateOptionalGetter();

	String getOptionalGetterSuffix();

	boolean isGenerateThrowingGetter();

	String getThrowingGetterSuffix();

	String getAnnotationForGeneratedClasses();

	String getI18nClass();

	String getTableClassNamePrefixes();

	SqmlQueryClassVersion getGeneratedQueryCodeVersion();

	SqmlTableClassVersion getGeneratedTableCodeVersion();

	String getPrefixForLoadByMethods();

	String getPrefixForClassFields();

	default Optional<JavaClassName> getAnnotationForGeneratedClassesAsOptional() {

		return Optional//
			.ofNullable(getAnnotationForGeneratedClasses())
			.map(String::trim)
			.filter(name -> !name.isEmpty())
			.map(JavaClassName::new);
	}

	default Optional<JavaClassName> getI18nClassAsOptional() {

		return Optional//
			.ofNullable(getI18nClass())
			.map(String::trim)
			.filter(name -> !name.isEmpty())
			.map(JavaClassName::new);
	}

	SqmlImportOverrides getImportOverrides();
}
