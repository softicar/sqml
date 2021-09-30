/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Group By Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlGroupByClause#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlGroupByClause()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlGroupByClause"
 * @generated
 */
public interface SqmlGroupByClause extends EObject, ISqmlGroupByClause {
	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.expressions.ISqmlExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlGroupByClause_Expressions()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	EList<ISqmlExpression> getExpressions();

} // SqmlGroupByClause
