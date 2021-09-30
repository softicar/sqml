package com.softicar.sqml.literals;

import com.softicar.sqml.model.utils.SqmlException;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

class LongValueConverter implements IValueConverter<Long> {

	private static final LongValueConverter singleton = new LongValueConverter();

	private LongValueConverter() {

		// singleton
	}

	public static LongValueConverter get() {

		return singleton;
	}

	@Override
	public Long toValue(String string, INode node) throws ValueConverterException {

		if (!string.endsWith("L")) {
			throw new SqmlException("Illegal long literal '%s'. Must end with 'L'.", string);
		}

		return Long.parseLong(string.substring(0, string.length() - 1));
	}

	@Override
	public String toString(Long value) throws ValueConverterException {

		return value + "L";
	}
}
