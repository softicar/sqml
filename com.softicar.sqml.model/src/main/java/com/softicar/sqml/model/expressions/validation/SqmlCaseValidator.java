package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlCase;
import com.softicar.sqml.model.expressions.ISqmlCaseWhen;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlCaseValidator {

	private final ISqmlCase sqmlCase;
	private final ISqmlValidationContext context;

	public SqmlCaseValidator(ISqmlCase sqmlCase, ISqmlValidationContext context) {

		this.sqmlCase = sqmlCase;
		this.context = context;
	}

	public void validate() {

		// for 'search cases', check that all conditions are boolean
		if (sqmlCase.getOperand() == null) {
			assertAllConditionsAreBoolean();
		}

		// for 'simple cases', check that operands have same type
		if (sqmlCase.getOperand() != null) {
			assertAllOperandsHaveSameType();
		}

		// check result expressions have same type
		ResultTypeChecker checker = new ResultTypeChecker();
		for (ISqmlCaseWhen when: sqmlCase.getWhens()) {
			checker.check(when.getThenExpression());
		}

		// check type of else expression
		ISqmlExpression elseExpression = sqmlCase.getElseExpression();
		if (elseExpression != null) {
			checker.check(elseExpression);
		}
	}

	private void assertAllConditionsAreBoolean() {

		for (ISqmlCaseWhen when: sqmlCase.getWhens()) {
			if (!when.getWhenExpression().getSqmlType().is(SqmlBuiltInTypes.getBooleanType())) {
				context.accept(new SqmlIssueExpressionNotBoolean(when.getWhenExpression()));
			}
		}
	}

	private void assertAllOperandsHaveSameType() {

		ISqmlType operandType = sqmlCase.getOperand().getSqmlType();
		for (ISqmlCaseWhen when: sqmlCase.getWhens()) {
			if (!when.getWhenExpression().getSqmlType().is(operandType)) {
				context.accept(new SqmlIssueExpressionHasWrongType(when.getWhenExpression(), operandType));
			}
		}
	}

	private class ResultTypeChecker {

		private ISqmlType resultType = null;

		private void check(ISqmlExpression expression) {

			ISqmlType type = expression.getSqmlType();
			if (resultType == null) {
				resultType = type;
			} else if (!type.is(resultType)) {
				context.accept(new SqmlIssueExpressionHasWrongType(expression, resultType));
			}
		}
	}
}
