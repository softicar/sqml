package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;

/**
 * The unknown type.
 * <p>
 * For example, invalid expressions are usually of unknown type.
 * 
 * @author Oliver Richers
 */
public class SqmlUnknownType extends SqmlBuiltInType {

	public SqmlUnknownType() {

		super("Unknown", null);
	}

	@Override
	public ISqmlJavaType getJavaType() {

		throw new UnsupportedOperationException("Unknown type has no Java type.");
	}

	@Override
	public boolean is(ISqmlType otherType) {

		// an unknown type is never the same as another unknown type
		return false;
	}

	@Override
	public boolean isAssignableTo(ISqmlType targetType) {

		// an unknown type is not assignable to any other unknown type
		return false;
	}
}
