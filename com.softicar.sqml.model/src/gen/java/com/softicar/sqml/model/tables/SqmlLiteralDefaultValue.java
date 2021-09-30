/**
 */
package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.literals.ISqmlLiteral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Literal Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#isMinus <em>Minus</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#getLiteral <em>Literal</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlLiteralDefaultValue()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteralDefaultValue"
 * @generated
 */
public interface SqmlLiteralDefaultValue extends EObject, ISqmlLiteralDefaultValue {
	/**
	 * Returns the value of the '<em><b>Minus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minus</em>' attribute.
	 * @see #setMinus(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlLiteralDefaultValue_Minus()
	 * @model unique="false"
	 * @generated
	 */
	boolean isMinus();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#isMinus <em>Minus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minus</em>' attribute.
	 * @see #isMinus()
	 * @generated
	 */
	void setMinus(boolean value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(ISqmlLiteral)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlLiteralDefaultValue_Literal()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlLiteral" containment="true"
	 * @generated
	 */
	ISqmlLiteral<?> getLiteral();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlLiteralDefaultValue#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(ISqmlLiteral<?> value);

} // SqmlLiteralDefaultValue
