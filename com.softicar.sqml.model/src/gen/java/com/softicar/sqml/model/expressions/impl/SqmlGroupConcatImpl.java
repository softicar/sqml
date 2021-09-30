/**
 */
package com.softicar.sqml.model.expressions.impl;

import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.SqmlGroupConcat;

import com.softicar.sqml.model.selects.ISqmlOrderByExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Group Concat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl#getOrderByExpressions <em>Order By Expressions</em>}</li>
 *   <li>{@link com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlGroupConcatImpl extends MinimalEObjectImpl.Container implements SqmlGroupConcat {
	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected boolean distinct = DISTINCT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ISqmlExpression> expressions;

	/**
	 * The cached value of the '{@link #getOrderByExpressions() <em>Order By Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderByExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<ISqmlOrderByExpression> orderByExpressions;

	/**
	 * The default value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected static final String SEPARATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeparator() <em>Separator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeparator()
	 * @generated
	 * @ordered
	 */
	protected String separator = SEPARATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlGroupConcatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.SQML_GROUP_CONCAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinct(boolean newDistinct) {
		boolean oldDistinct = distinct;
		distinct = newDistinct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_GROUP_CONCAT__DISTINCT, oldDistinct, distinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISqmlExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<ISqmlExpression>(ISqmlExpression.class, this, ExpressionsPackage.SQML_GROUP_CONCAT__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISqmlOrderByExpression> getOrderByExpressions() {
		if (orderByExpressions == null) {
			orderByExpressions = new EObjectContainmentEList<ISqmlOrderByExpression>(ISqmlOrderByExpression.class, this, ExpressionsPackage.SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS);
		}
		return orderByExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeparator() {
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeparator(String newSeparator) {
		String oldSeparator = separator;
		separator = newSeparator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionsPackage.SQML_GROUP_CONCAT__SEPARATOR, oldSeparator, separator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionsPackage.SQML_GROUP_CONCAT__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
			case ExpressionsPackage.SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS:
				return ((InternalEList<?>)getOrderByExpressions()).basicRemove(otherEnd, msgs);
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
			case ExpressionsPackage.SQML_GROUP_CONCAT__DISTINCT:
				return isDistinct();
			case ExpressionsPackage.SQML_GROUP_CONCAT__EXPRESSIONS:
				return getExpressions();
			case ExpressionsPackage.SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS:
				return getOrderByExpressions();
			case ExpressionsPackage.SQML_GROUP_CONCAT__SEPARATOR:
				return getSeparator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExpressionsPackage.SQML_GROUP_CONCAT__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case ExpressionsPackage.SQML_GROUP_CONCAT__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends ISqmlExpression>)newValue);
				return;
			case ExpressionsPackage.SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS:
				getOrderByExpressions().clear();
				getOrderByExpressions().addAll((Collection<? extends ISqmlOrderByExpression>)newValue);
				return;
			case ExpressionsPackage.SQML_GROUP_CONCAT__SEPARATOR:
				setSeparator((String)newValue);
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
			case ExpressionsPackage.SQML_GROUP_CONCAT__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case ExpressionsPackage.SQML_GROUP_CONCAT__EXPRESSIONS:
				getExpressions().clear();
				return;
			case ExpressionsPackage.SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS:
				getOrderByExpressions().clear();
				return;
			case ExpressionsPackage.SQML_GROUP_CONCAT__SEPARATOR:
				setSeparator(SEPARATOR_EDEFAULT);
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
			case ExpressionsPackage.SQML_GROUP_CONCAT__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case ExpressionsPackage.SQML_GROUP_CONCAT__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
			case ExpressionsPackage.SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS:
				return orderByExpressions != null && !orderByExpressions.isEmpty();
			case ExpressionsPackage.SQML_GROUP_CONCAT__SEPARATOR:
				return SEPARATOR_EDEFAULT == null ? separator != null : !SEPARATOR_EDEFAULT.equals(separator);
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
		result.append(" (distinct: ");
		result.append(distinct);
		result.append(", separator: ");
		result.append(separator);
		result.append(')');
		return result.toString();
	}

} //SqmlGroupConcatImpl
