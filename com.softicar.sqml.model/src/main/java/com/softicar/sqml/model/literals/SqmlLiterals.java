package com.softicar.sqml.model.literals;

import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.types.ISqmlType;

public class SqmlLiterals {

	public static ISqmlType getBooleanType() {

		return SqmlBuiltInTypes.getBooleanType();
	}

	public static ISqmlType getIntegerType() {

		return SqmlBuiltInTypes.getIntegerType();
	}

	public static ISqmlType getLongType() {

		return SqmlBuiltInTypes.getLongType();
	}

	public static ISqmlType getFloatType() {

		return SqmlBuiltInTypes.getFloatType();
	}

	public static ISqmlType getDoubleType() {

		return SqmlBuiltInTypes.getDoubleType();
	}

	public static ISqmlType getDecimalType() {

		return SqmlBuiltInTypes.getDecimalType();
	}

	public static ISqmlType getStringType() {

		return SqmlBuiltInTypes.getStringType();
	}
}
