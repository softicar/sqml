/**
 */
package com.softicar.sqml.model.files.impl;

import com.softicar.sqml.model.files.FilesFactory;
import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.SqmlFile;
import com.softicar.sqml.model.files.SqmlFileElement;
import com.softicar.sqml.model.files.SqmlImport;
import com.softicar.sqml.model.files.SqmlPackageDeclaration;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FilesPackageImpl extends EPackageImpl implements FilesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlPackageDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlFileElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.softicar.sqml.model.files.FilesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FilesPackageImpl() {
		super(eNS_URI, FilesFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FilesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FilesPackage init() {
		if (isInited) return (FilesPackage)EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFilesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FilesPackageImpl theFilesPackage = registeredFilesPackage instanceof FilesPackageImpl ? (FilesPackageImpl)registeredFilesPackage : new FilesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFilesPackage.createPackageContents();

		// Initialize created meta-data
		theFilesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFilesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FilesPackage.eNS_URI, theFilesPackage);
		return theFilesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlFile() {
		return sqmlFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFile_PackageDeclaration() {
		return (EReference)sqmlFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFile_Imports() {
		return (EReference)sqmlFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFile_Elements() {
		return (EReference)sqmlFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlPackageDeclaration() {
		return sqmlPackageDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlPackageDeclaration_SqmlFile() {
		return (EReference)sqmlPackageDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlPackageDeclaration_Name() {
		return (EAttribute)sqmlPackageDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlImport() {
		return sqmlImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlImport_SqmlFile() {
		return (EReference)sqmlImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlImport_Target() {
		return (EReference)sqmlImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlFileElement() {
		return sqmlFileElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlFileElement_Name() {
		return (EAttribute)sqmlFileElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FilesFactory getFilesFactory() {
		return (FilesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sqmlFileEClass = createEClass(SQML_FILE);
		createEReference(sqmlFileEClass, SQML_FILE__PACKAGE_DECLARATION);
		createEReference(sqmlFileEClass, SQML_FILE__IMPORTS);
		createEReference(sqmlFileEClass, SQML_FILE__ELEMENTS);

		sqmlPackageDeclarationEClass = createEClass(SQML_PACKAGE_DECLARATION);
		createEReference(sqmlPackageDeclarationEClass, SQML_PACKAGE_DECLARATION__SQML_FILE);
		createEAttribute(sqmlPackageDeclarationEClass, SQML_PACKAGE_DECLARATION__NAME);

		sqmlImportEClass = createEClass(SQML_IMPORT);
		createEReference(sqmlImportEClass, SQML_IMPORT__SQML_FILE);
		createEReference(sqmlImportEClass, SQML_IMPORT__TARGET);

		sqmlFileElementEClass = createEClass(SQML_FILE_ELEMENT);
		createEAttribute(sqmlFileElementEClass, SQML_FILE_ELEMENT__NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqmlFileEClass.getESuperTypes().add(theInterfacesPackage.getISqmlFile());
		sqmlPackageDeclarationEClass.getESuperTypes().add(theInterfacesPackage.getISqmlPackageDeclaration());
		sqmlImportEClass.getESuperTypes().add(theInterfacesPackage.getISqmlImport());
		sqmlFileElementEClass.getESuperTypes().add(theInterfacesPackage.getISqmlFileElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(sqmlFileEClass, SqmlFile.class, "SqmlFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlFile_PackageDeclaration(), this.getSqmlPackageDeclaration(), this.getSqmlPackageDeclaration_SqmlFile(), "packageDeclaration", null, 0, 1, SqmlFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFile_Imports(), this.getSqmlImport(), this.getSqmlImport_SqmlFile(), "imports", null, 0, -1, SqmlFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFile_Elements(), this.getSqmlFileElement(), null, "elements", null, 0, -1, SqmlFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlPackageDeclarationEClass, SqmlPackageDeclaration.class, "SqmlPackageDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlPackageDeclaration_SqmlFile(), this.getSqmlFile(), this.getSqmlFile_PackageDeclaration(), "sqmlFile", null, 0, 1, SqmlPackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlPackageDeclaration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlPackageDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlImportEClass, SqmlImport.class, "SqmlImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlImport_SqmlFile(), this.getSqmlFile(), this.getSqmlFile_Imports(), "sqmlFile", null, 0, 1, SqmlImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlImport_Target(), theInterfacesPackage.getISqmlGlobalObject(), null, "target", null, 0, 1, SqmlImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlFileElementEClass, SqmlFileElement.class, "SqmlFileElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlFileElement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlFileElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FilesPackageImpl
