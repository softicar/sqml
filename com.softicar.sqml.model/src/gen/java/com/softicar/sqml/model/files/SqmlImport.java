/**
 */
package com.softicar.sqml.model.files;

import com.softicar.sqml.model.ISqmlGlobalObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.files.SqmlImport#getSqmlFile <em>Sqml File</em>}</li>
 *   <li>{@link com.softicar.sqml.model.files.SqmlImport#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlImport()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlImport"
 * @generated
 */
public interface SqmlImport extends EObject, ISqmlImport {
	/**
	 * Returns the value of the '<em><b>Sqml File</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.files.SqmlFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sqml File</em>' container reference.
	 * @see #setSqmlFile(SqmlFile)
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlImport_SqmlFile()
	 * @see com.softicar.sqml.model.files.SqmlFile#getImports
	 * @model opposite="imports" transient="false"
	 * @generated
	 */
	SqmlFile getSqmlFile();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.files.SqmlImport#getSqmlFile <em>Sqml File</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sqml File</em>' container reference.
	 * @see #getSqmlFile()
	 * @generated
	 */
	void setSqmlFile(SqmlFile value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ISqmlGlobalObject)
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlImport_Target()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlGlobalObject"
	 * @generated
	 */
	ISqmlGlobalObject getTarget();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.files.SqmlImport#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ISqmlGlobalObject value);

} // SqmlImport
