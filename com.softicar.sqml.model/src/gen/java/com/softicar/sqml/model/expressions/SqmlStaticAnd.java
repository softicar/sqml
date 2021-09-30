/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Static And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlStaticAnd#getLeft <em>Left</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlStaticAnd#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticAnd()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticAnd"
 * @generated
 */
public interface SqmlStaticAnd extends EObject, ISqmlStaticAnd {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ISqmlStaticExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticAnd_Left()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlStaticExpression" containment="true"
	 * @generated
	 */
	ISqmlStaticExpression getLeft();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlStaticAnd#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ISqmlStaticExpression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ISqmlStaticExpression)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlStaticAnd_Right()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlStaticExpression" containment="true"
	 * @generated
	 */
	ISqmlStaticExpression getRight();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlStaticAnd#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ISqmlStaticExpression value);

} // SqmlStaticAnd
