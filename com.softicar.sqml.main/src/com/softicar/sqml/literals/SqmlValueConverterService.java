package com.softicar.sqml.literals;

import java.math.BigDecimal;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class SqmlValueConverterService extends DefaultTerminalConverters {

	@ValueConverter(rule = "LONG")
	public IValueConverter<Long> getLongConverter() {

		return LongValueConverter.get();
	}

	@ValueConverter(rule = "FLOAT")
	public IValueConverter<BigDecimal> getFloatConverter() {

		return FloatValueConverter.get();
	}

	@ValueConverter(rule = "DOUBLE")
	public IValueConverter<BigDecimal> getDoubleConverter() {

		return DoubleValueConverter.get();
	}

	@ValueConverter(rule = "DECIMAL")
	public IValueConverter<BigDecimal> getDecimalConverter() {

		return DecimalValueConverter.get();
	}
}
