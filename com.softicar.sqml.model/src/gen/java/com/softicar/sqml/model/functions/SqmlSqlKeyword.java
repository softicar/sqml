/**
 */
package com.softicar.sqml.model.functions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Sql Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlSqlKeyword#getKeywordText <em>Keyword Text</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlKeyword()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSqlKeyword"
 * @generated
 */
public interface SqmlSqlKeyword extends EObject, ISqmlSqlKeyword {
	/**
	 * Returns the value of the '<em><b>Keyword Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Text</em>' attribute.
	 * @see #setKeywordText(String)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlKeyword_KeywordText()
	 * @model unique="false"
	 * @generated
	 */
	String getKeywordText();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlSqlKeyword#getKeywordText <em>Keyword Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword Text</em>' attribute.
	 * @see #getKeywordText()
	 * @generated
	 */
	void setKeywordText(String value);

} // SqmlSqlKeyword
