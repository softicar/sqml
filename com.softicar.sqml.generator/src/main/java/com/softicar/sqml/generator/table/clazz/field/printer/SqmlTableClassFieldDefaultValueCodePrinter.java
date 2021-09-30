package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.core.exceptions.SofticarException;
import com.softicar.platform.common.core.exceptions.SofticarUnknownEnumConstantException;
import com.softicar.platform.common.date.DateFormat;
import com.softicar.platform.common.date.Day;
import com.softicar.platform.common.date.DayTime;
import com.softicar.platform.common.date.DayTimeParser;
import com.softicar.platform.common.date.Time;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldUtils;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import java.math.BigDecimal;

class SqmlTableClassFieldDefaultValueCodePrinter {

	private final ISqmlTableClassFieldPrinter fieldPrinter;
	private final SqmlTableClassPrinter classPrinter;
	private final ISqmlTableClassFieldDefinition fieldDefinition;
	private final String defaultValue;

	public SqmlTableClassFieldDefaultValueCodePrinter(ISqmlTableClassFieldPrinter fieldPrinter, SqmlTableClassPrinter classPrinter) {

		this.fieldPrinter = fieldPrinter;
		this.classPrinter = classPrinter;
		this.fieldDefinition = fieldPrinter.getFieldDefinition();
		this.defaultValue = fieldDefinition.getColumn().getDefaultValue();
	}

	public String getCode() {

		if (fieldDefinition.isIdField()) {
			return null;
		} else {
			return getCodeForPrimitiveType();
		}
	}

	private String getCodeForPrimitiveType() {

		switch (fieldDefinition.getFieldType()) {
		case BIG_DECIMAL:
			return getCodeForBigDecimal();
		case BYTE_ARRAY:
			return getCodeForByteArray();
		case BOOLEAN:
			return getCodeForBoolean();
		case DAY:
			return getCodeForDay();
		case DAY_TIME:
			return getCodeForDayTime();
		case DOUBLE:
			return getCodeForDouble();
		case ENUM:
			return getCodeForEnum();
		case FLOAT:
			return getCodeForFloat();
		case INTEGER:
			return getCodeForInteger();
		case LONG:
			return getCodeForLong();
		case STRING:
			return getCodeForString();
		case TIME:
			return getCodeForTime();
		}

		throw new SofticarUnknownEnumConstantException(fieldDefinition.getFieldType());
	}

	private String getCodeForBigDecimal() {

		return String.format("new %s(\"%s\")", BigDecimal.class.getSimpleName(), defaultValue);
	}

	private String getCodeForByteArray() {

		throw new SofticarException("Byte arrays are not allowed to have a default value.");
	}

	private String getCodeForBoolean() {

		if (defaultValue.equals("0")) {
			return "false";
		} else if (defaultValue.equals("1")) {
			return "true";
		} else {
			throw new SofticarException("Invalid default value for boolean: %s.", defaultValue);
		}
	}

	private String getCodeForDay() {

		Day day;

		// check for validity
		if (defaultValue.startsWith("0000-00-00")) {
			day = Day.get1970();
		} else {
			day = Day.parse(DateFormat.YYYY_MM_DD, defaultValue);
		}
		return String.format("Day.get(%d)", day.getAbsoluteIndex());
	}

	private String getCodeForDayTime() {

		// check for validity
		if (defaultValue.startsWith("0000-00-00 00:00:00")) {
			return "DayTime.get1970()";
		}

		// parse day time
		DayTime dayTime = DayTimeParser.parse(defaultValue, DayTimeParser.Format.YYYY_MM_DD_HH_MM_SS);

		// print assignment
		classPrinter.addImport(com.softicar.platform.common.date.Day.class);
		return String
			.format(//
				"new DayTime(Day.get(%d), %d, %d, %d)",
				dayTime.getDay().getAbsoluteIndex(),
				dayTime.getHour(),
				dayTime.getMinute(),
				dayTime.getSecond());
	}

	private String getCodeForDouble() {

		return String.format("%s.valueOf(\"%s\")", Double.class.getSimpleName(), defaultValue);
	}

	private String getCodeForEnum() {

		return fieldPrinter.getEnumClassName() + "." + SqmlTableClassFieldUtils.getEnumVariableName(defaultValue);
	}

	private String getCodeForFloat() {

		return String.format("%s.valueOf(\"%s\")", Float.class.getSimpleName(), defaultValue);
	}

	private String getCodeForInteger() {

		return defaultValue + "";
	}

	private String getCodeForLong() {

		return defaultValue + "L";
	}

	private String getCodeForString() {

		return String.format("\"%s\"", defaultValue);
	}

	private String getCodeForTime() {

		Time time = Time.parseTime(defaultValue);
		return String.format("new Time(%s, %s, %s)", time.getHour(), time.getMinute(), time.getSecond());
	}
}
