/**
 */
package com.softicar.sqml.model.queries;

import com.softicar.sqml.model.types.ISqmlTypeReference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Query Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getQuery <em>Query</em>}</li>
 *   <li>{@link com.softicar.sqml.model.queries.SqmlQueryParameter#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQueryParameter()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlQueryParameter"
 * @generated
 */
public interface SqmlQueryParameter extends EObject, ISqmlQueryParameter {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQueryParameter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Query</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.queries.SqmlQuery#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' container reference.
	 * @see #setQuery(SqmlQuery)
	 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQueryParameter_Query()
	 * @see com.softicar.sqml.model.queries.SqmlQuery#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	SqmlQuery getQuery();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getQuery <em>Query</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' container reference.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(SqmlQuery value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQueryParameter_Optional()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(ISqmlTypeReference)
	 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQueryParameter_TypeReference()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTypeReference" containment="true"
	 * @generated
	 */
	ISqmlTypeReference getTypeReference();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(ISqmlTypeReference value);

} // SqmlQueryParameter
