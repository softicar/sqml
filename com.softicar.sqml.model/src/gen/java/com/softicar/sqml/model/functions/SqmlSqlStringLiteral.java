/**
 */
package com.softicar.sqml.model.functions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Sql String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlSqlStringLiteral#getString <em>String</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlStringLiteral()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSqlStringLiteral"
 * @generated
 */
public interface SqmlSqlStringLiteral extends EObject, ISqmlSqlStringLiteral {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlStringLiteral_String()
	 * @model unique="false"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlSqlStringLiteral#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

} // SqmlSqlStringLiteral
