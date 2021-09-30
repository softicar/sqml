package com.softicar.sqml.model.types;

import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlValue;
import com.softicar.sqml.model.literals.ISqmlLiteral;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

/**
 * Represents a member of an {@link ISqmlEnum}.
 * <p>
 * The type of an {@link ISqmlEnumerator} is the containing {@link ISqmlEnum}.
 *
 * @author Oliver Richers
 */
public interface ISqmlEnumerator extends ISqmlValidatable, ISqmlValue, ISqmlModelElement {

	/**
	 * Effectively returns the enum type that this enumerator belongs to.
	 *
	 * @return the same as {@link #getEnum()}
	 */
	@Override
	default ISqmlType getSqmlType() {

		return getEnum();
	}

	/**
	 * Returns the name of this enumerator.
	 *
	 * @return the name of this enumerator, never null
	 */
	String getName();

	/**
	 * Returns the {@link ISqmlEnum} that this enumerator belongs to.
	 *
	 * @return the containing enum
	 */
	ISqmlEnum getEnum();

	/**
	 * Returns the underlying value type, e.g. String or Integer.
	 *
	 * @return the underlying literal value type
	 */
	default ISqmlType getLiteralValueType() {

		return getEnum().getLiteralValueType();
	}

	/**
	 * Returns the assigned literal value, if any.
	 * <p>
	 * The literal value can be omitted if it is identical to the name of the
	 * enumerator.
	 *
	 * @return the assigned literal value or null
	 */
	ISqmlLiteral<?> getValue();

	/**
	 * Returns the assigned string value of this enumerator.
	 *
	 * @return the string value (never null)
	 */
	default String getStringValue() {

		return SqmlEnumeratorMethods.getStringValue(this);
	}

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		SqmlEnumeratorMethods.validate(this, context);
	}
}
