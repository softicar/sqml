package com.softicar.sqml.model.functions.validation;

import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIncompatibleFunctionReturnType extends AbstractSqmlError<ISqmlFunction> {

	public SqmlIssueIncompatibleFunctionReturnType(ISqmlFunction function) {

		super(function);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FunctionsPackage.eINSTANCE.getSqmlFunction_Expression();
	}

	@Override
	public String getMessage() {

		ISqmlType expressionType = getTargetObject().getExpression().getSqmlType();
		ISqmlType functionType = getTargetObject().getSqmlType();
		return String
			.format(//
				"The type of the expression '%s' is not assignable to return type '%s'.",
				expressionType.getDisplayName(),
				functionType.getDisplayName());
	}
}
