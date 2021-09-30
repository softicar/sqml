/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml If Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlIfNull#getTestExpression <em>Test Expression</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlIfNull#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlIfNull()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlIfNull"
 * @generated
 */
public interface SqmlIfNull extends EObject, ISqmlIfNull {
	/**
	 * Returns the value of the '<em><b>Test Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Expression</em>' containment reference.
	 * @see #setTestExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlIfNull_TestExpression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getTestExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlIfNull#getTestExpression <em>Test Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Expression</em>' containment reference.
	 * @see #getTestExpression()
	 * @generated
	 */
	void setTestExpression(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlIfNull_ThenExpression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getThenExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlIfNull#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(ISqmlExpression value);

} // SqmlIfNull
