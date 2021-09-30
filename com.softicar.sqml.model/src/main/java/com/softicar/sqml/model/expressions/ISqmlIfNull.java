package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.validation.SqmlIfNullValidator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlIfNull extends ISqmlExpression, ISqmlValidatable {

	ISqmlExpression getTestExpression();

	ISqmlExpression getThenExpression();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		ISqmlType testType = getTestExpression().getSqmlType();
		ISqmlType thenType = getThenExpression().getSqmlType();

		if (testType != null && thenType != null && testType.is(thenType)) {
			return testType;
		} else {
			return null;
		}
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlIfNullValidator(this, context).validate();
	}
}
