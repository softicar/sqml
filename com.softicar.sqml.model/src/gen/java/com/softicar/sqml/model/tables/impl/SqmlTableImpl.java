/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.files.impl.SqmlFileElementImpl;

import com.softicar.sqml.model.tables.SqmlTable;
import com.softicar.sqml.model.tables.SqmlTableColumn;
import com.softicar.sqml.model.tables.SqmlTableKey;
import com.softicar.sqml.model.tables.SqmlTableRow;
import com.softicar.sqml.model.tables.TablesPackage;

import com.softicar.sqml.model.types.ISqmlEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl#isEnumTable <em>Enum Table</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl#getPhysicalNameOverride <em>Physical Name Override</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl#getTableKeys <em>Table Keys</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl#getEnums <em>Enums</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlTableImpl extends SqmlFileElementImpl implements SqmlTable {
	/**
	 * The default value of the '{@link #isEnumTable() <em>Enum Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnumTable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENUM_TABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnumTable() <em>Enum Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnumTable()
	 * @generated
	 * @ordered
	 */
	protected boolean enumTable = ENUM_TABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysicalNameOverride() <em>Physical Name Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNameOverride()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_NAME_OVERRIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalNameOverride() <em>Physical Name Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalNameOverride()
	 * @generated
	 * @ordered
	 */
	protected String physicalNameOverride = PHYSICAL_NAME_OVERRIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<SqmlTableColumn> columns;

	/**
	 * The cached value of the '{@link #getTableKeys() <em>Table Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<SqmlTableKey> tableKeys;

	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<ISqmlEnum> enums;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<SqmlTableRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.SQML_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnumTable() {
		return enumTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumTable(boolean newEnumTable) {
		boolean oldEnumTable = enumTable;
		enumTable = newEnumTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE__ENUM_TABLE, oldEnumTable, enumTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalNameOverride() {
		return physicalNameOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalNameOverride(String newPhysicalNameOverride) {
		String oldPhysicalNameOverride = physicalNameOverride;
		physicalNameOverride = newPhysicalNameOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE__PHYSICAL_NAME_OVERRIDE, oldPhysicalNameOverride, physicalNameOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqmlTableColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentWithInverseEList<SqmlTableColumn>(SqmlTableColumn.class, this, TablesPackage.SQML_TABLE__COLUMNS, TablesPackage.SQML_TABLE_COLUMN__TABLE);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqmlTableKey> getTableKeys() {
		if (tableKeys == null) {
			tableKeys = new EObjectContainmentWithInverseEList<SqmlTableKey>(SqmlTableKey.class, this, TablesPackage.SQML_TABLE__TABLE_KEYS, TablesPackage.SQML_TABLE_KEY__TABLE);
		}
		return tableKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISqmlEnum> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<ISqmlEnum>(ISqmlEnum.class, this, TablesPackage.SQML_TABLE__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqmlTableRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentWithInverseEList<SqmlTableRow>(SqmlTableRow.class, this, TablesPackage.SQML_TABLE__ROWS, TablesPackage.SQML_TABLE_ROW__TABLE);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE__COLUMNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumns()).basicAdd(otherEnd, msgs);
			case TablesPackage.SQML_TABLE__TABLE_KEYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTableKeys()).basicAdd(otherEnd, msgs);
			case TablesPackage.SQML_TABLE__ROWS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRows()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case TablesPackage.SQML_TABLE__TABLE_KEYS:
				return ((InternalEList<?>)getTableKeys()).basicRemove(otherEnd, msgs);
			case TablesPackage.SQML_TABLE__ENUMS:
				return ((InternalEList<?>)getEnums()).basicRemove(otherEnd, msgs);
			case TablesPackage.SQML_TABLE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE__ENUM_TABLE:
				return isEnumTable();
			case TablesPackage.SQML_TABLE__PHYSICAL_NAME_OVERRIDE:
				return getPhysicalNameOverride();
			case TablesPackage.SQML_TABLE__COLUMNS:
				return getColumns();
			case TablesPackage.SQML_TABLE__TABLE_KEYS:
				return getTableKeys();
			case TablesPackage.SQML_TABLE__ENUMS:
				return getEnums();
			case TablesPackage.SQML_TABLE__ROWS:
				return getRows();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE__ENUM_TABLE:
				setEnumTable((Boolean)newValue);
				return;
			case TablesPackage.SQML_TABLE__PHYSICAL_NAME_OVERRIDE:
				setPhysicalNameOverride((String)newValue);
				return;
			case TablesPackage.SQML_TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends SqmlTableColumn>)newValue);
				return;
			case TablesPackage.SQML_TABLE__TABLE_KEYS:
				getTableKeys().clear();
				getTableKeys().addAll((Collection<? extends SqmlTableKey>)newValue);
				return;
			case TablesPackage.SQML_TABLE__ENUMS:
				getEnums().clear();
				getEnums().addAll((Collection<? extends ISqmlEnum>)newValue);
				return;
			case TablesPackage.SQML_TABLE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends SqmlTableRow>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE__ENUM_TABLE:
				setEnumTable(ENUM_TABLE_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE__PHYSICAL_NAME_OVERRIDE:
				setPhysicalNameOverride(PHYSICAL_NAME_OVERRIDE_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE__COLUMNS:
				getColumns().clear();
				return;
			case TablesPackage.SQML_TABLE__TABLE_KEYS:
				getTableKeys().clear();
				return;
			case TablesPackage.SQML_TABLE__ENUMS:
				getEnums().clear();
				return;
			case TablesPackage.SQML_TABLE__ROWS:
				getRows().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE__ENUM_TABLE:
				return enumTable != ENUM_TABLE_EDEFAULT;
			case TablesPackage.SQML_TABLE__PHYSICAL_NAME_OVERRIDE:
				return PHYSICAL_NAME_OVERRIDE_EDEFAULT == null ? physicalNameOverride != null : !PHYSICAL_NAME_OVERRIDE_EDEFAULT.equals(physicalNameOverride);
			case TablesPackage.SQML_TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case TablesPackage.SQML_TABLE__TABLE_KEYS:
				return tableKeys != null && !tableKeys.isEmpty();
			case TablesPackage.SQML_TABLE__ENUMS:
				return enums != null && !enums.isEmpty();
			case TablesPackage.SQML_TABLE__ROWS:
				return rows != null && !rows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (enumTable: ");
		result.append(enumTable);
		result.append(", physicalNameOverride: ");
		result.append(physicalNameOverride);
		result.append(')');
		return result.toString();
	}

} //SqmlTableImpl
