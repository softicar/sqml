package com.softicar.sqml.model.tables.validation;

import com.softicar.sqml.model.tables.ISqmlTableKey;
import com.softicar.sqml.model.validation.ISqmlValidationConfiguration;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlTableKeyValidator {

	private final ISqmlTableKey key;
	private final ISqmlValidationContext context;
	private final ISqmlValidationConfiguration configuration;

	public SqmlTableKeyValidator(ISqmlTableKey key, ISqmlValidationContext context) {

		this.key = key;
		this.context = context;
		this.configuration = context.getValidationConfiguration();
	}

	public void validate() {

		validateKeyName();
		validateImplicitKeyName();
	}

	private void validateKeyName() {

		String name = key.getName();
		if (name != null && name.length() > configuration.getMaximumIdentifierLength()) {
			context.accept(new SqmlIssueTooLongTableKeyName(key, configuration));
		}
	}

	private void validateImplicitKeyName() {

		if (key.getName() == null) {
			if (key.getImplicitName().length() > configuration.getMaximumIdentifierLength()) {
				context.accept(new SqmlIssueTooLongImplicitKeyTableName(key, configuration));
			}
		}
	}
}
