/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Select Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getTitle <em>Title</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectColumn()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectColumn"
 * @generated
 */
public interface SqmlSelectColumn extends EObject, ISqmlSelectColumn {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectColumn_Alias()
	 * @model unique="false"
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectColumn_Title()
	 * @model unique="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ISqmlExpression)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectColumn_Expression()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlExpression" containment="true"
	 * @generated
	 */
	ISqmlExpression getExpression();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSelectColumn#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ISqmlExpression value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectColumn_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // SqmlSelectColumn
