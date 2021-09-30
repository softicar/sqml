/**
 */
package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.types.ISqmlTypeReference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getFunction <em>Function</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getTypeReference <em>Type Reference</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunctionParameter()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlFunctionParameter"
 * @generated
 */
public interface SqmlFunctionParameter extends EObject, ISqmlFunctionParameter {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunctionParameter_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.functions.SqmlFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' container reference.
	 * @see #setFunction(SqmlFunction)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunctionParameter_Function()
	 * @see com.softicar.sqml.model.functions.SqmlFunction#getParameters
	 * @model opposite="parameters" transient="false"
	 * @generated
	 */
	SqmlFunction getFunction();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getFunction <em>Function</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' container reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(SqmlFunction value);

	/**
	 * Returns the value of the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Reference</em>' containment reference.
	 * @see #setTypeReference(ISqmlTypeReference)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlFunctionParameter_TypeReference()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlTypeReference" containment="true"
	 * @generated
	 */
	ISqmlTypeReference getTypeReference();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getTypeReference <em>Type Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Reference</em>' containment reference.
	 * @see #getTypeReference()
	 * @generated
	 */
	void setTypeReference(ISqmlTypeReference value);

} // SqmlFunctionParameter
