package com.softicar.sqml.model.types.validation;

import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueMissingEnumeratorValueAssigment extends AbstractSqmlError<ISqmlEnumerator> {

	public SqmlIssueMissingEnumeratorValueAssigment(ISqmlEnumerator enumerator) {

		super(enumerator);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return String.format("Missing value assignment for enumerator '%s'.", getTargetObject().getName());
	}
}
