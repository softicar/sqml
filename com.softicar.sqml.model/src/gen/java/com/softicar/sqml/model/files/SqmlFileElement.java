/**
 */
package com.softicar.sqml.model.files;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml File Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.files.SqmlFileElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlFileElement()
 * @model abstract="true" superTypes="com.softicar.sqml.model.interfaces.ISqmlFileElement"
 * @generated
 */
public interface SqmlFileElement extends EObject, ISqmlFileElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.files.FilesPackage#getSqmlFileElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.files.SqmlFileElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SqmlFileElement
