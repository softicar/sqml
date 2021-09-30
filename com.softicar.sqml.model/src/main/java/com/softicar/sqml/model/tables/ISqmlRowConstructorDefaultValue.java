package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.List;

public interface ISqmlRowConstructorDefaultValue extends ISqmlDefaultValue {

	List<? extends ISqmlValueReference> getValueReferences();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlRowConstructorDefaultValueMethods.getSqmlType(this);
	}

	@Override
	default String getStringValue() {

		return SqmlRowConstructorDefaultValueMethods.getStringValue(this);
	}
}
