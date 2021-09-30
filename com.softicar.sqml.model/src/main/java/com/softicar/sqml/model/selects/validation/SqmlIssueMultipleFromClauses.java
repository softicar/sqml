package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlFromClause;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueMultipleFromClauses extends AbstractSqmlError<ISqmlFromClause> {

	public SqmlIssueMultipleFromClauses(ISqmlFromClause fromClause) {

		super(fromClause);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return null;
	}

	@Override
	public String getMessage() {

		return "Too many FROM clauses. A SELECT statement may have at most one FROM clause.";
	}
}
