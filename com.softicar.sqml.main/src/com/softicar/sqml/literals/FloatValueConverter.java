package com.softicar.sqml.literals;

import com.softicar.sqml.model.utils.SqmlException;
import java.math.BigDecimal;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

class FloatValueConverter implements IValueConverter<BigDecimal> {

	private static final FloatValueConverter singleton = new FloatValueConverter();

	private FloatValueConverter() {

		// singleton
	}

	public static FloatValueConverter get() {

		return singleton;
	}

	@Override
	public BigDecimal toValue(String string, INode node) throws ValueConverterException {

		if (!string.endsWith("f")) {
			throw new SqmlException("Illegal float literal '%s'. Must end with 'f'.", string);
		}

		return new BigDecimal(string.substring(0, string.length() - 1));
	}

	@Override
	public String toString(BigDecimal value) throws ValueConverterException {

		return value + "f";
	}
}
