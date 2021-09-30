/**
 */
package com.softicar.sqml.model.files.impl;

import com.softicar.sqml.model.ISqmlGlobalObject;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.SqmlFile;
import com.softicar.sqml.model.files.SqmlImport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.files.impl.SqmlImportImpl#getSqmlFile <em>Sqml File</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.impl.SqmlImportImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlImportImpl extends MinimalEObjectImpl.Container implements SqmlImport {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ISqmlGlobalObject target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesPackage.Literals.SQML_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFile getSqmlFile() {
		if (eContainerFeatureID() != FilesPackage.SQML_IMPORT__SQML_FILE) return null;
		return (SqmlFile)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFile basicGetSqmlFile() {
		if (eContainerFeatureID() != FilesPackage.SQML_IMPORT__SQML_FILE) return null;
		return (SqmlFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqmlFile(SqmlFile newSqmlFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSqmlFile, FilesPackage.SQML_IMPORT__SQML_FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqmlFile(SqmlFile newSqmlFile) {
		if (newSqmlFile != eInternalContainer() || (eContainerFeatureID() != FilesPackage.SQML_IMPORT__SQML_FILE && newSqmlFile != null)) {
			if (EcoreUtil.isAncestor(this, newSqmlFile))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSqmlFile != null)
				msgs = ((InternalEObject)newSqmlFile).eInverseAdd(this, FilesPackage.SQML_FILE__IMPORTS, SqmlFile.class, msgs);
			msgs = basicSetSqmlFile(newSqmlFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SQML_IMPORT__SQML_FILE, newSqmlFile, newSqmlFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlGlobalObject getTarget() {
		if (target != null && ((EObject)target).eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ISqmlGlobalObject)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FilesPackage.SQML_IMPORT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISqmlGlobalObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ISqmlGlobalObject newTarget) {
		ISqmlGlobalObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SQML_IMPORT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesPackage.SQML_IMPORT__SQML_FILE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSqmlFile((SqmlFile)otherEnd, msgs);
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
			case FilesPackage.SQML_IMPORT__SQML_FILE:
				return basicSetSqmlFile(null, msgs);
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
			case FilesPackage.SQML_IMPORT__SQML_FILE:
				return eInternalContainer().eInverseRemove(this, FilesPackage.SQML_FILE__IMPORTS, SqmlFile.class, msgs);
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
			case FilesPackage.SQML_IMPORT__SQML_FILE:
				if (resolve) return getSqmlFile();
				return basicGetSqmlFile();
			case FilesPackage.SQML_IMPORT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case FilesPackage.SQML_IMPORT__SQML_FILE:
				setSqmlFile((SqmlFile)newValue);
				return;
			case FilesPackage.SQML_IMPORT__TARGET:
				setTarget((ISqmlGlobalObject)newValue);
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
			case FilesPackage.SQML_IMPORT__SQML_FILE:
				setSqmlFile((SqmlFile)null);
				return;
			case FilesPackage.SQML_IMPORT__TARGET:
				setTarget((ISqmlGlobalObject)null);
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
			case FilesPackage.SQML_IMPORT__SQML_FILE:
				return basicGetSqmlFile() != null;
			case FilesPackage.SQML_IMPORT__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //SqmlImportImpl
