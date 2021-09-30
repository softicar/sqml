package com.softicar.sqml.validation;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import org.eclipse.xtext.validation.Check;

public class SqmlValidator extends AbstractSqmlValidator {

	private static final String VALIDATION_CONTEXT = SqmlValidator.class.getCanonicalName() + ".validationContext";
	@Inject private Injector injector;

	public ISqmlValidationContext getValidationContext() {

		ISqmlValidationContext validationContext = (ISqmlValidationContext) getContext().get(VALIDATION_CONTEXT);
		if (validationContext == null) {
			validationContext = new SqmlValidationContext(injector, this, getCurrentObject().eResource());
			getContext().put(VALIDATION_CONTEXT, validationContext);
		}
		return validationContext;
	}

	@Check
	public void checkValidatable(ISqmlValidatable validatable) {

		validatable.validate(getValidationContext());
	}
}
