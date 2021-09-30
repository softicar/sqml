package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueAmbiguousFunctionCall extends AbstractSqmlError<ISqmlFunctionCall> {

	public SqmlIssueAmbiguousFunctionCall(ISqmlFunctionCall functionCall) {

		super(functionCall);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return String.format("Ambiguous function call to %s.", getTargetObject().getDisplayName());
	}
}
