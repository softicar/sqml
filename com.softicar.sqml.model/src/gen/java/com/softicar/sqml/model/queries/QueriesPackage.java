/**
 */
package com.softicar.sqml.model.queries;

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
 * @see com.softicar.sqml.model.queries.QueriesFactory
 * @model kind="package"
 * @generated
 */
public interface QueriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "queries";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.queries";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "queries";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueriesPackage eINSTANCE = com.softicar.sqml.model.queries.impl.QueriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.queries.impl.SqmlQueryImpl <em>Sqml Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.queries.impl.SqmlQueryImpl
	 * @see com.softicar.sqml.model.queries.impl.QueriesPackageImpl#getSqmlQuery()
	 * @generated
	 */
	int SQML_QUERY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY__NAME = FilesPackage.SQML_FILE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY__PARAMETERS = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY__SELECT = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_FEATURE_COUNT = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_OPERATION_COUNT = FilesPackage.SQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl <em>Sqml Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl
	 * @see com.softicar.sqml.model.queries.impl.QueriesPackageImpl#getSqmlQueryParameter()
	 * @generated
	 */
	int SQML_QUERY_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_PARAMETER__NAME = InterfacesPackage.ISQML_QUERY_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Query</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_PARAMETER__QUERY = InterfacesPackage.ISQML_QUERY_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_PARAMETER__OPTIONAL = InterfacesPackage.ISQML_QUERY_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_PARAMETER__TYPE_REFERENCE = InterfacesPackage.ISQML_QUERY_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sqml Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_PARAMETER_FEATURE_COUNT = InterfacesPackage.ISQML_QUERY_PARAMETER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sqml Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_QUERY_PARAMETER_OPERATION_COUNT = InterfacesPackage.ISQML_QUERY_PARAMETER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.queries.SqmlQuery <em>Sqml Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Query</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQuery
	 * @generated
	 */
	EClass getSqmlQuery();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.queries.SqmlQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQuery#getParameters()
	 * @see #getSqmlQuery()
	 * @generated
	 */
	EReference getSqmlQuery_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.queries.SqmlQuery#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQuery#getSelect()
	 * @see #getSqmlQuery()
	 * @generated
	 */
	EReference getSqmlQuery_Select();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.queries.SqmlQueryParameter <em>Sqml Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Query Parameter</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQueryParameter
	 * @generated
	 */
	EClass getSqmlQueryParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQueryParameter#getName()
	 * @see #getSqmlQueryParameter()
	 * @generated
	 */
	EAttribute getSqmlQueryParameter_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Query</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQueryParameter#getQuery()
	 * @see #getSqmlQueryParameter()
	 * @generated
	 */
	EReference getSqmlQueryParameter_Query();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQueryParameter#isOptional()
	 * @see #getSqmlQueryParameter()
	 * @generated
	 */
	EAttribute getSqmlQueryParameter_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Reference</em>'.
	 * @see com.softicar.sqml.model.queries.SqmlQueryParameter#getTypeReference()
	 * @see #getSqmlQueryParameter()
	 * @generated
	 */
	EReference getSqmlQueryParameter_TypeReference();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueriesFactory getQueriesFactory();

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
		 * The meta object literal for the '{@link com.softicar.sqml.model.queries.impl.SqmlQueryImpl <em>Sqml Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.queries.impl.SqmlQueryImpl
		 * @see com.softicar.sqml.model.queries.impl.QueriesPackageImpl#getSqmlQuery()
		 * @generated
		 */
		EClass SQML_QUERY = eINSTANCE.getSqmlQuery();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_QUERY__PARAMETERS = eINSTANCE.getSqmlQuery_Parameters();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_QUERY__SELECT = eINSTANCE.getSqmlQuery_Select();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl <em>Sqml Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.queries.impl.SqmlQueryParameterImpl
		 * @see com.softicar.sqml.model.queries.impl.QueriesPackageImpl#getSqmlQueryParameter()
		 * @generated
		 */
		EClass SQML_QUERY_PARAMETER = eINSTANCE.getSqmlQueryParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_QUERY_PARAMETER__NAME = eINSTANCE.getSqmlQueryParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_QUERY_PARAMETER__QUERY = eINSTANCE.getSqmlQueryParameter_Query();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_QUERY_PARAMETER__OPTIONAL = eINSTANCE.getSqmlQueryParameter_Optional();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_QUERY_PARAMETER__TYPE_REFERENCE = eINSTANCE.getSqmlQueryParameter_TypeReference();

	}

} //QueriesPackage
