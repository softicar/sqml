package com.softicar.sqml.model.expressions;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlStaticVariableReference extends ISqmlExpression, ISqmlStaticExpression {

	boolean isNextIteration();

	ISqmlStaticVariable getVariable();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default String getJavaCode() {

		ISqmlStaticVariable variable = getVariable();
		return "parameters." + new JavaIdentifier(variable.getName()).asField();
	}

	@Override
	default ISqmlType getSqmlType() {

		ISqmlStaticVariable variable = getVariable();
		return variable != null? variable.getSqmlType() : null;
	}
}
