/**
 */
package com.softicar.sqml.model.types.impl;

import com.softicar.sqml.model.literals.ISqmlLiteral;

import com.softicar.sqml.model.types.SqmlEnum;
import com.softicar.sqml.model.types.SqmlEnumerator;
import com.softicar.sqml.model.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Enumerator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.types.impl.SqmlEnumeratorImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.impl.SqmlEnumeratorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.impl.SqmlEnumeratorImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlEnumeratorImpl extends MinimalEObjectImpl.Container implements SqmlEnumerator {
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ISqmlLiteral<?> value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlEnumeratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SQML_ENUMERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlEnum getEnum() {
		if (eContainerFeatureID() != TypesPackage.SQML_ENUMERATOR__ENUM) return null;
		return (SqmlEnum)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlEnum basicGetEnum() {
		if (eContainerFeatureID() != TypesPackage.SQML_ENUMERATOR__ENUM) return null;
		return (SqmlEnum)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnum(SqmlEnum newEnum, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnum, TypesPackage.SQML_ENUMERATOR__ENUM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnum(SqmlEnum newEnum) {
		if (newEnum != eInternalContainer() || (eContainerFeatureID() != TypesPackage.SQML_ENUMERATOR__ENUM && newEnum != null)) {
			if (EcoreUtil.isAncestor(this, newEnum))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnum != null)
				msgs = ((InternalEObject)newEnum).eInverseAdd(this, TypesPackage.SQML_ENUM__ENUMERATORS, SqmlEnum.class, msgs);
			msgs = basicSetEnum(newEnum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SQML_ENUMERATOR__ENUM, newEnum, newEnum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SQML_ENUMERATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlLiteral<?> getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ISqmlLiteral<?> newValue, NotificationChain msgs) {
		ISqmlLiteral<?> oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SQML_ENUMERATOR__VALUE, oldValue, newValue);
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
	public void setValue(ISqmlLiteral<?> newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SQML_ENUMERATOR__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SQML_ENUMERATOR__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SQML_ENUMERATOR__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SQML_ENUMERATOR__ENUM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnum((SqmlEnum)otherEnd, msgs);
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
			case TypesPackage.SQML_ENUMERATOR__ENUM:
				return basicSetEnum(null, msgs);
			case TypesPackage.SQML_ENUMERATOR__VALUE:
				return basicSetValue(null, msgs);
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
			case TypesPackage.SQML_ENUMERATOR__ENUM:
				return eInternalContainer().eInverseRemove(this, TypesPackage.SQML_ENUM__ENUMERATORS, SqmlEnum.class, msgs);
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
			case TypesPackage.SQML_ENUMERATOR__ENUM:
				if (resolve) return getEnum();
				return basicGetEnum();
			case TypesPackage.SQML_ENUMERATOR__NAME:
				return getName();
			case TypesPackage.SQML_ENUMERATOR__VALUE:
				return getValue();
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
			case TypesPackage.SQML_ENUMERATOR__ENUM:
				setEnum((SqmlEnum)newValue);
				return;
			case TypesPackage.SQML_ENUMERATOR__NAME:
				setName((String)newValue);
				return;
			case TypesPackage.SQML_ENUMERATOR__VALUE:
				setValue((ISqmlLiteral<?>)newValue);
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
			case TypesPackage.SQML_ENUMERATOR__ENUM:
				setEnum((SqmlEnum)null);
				return;
			case TypesPackage.SQML_ENUMERATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypesPackage.SQML_ENUMERATOR__VALUE:
				setValue((ISqmlLiteral<?>)null);
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
			case TypesPackage.SQML_ENUMERATOR__ENUM:
				return basicGetEnum() != null;
			case TypesPackage.SQML_ENUMERATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypesPackage.SQML_ENUMERATOR__VALUE:
				return value != null;
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

} //SqmlEnumeratorImpl
