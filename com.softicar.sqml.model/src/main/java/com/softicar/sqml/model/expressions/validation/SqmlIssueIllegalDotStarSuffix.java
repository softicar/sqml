package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIllegalDotStarSuffix extends AbstractSqmlError<ISqmlValueReference> {

	public SqmlIssueIllegalDotStarSuffix(ISqmlValueReference valueReference) {

		super(valueReference);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return String.format("Dot-star suffix only allowed for table variable as SELECT columns.");
	}
}
