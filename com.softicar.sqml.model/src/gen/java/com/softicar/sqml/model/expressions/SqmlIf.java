/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlIf#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlIf#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlIf#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlIf()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlIf"
 * @generated
 */
public interface SqmlIf extends EObject, ISqmlIf {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlIf_Condition()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getCondition();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlIf#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlIf_ThenExpression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getThenExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlIf#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlIf_ElseExpression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getElseExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlIf#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(ISqmlExpression value);

} // SqmlIf
