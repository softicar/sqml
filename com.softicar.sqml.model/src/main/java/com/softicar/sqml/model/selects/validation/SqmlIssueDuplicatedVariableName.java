package com.softicar.sqml.model.selects.validation;

import com.softicar.sqml.model.selects.ISqmlForeignKeyVariable;
import com.softicar.sqml.model.selects.ISqmlSubSelectVariable;
import com.softicar.sqml.model.selects.ISqmlTableVariable;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.utils.SqmlException;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueDuplicatedVariableName extends AbstractSqmlError<ISqmlVariable> {

	public SqmlIssueDuplicatedVariableName(ISqmlVariable variable) {

		super(variable);
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		if (getTargetObject() instanceof ISqmlTableVariable) {
			return SelectsPackage.eINSTANCE.getSqmlTableVariable_Name();
		} else if (getTargetObject() instanceof ISqmlSubSelectVariable) {
			return SelectsPackage.eINSTANCE.getSqmlSubSelectVariable_Name();
		} else if (getTargetObject() instanceof ISqmlForeignKeyVariable) {
			return SelectsPackage.eINSTANCE.getSqmlForeignKeyVariable_Name();
		} else {
			throw new SqmlException("Unknown varibale class %s", getTargetObject().getClass().getCanonicalName());
		}
	}

	@Override
	public String getMessage() {

		return String.format("Duplicated variable name '%s'.", getTargetObject().getName());
	}
}
