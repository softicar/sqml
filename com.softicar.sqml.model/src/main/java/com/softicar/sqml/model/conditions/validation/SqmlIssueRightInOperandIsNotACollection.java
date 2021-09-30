package com.softicar.sqml.model.conditions.validation;

import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.conditions.ISqmlIn;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueRightInOperandIsNotACollection extends AbstractSqmlError<ISqmlIn> {

	public SqmlIssueRightInOperandIsNotACollection(ISqmlIn in) {

		super(in);
	}

	@Override
	public String getMessage() {

		ISqmlType rightType = getTargetObject().getRight().getSqmlType();
		return String.format("Right operand of IN operation is not a collection: %s", rightType.getDisplayName());
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ConditionsPackage.eINSTANCE.getSqmlIn_Right();
	}
}
