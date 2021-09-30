/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.SqmlTable;
import com.softicar.sqml.model.tables.SqmlTableKey;
import com.softicar.sqml.model.tables.TablesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Table Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableKeyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableKeyImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableKeyImpl#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SqmlTableKeyImpl extends MinimalEObjectImpl.Container implements SqmlTableKey {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<ISqmlTableColumn> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlTableKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.SQML_TABLE_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISqmlTableColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<ISqmlTableColumn>(ISqmlTableColumn.class, this, TablesPackage.SQML_TABLE_KEY__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTable getTable() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_KEY__TABLE) return null;
		return (SqmlTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTable basicGetTable() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_KEY__TABLE) return null;
		return (SqmlTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(SqmlTable newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, TablesPackage.SQML_TABLE_KEY__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(SqmlTable newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != TablesPackage.SQML_TABLE_KEY__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, TablesPackage.SQML_TABLE__TABLE_KEYS, SqmlTable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_KEY__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_KEY__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((SqmlTable)otherEnd, msgs);
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
			case TablesPackage.SQML_TABLE_KEY__TABLE:
				return basicSetTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TablesPackage.SQML_TABLE_KEY__TABLE:
				return eInternalContainer().eInverseRemove(this, TablesPackage.SQML_TABLE__TABLE_KEYS, SqmlTable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablesPackage.SQML_TABLE_KEY__NAME:
				return getName();
			case TablesPackage.SQML_TABLE_KEY__COLUMNS:
				return getColumns();
			case TablesPackage.SQML_TABLE_KEY__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
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
			case TablesPackage.SQML_TABLE_KEY__NAME:
				setName((String)newValue);
				return;
			case TablesPackage.SQML_TABLE_KEY__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends ISqmlTableColumn>)newValue);
				return;
			case TablesPackage.SQML_TABLE_KEY__TABLE:
				setTable((SqmlTable)newValue);
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
			case TablesPackage.SQML_TABLE_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TablesPackage.SQML_TABLE_KEY__COLUMNS:
				getColumns().clear();
				return;
			case TablesPackage.SQML_TABLE_KEY__TABLE:
				setTable((SqmlTable)null);
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
			case TablesPackage.SQML_TABLE_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TablesPackage.SQML_TABLE_KEY__COLUMNS:
				return columns != null && !columns.isEmpty();
			case TablesPackage.SQML_TABLE_KEY__TABLE:
				return basicGetTable() != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SqmlTableKeyImpl
