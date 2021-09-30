/**
 */
package com.softicar.sqml.model.selects;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml From Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlFromClause#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlFromClause()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlFromClause"
 * @generated
 */
public interface SqmlFromClause extends EObject, ISqmlFromClause {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(ISqmlVariable)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlFromClause_Variable()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlVariable" containment="true"
	 * @generated
	 */
	ISqmlVariable getVariable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlFromClause#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ISqmlVariable value);

} // SqmlFromClause
