package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.validation.SqmlAdditionValidator;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlAddition extends ISqmlBinaryOperation {

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlAdditionValidator(this, context).validate();
	}
}
