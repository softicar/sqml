/**
 */
package com.softicar.sqml.model.files;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.files.FilesPackage
 * @generated
 */
public interface FilesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilesFactory eINSTANCE = com.softicar.sqml.model.files.impl.FilesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml File</em>'.
	 * @generated
	 */
	SqmlFile createSqmlFile();

	/**
	 * Returns a new object of class '<em>Sqml Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Package Declaration</em>'.
	 * @generated
	 */
	SqmlPackageDeclaration createSqmlPackageDeclaration();

	/**
	 * Returns a new object of class '<em>Sqml Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Import</em>'.
	 * @generated
	 */
	SqmlImport createSqmlImport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilesPackage getFilesPackage();

} //FilesFactory
