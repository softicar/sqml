package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlSelectClause;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueLateDistincts extends AbstractSqmlError<ISqmlSelectClause> {

	public SqmlIssueLateDistincts(ISqmlSelectClause selectClause) {

		super(selectClause);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlSelectClause_Distinct();
	}

	@Override
	public String getMessage() {

		return "The DISTINCT keyword may only be used in the first SELECT clause.";
	}
}
