package com.softicar.sqml.model.validation;

/**
 * Represents the type or class of an {@link ISqmlIssue}.
 * 
 * @author Oliver Richers
 */
public interface ISqmlIssueType extends Comparable<ISqmlIssueType> {

	String getIdentifier();
}
