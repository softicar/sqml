/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlNegation#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlNegation()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlNegation"
 * @generated
 */
public interface SqmlNegation extends EObject, ISqmlNegation {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlNegation_Expression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlNegation#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ISqmlExpression value);

} // SqmlNegation
