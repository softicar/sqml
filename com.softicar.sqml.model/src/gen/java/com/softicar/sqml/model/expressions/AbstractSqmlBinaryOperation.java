/**
 */
package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.functions.ISqmlFunction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Sqml Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getFunction <em>Function</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getLeft <em>Left</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getAbstractSqmlBinaryOperation()
 * @model abstract="true" superTypes="com.softicar.sqml.model.interfaces.ISqmlBinaryOperation"
 * @generated
 */
public interface AbstractSqmlBinaryOperation extends EObject, ISqmlBinaryOperation {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(ISqmlFunction)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getAbstractSqmlBinaryOperation_Function()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlFunction"
	 * @generated
	 */
	ISqmlFunction getFunction();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ISqmlFunction value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getAbstractSqmlBinaryOperation_Left()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getLeft();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getLeft <em>Left</em>}' containment reference.
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
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getAbstractSqmlBinaryOperation_Right()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getRight();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ISqmlExpression value);

} // AbstractSqmlBinaryOperation
