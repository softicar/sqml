/**
 */
package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.expressions.ISqmlValueReference;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Value Reference Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue#getValueReference <em>Value Reference</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlValueReferenceDefaultValue()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlValueReferenceDefaultValue"
 * @generated
 */
public interface SqmlValueReferenceDefaultValue extends EObject, ISqmlValueReferenceDefaultValue {
	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(ISqmlValueReference)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlValueReferenceDefaultValue_ValueReference()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlValueReference" containment="true"
	 * @generated
	 */
	ISqmlValueReference getValueReference();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlValueReferenceDefaultValue#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(ISqmlValueReference value);

} // SqmlValueReferenceDefaultValue
