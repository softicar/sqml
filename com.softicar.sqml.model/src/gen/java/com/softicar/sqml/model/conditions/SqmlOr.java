/**
 */
package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlOr#getLeft <em>Left</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlOr#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlOr()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlOr"
 * @generated
 */
public interface SqmlOr extends EObject, ISqmlOr {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ISqmlExpression)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlOr_Left()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getLeft();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlOr#getLeft <em>Left</em>}' containment reference.
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
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlOr_Right()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getRight();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlOr#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ISqmlExpression value);

} // SqmlOr
