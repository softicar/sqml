package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableKey;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTooLongTableKeyName extends AbstractSqmlError<ISqmlTableKey> {

	private final ISqmlValidationConfiguration configuration;

	public SqmlIssueTooLongTableKeyName(ISqmlTableKey key, ISqmlValidationConfiguration configuration) {

		super(key);

		this.configuration = configuration;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableKey_Name();
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"Key name '%s' exceeds the maximum length of %s characters. Please define a shorter key name.",
				getTargetObject().getName(),
				configuration.getMaximumIdentifierLength());
	}
}
