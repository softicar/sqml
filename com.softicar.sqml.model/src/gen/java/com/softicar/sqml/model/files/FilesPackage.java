/**
 */
package com.softicar.sqml.model.files;

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
 * @see com.softicar.sqml.model.files.FilesFactory
 * @model kind="package"
 * @generated
 */
public interface FilesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "files";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.files";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "files";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesPackage eINSTANCE = com.softicar.sqml.model.files.impl.FilesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.impl.SqmlFileImpl <em>Sqml File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.impl.SqmlFileImpl
	 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlFile()
	 * @generated
	 */
	int SQML_FILE = 0;

	/**
	 * The feature id for the '<em><b>Package Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE__PACKAGE_DECLARATION = InterfacesPackage.ISQML_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE__IMPORTS = InterfacesPackage.ISQML_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE__ELEMENTS = InterfacesPackage.ISQML_FILE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE_FEATURE_COUNT = InterfacesPackage.ISQML_FILE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE_OPERATION_COUNT = InterfacesPackage.ISQML_FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.impl.SqmlPackageDeclarationImpl <em>Sqml Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.impl.SqmlPackageDeclarationImpl
	 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlPackageDeclaration()
	 * @generated
	 */
	int SQML_PACKAGE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Sqml File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PACKAGE_DECLARATION__SQML_FILE = InterfacesPackage.ISQML_PACKAGE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PACKAGE_DECLARATION__NAME = InterfacesPackage.ISQML_PACKAGE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PACKAGE_DECLARATION_FEATURE_COUNT = InterfacesPackage.ISQML_PACKAGE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PACKAGE_DECLARATION_OPERATION_COUNT = InterfacesPackage.ISQML_PACKAGE_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.impl.SqmlImportImpl <em>Sqml Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.impl.SqmlImportImpl
	 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlImport()
	 * @generated
	 */
	int SQML_IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Sqml File</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IMPORT__SQML_FILE = InterfacesPackage.ISQML_IMPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IMPORT__TARGET = InterfacesPackage.ISQML_IMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IMPORT_FEATURE_COUNT = InterfacesPackage.ISQML_IMPORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IMPORT_OPERATION_COUNT = InterfacesPackage.ISQML_IMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.impl.SqmlFileElementImpl <em>Sqml File Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.impl.SqmlFileElementImpl
	 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlFileElement()
	 * @generated
	 */
	int SQML_FILE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE_ELEMENT__NAME = InterfacesPackage.ISQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml File Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE_ELEMENT_FEATURE_COUNT = InterfacesPackage.ISQML_FILE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml File Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FILE_ELEMENT_OPERATION_COUNT = InterfacesPackage.ISQML_FILE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.SqmlFile <em>Sqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml File</em>'.
	 * @see com.softicar.sqml.model.files.SqmlFile
	 * @generated
	 */
	EClass getSqmlFile();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.files.SqmlFile#getPackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package Declaration</em>'.
	 * @see com.softicar.sqml.model.files.SqmlFile#getPackageDeclaration()
	 * @see #getSqmlFile()
	 * @generated
	 */
	EReference getSqmlFile_PackageDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.files.SqmlFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see com.softicar.sqml.model.files.SqmlFile#getImports()
	 * @see #getSqmlFile()
	 * @generated
	 */
	EReference getSqmlFile_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.files.SqmlFile#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see com.softicar.sqml.model.files.SqmlFile#getElements()
	 * @see #getSqmlFile()
	 * @generated
	 */
	EReference getSqmlFile_Elements();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.SqmlPackageDeclaration <em>Sqml Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Package Declaration</em>'.
	 * @see com.softicar.sqml.model.files.SqmlPackageDeclaration
	 * @generated
	 */
	EClass getSqmlPackageDeclaration();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.files.SqmlPackageDeclaration#getSqmlFile <em>Sqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sqml File</em>'.
	 * @see com.softicar.sqml.model.files.SqmlPackageDeclaration#getSqmlFile()
	 * @see #getSqmlPackageDeclaration()
	 * @generated
	 */
	EReference getSqmlPackageDeclaration_SqmlFile();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.files.SqmlPackageDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.files.SqmlPackageDeclaration#getName()
	 * @see #getSqmlPackageDeclaration()
	 * @generated
	 */
	EAttribute getSqmlPackageDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.SqmlImport <em>Sqml Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Import</em>'.
	 * @see com.softicar.sqml.model.files.SqmlImport
	 * @generated
	 */
	EClass getSqmlImport();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.files.SqmlImport#getSqmlFile <em>Sqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Sqml File</em>'.
	 * @see com.softicar.sqml.model.files.SqmlImport#getSqmlFile()
	 * @see #getSqmlImport()
	 * @generated
	 */
	EReference getSqmlImport_SqmlFile();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.files.SqmlImport#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.softicar.sqml.model.files.SqmlImport#getTarget()
	 * @see #getSqmlImport()
	 * @generated
	 */
	EReference getSqmlImport_Target();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.SqmlFileElement <em>Sqml File Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml File Element</em>'.
	 * @see com.softicar.sqml.model.files.SqmlFileElement
	 * @generated
	 */
	EClass getSqmlFileElement();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.files.SqmlFileElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.files.SqmlFileElement#getName()
	 * @see #getSqmlFileElement()
	 * @generated
	 */
	EAttribute getSqmlFileElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FilesFactory getFilesFactory();

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
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.impl.SqmlFileImpl <em>Sqml File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.impl.SqmlFileImpl
		 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlFile()
		 * @generated
		 */
		EClass SQML_FILE = eINSTANCE.getSqmlFile();

		/**
		 * The meta object literal for the '<em><b>Package Declaration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FILE__PACKAGE_DECLARATION = eINSTANCE.getSqmlFile_PackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FILE__IMPORTS = eINSTANCE.getSqmlFile_Imports();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FILE__ELEMENTS = eINSTANCE.getSqmlFile_Elements();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.impl.SqmlPackageDeclarationImpl <em>Sqml Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.impl.SqmlPackageDeclarationImpl
		 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlPackageDeclaration()
		 * @generated
		 */
		EClass SQML_PACKAGE_DECLARATION = eINSTANCE.getSqmlPackageDeclaration();

		/**
		 * The meta object literal for the '<em><b>Sqml File</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_PACKAGE_DECLARATION__SQML_FILE = eINSTANCE.getSqmlPackageDeclaration_SqmlFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_PACKAGE_DECLARATION__NAME = eINSTANCE.getSqmlPackageDeclaration_Name();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.impl.SqmlImportImpl <em>Sqml Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.impl.SqmlImportImpl
		 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlImport()
		 * @generated
		 */
		EClass SQML_IMPORT = eINSTANCE.getSqmlImport();

		/**
		 * The meta object literal for the '<em><b>Sqml File</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IMPORT__SQML_FILE = eINSTANCE.getSqmlImport_SqmlFile();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IMPORT__TARGET = eINSTANCE.getSqmlImport_Target();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.impl.SqmlFileElementImpl <em>Sqml File Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.impl.SqmlFileElementImpl
		 * @see com.softicar.sqml.model.files.impl.FilesPackageImpl#getSqmlFileElement()
		 * @generated
		 */
		EClass SQML_FILE_ELEMENT = eINSTANCE.getSqmlFileElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_FILE_ELEMENT__NAME = eINSTANCE.getSqmlFileElement_Name();

	}

} //FilesPackage
