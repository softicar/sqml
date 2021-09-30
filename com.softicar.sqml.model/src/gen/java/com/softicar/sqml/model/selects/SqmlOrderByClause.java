/**
 */
package com.softicar.sqml.model.selects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Order By Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlOrderByClause#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlOrderByClause()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlOrderByClause"
 * @generated
 */
public interface SqmlOrderByClause extends EObject, ISqmlOrderByClause {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.selects.SqmlOrderByExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlOrderByClause_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SqmlOrderByExpression> getExpressions();

} // SqmlOrderByClause
