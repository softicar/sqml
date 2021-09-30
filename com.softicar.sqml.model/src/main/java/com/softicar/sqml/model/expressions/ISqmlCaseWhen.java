package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.validation.ISqmlValidatable;

public interface ISqmlCaseWhen extends ISqmlModelElement, ISqmlValidatable {

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(com.softicar.sqml.model.validation.ISqmlValidationContext context) {

		// TODO
//		new SqmlCaseValidator(this, context).validate();
	}

	ISqmlExpression getWhenExpression();

	ISqmlExpression getThenExpression();
}
