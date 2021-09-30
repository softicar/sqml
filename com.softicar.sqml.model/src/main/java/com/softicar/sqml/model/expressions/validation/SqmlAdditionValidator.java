package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlAddition;
import com.softicar.sqml.model.functions.validation.SqmlFunctionCallValidator;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlAdditionValidator extends SqmlFunctionCallValidator {

	private final ISqmlAddition addition;
	private final ISqmlValidationContext context;

	public SqmlAdditionValidator(ISqmlAddition addition, ISqmlValidationContext context) {

		super(addition, context);
		this.addition = addition;
		this.context = context;
	}

	@Override
	public void validate() {

		super.validate();
		SqmlIssueUnresolvedBinaryOperator.validate(addition, context);
	}
}
