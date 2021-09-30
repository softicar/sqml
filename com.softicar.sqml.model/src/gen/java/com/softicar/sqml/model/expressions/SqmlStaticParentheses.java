/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Static Parentheses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlStaticParentheses#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticParentheses()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticParentheses"
 * @generated
 */
public interface SqmlStaticParentheses extends EObject, ISqmlStaticParentheses {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ISqmlStaticExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticParentheses_Expression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlStaticExpression" containment="true"
	 * @generated
	 */
	ISqmlStaticExpression getExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlStaticParentheses#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ISqmlStaticExpression value);

} // SqmlStaticParentheses
