package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.types.ISqmlType;

/**
 * Represents the parameterization of a generic type.
 * 
 * @author Oliver Richers
 */
public interface ISqmlParameterizedType extends ISqmlType {

	/**
	 * Returns the underlying generic type, that is, the parameterized type.
	 * 
	 * @return the underlying generic type
	 */
	ISqmlGenericType getGenericType();

	/**
	 * Returns the list of type parameters.
	 * 
	 * @return the type parameters
	 */
	ISqmlTypeList getTypeParameters();
}
