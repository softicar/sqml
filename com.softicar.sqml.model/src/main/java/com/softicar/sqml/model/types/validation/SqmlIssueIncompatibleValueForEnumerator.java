package com.softicar.sqml.model.types.validation;

import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.TypesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueIncompatibleValueForEnumerator extends AbstractSqmlError<ISqmlEnumerator> {

	private final ISqmlType valueType;

	public SqmlIssueIncompatibleValueForEnumerator(ISqmlEnumerator enumerator, ISqmlType valueType) {

		super(enumerator);
		this.valueType = valueType;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TypesPackage.eINSTANCE.getSqmlEnumerator_Value();
	}

	@Override
	public String getMessage() {

		return String
			.format(
				"Cannot assign value of type '%s' to enumerator with literal value type '%s'.",
				valueType.getDisplayName(),
				getTargetObject().getLiteralValueType().getDisplayName());
	}
}
