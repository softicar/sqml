package com.softicar.sqml.generator.table.structure;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

/**
 * Transitively searches for the target column of a foreign key column.
 * <p>
 * A foreign key column may point to another foreign key column, which again
 * points to another foreign key column. This class determines the final target
 * column that is not a foreign key column.
 *
 * @author Oliver Richers
 */
class InternalSqmlTransientTargetColumnFinder {

	private final ISqmlTableColumn startColumn;
	private HashSet<ISqmlTableColumn> doneColumns;

	public InternalSqmlTransientTargetColumnFinder(ISqmlTableColumn startColumn) {

		this.startColumn = startColumn;
	}

	public ISqmlTableColumn findTargetColumn() {

		this.doneColumns = new HashSet<>();
		return findTargetColumn(startColumn);
	}

	public ISqmlTableColumn findTargetColumn(ISqmlTableColumn column) {

		if (doneColumns.add(column)) {
			return getTargetColumn(column).map(this::findTargetColumn).orElse(column);
		} else {
			return column;
		}
	}

	private Optional<ISqmlTableColumn> getTargetColumn(ISqmlTableColumn column) {

		return column//
			.getForeignKeyTargetTable()
			.flatMap(this::getPkColumn);
	}

	private Optional<ISqmlTableColumn> getPkColumn(ISqmlTable table) {

		List<ISqmlTableColumn> primarKeyColumns = table.getPrimarKeyColumns();
		if (primarKeyColumns.size() == 1) {
			return Optional.of(primarKeyColumns.get(0));
		} else {
			return Optional.empty();
		}
	}
}
