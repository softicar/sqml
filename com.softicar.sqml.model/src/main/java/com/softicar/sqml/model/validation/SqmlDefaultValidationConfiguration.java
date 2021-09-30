package com.softicar.sqml.model.validation;

import org.eclipse.xtext.diagnostics.Severity;

public class SqmlDefaultValidationConfiguration implements ISqmlValidationConfiguration {

	private static final SqmlDefaultValidationConfiguration SINGLETON = new SqmlDefaultValidationConfiguration();

	public static SqmlDefaultValidationConfiguration get() {

		return SINGLETON;
	}

	@Override
	public Severity getSeverity(ISqmlIssue issue) {

		return issue.getSeverity();
	}

	@Override
	public boolean isMandatoryIdColumn() {

		return false;
	}

	@Override
	public int getMaximumIdentifierLength() {

		return 63;
	}
}
