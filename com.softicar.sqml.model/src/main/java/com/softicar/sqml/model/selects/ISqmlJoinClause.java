package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.selects.validation.SqmlJoinClauseValidator;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.Collections;
import java.util.List;

public interface ISqmlJoinClause extends ISqmlValidatable, ISqmlSelectPart {

	boolean isLeftJoin();

	ISqmlVariable getVariable();

	List<? extends ISqmlExpression> getConditions();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlJoinClauseValidator(this, context).validate();
	}

	@Override
	default List<? extends ISqmlVariable> getVariables() {

		return Collections.singletonList(this.getVariable());
	}

	default boolean isForeignKeyJoin() {

		return getVariable() instanceof ISqmlForeignKeyVariable;
	}
}
