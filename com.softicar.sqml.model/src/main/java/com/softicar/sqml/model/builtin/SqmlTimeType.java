package com.softicar.sqml.model.builtin;

import com.softicar.platform.common.date.Time;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlTimeType extends SqmlBuiltInType {

	public SqmlTimeType() {

		super("Time", SqlFieldType.TIME);
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Time.class);
	}
}
