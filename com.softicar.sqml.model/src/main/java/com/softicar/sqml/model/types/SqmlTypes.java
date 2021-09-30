package com.softicar.sqml.model.types;

import com.softicar.sqml.model.builtin.ISqmlParameterizedType;
import com.softicar.sqml.model.builtin.ISqmlTypeList;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.utils.SqmlException;

public class SqmlTypes {

	// ---------------- AbstractCustomType ---------------- //

	public static boolean is(ISqmlType thisType, ISqmlType otherType) {

		return thisType == otherType;
	}

	// ---------------- ISqmlType ---------------- //

	public static ISqmlType getElementType(ISqmlType sqmlType) {

		if (!sqmlType.isCollection()) {
			throw new SqmlException("Not a collection type.");
		}

		if (sqmlType instanceof ISqmlParameterizedType) {
			ISqmlTypeList typeParameters = ((ISqmlParameterizedType) sqmlType).getTypeParameters();
			if (typeParameters.size() == 1) {
				return typeParameters.get(0);
			} else {
				return SqmlBuiltInTypes.getUnknownType();
			}
		} else {
			throw new SqmlException("Not a parameterized type.");
		}
	}

	// ---------------- ISqmlValueType ---------------- //

	public static String getDisplayName(ISqmlValueType valueType) {

		return valueType.getName();
	}
}
