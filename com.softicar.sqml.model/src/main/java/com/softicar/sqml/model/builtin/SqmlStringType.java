package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlStringType extends SqmlBuiltInType {

	public SqmlStringType() {

		super("String", SqlFieldType.STRING);
	}

	public static SqmlStringType get() {

		return SqmlBuiltInTypes.getStringType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(String.class);
	}
}
