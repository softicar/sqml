/**
 */
package com.softicar.sqml.model.literals;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.literals.SqmlBooleanLiteral#isTrue <em>True</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlBooleanLiteral()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlBooleanLiteral"
 * @generated
 */
public interface SqmlBooleanLiteral extends EObject, ISqmlBooleanLiteral {
	/**
	 * Returns the value of the '<em><b>True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True</em>' attribute.
	 * @see #setTrue(boolean)
	 * @see com.softicar.sqml.model.literals.LiteralsPackage#getSqmlBooleanLiteral_True()
	 * @model unique="false"
	 * @generated
	 */
	boolean isTrue();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.literals.SqmlBooleanLiteral#isTrue <em>True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True</em>' attribute.
	 * @see #isTrue()
	 * @generated
	 */
	void setTrue(boolean value);

} // SqmlBooleanLiteral
