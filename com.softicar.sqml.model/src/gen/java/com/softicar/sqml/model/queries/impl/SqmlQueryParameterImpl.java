/**
 */
package com.softicar.sqml.model.queries.impl;

import com.softicar.sqml.model.queries.QueriesPackage;
import com.softicar.sqml.model.queries.SqmlQuery;
import com.softicar.sqml.model.queries.SqmlQueryParameter;

import com.softicar.sqml.model.types.ISqmlTypeReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Query Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl#getQuery <em>Query</em>}</li>
 *   <li>{@link com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlQueryParameterImpl extends MinimalEObjectImpl.Container implements SqmlQueryParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeReference() <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeReference()
	 * @generated
	 * @ordered
	 */
	protected ISqmlTypeReference typeReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlQueryParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueriesPackage.Literals.SQML_QUERY_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueriesPackage.SQML_QUERY_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlQuery getQuery() {
		if (eContainerFeatureID() != QueriesPackage.SQML_QUERY_PARAMETER__QUERY) return null;
		return (SqmlQuery)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlQuery basicGetQuery() {
		if (eContainerFeatureID() != QueriesPackage.SQML_QUERY_PARAMETER__QUERY) return null;
		return (SqmlQuery)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuery(SqmlQuery newQuery, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQuery, QueriesPackage.SQML_QUERY_PARAMETER__QUERY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuery(SqmlQuery newQuery) {
		if (newQuery != eInternalContainer() || (eContainerFeatureID() != QueriesPackage.SQML_QUERY_PARAMETER__QUERY && newQuery != null)) {
			if (EcoreUtil.isAncestor(this, newQuery))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQuery != null)
				msgs = ((InternalEObject)newQuery).eInverseAdd(this, QueriesPackage.SQML_QUERY__PARAMETERS, SqmlQuery.class, msgs);
			msgs = basicSetQuery(newQuery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueriesPackage.SQML_QUERY_PARAMETER__QUERY, newQuery, newQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueriesPackage.SQML_QUERY_PARAMETER__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISqmlTypeReference getTypeReference() {
		return typeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeReference(ISqmlTypeReference newTypeReference, NotificationChain msgs) {
		ISqmlTypeReference oldTypeReference = typeReference;
		typeReference = newTypeReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
	public void setTypeReference(ISqmlTypeReference newTypeReference) {
		if (newTypeReference != typeReference) {
			NotificationChain msgs = null;
			if (typeReference != null)
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueriesPackage.SQML_QUERY_PARAMETER__QUERY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQuery((SqmlQuery)otherEnd, msgs);
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
			case QueriesPackage.SQML_QUERY_PARAMETER__QUERY:
				return basicSetQuery(null, msgs);
			case QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE:
				return basicSetTypeReference(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QueriesPackage.SQML_QUERY_PARAMETER__QUERY:
				return eInternalContainer().eInverseRemove(this, QueriesPackage.SQML_QUERY__PARAMETERS, SqmlQuery.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueriesPackage.SQML_QUERY_PARAMETER__NAME:
				return getName();
			case QueriesPackage.SQML_QUERY_PARAMETER__QUERY:
				if (resolve) return getQuery();
				return basicGetQuery();
			case QueriesPackage.SQML_QUERY_PARAMETER__OPTIONAL:
				return isOptional();
			case QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE:
				return getTypeReference();
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
			case QueriesPackage.SQML_QUERY_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case QueriesPackage.SQML_QUERY_PARAMETER__QUERY:
				setQuery((SqmlQuery)newValue);
				return;
			case QueriesPackage.SQML_QUERY_PARAMETER__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE:
				setTypeReference((ISqmlTypeReference)newValue);
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
			case QueriesPackage.SQML_QUERY_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QueriesPackage.SQML_QUERY_PARAMETER__QUERY:
				setQuery((SqmlQuery)null);
				return;
			case QueriesPackage.SQML_QUERY_PARAMETER__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE:
				setTypeReference((ISqmlTypeReference)null);
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
			case QueriesPackage.SQML_QUERY_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QueriesPackage.SQML_QUERY_PARAMETER__QUERY:
				return basicGetQuery() != null;
			case QueriesPackage.SQML_QUERY_PARAMETER__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case QueriesPackage.SQML_QUERY_PARAMETER__TYPE_REFERENCE:
				return typeReference != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //SqmlQueryParameterImpl
