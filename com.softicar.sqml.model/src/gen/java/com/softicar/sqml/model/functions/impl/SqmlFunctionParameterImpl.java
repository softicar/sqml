/**
 */
package com.softicar.sqml.model.functions.impl;

import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.SqmlFunction;
import com.softicar.sqml.model.functions.SqmlFunctionParameter;

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
 * An implementation of the model object '<em><b>Sqml Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlFunctionParameterImpl extends MinimalEObjectImpl.Container implements SqmlFunctionParameter {
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
	protected SqmlFunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.SQML_FUNCTION_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlFunction getFunction() {
		if (eContainerFeatureID() != FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION) return null;
		return (SqmlFunction)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFunction basicGetFunction() {
		if (eContainerFeatureID() != FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION) return null;
		return (SqmlFunction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(SqmlFunction newFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFunction, FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(SqmlFunction newFunction) {
		if (newFunction != eInternalContainer() || (eContainerFeatureID() != FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION && newFunction != null)) {
			if (EcoreUtil.isAncestor(this, newFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, FunctionsPackage.SQML_FUNCTION__PARAMETERS, SqmlFunction.class, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION, newFunction, newFunction));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE, oldTypeReference, newTypeReference);
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
				msgs = ((InternalEObject)typeReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE, null, msgs);
			if (newTypeReference != null)
				msgs = ((InternalEObject)newTypeReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE, null, msgs);
			msgs = basicSetTypeReference(newTypeReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE, newTypeReference, newTypeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFunction((SqmlFunction)otherEnd, msgs);
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
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION:
				return basicSetFunction(null, msgs);
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE:
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
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION:
				return eInternalContainer().eInverseRemove(this, FunctionsPackage.SQML_FUNCTION__PARAMETERS, SqmlFunction.class, msgs);
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
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__NAME:
				return getName();
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE:
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
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION:
				setFunction((SqmlFunction)newValue);
				return;
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE:
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
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION:
				setFunction((SqmlFunction)null);
				return;
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE:
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
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__FUNCTION:
				return basicGetFunction() != null;
			case FunctionsPackage.SQML_FUNCTION_PARAMETER__TYPE_REFERENCE:
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
		result.append(')');
		return result.toString();
	}

} //SqmlFunctionParameterImpl
