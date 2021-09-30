/**
 */
package com.softicar.sqml.model.literals;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Double Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.literals.SqmlDoubleLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlDoubleLiteral()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlDoubleLiteral"
 * @generated
 */
public interface SqmlDoubleLiteral extends EObject, ISqmlDoubleLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlDoubleLiteral_Value()
	 * @model unique="false" dataType="com.softicar.sqml.model.externals.BigDecimal"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.literals.SqmlDoubleLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

} // SqmlDoubleLiteral
