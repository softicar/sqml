/**
 */
package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.ISqmlModelElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Sql</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlSql#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSql()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSql"
 * @generated
 */
public interface SqmlSql extends EObject, ISqmlSql {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.ISqmlModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSql_Tokens()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlModelElement" containment="true"
	 * @generated
	 */
	EList<ISqmlModelElement> getTokens();

} // SqmlSql
