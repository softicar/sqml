/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Row Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlRowConstructor#isExplicit <em>Explicit</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlRowConstructor#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlRowConstructor()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlRowConstructor"
 * @generated
 */
public interface SqmlRowConstructor extends EObject, ISqmlRowConstructor {
	/**
	 * Returns the value of the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit</em>' attribute.
	 * @see #setExplicit(boolean)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlRowConstructor_Explicit()
	 * @model unique="false"
	 * @generated
	 */
	boolean isExplicit();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlRowConstructor#isExplicit <em>Explicit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit</em>' attribute.
	 * @see #isExplicit()
	 * @generated
	 */
	void setExplicit(boolean value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.expressions.ISqmlExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlRowConstructor_Expressions()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	EList<ISqmlExpression> getExpressions();

} // SqmlRowConstructor
