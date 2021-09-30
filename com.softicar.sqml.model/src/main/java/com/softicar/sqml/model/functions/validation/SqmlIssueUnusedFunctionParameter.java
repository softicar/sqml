package com.softicar.sqml.model.functions.validation;

import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.ISqmlFunctionParameter;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueUnusedFunctionParameter extends AbstractSqmlWarning<ISqmlFunctionParameter> {

	public SqmlIssueUnusedFunctionParameter(ISqmlFunctionParameter functionParameter) {

		super(functionParameter);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return FunctionsPackage.eINSTANCE.getSqmlFunctionParameter_Name();
	}

	@Override
	public String getMessage() {

		return "Unused function parameter.";
	}
}
