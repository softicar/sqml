/**
 */
package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.expressions.ISqmlValueReference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Row Constructor Default Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlRowConstructorDefaultValue#getValueReferences <em>Value References</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlRowConstructorDefaultValue()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlRowConstructorDefaultValue"
 * @generated
 */
public interface SqmlRowConstructorDefaultValue extends EObject, ISqmlRowConstructorDefaultValue {
	/**
	 * Returns the value of the '<em><b>Value References</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.expressions.ISqmlValueReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value References</em>' containment reference list.
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlRowConstructorDefaultValue_ValueReferences()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlValueReference" containment="true"
	 * @generated
	 */
	EList<ISqmlValueReference> getValueReferences();

} // SqmlRowConstructorDefaultValue
