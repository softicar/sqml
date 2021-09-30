package com.softicar.sqml.model.validation;

import org.eclipse.xtext.diagnostics.Severity;

public interface ISqmlValidationConfiguration {

	Severity getSeverity(ISqmlIssue issue);

	boolean isMandatoryIdColumn();

	int getMaximumIdentifierLength();
}
