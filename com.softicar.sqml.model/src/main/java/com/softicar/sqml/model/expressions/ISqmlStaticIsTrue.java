package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlStaticIsTrueValidator;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlStaticIsTrue extends ISqmlStaticParameterTest, ISqmlValidatable {

	boolean isNot();

	@Override
	default String getJavaCode() {

		String prefix = isNot()? "!" : "";
		String parameterCode = getParameterReference().getJavaCode();
		return prefix + parameterCode;
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlStaticIsTrueValidator(this, context).validate();
	}
}
