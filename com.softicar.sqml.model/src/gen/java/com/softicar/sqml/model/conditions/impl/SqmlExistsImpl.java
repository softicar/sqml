/**
 */
package com.softicar.sqml.model.conditions.impl;

import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.conditions.SqmlExists;

import com.softicar.sqml.model.expressions.ISqmlSubSelect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Exists</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlExistsImpl#getSubSelect <em>Sub Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlExistsImpl extends MinimalEObjectImpl.Container implements SqmlExists {
	/**
	 * The cached value of the '{@link #getSubSelect() <em>Sub Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSelect()
	 * @generated
	 * @ordered
	 */
	protected ISqmlSubSelect subSelect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlExistsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.SQML_EXISTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlSubSelect getSubSelect() {
		return subSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubSelect(ISqmlSubSelect newSubSelect, NotificationChain msgs) {
		ISqmlSubSelect oldSubSelect = subSelect;
		subSelect = newSubSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_EXISTS__SUB_SELECT, oldSubSelect, newSubSelect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubSelect(ISqmlSubSelect newSubSelect) {
		if (newSubSelect != subSelect) {
			NotificationChain msgs = null;
			if (subSelect != null)
				msgs = ((InternalEObject)subSelect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_EXISTS__SUB_SELECT, null, msgs);
			if (newSubSelect != null)
				msgs = ((InternalEObject)newSubSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_EXISTS__SUB_SELECT, null, msgs);
			msgs = basicSetSubSelect(newSubSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_EXISTS__SUB_SELECT, newSubSelect, newSubSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.SQML_EXISTS__SUB_SELECT:
				return basicSetSubSelect(null, msgs);
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
			case ConditionsPackage.SQML_EXISTS__SUB_SELECT:
				return getSubSelect();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConditionsPackage.SQML_EXISTS__SUB_SELECT:
				setSubSelect((ISqmlSubSelect)newValue);
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
			case ConditionsPackage.SQML_EXISTS__SUB_SELECT:
				setSubSelect((ISqmlSubSelect)null);
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
			case ConditionsPackage.SQML_EXISTS__SUB_SELECT:
				return subSelect != null;
		}
		return super.eIsSet(featureID);
	}

} //SqmlExistsImpl
