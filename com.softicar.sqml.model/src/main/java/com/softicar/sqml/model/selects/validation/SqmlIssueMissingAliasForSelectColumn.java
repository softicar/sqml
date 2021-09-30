package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueMissingAliasForSelectColumn extends AbstractSqmlError<ISqmlSelectColumn> {

	public SqmlIssueMissingAliasForSelectColumn(ISqmlSelectColumn selectColumn) {

		super(selectColumn);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlSelectColumn_Expression();
	}

	@Override
	public String getMessage() {

		return "Missing alias for select column.";
	}
}
