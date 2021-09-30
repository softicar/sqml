package com.softicar.sqml.model.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.Severity;

public abstract class AbstractSqmlError<T extends EObject> extends AbstractSqmlIssue<T> {

	public AbstractSqmlError(T issueObject) {

		super(issueObject);
	}

	@Override
	public Severity getSeverity() {

		return Severity.ERROR;
	}
}
