package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlSelectClause;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueMultipleDistincts extends AbstractSqmlError<ISqmlSelectClause> {

	public SqmlIssueMultipleDistincts(ISqmlSelectClause selectClause) {

		super(selectClause);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlSelectClause_Distinct();
	}

	@Override
	public String getMessage() {

		return "The DISTINCT keyword may be used at most once per SELECT statement.";
	}
}
