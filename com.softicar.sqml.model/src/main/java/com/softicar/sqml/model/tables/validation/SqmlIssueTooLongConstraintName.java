package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTooLongConstraintName extends AbstractSqmlError<ISqmlTableColumn> {

	private final ISqmlValidationConfiguration configuration;

	public SqmlIssueTooLongConstraintName(ISqmlTableColumn column, ISqmlValidationConfiguration configuration) {

		super(column);

		this.configuration = configuration;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableColumn_ConstraintName();
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"Constraint name '%s' exceeds the maximum length of %s characters. Please define a shorter name.",
				getTargetObject().getName(),
				configuration.getMaximumIdentifierLength());
	}
}
