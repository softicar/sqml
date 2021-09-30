package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueExpressionNotBoolean extends AbstractSqmlError<ISqmlExpression> {

	public SqmlIssueExpressionNotBoolean(ISqmlExpression expression) {

		super(expression);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return "Expression must be boolean.";
	}
}
