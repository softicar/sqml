package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.db.structure.enums.IDbEnumTableRowValueConverter;
import java.math.BigDecimal;

public class SqmlEnumTableRowValueToJavaConverter implements IDbEnumTableRowValueConverter<String> {

	@Override
	public String convertBigDecimal(BigDecimal value) {

		return String.format("new BigDecimal(\"%s\")", value.toString());
	}

	@Override
	public String convertBoolean(Boolean value) {

		return value? "true" : "false";
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

		return "\"" + value + "\"";
	}

	@Override
	public String convertNull() {

		return "null";
	}
}
