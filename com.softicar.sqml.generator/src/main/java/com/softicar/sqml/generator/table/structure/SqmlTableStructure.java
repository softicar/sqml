package com.softicar.sqml.generator.table.structure;

import com.softicar.platform.db.structure.enums.DbEnumTables;
import com.softicar.sqml.model.tables.ISqmlTable;

public class SqmlTableStructure extends AbstractSqmlTableStructure {

	public SqmlTableStructure(ISqmlTable table) {

		super(table);

		addColumns(table);
		addPrimaryKey(table);
		addKeys(table);
		addForeignKeys(table);
		if (table.isEnumTable()) {
			setEnumTable(true);
			addEnumTableRows(table);
			setComment(DbEnumTables.MARKER_COMMENT);
		}

		validate();
	}
}
