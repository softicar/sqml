/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Order By Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlOrderByExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlOrderByExpression#isDescending <em>Descending</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlOrderByExpression()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlOrderByExpression"
 * @generated
 */
public interface SqmlOrderByExpression extends EObject, ISqmlOrderByExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlOrderByExpression_Expression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlOrderByExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Descending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descending</em>' attribute.
	 * @see #setDescending(boolean)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlOrderByExpression_Descending()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDescending();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlOrderByExpression#isDescending <em>Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descending</em>' attribute.
	 * @see #isDescending()
	 * @generated
	 */
	void setDescending(boolean value);

} // SqmlOrderByExpression
