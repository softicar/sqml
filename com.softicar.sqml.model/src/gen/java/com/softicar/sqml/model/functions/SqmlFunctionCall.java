/**
 */
package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunctionCall#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunctionCall()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlFunctionCall"
 * @generated
 */
public interface SqmlFunctionCall extends EObject, ISqmlFunctionCall {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(ISqmlFunction)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunctionCall_Function()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlFunction"
	 * @generated
	 */
	ISqmlFunction getFunction();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlFunctionCall#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(ISqmlFunction value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.expressions.ISqmlExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunctionCall_Arguments()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	EList<ISqmlExpression> getArguments();

} // SqmlFunctionCall
