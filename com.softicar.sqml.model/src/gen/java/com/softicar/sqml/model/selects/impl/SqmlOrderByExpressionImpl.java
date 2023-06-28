/**
 */
package com.softicar.sqml.model.selects.impl;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.selects.SqmlOrderByExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Order By Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlOrderByExpressionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlOrderByExpressionImpl#isDescending <em>Descending</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlOrderByExpressionImpl extends MinimalEObjectImpl.Container implements SqmlOrderByExpression {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected ISqmlExpression expression;

	/**
	 * The default value of the '{@link #isDescending() <em>Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescending()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESCENDING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDescending() <em>Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescending()
	 * @generated
	 * @ordered
	 */
	protected boolean descending = DESCENDING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlOrderByExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectsPackage.Literals.SQML_ORDER_BY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(ISqmlExpression newExpression, NotificationChain msgs) {
		ISqmlExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(ISqmlExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDescending() {
		return descending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescending(boolean newDescending) {
		boolean oldDescending = descending;
		descending = newDescending;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_ORDER_BY_EXPRESSION__DESCENDING, oldDescending, descending));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION:
				return getExpression();
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__DESCENDING:
				return isDescending();
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
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION:
				setExpression((ISqmlExpression)newValue);
				return;
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__DESCENDING:
				setDescending((Boolean)newValue);
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
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION:
				setExpression((ISqmlExpression)null);
				return;
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__DESCENDING:
				setDescending(DESCENDING_EDEFAULT);
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
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__EXPRESSION:
				return expression != null;
			case SelectsPackage.SQML_ORDER_BY_EXPRESSION__DESCENDING:
				return descending != DESCENDING_EDEFAULT;
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
		result.append(" (descending: ");
		result.append(descending);
		result.append(')');
		return result.toString();
	}

} //SqmlOrderByExpressionImpl
