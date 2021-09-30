package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlIfNull;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlIfNullValidator {

	private final ISqmlIfNull ifNull;
	private final ISqmlValidationContext context;

	public SqmlIfNullValidator(ISqmlIfNull ifNull, ISqmlValidationContext context) {

		this.ifNull = ifNull;
		this.context = context;
	}

	public void validate() {

		// check result expressions have same type
		ISqmlType testType = ifNull.getTestExpression().getSqmlType();
		ISqmlType thenType = ifNull.getThenExpression().getSqmlType();
		if (!testType.is(thenType)) {
			context.accept(new SqmlIssueIfNullExpressionsNotSameType(ifNull));
		}
	}
}
