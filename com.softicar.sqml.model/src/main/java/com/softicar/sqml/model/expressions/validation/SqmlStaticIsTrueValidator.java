package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlStaticIsTrue;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlStaticIsTrueValidator extends AbstractSqmlStaticParameterTestValidator<ISqmlStaticIsTrue> {

	public SqmlStaticIsTrueValidator(ISqmlStaticIsTrue isTrue, ISqmlValidationContext context) {

		super(isTrue, context);
	}

	@Override
	protected void validateParameter(ISqmlQueryParameter queryParameter) {

		if (queryParameter.getSqmlType().is(SqmlBuiltInTypes.getBooleanType())) {
			// okay
		} else {
			context.accept(new SqmlIssueParameterReferenceNotBoolean(object.getParameterReference()));
		}
	}
}
