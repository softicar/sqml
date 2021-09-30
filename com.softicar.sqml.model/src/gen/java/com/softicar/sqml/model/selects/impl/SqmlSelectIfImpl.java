/**
 */
package com.softicar.sqml.model.selects.impl;

import com.softicar.sqml.model.expressions.ISqmlStaticExpression;

import com.softicar.sqml.model.selects.AbstractSqmlSelectBlock;
import com.softicar.sqml.model.selects.ISqmlSelectElse;
import com.softicar.sqml.model.selects.ISqmlSelectElseIf;
import com.softicar.sqml.model.selects.ISqmlSelectIf;
import com.softicar.sqml.model.selects.ISqmlSelectPart;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.selects.SqmlSelectIf;
import com.softicar.sqml.model.selects.SqmlSelectIfMethods;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Select If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlSelectIfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlSelectIfImpl#getElseIfs <em>Else Ifs</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlSelectIfImpl#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlSelectIfImpl extends AbstractSqmlSelectBlockImpl implements SqmlSelectIf {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected ISqmlStaticExpression condition;

	/**
	 * The cached value of the '{@link #getElseIfs() <em>Else Ifs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfs()
	 * @generated
	 * @ordered
	 */
	protected EList<ISqmlSelectElseIf> elseIfs;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected ISqmlSelectElse else_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlSelectIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectsPackage.Literals.SQML_SELECT_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlStaticExpression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(ISqmlStaticExpression newCondition, NotificationChain msgs) {
		ISqmlStaticExpression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_SELECT_IF__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(ISqmlStaticExpression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_SELECT_IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_SELECT_IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_SELECT_IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISqmlSelectElseIf> getElseIfs() {
		if (elseIfs == null) {
			elseIfs = new EObjectContainmentEList<ISqmlSelectElseIf>(ISqmlSelectElseIf.class, this, SelectsPackage.SQML_SELECT_IF__ELSE_IFS);
		}
		return elseIfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlSelectElse getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(ISqmlSelectElse newElse, NotificationChain msgs) {
		ISqmlSelectElse oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_SELECT_IF__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(ISqmlSelectElse newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_SELECT_IF__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_SELECT_IF__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_SELECT_IF__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<? extends ISqmlSelectPart> getAllElements() {
		return SqmlSelectIfMethods.getAllElements(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelectsPackage.SQML_SELECT_IF__CONDITION:
				return basicSetCondition(null, msgs);
			case SelectsPackage.SQML_SELECT_IF__ELSE_IFS:
				return ((InternalEList<?>)getElseIfs()).basicRemove(otherEnd, msgs);
			case SelectsPackage.SQML_SELECT_IF__ELSE:
				return basicSetElse(null, msgs);
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
			case SelectsPackage.SQML_SELECT_IF__CONDITION:
				return getCondition();
			case SelectsPackage.SQML_SELECT_IF__ELSE_IFS:
				return getElseIfs();
			case SelectsPackage.SQML_SELECT_IF__ELSE:
				return getElse();
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
			case SelectsPackage.SQML_SELECT_IF__CONDITION:
				setCondition((ISqmlStaticExpression)newValue);
				return;
			case SelectsPackage.SQML_SELECT_IF__ELSE_IFS:
				getElseIfs().clear();
				getElseIfs().addAll((Collection<? extends ISqmlSelectElseIf>)newValue);
				return;
			case SelectsPackage.SQML_SELECT_IF__ELSE:
				setElse((ISqmlSelectElse)newValue);
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
			case SelectsPackage.SQML_SELECT_IF__CONDITION:
				setCondition((ISqmlStaticExpression)null);
				return;
			case SelectsPackage.SQML_SELECT_IF__ELSE_IFS:
				getElseIfs().clear();
				return;
			case SelectsPackage.SQML_SELECT_IF__ELSE:
				setElse((ISqmlSelectElse)null);
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
			case SelectsPackage.SQML_SELECT_IF__CONDITION:
				return condition != null;
			case SelectsPackage.SQML_SELECT_IF__ELSE_IFS:
				return elseIfs != null && !elseIfs.isEmpty();
			case SelectsPackage.SQML_SELECT_IF__ELSE:
				return else_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractSqmlSelectBlock.class) {
			switch (baseOperationID) {
				case SelectsPackage.ABSTRACT_SQML_SELECT_BLOCK___GET_ALL_ELEMENTS: return SelectsPackage.SQML_SELECT_IF___GET_ALL_ELEMENTS;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ISqmlSelectIf.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SelectsPackage.SQML_SELECT_IF___GET_ALL_ELEMENTS:
				return getAllElements();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SqmlSelectIfImpl
