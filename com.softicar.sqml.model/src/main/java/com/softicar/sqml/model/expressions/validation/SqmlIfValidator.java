package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlIf;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlIfValidator {

	private final ISqmlIf sqmlIf;
	private final ISqmlValidationContext context;

	public SqmlIfValidator(ISqmlIf sqmlIf, ISqmlValidationContext context) {

		this.sqmlIf = sqmlIf;
		this.context = context;
	}

	public void validate() {

		// check condition is boolean
		ISqmlExpression condition = sqmlIf.getCondition();
		if (!condition.getSqmlType().is(SqmlBuiltInTypes.getBooleanType())) {
			context.accept(new SqmlIssueExpressionNotBoolean(condition));
		}

		// check result expressions have same type
		ISqmlType thenType = sqmlIf.getThenExpression().getSqmlType();
		ISqmlType elseType = sqmlIf.getElseExpression().getSqmlType();
		if (!thenType.is(elseType)) {
			context.accept(new SqmlIssueIfExpressionsNotSameType(sqmlIf));
		}
	}
}
