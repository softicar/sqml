/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Case When</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlCaseWhen#getWhenExpression <em>When Expression</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlCaseWhen#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlCaseWhen()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlCaseWhen"
 * @generated
 */
public interface SqmlCaseWhen extends EObject, ISqmlCaseWhen {
	/**
	 * Returns the value of the '<em><b>When Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Expression</em>' containment reference.
	 * @see #setWhenExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlCaseWhen_WhenExpression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getWhenExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlCaseWhen#getWhenExpression <em>When Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Expression</em>' containment reference.
	 * @see #getWhenExpression()
	 * @generated
	 */
	void setWhenExpression(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlCaseWhen_ThenExpression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getThenExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlCaseWhen#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(ISqmlExpression value);

} // SqmlCaseWhen
