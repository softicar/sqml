package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlFunctionParameter extends ISqmlValidatable, ISqmlStaticVariable {

	ISqmlFunction getFunction();

	ISqmlTypeReference getTypeReference();

	@Override
	default void validate(ISqmlValidationContext context) {

		SqmlFunctionParameterMethods.validate(this, context);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlFunctionParameterMethods.getSqmlType(this);
	}

	@Override
	default boolean isOptional() {

		return false;
	}
}
