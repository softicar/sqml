/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.expressions.ISqmlValueReference;

import com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue;
import com.softicar.sqml.model.tables.TablesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Row Constructor Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlRowConstructorDefaultValueImpl#getValueReferences <em>Value References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlRowConstructorDefaultValueImpl extends MinimalEObjectImpl.Container implements SqmlRowConstructorDefaultValue {
	/**
	 * The cached value of the '{@link #getValueReferences() <em>Value References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ISqmlValueReference> valueReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlRowConstructorDefaultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISqmlValueReference> getValueReferences() {
		if (valueReferences == null) {
			valueReferences = new EObjectContainmentEList<ISqmlValueReference>(ISqmlValueReference.class, this, TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES);
		}
		return valueReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES:
				return ((InternalEList<?>)getValueReferences()).basicRemove(otherEnd, msgs);
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
			case TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES:
				return getValueReferences();
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
			case TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES:
				getValueReferences().clear();
				getValueReferences().addAll((Collection<? extends ISqmlValueReference>)newValue);
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
			case TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES:
				getValueReferences().clear();
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
			case TablesPackage.SQML_ROW_CONSTRUCTOR_DEFAULT_VALUE__VALUE_REFERENCES:
				return valueReferences != null && !valueReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SqmlRowConstructorDefaultValueImpl
