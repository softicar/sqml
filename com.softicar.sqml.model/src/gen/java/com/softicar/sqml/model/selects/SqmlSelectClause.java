/**
 */
package com.softicar.sqml.model.selects;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Select Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectClause#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlSelectClause#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectClause()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectClause"
 * @generated
 */
public interface SqmlSelectClause extends EObject, ISqmlSelectClause {
	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectClause_Distinct()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlSelectClause#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.selects.SqmlSelectColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlSelectClause_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<SqmlSelectColumn> getColumns();

} // SqmlSelectClause
