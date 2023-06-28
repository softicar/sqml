/**
 */
package com.softicar.sqml.model.conditions.impl;

import com.softicar.sqml.model.conditions.ConditionsPackage;
import com.softicar.sqml.model.conditions.SqmlLike;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Like</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlLikeImpl#isNot <em>Not</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlLikeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlLikeImpl#getRight <em>Right</em>}</li>
 *   <li>{@link com.softicar.sqml.model.conditions.impl.SqmlLikeImpl#getEscape <em>Escape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlLikeImpl extends MinimalEObjectImpl.Container implements SqmlLike {
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
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected ISqmlExpression left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected ISqmlExpression right;

	/**
	 * The default value of the '{@link #getEscape() <em>Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscape()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEscape() <em>Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscape()
	 * @generated
	 * @ordered
	 */
	protected String escape = ESCAPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlLikeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.SQML_LIKE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_LIKE__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlExpression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(ISqmlExpression newLeft, NotificationChain msgs) {
		ISqmlExpression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_LIKE__LEFT, oldLeft, newLeft);
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
	public void setLeft(ISqmlExpression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_LIKE__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_LIKE__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_LIKE__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlExpression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(ISqmlExpression newRight, NotificationChain msgs) {
		ISqmlExpression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_LIKE__RIGHT, oldRight, newRight);
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
	public void setRight(ISqmlExpression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_LIKE__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.SQML_LIKE__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_LIKE__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEscape() {
		return escape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEscape(String newEscape) {
		String oldEscape = escape;
		escape = newEscape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.SQML_LIKE__ESCAPE, oldEscape, escape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.SQML_LIKE__LEFT:
				return basicSetLeft(null, msgs);
			case ConditionsPackage.SQML_LIKE__RIGHT:
				return basicSetRight(null, msgs);
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
			case ConditionsPackage.SQML_LIKE__NOT:
				return isNot();
			case ConditionsPackage.SQML_LIKE__LEFT:
				return getLeft();
			case ConditionsPackage.SQML_LIKE__RIGHT:
				return getRight();
			case ConditionsPackage.SQML_LIKE__ESCAPE:
				return getEscape();
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
			case ConditionsPackage.SQML_LIKE__NOT:
				setNot((Boolean)newValue);
				return;
			case ConditionsPackage.SQML_LIKE__LEFT:
				setLeft((ISqmlExpression)newValue);
				return;
			case ConditionsPackage.SQML_LIKE__RIGHT:
				setRight((ISqmlExpression)newValue);
				return;
			case ConditionsPackage.SQML_LIKE__ESCAPE:
				setEscape((String)newValue);
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
			case ConditionsPackage.SQML_LIKE__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case ConditionsPackage.SQML_LIKE__LEFT:
				setLeft((ISqmlExpression)null);
				return;
			case ConditionsPackage.SQML_LIKE__RIGHT:
				setRight((ISqmlExpression)null);
				return;
			case ConditionsPackage.SQML_LIKE__ESCAPE:
				setEscape(ESCAPE_EDEFAULT);
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
			case ConditionsPackage.SQML_LIKE__NOT:
				return not != NOT_EDEFAULT;
			case ConditionsPackage.SQML_LIKE__LEFT:
				return left != null;
			case ConditionsPackage.SQML_LIKE__RIGHT:
				return right != null;
			case ConditionsPackage.SQML_LIKE__ESCAPE:
				return ESCAPE_EDEFAULT == null ? escape != null : !ESCAPE_EDEFAULT.equals(escape);
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
		result.append(", escape: ");
		result.append(escape);
		result.append(')');
		return result.toString();
	}

} //SqmlLikeImpl
