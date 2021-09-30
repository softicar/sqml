package com.softicar.sqml.model.tables.validation;

import com.softicar.platform.db.structure.enums.DbEnumTables;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;
import java.util.Optional;

public class SqmlEnumTableValidator {

	private final ISqmlTable table;
	private final ISqmlValidationContext context;

	public SqmlEnumTableValidator(ISqmlTable table, ISqmlValidationContext context) {

		this.table = table;
		this.context = context;
	}

	public void validate() {

		validateIdColumn();
		validateNameColumn();
	}

	public void validateIdColumn() {

		List<ISqmlTableColumn> primarKeyColumns = table.getPrimarKeyColumns();
		if (primarKeyColumns.size() == 1) {
			validateIdColumn(primarKeyColumns.get(0));
		} else {
			context.accept(new SqmlIssueEnumTableMissingIdColumn(table));
		}
	}

	private void validateIdColumn(ISqmlTableColumn primarKeyColumn) {

		if (!primarKeyColumn.isSerial()) {
			context.accept(new SqmlIssueEnumTableMissingIdColumn(table));
		}
	}

	private void validateNameColumn() {

		Optional<? extends ISqmlTableColumn> nameColumn = table//
			.getColumns()
			.stream()
			.filter(column -> column.getName().equalsIgnoreCase(DbEnumTables.NAME_COLUMN_LOGICAL_NAME))
			.findFirst();
		if (nameColumn.isPresent()) {
			validateNameColumn(nameColumn.get());
		} else {
			context.accept(new SqmlIssueEnumTableMissingNameColumn(table));
		}
	}

	private void validateNameColumn(ISqmlTableColumn nameColumn) {

		if (nameColumn.isNullable()) {
			context.accept(new SqmlIssueEnumTableWithNullableNameColumn(nameColumn));
		}
		if (!nameColumn.getSqmlType().is(SqmlBuiltInTypes.getStringType())) {
			context.accept(new SqmlIssueEnumTableWithIllegalNameColumnType(nameColumn));
		}
	}
}
