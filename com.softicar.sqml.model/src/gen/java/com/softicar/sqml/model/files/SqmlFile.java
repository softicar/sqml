/**
 */
package com.softicar.sqml.model.files;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.files.SqmlFile#getPackageDeclaration <em>Package Declaration</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.SqmlFile#getImports <em>Imports</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.SqmlFile#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlFile()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlFile"
 * @generated
 */
public interface SqmlFile extends EObject, ISqmlFile {
	/**
	 * Returns the value of the '<em><b>Package Declaration</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.files.SqmlPackageDeclaration#getSqmlFile <em>Sqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Declaration</em>' containment reference.
	 * @see #setPackageDeclaration(SqmlPackageDeclaration)
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlFile_PackageDeclaration()
	 * @see com.softicar.sqml.model.files.SqmlPackageDeclaration#getSqmlFile
	 * @model opposite="sqmlFile" containment="true"
	 * @generated
	 */
	SqmlPackageDeclaration getPackageDeclaration();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.files.SqmlFile#getPackageDeclaration <em>Package Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Declaration</em>' containment reference.
	 * @see #getPackageDeclaration()
	 * @generated
	 */
	void setPackageDeclaration(SqmlPackageDeclaration value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.files.SqmlImport}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.files.SqmlImport#getSqmlFile <em>Sqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlFile_Imports()
	 * @see com.softicar.sqml.model.files.SqmlImport#getSqmlFile
	 * @model opposite="sqmlFile" containment="true"
	 * @generated
	 */
	EList<SqmlImport> getImports();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.files.SqmlFileElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlFile_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SqmlFileElement> getElements();

} // SqmlFile
