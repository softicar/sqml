/**
 */
package com.softicar.sqml.model.conditions;

import com.softicar.sqml.model.expressions.ISqmlSubSelect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Exists</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.conditions.SqmlExists#getSubSelect <em>Sub Select</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlExists()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlExists"
 * @generated
 */
public interface SqmlExists extends EObject, ISqmlExists {
	/**
	 * Returns the value of the '<em><b>Sub Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Select</em>' containment reference.
	 * @see #setSubSelect(ISqmlSubSelect)
	 * @see com.softicar.sqml.model.conditions.ConditionsPackage#getSqmlExists_SubSelect()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSubSelect" containment="true"
	 * @generated
	 */
	ISqmlSubSelect getSubSelect();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.conditions.SqmlExists#getSubSelect <em>Sub Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Select</em>' containment reference.
	 * @see #getSubSelect()
	 * @generated
	 */
	void setSubSelect(ISqmlSubSelect value);

} // SqmlExists
