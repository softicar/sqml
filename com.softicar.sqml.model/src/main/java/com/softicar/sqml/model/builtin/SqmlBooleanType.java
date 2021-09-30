package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlBooleanType extends SqmlBuiltInType {

	public SqmlBooleanType() {

		super("Boolean", SqlFieldType.BOOLEAN);
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Boolean.class);
	}
}
