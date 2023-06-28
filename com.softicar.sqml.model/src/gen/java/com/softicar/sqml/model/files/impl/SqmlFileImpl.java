/**
 */
package com.softicar.sqml.model.files.impl;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.SqmlFile;
import com.softicar.sqml.model.files.SqmlFileElement;
import com.softicar.sqml.model.files.SqmlImport;
import com.softicar.sqml.model.files.SqmlPackageDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sqml File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.files.impl.SqmlFileImpl#getPackageDeclaration <em>Package Declaration</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.impl.SqmlFileImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.impl.SqmlFileImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SqmlFileImpl extends MinimalEObjectImpl.Container implements SqmlFile {
	/**
	 * The cached value of the '{@link #getPackageDeclaration() <em>Package Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageDeclaration()
	 * @generated
	 * @ordered
	 */
	protected SqmlPackageDeclaration packageDeclaration;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<SqmlImport> imports;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SqmlFileElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SqmlFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesPackage.Literals.SQML_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlPackageDeclaration getPackageDeclaration() {
		return packageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackageDeclaration(SqmlPackageDeclaration newPackageDeclaration, NotificationChain msgs) {
		SqmlPackageDeclaration oldPackageDeclaration = packageDeclaration;
		packageDeclaration = newPackageDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FilesPackage.SQML_FILE__PACKAGE_DECLARATION, oldPackageDeclaration, newPackageDeclaration);
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
	public void setPackageDeclaration(SqmlPackageDeclaration newPackageDeclaration) {
		if (newPackageDeclaration != packageDeclaration) {
			NotificationChain msgs = null;
			if (packageDeclaration != null)
				msgs = ((InternalEObject)packageDeclaration).eInverseRemove(this, FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE, SqmlPackageDeclaration.class, msgs);
			if (newPackageDeclaration != null)
				msgs = ((InternalEObject)newPackageDeclaration).eInverseAdd(this, FilesPackage.SQML_PACKAGE_DECLARATION__SQML_FILE, SqmlPackageDeclaration.class, msgs);
			msgs = basicSetPackageDeclaration(newPackageDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SQML_FILE__PACKAGE_DECLARATION, newPackageDeclaration, newPackageDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SqmlImport> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentWithInverseEList<SqmlImport>(SqmlImport.class, this, FilesPackage.SQML_FILE__IMPORTS, FilesPackage.SQML_IMPORT__SQML_FILE);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SqmlFileElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<SqmlFileElement>(SqmlFileElement.class, this, FilesPackage.SQML_FILE__ELEMENTS);
		}
		return elements;
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
			case FilesPackage.SQML_FILE__PACKAGE_DECLARATION:
				if (packageDeclaration != null)
					msgs = ((InternalEObject)packageDeclaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FilesPackage.SQML_FILE__PACKAGE_DECLARATION, null, msgs);
				return basicSetPackageDeclaration((SqmlPackageDeclaration)otherEnd, msgs);
			case FilesPackage.SQML_FILE__IMPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImports()).basicAdd(otherEnd, msgs);
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
			case FilesPackage.SQML_FILE__PACKAGE_DECLARATION:
				return basicSetPackageDeclaration(null, msgs);
			case FilesPackage.SQML_FILE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
			case FilesPackage.SQML_FILE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case FilesPackage.SQML_FILE__PACKAGE_DECLARATION:
				return getPackageDeclaration();
			case FilesPackage.SQML_FILE__IMPORTS:
				return getImports();
			case FilesPackage.SQML_FILE__ELEMENTS:
				return getElements();
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
			case FilesPackage.SQML_FILE__PACKAGE_DECLARATION:
				setPackageDeclaration((SqmlPackageDeclaration)newValue);
				return;
			case FilesPackage.SQML_FILE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends SqmlImport>)newValue);
				return;
			case FilesPackage.SQML_FILE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SqmlFileElement>)newValue);
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
			case FilesPackage.SQML_FILE__PACKAGE_DECLARATION:
				setPackageDeclaration((SqmlPackageDeclaration)null);
				return;
			case FilesPackage.SQML_FILE__IMPORTS:
				getImports().clear();
				return;
			case FilesPackage.SQML_FILE__ELEMENTS:
				getElements().clear();
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
			case FilesPackage.SQML_FILE__PACKAGE_DECLARATION:
				return packageDeclaration != null;
			case FilesPackage.SQML_FILE__IMPORTS:
				return imports != null && !imports.isEmpty();
			case FilesPackage.SQML_FILE__ELEMENTS:
				return elements != null && !elements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SqmlFileImpl
