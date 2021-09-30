/**
 */
package com.softicar.sqml.model.tables;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Table Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableKey#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableKey#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableKey#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableKey()
 * @model abstract="true" superTypes="com.softicar.sqml.model.interfaces.ISqmlTableKey"
 * @generated
 */
public interface SqmlTableKey extends EObject, ISqmlTableKey {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableKey_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.tables.ISqmlTableColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableKey_Columns()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTableColumn"
	 * @generated
	 */
	EList<ISqmlTableColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTable#getTableKeys <em>Table Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(SqmlTable)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableKey_Table()
	 * @see com.softicar.sqml.model.tables.SqmlTable#getTableKeys
	 * @model opposite="tableKeys" transient="false"
	 * @generated
	 */
	SqmlTable getTable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableKey#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(SqmlTable value);

} // SqmlTableKey
