package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlIfNull;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIfNullExpressionsNotSameType extends AbstractSqmlError<ISqmlIfNull> {

	public SqmlIssueIfNullExpressionsNotSameType(ISqmlIfNull ifNull) {

		super(ifNull);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return "Both result expressions of an IFNULL construct must have the same type.";
	}
}
