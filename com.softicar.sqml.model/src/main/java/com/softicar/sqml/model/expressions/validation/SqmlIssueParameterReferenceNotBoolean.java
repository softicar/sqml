package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueParameterReferenceNotBoolean extends AbstractSqmlError<ISqmlStaticVariableReference> {

	public SqmlIssueParameterReferenceNotBoolean(ISqmlStaticVariableReference parameterReference) {

		super(parameterReference);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ExpressionsPackage.eINSTANCE.getSqmlStaticVariableReference_Variable();
	}

	@Override
	public String getMessage() {

		return "Parameter reference must be boolean.";
	}
}
