package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.validation.SqmlIfValidator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;

public interface ISqmlIf extends ISqmlExpression, ISqmlValidatable {

	@Override
	default ISqmlType getSqmlType() {

		ISqmlExpression thenExpression = getThenExpression();
		ISqmlType thenType = thenExpression != null? thenExpression.getSqmlType() : null;

		ISqmlExpression elseExpression = getElseExpression();
		ISqmlType elseType = elseExpression != null? elseExpression.getSqmlType() : null;

		if (thenType != null && elseType != null && thenType.is(elseType)) {
			return thenType;
		} else {
			return SqmlBuiltInTypes.getUnknownType();
		}
	}

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(com.softicar.sqml.model.validation.ISqmlValidationContext context) {

		new SqmlIfValidator(this, context).validate();
	}

	ISqmlExpression getCondition();

	ISqmlExpression getThenExpression();

	ISqmlExpression getElseExpression();
}
