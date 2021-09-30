package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.selects.ISqmlJoinClause;
import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;

public class SqmlJoinClauseValidator {

	private final ISqmlJoinClause joinClause;
	private final ISqmlIssueAcceptor acceptor;

	public SqmlJoinClauseValidator(ISqmlJoinClause joinClause, ISqmlIssueAcceptor acceptor) {

		this.joinClause = joinClause;
		this.acceptor = acceptor;
	}

	public void validate() {

		checkForMissingCondition();
		validateTypeOfCondition();
	}

	private void checkForMissingCondition() {

		if (joinClause.getConditions().isEmpty() && !joinClause.isForeignKeyJoin()) {
			acceptor.accept(new SqmlIssueJoinClauseWithMissingOnCondition(joinClause));
		}
	}

	private void validateTypeOfCondition() {

		for (ISqmlExpression condition: joinClause.getConditions()) {
			if (!condition.getSqmlType().isAssignableTo(SqmlBuiltInTypes.getBooleanType())) {
				acceptor.accept(new SqmlIssueJoinClauseConditionNotBoolean(condition));
			}
		}
	}
}
