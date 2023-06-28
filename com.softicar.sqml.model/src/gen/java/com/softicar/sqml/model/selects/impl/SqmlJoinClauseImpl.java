/**
 */
package com.softicar.sqml.model.selects.impl;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.selects.SqmlJoinClause;

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
 * An implementation of the model object '<em><b>Sqml Join Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlJoinClauseImpl#isLeftJoin <em>Left Join</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlJoinClauseImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.impl.SqmlJoinClauseImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlJoinClauseImpl extends MinimalEObjectImpl.Container implements SqmlJoinClause {
	/**
	 * The default value of the '{@link #isLeftJoin() <em>Left Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftJoin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LEFT_JOIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLeftJoin() <em>Left Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLeftJoin()
	 * @generated
	 * @ordered
	 */
	protected boolean leftJoin = LEFT_JOIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected ISqmlVariable variable;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ISqmlExpression> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlJoinClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SelectsPackage.Literals.SQML_JOIN_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLeftJoin() {
		return leftJoin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeftJoin(boolean newLeftJoin) {
		boolean oldLeftJoin = leftJoin;
		leftJoin = newLeftJoin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_JOIN_CLAUSE__LEFT_JOIN, oldLeftJoin, leftJoin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlVariable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(ISqmlVariable newVariable, NotificationChain msgs) {
		ISqmlVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE, oldVariable, newVariable);
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
	public void setVariable(ISqmlVariable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISqmlExpression> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<ISqmlExpression>(ISqmlExpression.class, this, SelectsPackage.SQML_JOIN_CLAUSE__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE:
				return basicSetVariable(null, msgs);
			case SelectsPackage.SQML_JOIN_CLAUSE__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case SelectsPackage.SQML_JOIN_CLAUSE__LEFT_JOIN:
				return isLeftJoin();
			case SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE:
				return getVariable();
			case SelectsPackage.SQML_JOIN_CLAUSE__CONDITIONS:
				return getConditions();
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
			case SelectsPackage.SQML_JOIN_CLAUSE__LEFT_JOIN:
				setLeftJoin((Boolean)newValue);
				return;
			case SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE:
				setVariable((ISqmlVariable)newValue);
				return;
			case SelectsPackage.SQML_JOIN_CLAUSE__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends ISqmlExpression>)newValue);
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
			case SelectsPackage.SQML_JOIN_CLAUSE__LEFT_JOIN:
				setLeftJoin(LEFT_JOIN_EDEFAULT);
				return;
			case SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE:
				setVariable((ISqmlVariable)null);
				return;
			case SelectsPackage.SQML_JOIN_CLAUSE__CONDITIONS:
				getConditions().clear();
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
			case SelectsPackage.SQML_JOIN_CLAUSE__LEFT_JOIN:
				return leftJoin != LEFT_JOIN_EDEFAULT;
			case SelectsPackage.SQML_JOIN_CLAUSE__VARIABLE:
				return variable != null;
			case SelectsPackage.SQML_JOIN_CLAUSE__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
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
		result.append(" (leftJoin: ");
		result.append(leftJoin);
		result.append(')');
		return result.toString();
	}

} //SqmlJoinClauseImpl
