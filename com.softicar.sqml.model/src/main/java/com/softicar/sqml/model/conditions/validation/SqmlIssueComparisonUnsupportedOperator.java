package com.softicar.sqml.model.conditions.validation;

import com.softicar.sqml.model.conditions.ISqmlComparison;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueComparisonUnsupportedOperator extends AbstractSqmlError<ISqmlComparison> {

	private final ISqmlType leftType;
	private final ISqmlType rightType;

	public SqmlIssueComparisonUnsupportedOperator(ISqmlComparison comparison) {

		super(comparison);

		this.leftType = comparison.getLeft().getSqmlType();
		this.rightType = comparison.getRight().getSqmlType();
	}

	public void validate(ISqmlIssueAcceptor acceptor) {

		if (leftType instanceof ISqmlTable || rightType instanceof ISqmlTable) {
			// TODO: don't use literal strings here!
			String operatorSymbol = getTargetObject().getOperatorSymbol();
			if (operatorSymbol.equals("=") || operatorSymbol.equals("!=") || operatorSymbol.equals("<>")) {
				// okay
			} else {
				acceptor.accept(this);
			}
		}
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return String
			.format(
				"Comparison operator %s %s %s not supported.",
				leftType.getDisplayName(),
				getTargetObject().getOperatorSymbol(),
				rightType.getDisplayName());
	}
}
