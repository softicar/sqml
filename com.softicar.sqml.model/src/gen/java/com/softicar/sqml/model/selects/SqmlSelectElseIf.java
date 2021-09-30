/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.expressions.ISqmlStaticExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Select Else If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectElseIf#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectElseIf()
 * @model superTypes="com.softicar.sqml.model.selects.AbstractSqmlSelectBlock com.softicar.sqml.model.interfaces.ISqmlSelectElseIf"
 * @generated
 */
public interface SqmlSelectElseIf extends AbstractSqmlSelectBlock, ISqmlSelectElseIf {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ISqmlStaticExpression)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectElseIf_Condition()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlStaticExpression" containment="true"
	 * @generated
	 */
	ISqmlStaticExpression getCondition();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSelectElseIf#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ISqmlStaticExpression value);

} // SqmlSelectElseIf
