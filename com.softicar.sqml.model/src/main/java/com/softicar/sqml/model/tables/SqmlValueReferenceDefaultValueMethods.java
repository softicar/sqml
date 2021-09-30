package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.ISqmlValue;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.SqmlException;

public class SqmlValueReferenceDefaultValueMethods {

	public static ISqmlType getSqmlType(ISqmlValueReferenceDefaultValue defaultValue) {

		ISqmlValueReference valueReference = defaultValue.getValueReference();
		if (valueReference != null) {
			return valueReference.getSqmlType();
		} else {
			return SqmlBuiltInTypes.getUnknownType();
		}
	}

	public static String getStringValue(ISqmlValueReferenceDefaultValue defaultValue) {

		ISqmlValue value = defaultValue.getValueReference().getValue();
		if (value instanceof ISqmlEnumerator) {
			ISqmlEnumerator enumerator = (ISqmlEnumerator) value;
			return enumerator.getStringValue();
		} else {
			throw new SqmlException("Default value reference must point to enumerator.");
		}
	}
}
