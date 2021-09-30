package com.softicar.sqml.model.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Represents an info, a warning or an error.
 * 
 * @author Oliver Richers
 */
public interface ISqmlIssue {

	/**
	 * The target object that this issue applies to.
	 * 
	 * @return the target object, never null
	 */
	EObject getTargetObject();

	/**
	 * The structural feature of the target object, that this issue applies to.
	 * <p>
	 * Only the returned feature will be marked with the issue. If this method
	 * returns null, the complete object will be marked.
	 * 
	 * @return the structural feature or null
	 */
	EStructuralFeature getStructuralFeature();

	/**
	 * The issue message describing the problem.
	 * 
	 * @return the issue message, never null
	 */
	String getMessage();

	/**
	 * The type of this issue.
	 * 
	 * @return the issue type, never null
	 */
	ISqmlIssueType getType();

	/**
	 * Returns the {@link Severity} of this issue.
	 * 
	 * @return the severity, never null
	 */
	Severity getSeverity();

	INode getTargetNode();
}
