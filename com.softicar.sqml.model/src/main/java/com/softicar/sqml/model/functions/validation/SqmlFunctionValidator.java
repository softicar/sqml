package com.softicar.sqml.model.functions.validation;

import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlFunctionValidator {

	private final ISqmlFunction function;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlFunctionValidator(ISqmlFunction function, ISqmlIssueAcceptor acceptor) {

		this.function = function;
		this.acceptor = acceptor;
	}

	public void validate() {

		prohibitIncompatibleReturnValue();
	}

	private void prohibitIncompatibleReturnValue() {

		ISqmlExpression expression = function.getExpression();
		if (expression != null) {
			ISqmlType expressionType = expression.getSqmlType();
			ISqmlType functionType = function.getSqmlType();
			if (!expressionType.isAssignableTo(functionType)) {
				acceptor.accept(new SqmlIssueIncompatibleFunctionReturnType(function));
			}
		}
	}
}
