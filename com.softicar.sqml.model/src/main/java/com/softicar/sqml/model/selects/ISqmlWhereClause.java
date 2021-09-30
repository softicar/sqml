package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.selects.validation.SqmlIssueWhereClauseConditionNotBoolean;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

public interface ISqmlWhereClause extends ISqmlValidatable, ISqmlSelectPart {

	ISqmlExpression getCondition();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		// check condition is boolean
		ISqmlExpression condition = getCondition();
		if (!condition.getSqmlType().isAssignableTo(SqmlBuiltInTypes.getBooleanType())) {
			context.accept(new SqmlIssueWhereClauseConditionNotBoolean(this));
		}
	}
}
