package com.softicar.sqml.generator.table.structure;

import com.softicar.sqml.model.tables.ISqmlTable;
import java.util.stream.Collectors;

/**
 * This table structure only reflect the columns and the primary key of a table.
 * <p>
 * If the primary key column is also a foreign key, then this is also reflected.
 * Otherwise, no unique key, index key or foreign key will be considered.
 *
 * @author Oliver Richers
 */
public class SqmlShallowTableStructure extends AbstractSqmlTableStructure {

	public SqmlShallowTableStructure(ISqmlTable table) {

		super(table);

		addColumns(table);
		addPrimaryKey(table);
		addPrimaryKeyForeignKey(table);

		validate();
	}

	private void addPrimaryKeyForeignKey(ISqmlTable table) {

		table//
			.getPrimarKeyColumns()
			.stream()
			.filter(column -> column.getForeignKeyTargetTable().isPresent())
			.collect(Collectors.toList())
			.forEach(column -> addForeignKeyStructure(new SqmlForeignKeyStructure(this, column)));
	}
}
