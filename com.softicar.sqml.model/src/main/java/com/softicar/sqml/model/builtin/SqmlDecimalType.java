package com.softicar.sqml.model.builtin;

import com.softicar.platform.db.sql.type.SqlFieldType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import java.math.BigDecimal;

public class SqmlDecimalType extends SqmlBuiltInType {

	public SqmlDecimalType() {

		super("Decimal", SqlFieldType.BIG_DECIMAL);
	}

	public static SqmlDecimalType get() {

		return SqmlBuiltInTypes.getDecimalType();
	}

	@Override
	public ISqmlJavaType getJavaType() {

		return new SqmlJavaType(BigDecimal.class);
	}
}
