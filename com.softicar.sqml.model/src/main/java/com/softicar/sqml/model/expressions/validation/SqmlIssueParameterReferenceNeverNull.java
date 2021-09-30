package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueParameterReferenceNeverNull extends AbstractSqmlError<ISqmlStaticVariableReference> {

	public SqmlIssueParameterReferenceNeverNull(ISqmlStaticVariableReference parameterReference) {

		super(parameterReference);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ExpressionsPackage.eINSTANCE.getSqmlStaticVariableReference_Variable();
	}

	@Override
	public String getMessage() {

		return "Parameter reference can never be null.";
	}
}
