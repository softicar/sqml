package com.softicar.sqml.literals;

import com.softicar.sqml.model.utils.SqmlException;
import java.math.BigDecimal;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

class DoubleValueConverter implements IValueConverter<BigDecimal> {

	private static final DoubleValueConverter singleton = new DoubleValueConverter();

	private DoubleValueConverter() {

		// singleton
	}

	public static DoubleValueConverter get() {

		return singleton;
	}

	@Override
	public BigDecimal toValue(String string, INode node) throws ValueConverterException {

		if (!string.endsWith("d")) {
			throw new SqmlException("Illegal double literal '%s'. Must end with 'd'.", string);
		}

		return new BigDecimal(string.substring(0, string.length() - 1));
	}

	@Override
	public String toString(BigDecimal value) throws ValueConverterException {

		return value + "d";
	}
}
