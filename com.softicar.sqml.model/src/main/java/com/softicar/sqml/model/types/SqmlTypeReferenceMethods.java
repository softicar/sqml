package com.softicar.sqml.model.types;

import com.softicar.sqml.model.builtin.ISqmlGenericType;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.utils.SqmlLogicError;
import java.util.ArrayList;
import java.util.List;

public class SqmlTypeReferenceMethods {

	public static ISqmlType getSqmlType(ISqmlTypeReference typeReference) {

		if (typeReference.getTypeDefinition() != null) {
			ISqmlType sqmlType = typeReference.getTypeDefinition();

			// type parameters
			if (!typeReference.getTypeParameters().isEmpty()) {
				if (sqmlType instanceof ISqmlGenericType) {
					ISqmlGenericType genericType = (ISqmlGenericType) sqmlType;
					sqmlType = genericType.parameterize(getTypes(typeReference.getTypeParameters()));
				} else {
					sqmlType = SqmlBuiltInTypes.getUnknownType();
				}
			}

			// list type
			if (typeReference.isList()) {
				sqmlType = SqmlBuiltInTypes.getListType().parameterize(sqmlType);
			}

			return sqmlType;
		} else {
			throw new SqmlLogicError("Type reference does not refer to any type.");
		}
	}

	private static List<ISqmlType> getTypes(List<? extends ISqmlTypeReference> typeReferences) {

		List<ISqmlType> types = new ArrayList<>();
		for (ISqmlTypeReference typeReference: typeReferences) {
			types.add(typeReference.getSqmlType());
		}
		return types;
	}
}
