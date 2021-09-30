/**
 */
package com.softicar.sqml.model.literals;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.literals.SqmlStringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlStringLiteral()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlStringLiteral"
 * @generated
 */
public interface SqmlStringLiteral extends EObject, ISqmlStringLiteral {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlStringLiteral_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.literals.SqmlStringLiteral#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SqmlStringLiteral
