/**
 */
package com.softicar.sqml.model.tables.impl;

import com.softicar.sqml.model.literals.ISqmlLiteral;

import com.softicar.sqml.model.tables.SqmlLiteralDefaultValue;
import com.softicar.sqml.model.tables.TablesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Literal Default Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlLiteralDefaultValueImpl#isMinus <em>Minus</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.impl.SqmlLiteralDefaultValueImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlLiteralDefaultValueImpl extends MinimalEObjectImpl.Container implements SqmlLiteralDefaultValue {
	/**
	 * The default value of the '{@link #isMinus() <em>Minus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinus() <em>Minus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinus()
	 * @generated
	 * @ordered
	 */
	protected boolean minus = MINUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected ISqmlLiteral<?> literal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlLiteralDefaultValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.SQML_LITERAL_DEFAULT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinus() {
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinus(boolean newMinus) {
		boolean oldMinus = minus;
		minus = newMinus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_LITERAL_DEFAULT_VALUE__MINUS, oldMinus, minus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlLiteral<?> getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(ISqmlLiteral<?> newLiteral, NotificationChain msgs) {
		ISqmlLiteral<?> oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL, oldLiteral, newLiteral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteral(ISqmlLiteral<?> newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null)
				msgs = ((InternalEObject)literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL, null, msgs);
			if (newLiteral != null)
				msgs = ((InternalEObject)newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL, null, msgs);
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL, newLiteral, newLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL:
				return basicSetLiteral(null, msgs);
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
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__MINUS:
				return isMinus();
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL:
				return getLiteral();
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
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__MINUS:
				setMinus((Boolean)newValue);
				return;
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL:
				setLiteral((ISqmlLiteral<?>)newValue);
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
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__MINUS:
				setMinus(MINUS_EDEFAULT);
				return;
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL:
				setLiteral((ISqmlLiteral<?>)null);
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
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__MINUS:
				return minus != MINUS_EDEFAULT;
			case TablesPackage.SQML_LITERAL_DEFAULT_VALUE__LITERAL:
				return literal != null;
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
		result.append(" (minus: ");
		result.append(minus);
		result.append(')');
		return result.toString();
	}

} //SqmlLiteralDefaultValueImpl
