/**
 */
package com.softicar.sqml.model.queries.impl;

import com.softicar.sqml.model.files.FilesPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import com.softicar.sqml.model.queries.QueriesFactory;
import com.softicar.sqml.model.queries.QueriesPackage;
import com.softicar.sqml.model.queries.SqmlQuery;
import com.softicar.sqml.model.queries.SqmlQueryParameter;

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
public class QueriesPackageImpl extends EPackageImpl implements QueriesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlQueryParameterEClass = null;

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
	 * @see com.softicar.sqml.model.queries.QueriesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QueriesPackageImpl() {
		super(eNS_URI, QueriesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QueriesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QueriesPackage init() {
		if (isInited) return (QueriesPackage)EPackage.Registry.INSTANCE.getEPackage(QueriesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQueriesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QueriesPackageImpl theQueriesPackage = registeredQueriesPackage instanceof QueriesPackageImpl ? (QueriesPackageImpl)registeredQueriesPackage : new QueriesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		FilesPackage.eINSTANCE.eClass();
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQueriesPackage.createPackageContents();

		// Initialize created meta-data
		theQueriesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQueriesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QueriesPackage.eNS_URI, theQueriesPackage);
		return theQueriesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlQuery() {
		return sqmlQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlQuery_Parameters() {
		return (EReference)sqmlQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlQuery_Select() {
		return (EReference)sqmlQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlQueryParameter() {
		return sqmlQueryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlQueryParameter_Name() {
		return (EAttribute)sqmlQueryParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlQueryParameter_Query() {
		return (EReference)sqmlQueryParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlQueryParameter_Optional() {
		return (EAttribute)sqmlQueryParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlQueryParameter_TypeReference() {
		return (EReference)sqmlQueryParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QueriesFactory getQueriesFactory() {
		return (QueriesFactory)getEFactoryInstance();
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
		sqmlQueryEClass = createEClass(SQML_QUERY);
		createEReference(sqmlQueryEClass, SQML_QUERY__PARAMETERS);
		createEReference(sqmlQueryEClass, SQML_QUERY__SELECT);

		sqmlQueryParameterEClass = createEClass(SQML_QUERY_PARAMETER);
		createEAttribute(sqmlQueryParameterEClass, SQML_QUERY_PARAMETER__NAME);
		createEReference(sqmlQueryParameterEClass, SQML_QUERY_PARAMETER__QUERY);
		createEAttribute(sqmlQueryParameterEClass, SQML_QUERY_PARAMETER__OPTIONAL);
		createEReference(sqmlQueryParameterEClass, SQML_QUERY_PARAMETER__TYPE_REFERENCE);
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
		FilesPackage theFilesPackage = (FilesPackage)EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqmlQueryEClass.getESuperTypes().add(theFilesPackage.getSqmlFileElement());
		sqmlQueryEClass.getESuperTypes().add(theInterfacesPackage.getISqmlQuery());
		sqmlQueryParameterEClass.getESuperTypes().add(theInterfacesPackage.getISqmlQueryParameter());

		// Initialize classes, features, and operations; add parameters
		initEClass(sqmlQueryEClass, SqmlQuery.class, "SqmlQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlQuery_Parameters(), this.getSqmlQueryParameter(), this.getSqmlQueryParameter_Query(), "parameters", null, 0, -1, SqmlQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlQuery_Select(), theInterfacesPackage.getISqmlSelect(), null, "select", null, 0, 1, SqmlQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlQueryParameterEClass, SqmlQueryParameter.class, "SqmlQueryParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlQueryParameter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlQueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlQueryParameter_Query(), this.getSqmlQuery(), this.getSqmlQuery_Parameters(), "query", null, 0, 1, SqmlQueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlQueryParameter_Optional(), theEcorePackage.getEBoolean(), "optional", null, 0, 1, SqmlQueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlQueryParameter_TypeReference(), theInterfacesPackage.getISqmlTypeReference(), null, "typeReference", null, 0, 1, SqmlQueryParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QueriesPackageImpl
