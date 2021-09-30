/**
 */
package com.softicar.sqml.model.expressions.impl;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.SqmlIfNull;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml If Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlIfNullImpl#getTestExpression <em>Test Expression</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlIfNullImpl#getThenExpression <em>Then Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlIfNullImpl extends MinimalEObjectImpl.Container implements SqmlIfNull {
	/**
	 * The cached value of the '{@link #getTestExpression() <em>Test Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestExpression()
	 * @generated
	 * @ordered
	 */
	protected ISqmlExpression testExpression;

	/**
	 * The cached value of the '{@link #getThenExpression() <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenExpression()
	 * @generated
	 * @ordered
	 */
	protected ISqmlExpression thenExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlIfNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.SQML_IF_NULL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlExpression getTestExpression() {
		return testExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestExpression(ISqmlExpression newTestExpression, NotificationChain msgs) {
		ISqmlExpression oldTestExpression = testExpression;
		testExpression = newTestExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION, oldTestExpression, newTestExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestExpression(ISqmlExpression newTestExpression) {
		if (newTestExpression != testExpression) {
			NotificationChain msgs = null;
			if (testExpression != null)
				msgs = ((InternalEObject)testExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION, null, msgs);
			if (newTestExpression != null)
				msgs = ((InternalEObject)newTestExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION, null, msgs);
			msgs = basicSetTestExpression(newTestExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION, newTestExpression, newTestExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlExpression getThenExpression() {
		return thenExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenExpression(ISqmlExpression newThenExpression, NotificationChain msgs) {
		ISqmlExpression oldThenExpression = thenExpression;
		thenExpression = newThenExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION, oldThenExpression, newThenExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenExpression(ISqmlExpression newThenExpression) {
		if (newThenExpression != thenExpression) {
			NotificationChain msgs = null;
			if (thenExpression != null)
				msgs = ((InternalEObject)thenExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION, null, msgs);
			if (newThenExpression != null)
				msgs = ((InternalEObject)newThenExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION, null, msgs);
			msgs = basicSetThenExpression(newThenExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION, newThenExpression, newThenExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION:
				return basicSetTestExpression(null, msgs);
			case ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION:
				return basicSetThenExpression(null, msgs);
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
			case ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION:
				return getTestExpression();
			case ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION:
				return getThenExpression();
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
			case ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION:
				setTestExpression((ISqmlExpression)newValue);
				return;
			case ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION:
				setThenExpression((ISqmlExpression)newValue);
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
			case ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION:
				setTestExpression((ISqmlExpression)null);
				return;
			case ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION:
				setThenExpression((ISqmlExpression)null);
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
			case ExpressionsPackage.SQML_IF_NULL__TEST_EXPRESSION:
				return testExpression != null;
			case ExpressionsPackage.SQML_IF_NULL__THEN_EXPRESSION:
				return thenExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //SqmlIfNullImpl
