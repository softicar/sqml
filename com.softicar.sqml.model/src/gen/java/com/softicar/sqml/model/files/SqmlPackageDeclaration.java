/**
 */
package com.softicar.sqml.model.files;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.files.SqmlPackageDeclaration#getSqmlFile <em>Sqml File</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.SqmlPackageDeclaration#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlPackageDeclaration()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlPackageDeclaration"
 * @generated
 */
public interface SqmlPackageDeclaration extends EObject, ISqmlPackageDeclaration {
	/**
	 * Returns the value of the '<em><b>Sqml File</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.files.SqmlFile#getPackageDeclaration <em>Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sqml File</em>' container reference.
	 * @see #setSqmlFile(SqmlFile)
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlPackageDeclaration_SqmlFile()
	 * @see com.softicar.sqml.model.files.SqmlFile#getPackageDeclaration
	 * @model opposite="packageDeclaration" transient="false"
	 * @generated
	 */
	SqmlFile getSqmlFile();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.files.SqmlPackageDeclaration#getSqmlFile <em>Sqml File</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sqml File</em>' container reference.
	 * @see #getSqmlFile()
	 * @generated
	 */
	void setSqmlFile(SqmlFile value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlPackageDeclaration_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.files.SqmlPackageDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SqmlPackageDeclaration
