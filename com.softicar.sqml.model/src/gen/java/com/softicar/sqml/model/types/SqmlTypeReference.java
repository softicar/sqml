/**
 */
package com.softicar.sqml.model.types;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.types.SqmlTypeReference#isList <em>List</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.SqmlTypeReference#getTypeDefinition <em>Type Definition</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.SqmlTypeReference#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlTypeReference()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlTypeReference"
 * @generated
 */
public interface SqmlTypeReference extends EObject, ISqmlTypeReference {
	/**
	 * Returns the value of the '<em><b>List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' attribute.
	 * @see #setList(boolean)
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlTypeReference_List()
	 * @model unique="false"
	 * @generated
	 */
	boolean isList();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.types.SqmlTypeReference#isList <em>List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' attribute.
	 * @see #isList()
	 * @generated
	 */
	void setList(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Definition</em>' reference.
	 * @see #setTypeDefinition(ISqmlTypeDefinition)
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlTypeReference_TypeDefinition()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTypeDefinition"
	 * @generated
	 */
	ISqmlTypeDefinition getTypeDefinition();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.types.SqmlTypeReference#getTypeDefinition <em>Type Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Definition</em>' reference.
	 * @see #getTypeDefinition()
	 * @generated
	 */
	void setTypeDefinition(ISqmlTypeDefinition value);

	/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.types.ISqmlTypeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlTypeReference_TypeParameters()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTypeReference" containment="true"
	 * @generated
	 */
	EList<ISqmlTypeReference> getTypeParameters();

} // SqmlTypeReference
