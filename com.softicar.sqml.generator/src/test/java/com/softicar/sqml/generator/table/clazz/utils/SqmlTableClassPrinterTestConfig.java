package com.softicar.sqml.generator.table.clazz.utils;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.common.core.annotations.Generated;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.SqmlImportOverrides;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterConfig;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersion;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class SqmlTableClassPrinterTestConfig implements ISqmlTableClassPrinterConfig {

	private static final String I18N_CLASS = "com.softicar.TestI18n";
	public static final JavaPackageName PACKAGE_NAME = new JavaPackageName("com.example");
	private final Map<JavaClassName, String> existingCode;
	private final Map<DbTableName, IDbTableStructure> tableStructures;
	private final DbTableName tableName;
	private String i18nClass;
	private String generatedCode;
	private final SqmlImportOverrides importOverrides;

	public SqmlTableClassPrinterTestConfig(DbTableName tableName) {

		this.existingCode = new TreeMap<>();
		this.tableStructures = new TreeMap<>();
		this.tableName = tableName;
		this.i18nClass = I18N_CLASS;
		this.importOverrides = new SqmlImportOverrides();
	}

	@Override
	public JavaClassName getClassName(DbTableName tableName) {

		String className = new JavaIdentifier(tableName.getSimpleName()).asClass();
		return new JavaClassName(PACKAGE_NAME, className);
	}

	@Override
	public IDbTableStructure getTableStructure(DbTableName tableName) {

		return tableStructures.get(tableName);
	}

	@Override
	public void writeClassFile(JavaClassName className, String content) {

		this.generatedCode = content;
	}

	@Override
	public String readClassFile(JavaClassName className) {

		return existingCode.get(className);
	}

	@Override
	public boolean classFileExists(JavaClassName className) {

		return existingCode.get(className) != null;
	}

	@Override
	public SqmlTableClassVersion getVersion() {

		return SqmlTableClassVersion.getLatest();
	}

	@Override
	public String getPrefixForClassFields() {

		return "";
	}

	@Override
	public String getPrefixForGeneratedLoadByMethods() {

		return "loadBy";
	}

	@Override
	public Optional<JavaClassName> getAnnotationForGeneratedClasses() {

		return Optional.of(new JavaClassName(Generated.class));
	}

	@Override
	public Optional<JavaClassName> getI18nClass() {

		return i18nClass.isEmpty()? Optional.empty() : Optional.of(new JavaClassName(i18nClass));
	}

	@Override
	public Collection<String> getTableClassNamePrefixes() {

		return Collections.emptyList();
	}

	public SqmlTableClassPrinterTestConfig addTableStructure(IDbTableStructure tableStructure) {

		tableStructures.put(tableStructure.getTableName(), tableStructure);
		return this;
	}

	public String getGeneratedCode() {

		return generatedCode;
	}

	public void setExistingCode(String code) {

		setExistingCode(getClassName(tableName), code);
	}

	public void setExistingCode(JavaClassName className, String code) {

		existingCode.put(className, code);
	}

	public void setI18nClass(String i18nClass) {

		this.i18nClass = i18nClass;
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
	public SqmlImportOverrides getImportOverrides() {

		return importOverrides;
	}
}
