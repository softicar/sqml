package com.softicar.sqml.model.validation;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.validation.Issue;

public class SqmlIssueType implements ISqmlIssueType {

	public static final SqmlIssueType LINKING_ERROR = new SqmlIssueType(Diagnostic.LINKING_DIAGNOSTIC);
	public static final SqmlIssueType SYNTAX_ERROR = new SqmlIssueType(Diagnostic.SYNTAX_DIAGNOSTIC);
	public static final SqmlIssueType UNRESOLVED_PROXY =
			new SqmlIssueType(EObjectValidator.DIAGNOSTIC_SOURCE + "." + EObjectValidator.EOBJECT__EVERY_PROXY_RESOLVES);
	private final String identifier;

	public SqmlIssueType(Class<? extends ISqmlIssue> issueClass) {

		this(issueClass.getCanonicalName());
	}

	public SqmlIssueType(ISqmlIssue issue) {

		this(issue.getClass());
	}

	public SqmlIssueType(Issue issue) {

		this(issue.getCode());
	}

	private SqmlIssueType(String identifier) {

		this.identifier = identifier;
	}

	@Override
	public String getIdentifier() {

		return identifier;
	}

	@Override
	public String toString() {

		return getIdentifier();
	}

	@Override
	public int compareTo(ISqmlIssueType other) {

		return getIdentifier().compareTo(other.getIdentifier());
	}
}
