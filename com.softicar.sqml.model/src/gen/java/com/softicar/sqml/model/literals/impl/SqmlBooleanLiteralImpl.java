/**
 */
package com.softicar.sqml.model.literals.impl;

import com.softicar.sqml.model.literals.LiteralsPackage;
import com.softicar.sqml.model.literals.SqmlBooleanLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Boolean Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.literals.impl.SqmlBooleanLiteralImpl#isTrue <em>True</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlBooleanLiteralImpl extends MinimalEObjectImpl.Container implements SqmlBooleanLiteral {
	/**
	 * The default value of the '{@link #isTrue() <em>True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrue() <em>True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrue()
	 * @generated
	 * @ordered
	 */
	protected boolean true_ = TRUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlBooleanLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LiteralsPackage.Literals.SQML_BOOLEAN_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTrue() {
		return true_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrue(boolean newTrue) {
		boolean oldTrue = true_;
		true_ = newTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LiteralsPackage.SQML_BOOLEAN_LITERAL__TRUE, oldTrue, true_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LiteralsPackage.SQML_BOOLEAN_LITERAL__TRUE:
				return isTrue();
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
			case LiteralsPackage.SQML_BOOLEAN_LITERAL__TRUE:
				setTrue((Boolean)newValue);
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
			case LiteralsPackage.SQML_BOOLEAN_LITERAL__TRUE:
				setTrue(TRUE_EDEFAULT);
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
			case LiteralsPackage.SQML_BOOLEAN_LITERAL__TRUE:
				return true_ != TRUE_EDEFAULT;
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
		result.append(" (true: ");
		result.append(true_);
		result.append(')');
		return result.toString();
	}

} //SqmlBooleanLiteralImpl
