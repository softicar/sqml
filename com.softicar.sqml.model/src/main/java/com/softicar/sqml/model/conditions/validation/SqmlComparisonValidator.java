package com.softicar.sqml.model.conditions.validation;

import com.softicar.sqml.model.conditions.ISqmlComparison;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlComparisonValidator {

	private final ISqmlComparison comparison;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlComparisonValidator(ISqmlComparison comparison, ISqmlIssueAcceptor acceptor) {

		this.comparison = comparison;
		this.acceptor = acceptor;
	}

	public void validate() {

		new SqmlIssueComparisonIncompatibleTypes(comparison).validate(acceptor);
		new SqmlIssueComparisonUnsupportedOperator(comparison).validate(acceptor);
	}
}
