package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlDoubleType extends SqmlBuiltInType {

	public SqmlDoubleType() {

		super("Double", SqlFieldType.DOUBLE);
	}

	public static SqmlDoubleType get() {

		return SqmlBuiltInTypes.getDoubleType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Double.class);
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return targetType == this || targetType == SqmlBuiltInTypes.getDecimalType();
	}
}
