package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlLongType extends SqmlBuiltInType {

	public SqmlLongType() {

		super("Long", SqlFieldType.LONG);
	}

	public static SqmlLongType get() {

		return SqmlBuiltInTypes.getLongType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Long.class);
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return targetType == this || targetType == SqmlBuiltInTypes.getDecimalType();
	}
}
