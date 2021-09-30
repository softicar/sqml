/**
 */
package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.selects.ISqmlSelect;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Sub Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.expressions.SqmlSubSelect#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlSubSelect()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSubSelect"
 * @generated
 */
public interface SqmlSubSelect extends EObject, ISqmlSubSelect {
	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(ISqmlSelect)
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#getSqmlSubSelect_Select()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSelect" containment="true"
	 * @generated
	 */
	ISqmlSelect getSelect();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.expressions.SqmlSubSelect#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(ISqmlSelect value);

} // SqmlSubSelect
