package com.softicar.sqml.model.conditions.validation;

import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.conditions.ISqmlIn;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueInOperandsNotCompatible extends AbstractSqmlError<ISqmlIn> {

	private final ISqmlType leftType;
	private final ISqmlType rightType;

	public SqmlIssueInOperandsNotCompatible(ISqmlIn in) {

		super(in);

		this.leftType = in.getLeft().getSqmlType();
		this.rightType = in.getRight().getSqmlType();
	}

	@Override
	public String getMessage() {

		return String.format("Operands of IN operation not compatible: '%s' IN '%s'.", leftType.getDisplayName(), rightType.getDisplayName());
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ConditionsPackage.eINSTANCE.getSqmlIn_Right();
	}
}
