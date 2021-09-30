/**
 */
package com.softicar.sqml.model.files.impl;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.SqmlFile;
import com.softicar.sqml.model.files.SqmlPackageDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.files.impl.SqmlPackageDeclarationImpl#getSqmlFile <em>Sqml File</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.impl.SqmlPackageDeclarationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlPackageDeclarationImpl extends MinimalEObjectImpl.Container implements SqmlPackageDeclaration {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlPackageDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesPackage.Literals.SQML_PACKAGE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFile getSqmlFile() {
		if (eContainerFeatureID() != FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE) return null;
		return (SqmlFile)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFile basicGetSqmlFile() {
		if (eContainerFeatureID() != FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE) return null;
		return (SqmlFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSqmlFile(SqmlFile newSqmlFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSqmlFile, FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSqmlFile(SqmlFile newSqmlFile) {
		if (newSqmlFile != eInternalContainer() || (eContainerFeatureID() != FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE && newSqmlFile != null)) {
			if (EcoreUtil.isAncestor(this, newSqmlFile))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSqmlFile != null)
				msgs = ((InternalEObject)newSqmlFile).eInverseAdd(this, FilesPackage.SQML_FILE__PACKAGE_DECLARATION, SqmlFile.class, msgs);
			msgs = basicSetSqmlFile(newSqmlFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE, newSqmlFile, newSqmlFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SQML_PACKAGE_DECLARATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE:
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
			case FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE:
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
			case FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE:
				return eInternalContainer().eInverseRemove(this, FilesPackage.SQML_FILE__PACKAGE_DECLARATION, SqmlFile.class, msgs);
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
			case FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE:
				if (resolve) return getSqmlFile();
				return basicGetSqmlFile();
			case FilesPackage.SQML_PACKAGE_DECLARATION__NAME:
				return getName();
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
			case FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE:
				setSqmlFile((SqmlFile)newValue);
				return;
			case FilesPackage.SQML_PACKAGE_DECLARATION__NAME:
				setName((String)newValue);
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
			case FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE:
				setSqmlFile((SqmlFile)null);
				return;
			case FilesPackage.SQML_PACKAGE_DECLARATION__NAME:
				setName(NAME_EDEFAULT);
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
			case FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE:
				return basicGetSqmlFile() != null;
			case FilesPackage.SQML_PACKAGE_DECLARATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //SqmlPackageDeclarationImpl
