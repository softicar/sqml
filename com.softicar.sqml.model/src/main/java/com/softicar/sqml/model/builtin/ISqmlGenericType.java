package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import java.util.Collection;

/**
 * Interface for types that can be parameterized.
 * 
 * @author Oliver Richers
 */
public interface ISqmlGenericType extends ISqmlType {

	boolean isAssignable(ISqmlTypeList typeList, ISqmlType targetType);

	ISqmlParameterizedType parameterize(ISqmlTypeList typeParameters);

	ISqmlParameterizedType parameterize(ISqmlType...typeParameters);

	ISqmlParameterizedType parameterize(Collection<ISqmlType> typeParameters);

	/**
	 * Returns the Java type depending on the number of type parameters.
	 * <p>
	 * This method is necessary for example for tuples, where a different tuple
	 * type is necessary for each number of type parameters.
	 * 
	 * @param parameterCount
	 *            number of type parameters
	 * @return the respective Java type
	 */
	ISqmlJavaType getJavaType(int parameterCount);

	ISqmlJavaType getConcreteJavaType(int parameterCount);
}
