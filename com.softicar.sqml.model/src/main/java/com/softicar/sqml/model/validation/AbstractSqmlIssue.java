package com.softicar.sqml.model.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;

public abstract class AbstractSqmlIssue<T extends EObject> implements ISqmlIssue {

	private final ISqmlIssueType issueType;
	private final T issueObject;

	public AbstractSqmlIssue(T issueObject) {

		this.issueType = new SqmlIssueType(this);
		this.issueObject = issueObject;
	}

	@Override
	public ISqmlIssueType getType() {

		return issueType;
	}

	@Override
	public T getTargetObject() {

		return issueObject;
	}

	@Override
	public INode getTargetNode() {

		return null;
	}
}
