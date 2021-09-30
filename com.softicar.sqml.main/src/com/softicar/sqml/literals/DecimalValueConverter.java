package com.softicar.sqml.literals;

import java.math.BigDecimal;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

class DecimalValueConverter implements IValueConverter<BigDecimal> {

	private static final DecimalValueConverter singleton = new DecimalValueConverter();

	private DecimalValueConverter() {

		// singleton
	}

	public static DecimalValueConverter get() {

		return singleton;
	}

	@Override
	public BigDecimal toValue(String string, INode node) throws ValueConverterException {

		return new BigDecimal(string);
	}

	@Override
	public String toString(BigDecimal value) throws ValueConverterException {

		return value.toPlainString();
	}
}
