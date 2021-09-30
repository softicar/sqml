/**
 */
package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Is Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlIsNull#isNot <em>Not</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlIsNull#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlIsNull()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlIsNull"
 * @generated
 */
public interface SqmlIsNull extends EObject, ISqmlIsNull {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlIsNull_Not()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlIsNull#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference.
	 * @see #setOperand(ISqmlExpression)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlIsNull_Operand()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getOperand();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlIsNull#getOperand <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand</em>' containment reference.
	 * @see #getOperand()
	 * @generated
	 */
	void setOperand(ISqmlExpression value);

} // SqmlIsNull
