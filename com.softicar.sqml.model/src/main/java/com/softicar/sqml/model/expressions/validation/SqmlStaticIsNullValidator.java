package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlStaticIsNull;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlStaticIsNullValidator extends AbstractSqmlStaticParameterTestValidator<ISqmlStaticIsNull> {

	public SqmlStaticIsNullValidator(ISqmlStaticIsNull isNull, ISqmlValidationContext context) {

		super(isNull, context);
	}

	@Override
	protected void validateParameter(ISqmlQueryParameter queryParameter) {

		if (queryParameter.getSqmlType().isCollection()) {
			context.accept(new SqmlIssueParameterReferenceNeverNull(object.getParameterReference()));
		}
	}
}
