package com.softicar.sqml.model.conditions.validation;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlRowConstructor;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueInconsistenElementTypeInRowConstructor extends AbstractSqmlError<ISqmlRowConstructor> {

	private final ISqmlType type1;
	private final ISqmlType type2;

	public SqmlIssueInconsistenElementTypeInRowConstructor(ISqmlRowConstructor rowConstructor, ISqmlType type1, ISqmlType type2) {

		super(rowConstructor);
		this.type1 = type1;
		this.type2 = type2;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ExpressionsPackage.eINSTANCE.getSqmlRowConstructor_Expressions();
	}

	@Override
	public String getMessage() {

		return String.format("All expressions should be of the same type. For example, mixing %s and %s.", type1.getDisplayName(), type2.getDisplayName());
	}
}
