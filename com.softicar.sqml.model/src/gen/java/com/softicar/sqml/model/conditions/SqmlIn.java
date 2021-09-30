/**
 */
package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlIn#isNot <em>Not</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlIn#getLeft <em>Left</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlIn#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlIn()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlIn"
 * @generated
 */
public interface SqmlIn extends EObject, ISqmlIn {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlIn_Not()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlIn#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ISqmlExpression)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlIn_Left()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getLeft();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlIn#getLeft <em>Left</em>}' containment reference.
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
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlIn_Right()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getRight();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlIn#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ISqmlExpression value);

} // SqmlIn
