/**
 */
package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.types.ISqmlEnum;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTable#isEnumTable <em>Enum Table</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTable#getPhysicalNameOverride <em>Physical Name Override</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTable#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTable#getTableKeys <em>Table Keys</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTable#getEnums <em>Enums</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTable#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTable()
 * @model superTypes="com.softicar.sqml.model.files.SqmlFileElement com.softicar.sqml.model.interfaces.ISqmlTable"
 * @generated
 */
public interface SqmlTable extends SqmlFileElement, ISqmlTable {
	/**
	 * Returns the value of the '<em><b>Enum Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Table</em>' attribute.
	 * @see #setEnumTable(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTable_EnumTable()
	 * @model unique="false"
	 * @generated
	 */
	boolean isEnumTable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTable#isEnumTable <em>Enum Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Table</em>' attribute.
	 * @see #isEnumTable()
	 * @generated
	 */
	void setEnumTable(boolean value);

	/**
	 * Returns the value of the '<em><b>Physical Name Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Name Override</em>' attribute.
	 * @see #setPhysicalNameOverride(String)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTable_PhysicalNameOverride()
	 * @model unique="false"
	 * @generated
	 */
	String getPhysicalNameOverride();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTable#getPhysicalNameOverride <em>Physical Name Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Name Override</em>' attribute.
	 * @see #getPhysicalNameOverride()
	 * @generated
	 */
	void setPhysicalNameOverride(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.tables.SqmlTableColumn}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTableColumn#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTable_Columns()
	 * @see com.softicar.sqml.model.tables.SqmlTableColumn#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<SqmlTableColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Table Keys</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.tables.SqmlTableKey}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTableKey#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Keys</em>' containment reference list.
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTable_TableKeys()
	 * @see com.softicar.sqml.model.tables.SqmlTableKey#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<SqmlTableKey> getTableKeys();

	/**
	 * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.types.ISqmlEnum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' containment reference list.
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTable_Enums()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlEnum" containment="true"
	 * @generated
	 */
	EList<ISqmlEnum> getEnums();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.tables.SqmlTableRow}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTableRow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTable_Rows()
	 * @see com.softicar.sqml.model.tables.SqmlTableRow#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<SqmlTableRow> getRows();

} // SqmlTable
