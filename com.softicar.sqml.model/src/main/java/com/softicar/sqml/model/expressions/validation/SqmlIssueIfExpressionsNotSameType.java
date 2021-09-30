package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlIf;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIfExpressionsNotSameType extends AbstractSqmlError<ISqmlIf> {

	public SqmlIssueIfExpressionsNotSameType(ISqmlIf sqmlIf) {

		super(sqmlIf);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return "Both result expressions of an IF construct must have the same type.";
	}
}
