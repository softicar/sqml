package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlStaticIsNullValidator;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlStaticIsNull extends ISqmlStaticParameterTest, ISqmlValidatable {

	boolean isNot();

	@Override
	default String getJavaCode() {

		String operator = isNot()? "!=" : "==";
		String parameterCode = getParameterReference().getJavaCode();
		return String.format("%s %s null", parameterCode, operator);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlStaticIsNullValidator(this, context).validate();
	}
}
