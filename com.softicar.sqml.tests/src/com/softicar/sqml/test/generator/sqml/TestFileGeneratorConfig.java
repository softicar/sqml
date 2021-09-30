package com.softicar.sqml.test.generator.sqml;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.preferences.SqmlDefaultGeneratorPreferences;
import com.softicar.sqml.generator.sqml.ISqmlFileGeneratorConfig;
import java.util.Map;
import java.util.TreeMap;

public class TestFileGeneratorConfig implements ISqmlFileGeneratorConfig {

	private final Map<DbTableName, JavaClassName> foreignTableClassName = new TreeMap<>();
	private final TestFileSystemAccess fileSystemAccess = new TestFileSystemAccess();
	private final IDbTableStructure tableStructure;
	private final JavaClassName className;
	private final SqmlDefaultGeneratorPreferences generatorPreferences;

	public TestFileGeneratorConfig(IDbTableStructure tableStructure, JavaClassName className) {

		this.tableStructure = tableStructure;
		this.className = className;
		this.generatorPreferences = new SqmlDefaultGeneratorPreferences();
	}

	public void setForeignTableClassName(DbTableName targetTableName, JavaClassName className) {

		foreignTableClassName.put(targetTableName, className);
	}

	@Override
	public ISqmlFileSystemAccess getFileSystemAccess() {

		return fileSystemAccess;
	}

	@Override
	public DbTableName getTableName() {

		return tableStructure.getTableName();
	}

	@Override
	public JavaClassName getClassName() {

		return className;
	}

	@Override
	public IDbTableStructure getTableStructure() {

		return tableStructure;
	}

	@Override
	public IDbTableStructure getTableStructure(DbTableName tableName) {

		throw new UnsupportedOperationException();
	}

	@Override
	public JavaClassName getForeignClassName(DbTableName targetTableName) {

		return foreignTableClassName.get(targetTableName);
	}

	@Override
	public ISqmlGeneratorPreferences getGeneratorPreferences() {

		return generatorPreferences;
	}
}
