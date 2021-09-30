package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlTableVariable;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.validation.AbstractSqmlWarning;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTableVariableNameNotLowerCamelCase extends AbstractSqmlWarning<ISqmlTableVariable> {

	public SqmlIssueTableVariableNameNotLowerCamelCase(ISqmlTableVariable tableVariable) {

		super(tableVariable);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return SelectsPackage.eINSTANCE.getSqmlTableVariable_Name();
	}

	@Override
	public String getMessage() {

		return String.format("Table variable names must be lower-camel-case.");
	}
}
