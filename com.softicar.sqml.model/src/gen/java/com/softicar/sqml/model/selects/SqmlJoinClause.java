/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Join Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlJoinClause#isLeftJoin <em>Left Join</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlJoinClause#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlJoinClause#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlJoinClause()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlJoinClause"
 * @generated
 */
public interface SqmlJoinClause extends EObject, ISqmlJoinClause {
	/**
	 * Returns the value of the '<em><b>Left Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Join</em>' attribute.
	 * @see #setLeftJoin(boolean)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlJoinClause_LeftJoin()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLeftJoin();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlJoinClause#isLeftJoin <em>Left Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Join</em>' attribute.
	 * @see #isLeftJoin()
	 * @generated
	 */
	void setLeftJoin(boolean value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(ISqmlVariable)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlJoinClause_Variable()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlVariable" containment="true"
	 * @generated
	 */
	ISqmlVariable getVariable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlJoinClause#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ISqmlVariable value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.expressions.ISqmlExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlJoinClause_Conditions()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	EList<ISqmlExpression> getConditions();

} // SqmlJoinClause
