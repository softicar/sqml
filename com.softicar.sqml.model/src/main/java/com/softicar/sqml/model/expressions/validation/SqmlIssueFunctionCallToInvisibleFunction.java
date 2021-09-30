package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueFunctionCallToInvisibleFunction extends AbstractSqmlError<ISqmlFunctionCall> {

	public SqmlIssueFunctionCallToInvisibleFunction(ISqmlFunctionCall functionCall) {

		super(functionCall);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"The function %s is not visible at this point. There is probably an import missing.",
				getTargetObject().getFunction().getDisplayName());
	}
}
