package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueExpressionHasWrongType extends AbstractSqmlError<ISqmlExpression> {

	private final ISqmlType expectedType;

	public SqmlIssueExpressionHasWrongType(ISqmlExpression expression, ISqmlType expectedType) {

		super(expression);

		this.expectedType = expectedType;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return String.format("Expression must be of type %s.", expectedType.getDisplayName());
	}
}
