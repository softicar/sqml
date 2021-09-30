package com.softicar.sqml.generator.sqml;

import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.foreign.key.IDbForeignKeyStructure;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import java.util.List;
import java.util.Optional;

public class ForeignClassNameGetter {

	private final ISqmlFileGeneratorConfig config;

	public ForeignClassNameGetter(ISqmlFileGeneratorConfig config) {

		this.config = config;
	}

	public JavaClassName get(IDbColumnStructure columnStructure) {

		Optional<IDbForeignKeyStructure> foreignKeyStructure = columnStructure.getForeignKeyStructure();
		if (foreignKeyStructure.isPresent()) {
			DbTableName foreignTableName = foreignKeyStructure.get().getForeignTableName();
			if (isForeignKeyToPrimaryKey(foreignKeyStructure.get())) {
				return config.getForeignClassName(foreignTableName);
			}
		}
		return null;
	}

	private boolean isForeignKeyToPrimaryKey(IDbForeignKeyStructure foreignKeyStructure) {

		String targetColumn = getNameOfTargetColumn(foreignKeyStructure);
		String pkColumn = getNameOfPkColumn(foreignKeyStructure.getForeignTableName());
		return targetColumn != null && pkColumn != null && targetColumn.equalsIgnoreCase(pkColumn);
	}

	private String getNameOfTargetColumn(IDbForeignKeyStructure foreignKeyStructure) {

		List<String> columnNames = foreignKeyStructure.getColumns();
		if (columnNames.size() == 1) {
			return foreignKeyStructure.getForeignColumnName(columnNames.get(0));
		} else {
			return null;
		}
	}

	private String getNameOfPkColumn(DbTableName targetTableName) {

		return config
			.getTableStructure(targetTableName)//
			.getPkColumn()
			.map(IDbColumnStructure::getNameOrThrow)
			.orElse(null);
	}
}
