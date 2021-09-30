/**
 */
package com.softicar.sqml.model.queries;

import com.softicar.sqml.model.files.SqmlFileElement;

import com.softicar.sqml.model.selects.ISqmlSelect;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.queries.SqmlQuery#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.softicar.sqml.model.queries.SqmlQuery#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQuery()
 * @model superTypes="com.softicar.sqml.model.files.SqmlFileElement com.softicar.sqml.model.interfaces.ISqmlQuery"
 * @generated
 */
public interface SqmlQuery extends SqmlFileElement, ISqmlQuery {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.softicar.sqml.model.queries.SqmlQueryParameter}.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.queries.SqmlQueryParameter#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQuery_Parameters()
	 * @see com.softicar.sqml.model.queries.SqmlQueryParameter#getQuery
	 * @model opposite="query" containment="true"
	 * @generated
	 */
	EList<SqmlQueryParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(ISqmlSelect)
	 * @see com.softicar.sqml.model.queries.QueriesPackage#getSqmlQuery_Select()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlSelect" containment="true"
	 * @generated
	 */
	ISqmlSelect getSelect();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.queries.SqmlQuery#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(ISqmlSelect value);

} // SqmlQuery
