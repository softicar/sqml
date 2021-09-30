package com.softicar.sqml.model.tables;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.ISqmlValue;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.literals.ISqmlLiteral;
import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.SqmlException;
import java.util.ArrayList;
import java.util.List;

public class SqmlRowConstructorDefaultValueMethods {

	public static ISqmlType getSqmlType(ISqmlRowConstructorDefaultValue defaultValue) {

		List<ISqmlType> elementTypes = new ArrayList<>();
		for (ISqmlValueReference valueReference: defaultValue.getValueReferences()) {
			ISqmlValue value = valueReference.getValue();
			if (value != null) {
				elementTypes.add(value.getSqmlType());
			} else {
				elementTypes.add(SqmlBuiltInTypes.getUnknownType());
			}
		}
		return SqmlBuiltInTypes.getTupleType().parameterize(elementTypes);
	}

	public static String getStringValue(ISqmlRowConstructorDefaultValue defaultValue) {

		List<String> stringValues = new ArrayList<>();
		for (ISqmlValueReference valueReference: defaultValue.getValueReferences()) {
			ISqmlValue value = valueReference.getValue();
			if (value instanceof ISqmlEnumerator) {
				ISqmlEnumerator enumerator = (ISqmlEnumerator) value;
				ISqmlLiteral<?> enumeratorValue = enumerator.getValue();
				stringValues.add(enumeratorValue != null? enumeratorValue.getStringValue() : enumerator.getName());
			} else {
				throw new SqmlException("Default value reference must point to enumerator.");
			}
		}
		return Imploder.implode(stringValues, ",");
	}
}
