/**
 */
package com.softicar.sqml.model.selects.impl;

import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.selects.SqmlSubSelectVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Sub Select Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlSubSelectVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlSubSelectVariableImpl#getSubSelect <em>Sub Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlSubSelectVariableImpl extends MinimalEObjectImpl.Container implements SqmlSubSelectVariable {
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
	 * The cached value of the '{@link #getSubSelect() <em>Sub Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSelect()
	 * @generated
	 * @ordered
	 */
	protected ISqmlSelect subSelect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlSubSelectVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectsPackage.Literals.SQML_SUB_SELECT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_SUB_SELECT_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlSelect getSubSelect() {
		return subSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubSelect(ISqmlSelect newSubSelect, NotificationChain msgs) {
		ISqmlSelect oldSubSelect = subSelect;
		subSelect = newSubSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT, oldSubSelect, newSubSelect);
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
	public void setSubSelect(ISqmlSelect newSubSelect) {
		if (newSubSelect != subSelect) {
			NotificationChain msgs = null;
			if (subSelect != null)
				msgs = ((InternalEObject)subSelect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT, null, msgs);
			if (newSubSelect != null)
				msgs = ((InternalEObject)newSubSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT, null, msgs);
			msgs = basicSetSubSelect(newSubSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT, newSubSelect, newSubSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT:
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
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__NAME:
				return getName();
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT:
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
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT:
				setSubSelect((ISqmlSelect)newValue);
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
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT:
				setSubSelect((ISqmlSelect)null);
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
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SelectsPackage.SQML_SUB_SELECT_VARIABLE__SUB_SELECT:
				return subSelect != null;
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

} //SqmlSubSelectVariableImpl
