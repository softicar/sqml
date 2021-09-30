package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.validation.SqmlCaseValidator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import java.util.ArrayList;
import java.util.Collection;

public interface ISqmlCase extends ISqmlExpression, ISqmlValidatable {

	@Override
	default ISqmlType getSqmlType() {

		// get all types of cases
		Collection<ISqmlType> types = new ArrayList<>();
		for (ISqmlCaseWhen when: getWhens()) {
			types.add(when.getThenExpression().getSqmlType());
		}

		// get type of else
		ISqmlExpression elseExpression = getElseExpression();
		if (elseExpression != null) {
			types.add(elseExpression.getSqmlType());
		}

		// check that all types are the same
		ISqmlType resultType = null;
		for (ISqmlType type: types) {
			if (resultType == null) {
				resultType = type;
			} else if (!resultType.is(type)) {
				return SqmlBuiltInTypes.getUnknownType();
			}
		}
		return resultType;
	}

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(com.softicar.sqml.model.validation.ISqmlValidationContext context) {

		new SqmlCaseValidator(this, context).validate();
	}

	ISqmlExpression getOperand();

	Collection<? extends ISqmlCaseWhen> getWhens();

	ISqmlExpression getElseExpression();
}
