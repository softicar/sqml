package com.softicar.sqml.model.validation;

/**
 * This interface is used by {@link ISqmlValidatable} to output eventual
 * {@link ISqmlIssue} objects.
 * 
 * @author Oliver Richers
 */
public interface ISqmlIssueAcceptor {

	void accept(ISqmlIssue issue);
}
