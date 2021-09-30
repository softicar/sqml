package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlIntegerType extends SqmlBuiltInType {

	public SqmlIntegerType() {

		super("Integer", SqlFieldType.INTEGER);
	}

	public static SqmlIntegerType get() {

		return SqmlBuiltInTypes.getIntegerType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Integer.class);
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return targetType == this || targetType == SqmlDecimalType.get() || targetType == SqmlDoubleType.get() || targetType == SqmlLongType.get();
	}
}
