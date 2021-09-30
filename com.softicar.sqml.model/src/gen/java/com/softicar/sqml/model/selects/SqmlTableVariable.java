/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.tables.ISqmlTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Table Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlTableVariable#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlTableVariable#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlTableVariable()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlTableVariable"
 * @generated
 */
public interface SqmlTableVariable extends EObject, ISqmlTableVariable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlTableVariable_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlTableVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(ISqmlTable)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlTableVariable_Table()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTable"
	 * @generated
	 */
	ISqmlTable getTable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlTableVariable#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(ISqmlTable value);

} // SqmlTableVariable
