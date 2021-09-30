package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.types.ISqmlType;

public interface ISqmlValueReferenceDefaultValue extends ISqmlDefaultValue {

	ISqmlValueReference getValueReference();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlValueReferenceDefaultValueMethods.getSqmlType(this);
	}

	@Override
	default String getStringValue() {

		return SqmlValueReferenceDefaultValueMethods.getStringValue(this);
	}
}
