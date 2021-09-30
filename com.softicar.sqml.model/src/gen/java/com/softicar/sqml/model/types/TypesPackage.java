/**
 */
package com.softicar.sqml.model.types;

import com.softicar.sqml.model.files.FilesPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = com.softicar.sqml.model.types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.impl.AbstractSqmlTypeDefinitionImpl <em>Abstract Sqml Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.impl.AbstractSqmlTypeDefinitionImpl
	 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getAbstractSqmlTypeDefinition()
	 * @generated
	 */
	int ABSTRACT_SQML_TYPE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_TYPE_DEFINITION__NAME = FilesPackage.SQML_FILE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Abstract Sqml Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_TYPE_DEFINITION_FEATURE_COUNT = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Sqml Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_TYPE_DEFINITION_OPERATION_COUNT = FilesPackage.SQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.impl.SqmlValueTypeImpl <em>Sqml Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.impl.SqmlValueTypeImpl
	 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlValueType()
	 * @generated
	 */
	int SQML_VALUE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_TYPE__NAME = FilesPackage.SQML_FILE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Sqml Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_TYPE_FEATURE_COUNT = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqml Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_TYPE_OPERATION_COUNT = FilesPackage.SQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.impl.SqmlEnumImpl <em>Sqml Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.impl.SqmlEnumImpl
	 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlEnum()
	 * @generated
	 */
	int SQML_ENUM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUM__NAME = InterfacesPackage.ISQML_ENUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUM__TYPE_REFERENCE = InterfacesPackage.ISQML_ENUM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enumerators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUM__ENUMERATORS = InterfacesPackage.ISQML_ENUM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUM_FEATURE_COUNT = InterfacesPackage.ISQML_ENUM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUM_OPERATION_COUNT = InterfacesPackage.ISQML_ENUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.impl.SqmlEnumeratorImpl <em>Sqml Enumerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.impl.SqmlEnumeratorImpl
	 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlEnumerator()
	 * @generated
	 */
	int SQML_ENUMERATOR = 3;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUMERATOR__ENUM = InterfacesPackage.ISQML_ENUMERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUMERATOR__NAME = InterfacesPackage.ISQML_ENUMERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUMERATOR__VALUE = InterfacesPackage.ISQML_ENUMERATOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUMERATOR_FEATURE_COUNT = InterfacesPackage.ISQML_ENUMERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ENUMERATOR_OPERATION_COUNT = InterfacesPackage.ISQML_ENUMERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.impl.SqmlTypeReferenceImpl <em>Sqml Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.impl.SqmlTypeReferenceImpl
	 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlTypeReference()
	 * @generated
	 */
	int SQML_TYPE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TYPE_REFERENCE__LIST = InterfacesPackage.ISQML_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TYPE_REFERENCE__TYPE_DEFINITION = InterfacesPackage.ISQML_TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TYPE_REFERENCE__TYPE_PARAMETERS = InterfacesPackage.ISQML_TYPE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TYPE_REFERENCE_FEATURE_COUNT = InterfacesPackage.ISQML_TYPE_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_TYPE_REFERENCE_OPERATION_COUNT = InterfacesPackage.ISQML_TYPE_REFERENCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.AbstractSqmlTypeDefinition <em>Abstract Sqml Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sqml Type Definition</em>'.
	 * @see com.softicar.sqml.model.types.AbstractSqmlTypeDefinition
	 * @generated
	 */
	EClass getAbstractSqmlTypeDefinition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.SqmlValueType <em>Sqml Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Value Type</em>'.
	 * @see com.softicar.sqml.model.types.SqmlValueType
	 * @generated
	 */
	EClass getSqmlValueType();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.SqmlEnum <em>Sqml Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Enum</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnum
	 * @generated
	 */
	EClass getSqmlEnum();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.types.SqmlEnum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnum#getName()
	 * @see #getSqmlEnum()
	 * @generated
	 */
	EAttribute getSqmlEnum_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.types.SqmlEnum#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Reference</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnum#getTypeReference()
	 * @see #getSqmlEnum()
	 * @generated
	 */
	EReference getSqmlEnum_TypeReference();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.types.SqmlEnum#getEnumerators <em>Enumerators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerators</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnum#getEnumerators()
	 * @see #getSqmlEnum()
	 * @generated
	 */
	EReference getSqmlEnum_Enumerators();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.SqmlEnumerator <em>Sqml Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Enumerator</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnumerator
	 * @generated
	 */
	EClass getSqmlEnumerator();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.types.SqmlEnumerator#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enum</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnumerator#getEnum()
	 * @see #getSqmlEnumerator()
	 * @generated
	 */
	EReference getSqmlEnumerator_Enum();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.types.SqmlEnumerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnumerator#getName()
	 * @see #getSqmlEnumerator()
	 * @generated
	 */
	EAttribute getSqmlEnumerator_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.types.SqmlEnumerator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see com.softicar.sqml.model.types.SqmlEnumerator#getValue()
	 * @see #getSqmlEnumerator()
	 * @generated
	 */
	EReference getSqmlEnumerator_Value();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.SqmlTypeReference <em>Sqml Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Type Reference</em>'.
	 * @see com.softicar.sqml.model.types.SqmlTypeReference
	 * @generated
	 */
	EClass getSqmlTypeReference();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.types.SqmlTypeReference#isList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List</em>'.
	 * @see com.softicar.sqml.model.types.SqmlTypeReference#isList()
	 * @see #getSqmlTypeReference()
	 * @generated
	 */
	EAttribute getSqmlTypeReference_List();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.types.SqmlTypeReference#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Definition</em>'.
	 * @see com.softicar.sqml.model.types.SqmlTypeReference#getTypeDefinition()
	 * @see #getSqmlTypeReference()
	 * @generated
	 */
	EReference getSqmlTypeReference_TypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.types.SqmlTypeReference#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see com.softicar.sqml.model.types.SqmlTypeReference#getTypeParameters()
	 * @see #getSqmlTypeReference()
	 * @generated
	 */
	EReference getSqmlTypeReference_TypeParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.impl.AbstractSqmlTypeDefinitionImpl <em>Abstract Sqml Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.impl.AbstractSqmlTypeDefinitionImpl
		 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getAbstractSqmlTypeDefinition()
		 * @generated
		 */
		EClass ABSTRACT_SQML_TYPE_DEFINITION = eINSTANCE.getAbstractSqmlTypeDefinition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.impl.SqmlValueTypeImpl <em>Sqml Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.impl.SqmlValueTypeImpl
		 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlValueType()
		 * @generated
		 */
		EClass SQML_VALUE_TYPE = eINSTANCE.getSqmlValueType();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.impl.SqmlEnumImpl <em>Sqml Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.impl.SqmlEnumImpl
		 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlEnum()
		 * @generated
		 */
		EClass SQML_ENUM = eINSTANCE.getSqmlEnum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_ENUM__NAME = eINSTANCE.getSqmlEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ENUM__TYPE_REFERENCE = eINSTANCE.getSqmlEnum_TypeReference();

		/**
		 * The meta object literal for the '<em><b>Enumerators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ENUM__ENUMERATORS = eINSTANCE.getSqmlEnum_Enumerators();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.impl.SqmlEnumeratorImpl <em>Sqml Enumerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.impl.SqmlEnumeratorImpl
		 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlEnumerator()
		 * @generated
		 */
		EClass SQML_ENUMERATOR = eINSTANCE.getSqmlEnumerator();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ENUMERATOR__ENUM = eINSTANCE.getSqmlEnumerator_Enum();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_ENUMERATOR__NAME = eINSTANCE.getSqmlEnumerator_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ENUMERATOR__VALUE = eINSTANCE.getSqmlEnumerator_Value();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.impl.SqmlTypeReferenceImpl <em>Sqml Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.impl.SqmlTypeReferenceImpl
		 * @see com.softicar.sqml.model.types.impl.TypesPackageImpl#getSqmlTypeReference()
		 * @generated
		 */
		EClass SQML_TYPE_REFERENCE = eINSTANCE.getSqmlTypeReference();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_TYPE_REFERENCE__LIST = eINSTANCE.getSqmlTypeReference_List();

		/**
		 * The meta object literal for the '<em><b>Type Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TYPE_REFERENCE__TYPE_DEFINITION = eINSTANCE.getSqmlTypeReference_TypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_TYPE_REFERENCE__TYPE_PARAMETERS = eINSTANCE.getSqmlTypeReference_TypeParameters();

	}

} //TypesPackage
