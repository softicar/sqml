package com.softicar.sqml.ui.generation;

import com.google.inject.Injector;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.sqml.ISqmlFileGeneratorConfig;
import com.softicar.sqml.generator.sqml.ISqmlFilesGeneratorConfig;
import com.softicar.sqml.model.tables.ISqmlTable;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * This configuration is useful for updating an existing SQML table definitions.
 *
 * @author Oliver Richers
 */
public class SqmlUiGeneratorConfig implements ISqmlFilesGeneratorConfig {

	private final Injector injector;
	private final ISqmlFileSystemAccess fileSystemAccess;
	private final Map<DbTableName, ISqmlTable> tableMap;
	private final InternalTableStructureMap tableStructureMap;

	public SqmlUiGeneratorConfig(Injector injector, ISqmlFileSystemAccess fileSystemAccess, Collection<ISqmlTable> tables) {

		this.injector = injector;
		this.fileSystemAccess = fileSystemAccess;
		this.tableMap = createTableMap(tables);
		this.tableStructureMap = new InternalTableStructureMap(tableMap.keySet());
	}

	private Map<DbTableName, ISqmlTable> createTableMap(Collection<ISqmlTable> tables) {

		Map<DbTableName, ISqmlTable> tableMap = new TreeMap<>();
		for (ISqmlTable table: tables) {
			tableMap.put(table.getDbTableName(), table);
		}
		return tableMap;
	}

	@Override
	public ISqmlFileSystemAccess getFileSystemAccess() {

		return fileSystemAccess;
	}

	@Override
	public Collection<DbTableName> getAllTableNames() {

		return tableMap.keySet();
	}

	@Override
	public ISqmlFileGeneratorConfig getConfig(DbTableName tableName) {

		return new SqmlUiClassGeneratorConfig(this, tableMap.get(tableName));
	}

	public IDbTableStructure getTableStructure(DbTableName tableName) {

		return tableStructureMap.get(tableName);
	}

	public Injector getInjector() {

		return injector;
	}
}
