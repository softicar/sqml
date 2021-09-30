package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIncompatibleFunctionCallArguments extends AbstractSqmlError<ISqmlFunctionCall> {

	public SqmlIssueIncompatibleFunctionCallArguments(ISqmlFunctionCall functionCall) {

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
				"The function %s is not applicable for the call %s.",
				getTargetObject().getFunction().getDisplayName(),
				getTargetObject().getDisplayName());
	}
}
