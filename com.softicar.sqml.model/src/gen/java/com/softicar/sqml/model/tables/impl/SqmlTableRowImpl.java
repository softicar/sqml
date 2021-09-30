/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.tables.SqmlTable;
import com.softicar.sqml.model.tables.SqmlTableRow;
import com.softicar.sqml.model.tables.SqmlTableRowValue;
import com.softicar.sqml.model.tables.TablesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableRowImpl#getTable <em>Table</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlTableRowImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlTableRowImpl extends MinimalEObjectImpl.Container implements SqmlTableRow {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<SqmlTableRowValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlTableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.SQML_TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTable getTable() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_ROW__TABLE) return null;
		return (SqmlTable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlTable basicGetTable() {
		if (eContainerFeatureID() != TablesPackage.SQML_TABLE_ROW__TABLE) return null;
		return (SqmlTable)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(SqmlTable newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, TablesPackage.SQML_TABLE_ROW__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(SqmlTable newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != TablesPackage.SQML_TABLE_ROW__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, TablesPackage.SQML_TABLE__ROWS, SqmlTable.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_TABLE_ROW__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqmlTableRowValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentWithInverseEList<SqmlTableRowValue>(SqmlTableRowValue.class, this, TablesPackage.SQML_TABLE_ROW__VALUES, TablesPackage.SQML_TABLE_ROW_VALUE__ROW);
		}
		return values;
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
			case TablesPackage.SQML_TABLE_ROW__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((SqmlTable)otherEnd, msgs);
			case TablesPackage.SQML_TABLE_ROW__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
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
			case TablesPackage.SQML_TABLE_ROW__TABLE:
				return basicSetTable(null, msgs);
			case TablesPackage.SQML_TABLE_ROW__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case TablesPackage.SQML_TABLE_ROW__TABLE:
				return eInternalContainer().eInverseRemove(this, TablesPackage.SQML_TABLE__ROWS, SqmlTable.class, msgs);
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
			case TablesPackage.SQML_TABLE_ROW__TABLE:
				if (resolve) return getTable();
				return basicGetTable();
			case TablesPackage.SQML_TABLE_ROW__VALUES:
				return getValues();
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
			case TablesPackage.SQML_TABLE_ROW__TABLE:
				setTable((SqmlTable)newValue);
				return;
			case TablesPackage.SQML_TABLE_ROW__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends SqmlTableRowValue>)newValue);
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
			case TablesPackage.SQML_TABLE_ROW__TABLE:
				setTable((SqmlTable)null);
				return;
			case TablesPackage.SQML_TABLE_ROW__VALUES:
				getValues().clear();
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
			case TablesPackage.SQML_TABLE_ROW__TABLE:
				return basicGetTable() != null;
			case TablesPackage.SQML_TABLE_ROW__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SqmlTableRowImpl
