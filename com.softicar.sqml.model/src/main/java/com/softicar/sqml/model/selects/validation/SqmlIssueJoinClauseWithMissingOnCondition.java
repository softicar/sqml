package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlJoinClause;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueJoinClauseWithMissingOnCondition extends AbstractSqmlWarning<ISqmlJoinClause> {

	public SqmlIssueJoinClauseWithMissingOnCondition(ISqmlJoinClause joinClause) {

		super(joinClause);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return "The JOIN clause is missing an ON condition.";
	}
}
