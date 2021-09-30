package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueDuplicatedSelectColumnName extends AbstractSqmlError<ISqmlSelectColumn> {

	public SqmlIssueDuplicatedSelectColumnName(ISqmlSelectColumn selectColumn) {

		super(selectColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		if (getTargetObject().getAlias() != null) {
			return SelectsPackage.eINSTANCE.getSqmlSelectColumn_Alias();
		} else {
			return SelectsPackage.eINSTANCE.getSqmlSelectColumn_Expression();
		}
	}

	@Override
	public String getMessage() {

		return String.format("Duplicated select column name '%s'.", getTargetObject().getName());
	}
}
