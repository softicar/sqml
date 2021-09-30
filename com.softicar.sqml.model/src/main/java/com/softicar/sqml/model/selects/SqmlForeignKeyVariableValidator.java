package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlForeignKeyVariableValidator {

	private final ISqmlForeignKeyVariable variable;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlForeignKeyVariableValidator(ISqmlForeignKeyVariable variable, ISqmlIssueAcceptor acceptor) {

		this.variable = variable;
		this.acceptor = acceptor;
	}

	public void validate() {

		if (variable.getTable().eIsProxy()) {
			acceptor.accept(new SqmlIssueUnresolvedForeignKeyType(variable));
		}
	}
}
