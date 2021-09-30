package com.softicar.sqml.model.conditions.validation;

import com.softicar.sqml.model.conditions.ISqmlComparison;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueComparisonIncompatibleTypes extends AbstractSqmlError<ISqmlComparison> {

	private final ISqmlType leftType;
	private final ISqmlType rightType;

	public SqmlIssueComparisonIncompatibleTypes(ISqmlComparison comparison) {

		super(comparison);

		this.leftType = comparison.getLeft().getSqmlType();
		this.rightType = comparison.getRight().getSqmlType();
	}

	public void validate(ISqmlIssueAcceptor acceptor) {

		if (!leftType.is(rightType)) {
			acceptor.accept(this);
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return String.format("Cannot compare %s %s %s.", leftType.getDisplayName(), getTargetObject().getOperatorSymbol(), rightType.getDisplayName());
	}
}
