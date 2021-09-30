package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlPath;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnresolvedPathTarget extends AbstractSqmlError<ISqmlPath> {

	public SqmlIssueUnresolvedPathTarget(ISqmlPath path) {

		super(path);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return ExpressionsPackage.eINSTANCE.getSqmlPath_Target();
	}

	@Override
	public String getMessage() {

		return "Unresolved value reference.";
	}
}
