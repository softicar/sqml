package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.expressions.validation.SqmlStaticIsEmptyValidator;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlStaticIsEmpty extends ISqmlStaticParameterTest, ISqmlValidatable {

	boolean isNot();

	@Override
	default String getJavaCode() {

		String prefix = isNot()? "!" : "";
		String parameterCode = getParameterReference().getJavaCode();
		return String.format("%s%s.isEmpty()", prefix, parameterCode);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlStaticIsEmptyValidator(this, context).validate();
	}
}
