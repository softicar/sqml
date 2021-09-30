/**
 */
package com.softicar.sqml.model.selects;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Sub Select Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable#getSubSelect <em>Sub Select</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSubSelectVariable()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSubSelectVariable"
 * @generated
 */
public interface SqmlSubSelectVariable extends EObject, ISqmlSubSelectVariable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSubSelectVariable_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Select</em>' containment reference.
	 * @see #setSubSelect(ISqmlSelect)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSubSelectVariable_SubSelect()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSelect" containment="true"
	 * @generated
	 */
	ISqmlSelect getSubSelect();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSubSelectVariable#getSubSelect <em>Sub Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Select</em>' containment reference.
	 * @see #getSubSelect()
	 * @generated
	 */
	void setSubSelect(ISqmlSelect value);

} // SqmlSubSelectVariable
