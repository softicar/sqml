package com.softicar.sqml.model.builtin;

import com.softicar.platform.common.date.DayTime;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlDayTimeType extends SqmlBuiltInType {

	public SqmlDayTimeType() {

		super("DayTime", SqlFieldType.DAY_TIME);
	}

	public static SqmlDayTimeType get() {

		return SqmlBuiltInTypes.getDayTimeType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(DayTime.class);
	}
}
