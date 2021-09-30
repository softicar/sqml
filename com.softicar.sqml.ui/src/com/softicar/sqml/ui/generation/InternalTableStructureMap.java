package com.softicar.sqml.ui.generation;

import com.softicar.platform.common.core.exceptions.SofticarException;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.mysql.DbMysqlTableStructuresLoader;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

class InternalTableStructureMap {

	private final Map<DbTableName, IDbTableStructure> tableStructures;

	public InternalTableStructureMap(Collection<DbTableName> tableNames) {

		this.tableStructures = new TreeMap<>();

		loadAll(tableNames);
	}

	public IDbTableStructure get(DbTableName tableName) {

		IDbTableStructure tableStructure = tableStructures.get(tableName);
		return tableStructure != null? tableStructure : loadOne(tableName);
	}

	// ------------------------------ private ------------------------------ //

	private void loadAll(Collection<DbTableName> tableNames) {

		if (!tableNames.isEmpty()) {
			new DbMysqlTableStructuresLoader(tableNames)//
				.loadAll()
				.values()
				.forEach(tableStructure -> tableStructures.put(tableStructure.getTableName(), tableStructure));
		}
	}

	private IDbTableStructure loadOne(DbTableName tableName) {

		loadAll(Collections.singleton(tableName));

		return Optional//
			.ofNullable(tableStructures.get(tableName))
			.orElseThrow(() -> new SofticarException("Missing database table %s.", tableName));
	}
}
