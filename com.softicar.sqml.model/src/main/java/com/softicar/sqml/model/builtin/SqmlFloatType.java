package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlFloatType extends SqmlBuiltInType {

	public SqmlFloatType() {

		super("Float", SqlFieldType.FLOAT);
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Float.class);
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		return targetType == this || targetType == SqmlBuiltInTypes.getDecimalType() || targetType == SqmlBuiltInTypes.getDoubleType();
	}
}
