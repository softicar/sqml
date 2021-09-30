package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvedForeignKeyType extends AbstractSqmlError<ISqmlForeignKeyVariable> {

	public SqmlIssueUnresolvedForeignKeyType(ISqmlForeignKeyVariable foreignKeyVariable) {

		super(foreignKeyVariable);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlForeignKeyVariable_Column();
	}

	@Override
	public String getMessage() {

		return "Unresolved type of foreign key.";
	}
}
