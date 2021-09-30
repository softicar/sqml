/**
 */
package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Between</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlBetween#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlBetween#getLeft <em>Left</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlBetween#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlBetween()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlBetween"
 * @generated
 */
public interface SqmlBetween extends EObject, ISqmlBetween {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(ISqmlExpression)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlBetween_Operand()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getOperand();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlBetween#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ISqmlExpression)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlBetween_Left()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getLeft();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlBetween#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ISqmlExpression)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlBetween_Right()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getRight();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlBetween#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ISqmlExpression value);

} // SqmlBetween
