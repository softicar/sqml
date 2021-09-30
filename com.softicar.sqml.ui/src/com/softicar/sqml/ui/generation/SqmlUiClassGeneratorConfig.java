package com.softicar.sqml.ui.generation;

import com.google.common.collect.Iterables;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferencesProvider;
import com.softicar.sqml.generator.sqml.ISqmlFileGeneratorConfig;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.utils.SqmlQualifiedPhysicalTableName;
import java.util.Collection;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;

/**
 * Implementation of {@link ISqmlFileGeneratorConfig} for the user interface.
 *
 * @author Oliver Richers
 */
public class SqmlUiClassGeneratorConfig implements ISqmlFileGeneratorConfig {

	private final SqmlUiGeneratorConfig filesGeneratorConfig;
	private final ISqmlTable table;

	public SqmlUiClassGeneratorConfig(SqmlUiGeneratorConfig filesGeneratorConfig, ISqmlTable table) {

		this.filesGeneratorConfig = filesGeneratorConfig;
		this.table = table;
	}

	@Override
	public ISqmlFileSystemAccess getFileSystemAccess() {

		return filesGeneratorConfig.getFileSystemAccess();
	}

	@Override
	public DbTableName getTableName() {

		return table.getDbTableName();
	}

	@Override
	public JavaClassName getClassName() {

		return table.getClassName();
	}

	@Override
	public IDbTableStructure getTableStructure() {

		return filesGeneratorConfig.getTableStructure(getTableName());
	}

	@Override
	public IDbTableStructure getTableStructure(DbTableName tableName) {

		return filesGeneratorConfig.getTableStructure(tableName);
	}

	@Override
	public JavaClassName getForeignClassName(DbTableName targetTableName) {

		ISqmlTable table = getTable(targetTableName);
		return table != null? table.getClassName() : null;
	}

	@Override
	public ISqmlGeneratorPreferences getGeneratorPreferences() {

		ISqmlGeneratorPreferencesProvider preferencesProvider = filesGeneratorConfig.getInjector().getInstance(ISqmlGeneratorPreferencesProvider.class);
		return preferencesProvider.getPreferences(SqmlNavigation.getResource(table));
	}

	private ISqmlTable getTable(DbTableName targetTableName) {

		if (targetTableName.equals(getTableName())) {
			return table;
		} else {
			IGlobalScopeProvider globalScopeProvider = filesGeneratorConfig.getInjector().getInstance(IGlobalScopeProvider.class);
			Resource resource = SqmlNavigation.getResource(table);
			Collection<ISqmlTable> tables = new SqmlQualifiedPhysicalTableName(targetTableName).findAllTables(globalScopeProvider, resource).values();
			return Iterables.getFirst(tables, null);
		}
	}
}
