/**
 */
package com.softicar.sqml.model.tables;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableRow#getTable <em>Table</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableRow#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableRow()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlTableRow"
 * @generated
 */
public interface SqmlTableRow extends EObject, ISqmlTableRow {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(SqmlTable)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableRow_Table()
	 * @see com.softicar.sqml.model.tables.SqmlTable#getRows
	 * @model opposite="rows" transient="false"
	 * @generated
	 */
	SqmlTable getTable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableRow#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(SqmlTable value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.tables.SqmlTableRowValue}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTableRowValue#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableRow_Values()
	 * @see com.softicar.sqml.model.tables.SqmlTableRowValue#getRow
	 * @model opposite="row" containment="true"
	 * @generated
	 */
	EList<SqmlTableRowValue> getValues();

} // SqmlTableRow
