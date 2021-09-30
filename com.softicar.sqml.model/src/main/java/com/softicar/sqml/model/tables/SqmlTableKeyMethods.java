package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.tables.validation.SqmlTableKeyValidator;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.stream.Collectors;

public class SqmlTableKeyMethods {

	public static String getImplicitName(ISqmlTableKey key) {

		return SqmlTableKeyNames
			.getImplicitKeyName(
				key//
					.getColumns()
					.stream()
					.map(ISqmlTableColumn::getName)
					.collect(Collectors.toList()));
	}

	public static void validate(ISqmlTableKey key, ISqmlValidationContext context) {

		new SqmlTableKeyValidator(key, context).validate();
	}
}
