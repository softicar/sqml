package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.types.ISqmlType;

/**
 * An immutable list of {@link ISqmlType} elements.
 * 
 * @author Oliver Richers
 */
public interface ISqmlTypeList extends Iterable<ISqmlType> {

	String getDisplayName();

	boolean is(ISqmlTypeList other);

	boolean isEmpty();

	int size();

	ISqmlType get(int index);
}
