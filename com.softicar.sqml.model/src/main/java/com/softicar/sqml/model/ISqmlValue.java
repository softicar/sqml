package com.softicar.sqml.model;

import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.types.ISqmlType;

/**
 * An {@link ISqmlValue} is some value of a defined type.
 * <p>
 * Examples of values are {@link ISqmlColumn}, {@link ISqmlVariable} or an
 * {@link ISqmlEnumerator}.
 * 
 * @author Oliver Richers
 */
public interface ISqmlValue {

	/**
	 * Returns the type of this value.
	 * <p>
	 * The returns type is never null but it may be the UNKNOWN type, for
	 * example, if this is an {@link ISqmlVariable} referring to a sub-select.
	 * 
	 * @return the type of this value (never null)
	 */
	ISqmlType getSqmlType();
}
