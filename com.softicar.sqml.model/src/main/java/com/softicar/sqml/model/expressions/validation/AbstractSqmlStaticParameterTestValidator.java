package com.softicar.sqml.model.expressions.validation;

import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.expressions.ISqmlStaticParameterTest;
import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public abstract class AbstractSqmlStaticParameterTestValidator<T extends ISqmlStaticParameterTest> {

	protected final T object;
	protected final ISqmlValidationContext context;

	public AbstractSqmlStaticParameterTestValidator(T object, ISqmlValidationContext context) {

		this.object = object;
		this.context = context;
	}

	public void validate() {

		ISqmlStaticVariableReference parameterReference = object.getParameterReference();
		ISqmlStaticVariable parameter = parameterReference.getVariable();

		if (parameter instanceof ISqmlQueryParameter) {
			validateParameter((ISqmlQueryParameter) parameter);
		} else {
			context.accept(new SqmlIssueParameterReferenceNotQueryParameter(parameterReference));
		}
	}

	protected abstract void validateParameter(ISqmlQueryParameter queryParameter);
}
