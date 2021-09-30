package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.tables.validation.SqmlTableColumnValidator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.Optional;

public class SqmlTableColumnMethods {

	public static void validate(ISqmlTableColumn column, ISqmlValidationContext context) {

		new SqmlTableColumnValidator(column, context).validate();
	}

	public static Optional<ISqmlTable> getForeignKeyTargetTable(ISqmlTableColumn column) {

		ISqmlType sqmlType = column.getTypeReference().getSqmlType();
		if (sqmlType instanceof ISqmlTable) {
			return Optional.of((ISqmlTable) sqmlType);
		} else {
			return Optional.empty();
		}
	}
}
