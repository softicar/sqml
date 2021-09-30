/**
 */
package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.selects.ISqmlOrderByExpression;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Group Concat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#getOrderByExpressions <em>Order By Expressions</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlGroupConcat()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlGroupConcat"
 * @generated
 */
public interface SqmlGroupConcat extends EObject, ISqmlGroupConcat {
	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlGroupConcat_Distinct()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.expressions.ISqmlExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlGroupConcat_Expressions()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	EList<ISqmlExpression> getExpressions();

	/**
	 * Returns the value of the '<em><b>Order By Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.selects.ISqmlOrderByExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By Expressions</em>' containment reference list.
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlGroupConcat_OrderByExpressions()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlOrderByExpression" containment="true"
	 * @generated
	 */
	EList<ISqmlOrderByExpression> getOrderByExpressions();

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' attribute.
	 * @see #setSeparator(String)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlGroupConcat_Separator()
	 * @model unique="false"
	 * @generated
	 */
	String getSeparator();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#getSeparator <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' attribute.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(String value);

} // SqmlGroupConcat
