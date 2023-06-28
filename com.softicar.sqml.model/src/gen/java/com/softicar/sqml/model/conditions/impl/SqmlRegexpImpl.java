/**
 */
package com.softicar.sqml.model.conditions.impl;

import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.conditions.SqmlRegexp;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Regexp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlRegexpImpl#isNot <em>Not</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlRegexpImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlRegexpImpl#getRegexp <em>Regexp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlRegexpImpl extends MinimalEObjectImpl.Container implements SqmlRegexp {
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
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected ISqmlExpression operand;

	/**
	 * The cached value of the '{@link #getRegexp() <em>Regexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegexp()
	 * @generated
	 * @ordered
	 */
	protected ISqmlExpression regexp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlRegexpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.SQML_REGEXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_REGEXP__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlExpression getOperand() {
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperand(ISqmlExpression newOperand, NotificationChain msgs) {
		ISqmlExpression oldOperand = operand;
		operand = newOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_REGEXP__OPERAND, oldOperand, newOperand);
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
	public void setOperand(ISqmlExpression newOperand) {
		if (newOperand != operand) {
			NotificationChain msgs = null;
			if (operand != null)
				msgs = ((InternalEObject)operand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_REGEXP__OPERAND, null, msgs);
			if (newOperand != null)
				msgs = ((InternalEObject)newOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_REGEXP__OPERAND, null, msgs);
			msgs = basicSetOperand(newOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_REGEXP__OPERAND, newOperand, newOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlExpression getRegexp() {
		return regexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegexp(ISqmlExpression newRegexp, NotificationChain msgs) {
		ISqmlExpression oldRegexp = regexp;
		regexp = newRegexp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_REGEXP__REGEXP, oldRegexp, newRegexp);
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
	public void setRegexp(ISqmlExpression newRegexp) {
		if (newRegexp != regexp) {
			NotificationChain msgs = null;
			if (regexp != null)
				msgs = ((InternalEObject)regexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_REGEXP__REGEXP, null, msgs);
			if (newRegexp != null)
				msgs = ((InternalEObject)newRegexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_REGEXP__REGEXP, null, msgs);
			msgs = basicSetRegexp(newRegexp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_REGEXP__REGEXP, newRegexp, newRegexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.SQML_REGEXP__OPERAND:
				return basicSetOperand(null, msgs);
			case ConditionsPackage.SQML_REGEXP__REGEXP:
				return basicSetRegexp(null, msgs);
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
			case ConditionsPackage.SQML_REGEXP__NOT:
				return isNot();
			case ConditionsPackage.SQML_REGEXP__OPERAND:
				return getOperand();
			case ConditionsPackage.SQML_REGEXP__REGEXP:
				return getRegexp();
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
			case ConditionsPackage.SQML_REGEXP__NOT:
				setNot((Boolean)newValue);
				return;
			case ConditionsPackage.SQML_REGEXP__OPERAND:
				setOperand((ISqmlExpression)newValue);
				return;
			case ConditionsPackage.SQML_REGEXP__REGEXP:
				setRegexp((ISqmlExpression)newValue);
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
			case ConditionsPackage.SQML_REGEXP__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case ConditionsPackage.SQML_REGEXP__OPERAND:
				setOperand((ISqmlExpression)null);
				return;
			case ConditionsPackage.SQML_REGEXP__REGEXP:
				setRegexp((ISqmlExpression)null);
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
			case ConditionsPackage.SQML_REGEXP__NOT:
				return not != NOT_EDEFAULT;
			case ConditionsPackage.SQML_REGEXP__OPERAND:
				return operand != null;
			case ConditionsPackage.SQML_REGEXP__REGEXP:
				return regexp != null;
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

} //SqmlRegexpImpl
