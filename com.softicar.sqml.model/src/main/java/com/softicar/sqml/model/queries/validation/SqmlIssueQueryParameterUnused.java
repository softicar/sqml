package com.softicar.sqml.model.queries.validation;

import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.queries.QueriesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueQueryParameterUnused extends AbstractSqmlWarning<ISqmlQueryParameter> {

	public SqmlIssueQueryParameterUnused(ISqmlQueryParameter queryParameter) {

		super(queryParameter);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return QueriesPackage.eINSTANCE.getSqmlQueryParameter_Name();
	}

	@Override
	public String getMessage() {

		return String.format("The query parameter '%s' is not used.", getTargetObject().getName());
	}
}
