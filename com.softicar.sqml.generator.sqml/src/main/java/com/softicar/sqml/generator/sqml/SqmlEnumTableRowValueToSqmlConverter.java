package com.softicar.sqml.generator.sqml;

import com.softicar.platform.db.structure.enums.IDbEnumTableRowValueConverter;
import java.math.BigDecimal;

public class SqmlEnumTableRowValueToSqmlConverter implements IDbEnumTableRowValueConverter<String> {

	@Override
	public String convertBigDecimal(BigDecimal value) {

		return value + "";
	}

	@Override
	public String convertBoolean(Boolean value) {

		return value? "TRUE" : "FALSE";
	}

	@Override
	public String convertDouble(Double value) {

		return value + "d";
	}

	@Override
	public String convertFloat(Float value) {

		return value + "f";
	}

	@Override
	public String convertInteger(Integer value) {

		return value + "";
	}

	@Override
	public String convertLong(Long value) {

		return value + "L";
	}

	@Override
	public String convertString(String value) {

		return "'" + value.toString() + "'";
	}

	@Override
	public String convertNull() {

		return "NULL";
	}
}
