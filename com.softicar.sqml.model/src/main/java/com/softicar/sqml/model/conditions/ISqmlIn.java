package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.conditions.validation.SqmlInValidator;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlIn extends ISqmlCondition, ISqmlValidatable {

	boolean isNot();

	ISqmlExpression getLeft();

	ISqmlExpression getRight();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlInValidator(this, context).validate();
	}
}
