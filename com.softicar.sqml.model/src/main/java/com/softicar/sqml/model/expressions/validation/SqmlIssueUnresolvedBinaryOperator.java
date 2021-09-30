package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlBinaryOperation;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvedBinaryOperator extends AbstractSqmlError<ISqmlBinaryOperation> {

	public SqmlIssueUnresolvedBinaryOperator(ISqmlBinaryOperation operator) {

		super(operator);
	}

	public static void validate(ISqmlBinaryOperation operator, ISqmlIssueAcceptor acceptor) {

		ISqmlFunction function = operator.getFunction();
		if (function.eIsProxy() || !function.acceptsArguments(operator.getArguments())) {
			acceptor.accept(new SqmlIssueUnresolvedBinaryOperator(operator));
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ExpressionsPackage.eINSTANCE.getAbstractSqmlBinaryOperation_Function();
	}

	@Override
	public String getMessage() {

		ISqmlBinaryOperation operator = getTargetObject();

		return String
			.format(
				"No matching operator found for expression '%s %s %s'.",
				getTypeDisplayName(operator.getLeft()),
				operator.getOperatorSymbol(),
				getTypeDisplayName(operator.getLeft()));
	}

	private static final String getTypeDisplayName(ISqmlExpression expression) {

		if (expression == null || expression.getSqmlType() == null) {
			return "UNKNOWN";
		} else {
			return expression.getSqmlType().getDisplayName();
		}
	}
}
