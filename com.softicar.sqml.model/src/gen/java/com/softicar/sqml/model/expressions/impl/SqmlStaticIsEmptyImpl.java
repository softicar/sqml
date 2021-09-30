/**
 */
package com.softicar.sqml.model.expressions.impl;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.expressions.SqmlStaticIsEmpty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Static Is Empty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsEmptyImpl#getParameterReference <em>Parameter Reference</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsEmptyImpl#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlStaticIsEmptyImpl extends MinimalEObjectImpl.Container implements SqmlStaticIsEmpty {
	/**
	 * The cached value of the '{@link #getParameterReference() <em>Parameter Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterReference()
	 * @generated
	 * @ordered
	 */
	protected ISqmlStaticVariableReference parameterReference;

	/**
	 * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlStaticIsEmptyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.SQML_STATIC_IS_EMPTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlStaticVariableReference getParameterReference() {
		return parameterReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterReference(ISqmlStaticVariableReference newParameterReference, NotificationChain msgs) {
		ISqmlStaticVariableReference oldParameterReference = parameterReference;
		parameterReference = newParameterReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE, oldParameterReference, newParameterReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterReference(ISqmlStaticVariableReference newParameterReference) {
		if (newParameterReference != parameterReference) {
			NotificationChain msgs = null;
			if (parameterReference != null)
				msgs = ((InternalEObject)parameterReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE, null, msgs);
			if (newParameterReference != null)
				msgs = ((InternalEObject)newParameterReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE, null, msgs);
			msgs = basicSetParameterReference(newParameterReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE, newParameterReference, newParameterReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_STATIC_IS_EMPTY__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE:
				return basicSetParameterReference(null, msgs);
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
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE:
				return getParameterReference();
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__NOT:
				return isNot();
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
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE:
				setParameterReference((ISqmlStaticVariableReference)newValue);
				return;
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__NOT:
				setNot((Boolean)newValue);
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
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE:
				setParameterReference((ISqmlStaticVariableReference)null);
				return;
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__NOT:
				setNot(NOT_EDEFAULT);
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
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE:
				return parameterReference != null;
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY__NOT:
				return not != NOT_EDEFAULT;
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
		result.append(" (not: ");
		result.append(not);
		result.append(')');
		return result.toString();
	}

} //SqmlStaticIsEmptyImpl
