/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlCase#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlCase#getWhens <em>Whens</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlCase#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlCase()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlCase"
 * @generated
 */
public interface SqmlCase extends EObject, ISqmlCase {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlCase_Operand()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getOperand();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlCase#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Whens</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.expressions.SqmlCaseWhen}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Whens</em>' containment reference list.
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlCase_Whens()
	 * @model containment="true"
	 * @generated
	 */
	EList<SqmlCaseWhen> getWhens();

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlCase_ElseExpression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getElseExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlCase#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(ISqmlExpression value);

} // SqmlCase
