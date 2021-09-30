package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlWhereClause;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueWhereClauseConditionNotBoolean extends AbstractSqmlError<ISqmlWhereClause> {

	public SqmlIssueWhereClauseConditionNotBoolean(ISqmlWhereClause whereClause) {

		super(whereClause);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlWhereClause_Condition();
	}

	@Override
	public String getMessage() {

		return "Condition of WHERE clause must be of boolean type.";
	}
}
