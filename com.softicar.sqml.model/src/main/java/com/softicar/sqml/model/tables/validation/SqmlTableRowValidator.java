package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.literals.ISqmlLiteral;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.ISqmlTableRow;
import com.softicar.sqml.model.tables.ISqmlTableRowValue;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;

public class SqmlTableRowValidator {

	private final ISqmlTableRow tableRow;
	private final ISqmlValidationContext context;

	public SqmlTableRowValidator(ISqmlTableRow tableRow, ISqmlValidationContext context) {

		this.tableRow = tableRow;
		this.context = context;
	}

	public void validate() {

		validateTableIsAnEnumTable();
		validateNumberAndTypeOfValues();
	}

	private void validateTableIsAnEnumTable() {

		if (!tableRow.getTable().isEnumTable()) {
			context.accept(new SqmlIssueTableRowsInNonEnumTable(tableRow));
		}
	}

	private void validateNumberAndTypeOfValues() {

		int expectedNumberOfValues = tableRow.getTable().getColumns().size();
		int actualNumberOfValues = tableRow.getValues().size();
		if (expectedNumberOfValues == actualNumberOfValues) {
			validateTypeOfValues(expectedNumberOfValues);
		} else {
			context.accept(new SqmlIssueIllegalNumberOfTableRowValues(tableRow, expectedNumberOfValues, actualNumberOfValues));
		}
	}

	private void validateTypeOfValues(int count) {

		List<? extends ISqmlTableRowValue> values = tableRow.getValues();
		List<? extends ISqmlTableColumn> columns = tableRow.getTable().getColumns();
		for (int i = 0; i < count; i++) {
			validateType(values.get(i), columns.get(i));
		}
	}

	private void validateType(ISqmlTableRowValue tableRowValue, ISqmlTableColumn tableColumn) {

		if (tableRowValue.isNull()) {
			if (!tableColumn.isNullable()) {
				context.accept(new SqmlIssueIllegalNullValueForNonNullableTableColumn(tableRowValue, tableColumn));
			}
		} else {
			ISqmlLiteral<?> literal = tableRowValue.getLiteral();
			if (literal != null && !literal.getSqmlType().is(tableColumn.getSqmlType())) {
				context.accept(new SqmlIssueIllegalTypeOfTableRowValue(tableRowValue, tableColumn));
			}
		}
	}
}
