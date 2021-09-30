package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public class SqmlStaticIsEmptyValidator extends AbstractSqmlStaticParameterTestValidator<ISqmlStaticIsEmpty> {

	public SqmlStaticIsEmptyValidator(ISqmlStaticIsEmpty isEmpty, ISqmlValidationContext context) {

		super(isEmpty, context);
	}

	@Override
	protected void validateParameter(ISqmlQueryParameter queryParameter) {

		if (queryParameter.getSqmlType().isCollection()) {
			// okay
		} else {
			context.accept(new SqmlIssueParameterReferenceNotCollection(object.getParameterReference()));
		}
	}
}
