/**
 */
package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.types.ISqmlTypeReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunction#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunction#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunction#getSql <em>Sql</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunction#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunction()
 * @model superTypes="com.softicar.sqml.model.files.SqmlFileElement com.softicar.sqml.model.interfaces.ISqmlFunction"
 * @generated
 */
public interface SqmlFunction extends SqmlFileElement, ISqmlFunction {
	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(ISqmlTypeReference)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunction_ReturnType()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTypeReference" containment="true"
	 * @generated
	 */
	ISqmlTypeReference getReturnType();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlFunction#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(ISqmlTypeReference value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.functions.SqmlFunctionParameter}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunction_Parameters()
	 * @see com.softicar.sqml.model.functions.SqmlFunctionParameter#getFunction
	 * @model opposite="function" containment="true"
	 * @generated
	 */
	EList<SqmlFunctionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sql</em>' containment reference.
	 * @see #setSql(ISqmlSql)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunction_Sql()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSql" containment="true"
	 * @generated
	 */
	ISqmlSql getSql();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlFunction#getSql <em>Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sql</em>' containment reference.
	 * @see #getSql()
	 * @generated
	 */
	void setSql(ISqmlSql value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunction_Expression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlFunction#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ISqmlExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	String toString();

} // SqmlFunction
