/**
 */
package com.softicar.sqml.model.types;

import com.softicar.sqml.model.literals.ISqmlLiteral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Enumerator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.types.SqmlEnumerator#getEnum <em>Enum</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.SqmlEnumerator#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.types.SqmlEnumerator#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnumerator()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlEnumerator"
 * @generated
 */
public interface SqmlEnumerator extends EObject, ISqmlEnumerator {
	/**
	 * Returns the value of the '<em><b>Enum</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.types.SqmlEnum#getEnumerators <em>Enumerators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' container reference.
	 * @see #setEnum(SqmlEnum)
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnumerator_Enum()
	 * @see com.softicar.sqml.model.types.SqmlEnum#getEnumerators
	 * @model opposite="enumerators" transient="false"
	 * @generated
	 */
	SqmlEnum getEnum();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.types.SqmlEnumerator#getEnum <em>Enum</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' container reference.
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(SqmlEnum value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnumerator_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.types.SqmlEnumerator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ISqmlLiteral)
	 * @see com.softicar.sqml.model.types.TypesPackage#getSqmlEnumerator_Value()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlLiteral" containment="true"
	 * @generated
	 */
	ISqmlLiteral<?> getValue();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.types.SqmlEnumerator#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ISqmlLiteral<?> value);

} // SqmlEnumerator
