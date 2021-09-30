package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableKey;
import com.softicar.sqml.model.tables.TablesPackage;
import com.softicar.sqml.model.validation.AbstractSqmlError;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import org.eclipse.emf.ecore.EStructuralFeature;

public class SqmlIssueTooLongImplicitKeyTableName extends AbstractSqmlError<ISqmlTableKey> {

	private final ISqmlValidationConfiguration configuration;

	public SqmlIssueTooLongImplicitKeyTableName(ISqmlTableKey key, ISqmlValidationConfiguration configuration) {

		super(key);
		this.configuration = configuration;
	}

	@Override
	public EStructuralFeature getStructuralFeature() {

		return TablesPackage.eINSTANCE.getSqmlTableKey_Columns();
	}

	@Override
	public String getMessage() {

		return String
			.format(//
				"Implicit key name '%s' exceeds the maximum length of %s characters. Please define a shorter key name explicitly.",
				getTargetObject().getImplicitName(),
				configuration.getMaximumIdentifierLength());
	}
}
