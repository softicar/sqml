package com.softicar.sqml.model.types;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.utils.ISqmlJavaType;

public interface ISqmlValueType extends ISqmlTopLevelTypeDefinition {

	@Override
	String getName();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default SqlFieldType getFieldType() {

		// TODO
		throw new UnsupportedOperationException("not implemented, yet");
	}

	@Override
	default ISqmlJavaType getJavaType() {

		// TODO
		throw new UnsupportedOperationException("not implemented, yet");
	}

	@Override
	default ISqmlJavaType getConcreteJavaType() {

		// TODO
		throw new UnsupportedOperationException("not implemented, yet");
	}

	@Override
	default String getDisplayName() {

		return SqmlTypes.getDisplayName(this);
	}
}
