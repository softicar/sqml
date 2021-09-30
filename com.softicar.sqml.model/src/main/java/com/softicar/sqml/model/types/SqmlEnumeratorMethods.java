package com.softicar.sqml.model.types;

import com.softicar.sqml.model.builtin.SqmlStringType;
import com.softicar.sqml.model.literals.ISqmlLiteral;
import com.softicar.sqml.model.types.validation.SqmlIssueIncompatibleValueForEnumerator;
import com.softicar.sqml.model.types.validation.SqmlIssueMissingEnumeratorValueAssigment;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlEnumeratorMethods {

	public static String getStringValue(ISqmlEnumerator enumerator) {

		ISqmlLiteral<?> value = enumerator.getValue();
		return value != null? value.getStringValue() : enumerator.getName();
	}

	public static void validate(ISqmlEnumerator enumerator, ISqmlValidationContext context) {

		ISqmlLiteral<?> value = enumerator.getValue();

		// check for missing value assignment
		if (value == null && !enumerator.getLiteralValueType().is(SqmlStringType.get())) {
			context.accept(new SqmlIssueMissingEnumeratorValueAssigment(enumerator));
		}

		// check for incompatible type of literal value
		if (value != null) {
			if (!value.getSqmlType().isAssignableTo(enumerator.getLiteralValueType())) {
				context.accept(new SqmlIssueIncompatibleValueForEnumerator(enumerator, value.getSqmlType()));
			}
		}
	}
}
