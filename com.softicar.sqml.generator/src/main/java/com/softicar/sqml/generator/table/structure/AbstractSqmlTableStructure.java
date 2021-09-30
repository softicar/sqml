package com.softicar.sqml.generator.table.structure;

import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.enums.DbEnumTableRowStructure;
import com.softicar.platform.db.structure.enums.IDbEnumTableRowValue;
import com.softicar.platform.db.structure.key.DbKeyStructure;
import com.softicar.platform.db.structure.key.DbKeyType;
import com.softicar.platform.db.structure.table.DbTableStructure;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableRow;
import com.softicar.sqml.model.tables.ISqmlTableRowValue;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractSqmlTableStructure extends DbTableStructure {

	public AbstractSqmlTableStructure(ISqmlTable table) {

		super(table.getDbTableName());
	}

	protected void addColumns(ISqmlTable table) {

		table//
			.getColumns()
			.forEach(column -> addColumnStructure(new SqmlColumnStructure(this, column)));
	}

	protected void addPrimaryKey(ISqmlTable table) {

		List<String> columnNames = table//
			.getPrimarKeyColumns()
			.stream()
			.map(column -> column.getPhysicalName())
			.collect(Collectors.toList());
		if (!columnNames.isEmpty()) {
			addKeyStructure(new DbKeyStructure(this).setType(DbKeyType.PRIMARY).addColumnNames(columnNames));
		}
	}

	protected void addKeys(ISqmlTable table) {

		table//
			.getTableKeys()
			.forEach(key -> addKeyStructure(new SqmlKeyStructure(this, key)));
	}

	protected void addForeignKeys(ISqmlTable table) {

		table//
			.getColumns()
			.stream()
			.filter(column -> column.getForeignKeyTargetTable().isPresent())
			.forEach(column -> addForeignKeyStructure(new SqmlForeignKeyStructure(this, column)));
	}

	protected void addEnumTableRows(ISqmlTable table) {

		table//
			.getRows()
			.stream()
			.map(this::createEnumTableRowStructure)
			.forEach(this::addEnumTableRow);
	}

	private DbEnumTableRowStructure createEnumTableRowStructure(ISqmlTableRow tableRow) {

		DbEnumTableRowStructure structure = new DbEnumTableRowStructure(this);
		List<? extends IDbColumnStructure> columns = getColumns();
		List<? extends ISqmlTableRowValue> values = tableRow.getValues();
		for (int i = 0; i < columns.size(); i++) {
			structure.setValue(columns.get(i), getValue(values.get(i)));
		}
		return structure;
	}

	private IDbEnumTableRowValue getValue(ISqmlTableRowValue value) {

		return value.isNull()? null : value.getLiteral().convert(new SqmlLiteralToEnumTableRowValueConverter());
	}
}
