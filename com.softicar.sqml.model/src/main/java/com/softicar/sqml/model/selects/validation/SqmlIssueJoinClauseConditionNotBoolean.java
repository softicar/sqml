package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueJoinClauseConditionNotBoolean extends AbstractSqmlError<ISqmlExpression> {

	public SqmlIssueJoinClauseConditionNotBoolean(ISqmlExpression expression) {

		super(expression);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return "Conditions of JOIN clause must be of boolean type.";
	}
}
