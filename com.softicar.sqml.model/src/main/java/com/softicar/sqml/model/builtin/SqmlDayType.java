package com.softicar.sqml.model.builtin;

import com.softicar.platform.common.date.Day;
import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;

public class SqmlDayType extends SqmlBuiltInType {

	public SqmlDayType() {

		super("Day", SqlFieldType.DAY);
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(Day.class);
	}
}
