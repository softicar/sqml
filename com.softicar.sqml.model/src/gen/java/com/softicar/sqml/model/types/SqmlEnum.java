/**
 */
package com.softicar.sqml.model.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.types.SqmlEnum#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.SqmlEnum#getTypeReference <em>Type Reference</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.SqmlEnum#getEnumerators <em>Enumerators</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnum()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlEnum"
 * @generated
 */
public interface SqmlEnum extends EObject, ISqmlEnum {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnum_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.types.SqmlEnum#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(ISqmlTypeReference)
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnum_TypeReference()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTypeReference" containment="true"
	 * @generated
	 */
	ISqmlTypeReference getTypeReference();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.types.SqmlEnum#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(ISqmlTypeReference value);

	/**
	 * Returns the value of the '<em><b>Enumerators</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.types.SqmlEnumerator}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.types.SqmlEnumerator#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerators</em>' containment reference list.
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnum_Enumerators()
	 * @see com.softicar.sqml.model.types.SqmlEnumerator#getEnum
	 * @model opposite="enum" containment="true"
	 * @generated
	 */
	EList<SqmlEnumerator> getEnumerators();

} // SqmlEnum
