package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvedTableColumnType extends AbstractSqmlError<ISqmlValueReference> {

	public SqmlIssueUnresolvedTableColumnType(ISqmlValueReference valueReference) {

		super(valueReference);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ExpressionsPackage.eINSTANCE.getSqmlValueReference_Path();
	}

	@Override
	public String getMessage() {

		return "Unresolved type of table column.";
	}
}
