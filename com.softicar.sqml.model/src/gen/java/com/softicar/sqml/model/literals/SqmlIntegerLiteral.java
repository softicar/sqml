/**
 */
package com.softicar.sqml.model.literals;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.literals.SqmlIntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlIntegerLiteral()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlIntegerLiteral"
 * @generated
 */
public interface SqmlIntegerLiteral extends EObject, ISqmlIntegerLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlIntegerLiteral_Value()
	 * @model unique="false"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.literals.SqmlIntegerLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // SqmlIntegerLiteral
