/**
 */
package com.softicar.sqml.model.functions.impl;

import com.softicar.sqml.model.expressions.ISqmlExpression;

import com.softicar.sqml.model.files.impl.SqmlFileElementImpl;

import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.ISqmlSql;
import com.softicar.sqml.model.functions.SqmlFunction;
import com.softicar.sqml.model.functions.SqmlFunctionMethods;
import com.softicar.sqml.model.functions.SqmlFunctionParameter;

import com.softicar.sqml.model.types.ISqmlTypeReference;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlFunctionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlFunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlFunctionImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlFunctionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlFunctionImpl extends SqmlFileElementImpl implements SqmlFunction {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected ISqmlTypeReference returnType;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SqmlFunctionParameter> parameters;

	/**
	 * The cached value of the '{@link #getSql() <em>Sql</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSql()
	 * @generated
	 * @ordered
	 */
	protected ISqmlSql sql;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SQML_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlTypeReference getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(ISqmlTypeReference newReturnType, NotificationChain msgs) {
		ISqmlTypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(ISqmlTypeReference newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SqmlFunctionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentWithInverseEList<SqmlFunctionParameter>(SqmlFunctionParameter.class, this, FunctionsPackage.SQML_FUNCTION__PARAMETERS, FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlSql getSql() {
		return sql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSql(ISqmlSql newSql, NotificationChain msgs) {
		ISqmlSql oldSql = sql;
		sql = newSql;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION__SQL, oldSql, newSql);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSql(ISqmlSql newSql) {
		if (newSql != sql) {
			NotificationChain msgs = null;
			if (sql != null)
				msgs = ((InternalEObject)sql).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION__SQL, null, msgs);
			if (newSql != null)
				msgs = ((InternalEObject)newSql).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION__SQL, null, msgs);
			msgs = basicSetSql(newSql, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION__SQL, newSql, newSql));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(ISqmlExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return SqmlFunctionMethods.getDisplayName(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.SQML_FUNCTION__PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameters()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.SQML_FUNCTION__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case FunctionsPackage.SQML_FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.SQML_FUNCTION__SQL:
				return basicSetSql(null, msgs);
			case FunctionsPackage.SQML_FUNCTION__EXPRESSION:
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
			case FunctionsPackage.SQML_FUNCTION__RETURN_TYPE:
				return getReturnType();
			case FunctionsPackage.SQML_FUNCTION__PARAMETERS:
				return getParameters();
			case FunctionsPackage.SQML_FUNCTION__SQL:
				return getSql();
			case FunctionsPackage.SQML_FUNCTION__EXPRESSION:
				return getExpression();
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
			case FunctionsPackage.SQML_FUNCTION__RETURN_TYPE:
				setReturnType((ISqmlTypeReference)newValue);
				return;
			case FunctionsPackage.SQML_FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SqmlFunctionParameter>)newValue);
				return;
			case FunctionsPackage.SQML_FUNCTION__SQL:
				setSql((ISqmlSql)newValue);
				return;
			case FunctionsPackage.SQML_FUNCTION__EXPRESSION:
				setExpression((ISqmlExpression)newValue);
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
			case FunctionsPackage.SQML_FUNCTION__RETURN_TYPE:
				setReturnType((ISqmlTypeReference)null);
				return;
			case FunctionsPackage.SQML_FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case FunctionsPackage.SQML_FUNCTION__SQL:
				setSql((ISqmlSql)null);
				return;
			case FunctionsPackage.SQML_FUNCTION__EXPRESSION:
				setExpression((ISqmlExpression)null);
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
			case FunctionsPackage.SQML_FUNCTION__RETURN_TYPE:
				return returnType != null;
			case FunctionsPackage.SQML_FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case FunctionsPackage.SQML_FUNCTION__SQL:
				return sql != null;
			case FunctionsPackage.SQML_FUNCTION__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FunctionsPackage.SQML_FUNCTION___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SqmlFunctionImpl
