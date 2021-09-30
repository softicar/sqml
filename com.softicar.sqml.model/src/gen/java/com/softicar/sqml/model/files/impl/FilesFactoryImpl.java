/**
 */
package com.softicar.sqml.model.files.impl;

import com.softicar.sqml.model.files.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilesFactoryImpl extends EFactoryImpl implements FilesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FilesFactory init() {
		try {
			FilesFactory theFilesFactory = (FilesFactory)EPackage.Registry.INSTANCE.getEFactory(FilesPackage.eNS_URI);
			if (theFilesFactory != null) {
				return theFilesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FilesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FilesPackage.SQML_FILE: return createSqmlFile();
			case FilesPackage.SQML_PACKAGE_DECLARATION: return createSqmlPackageDeclaration();
			case FilesPackage.SQML_IMPORT: return createSqmlImport();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFile createSqmlFile() {
		SqmlFileImpl sqmlFile = new SqmlFileImpl();
		return sqmlFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlPackageDeclaration createSqmlPackageDeclaration() {
		SqmlPackageDeclarationImpl sqmlPackageDeclaration = new SqmlPackageDeclarationImpl();
		return sqmlPackageDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlImport createSqmlImport() {
		SqmlImportImpl sqmlImport = new SqmlImportImpl();
		return sqmlImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilesPackage getFilesPackage() {
		return (FilesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FilesPackage getPackage() {
		return FilesPackage.eINSTANCE;
	}

} //FilesFactoryImpl
