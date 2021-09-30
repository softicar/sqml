package com.softicar.sqml.model.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.Severity;

public abstract class AbstractSqmlWarning<T extends EObject> extends AbstractSqmlIssue<T> {

	public AbstractSqmlWarning(T issueObject) {

		super(issueObject);
	}

	@Override
	public Severity getSeverity() {

		return Severity.WARNING;
	}
}
