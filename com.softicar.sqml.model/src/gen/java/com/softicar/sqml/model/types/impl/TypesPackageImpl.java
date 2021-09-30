/**
 */
package com.softicar.sqml.model.types.impl;

import com.softicar.sqml.model.files.FilesPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import com.softicar.sqml.model.types.AbstractSqmlTypeDefinition;
import com.softicar.sqml.model.types.SqmlEnum;
import com.softicar.sqml.model.types.SqmlEnumerator;
import com.softicar.sqml.model.types.SqmlTypeReference;
import com.softicar.sqml.model.types.SqmlValueType;
import com.softicar.sqml.model.types.TypesFactory;
import com.softicar.sqml.model.types.TypesPackage;

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
public class TypesPackageImpl extends EPackageImpl implements TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSqmlTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlEnumeratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlTypeReferenceEClass = null;

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
	 * @see com.softicar.sqml.model.types.TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypesPackageImpl() {
		super(eNS_URI, TypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypesPackage init() {
		if (isInited) return (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypesPackageImpl theTypesPackage = registeredTypesPackage instanceof TypesPackageImpl ? (TypesPackageImpl)registeredTypesPackage : new TypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		FilesPackage.eINSTANCE.eClass();
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypesPackage.eNS_URI, theTypesPackage);
		return theTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSqmlTypeDefinition() {
		return abstractSqmlTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlValueType() {
		return sqmlValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlEnum() {
		return sqmlEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlEnum_Name() {
		return (EAttribute)sqmlEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlEnum_TypeReference() {
		return (EReference)sqmlEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlEnum_Enumerators() {
		return (EReference)sqmlEnumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlEnumerator() {
		return sqmlEnumeratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlEnumerator_Enum() {
		return (EReference)sqmlEnumeratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlEnumerator_Name() {
		return (EAttribute)sqmlEnumeratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlEnumerator_Value() {
		return (EReference)sqmlEnumeratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlTypeReference() {
		return sqmlTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlTypeReference_List() {
		return (EAttribute)sqmlTypeReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTypeReference_TypeDefinition() {
		return (EReference)sqmlTypeReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlTypeReference_TypeParameters() {
		return (EReference)sqmlTypeReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesFactory getTypesFactory() {
		return (TypesFactory)getEFactoryInstance();
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
		abstractSqmlTypeDefinitionEClass = createEClass(ABSTRACT_SQML_TYPE_DEFINITION);

		sqmlValueTypeEClass = createEClass(SQML_VALUE_TYPE);

		sqmlEnumEClass = createEClass(SQML_ENUM);
		createEAttribute(sqmlEnumEClass, SQML_ENUM__NAME);
		createEReference(sqmlEnumEClass, SQML_ENUM__TYPE_REFERENCE);
		createEReference(sqmlEnumEClass, SQML_ENUM__ENUMERATORS);

		sqmlEnumeratorEClass = createEClass(SQML_ENUMERATOR);
		createEReference(sqmlEnumeratorEClass, SQML_ENUMERATOR__ENUM);
		createEAttribute(sqmlEnumeratorEClass, SQML_ENUMERATOR__NAME);
		createEReference(sqmlEnumeratorEClass, SQML_ENUMERATOR__VALUE);

		sqmlTypeReferenceEClass = createEClass(SQML_TYPE_REFERENCE);
		createEAttribute(sqmlTypeReferenceEClass, SQML_TYPE_REFERENCE__LIST);
		createEReference(sqmlTypeReferenceEClass, SQML_TYPE_REFERENCE__TYPE_DEFINITION);
		createEReference(sqmlTypeReferenceEClass, SQML_TYPE_REFERENCE__TYPE_PARAMETERS);
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
		abstractSqmlTypeDefinitionEClass.getESuperTypes().add(theFilesPackage.getSqmlFileElement());
		abstractSqmlTypeDefinitionEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTopLevelTypeDefinition());
		sqmlValueTypeEClass.getESuperTypes().add(theFilesPackage.getSqmlFileElement());
		sqmlValueTypeEClass.getESuperTypes().add(theInterfacesPackage.getISqmlValueType());
		sqmlEnumEClass.getESuperTypes().add(theInterfacesPackage.getISqmlEnum());
		sqmlEnumeratorEClass.getESuperTypes().add(theInterfacesPackage.getISqmlEnumerator());
		sqmlTypeReferenceEClass.getESuperTypes().add(theInterfacesPackage.getISqmlTypeReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractSqmlTypeDefinitionEClass, AbstractSqmlTypeDefinition.class, "AbstractSqmlTypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlValueTypeEClass, SqmlValueType.class, "SqmlValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlEnumEClass, SqmlEnum.class, "SqmlEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlEnum_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlEnum_TypeReference(), theInterfacesPackage.getISqmlTypeReference(), null, "typeReference", null, 0, 1, SqmlEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlEnum_Enumerators(), this.getSqmlEnumerator(), this.getSqmlEnumerator_Enum(), "enumerators", null, 0, -1, SqmlEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlEnumeratorEClass, SqmlEnumerator.class, "SqmlEnumerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlEnumerator_Enum(), this.getSqmlEnum(), this.getSqmlEnum_Enumerators(), "enum", null, 0, 1, SqmlEnumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlEnumerator_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlEnumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlEnumerator_Value(), theInterfacesPackage.getISqmlLiteral(), null, "value", null, 0, 1, SqmlEnumerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlTypeReferenceEClass, SqmlTypeReference.class, "SqmlTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlTypeReference_List(), theEcorePackage.getEBoolean(), "list", null, 0, 1, SqmlTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTypeReference_TypeDefinition(), theInterfacesPackage.getISqmlTypeDefinition(), null, "typeDefinition", null, 0, 1, SqmlTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlTypeReference_TypeParameters(), theInterfacesPackage.getISqmlTypeReference(), null, "typeParameters", null, 0, -1, SqmlTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TypesPackageImpl
