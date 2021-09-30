package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.literals.ISqmlLiteral;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlLiteralDefaultValue extends ISqmlDefaultValue {

	boolean isMinus();

	ISqmlLiteral<?> getLiteral();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlLiteralDefaultValueMethods.getSqmlType(this);
	}

	@Override
	default String getStringValue() {

		return SqmlLiteralDefaultValueMethods.getStringValue(this);
	}
}
