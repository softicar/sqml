/**
 */
package com.softicar.sqml.model.functions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Sql Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlSqlSymbol#getSymbolText <em>Symbol Text</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlSymbol()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSqlSymbol"
 * @generated
 */
public interface SqmlSqlSymbol extends EObject, ISqmlSqlSymbol {
	/**
	 * Returns the value of the '<em><b>Symbol Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Text</em>' attribute.
	 * @see #setSymbolText(String)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlSymbol_SymbolText()
	 * @model unique="false"
	 * @generated
	 */
	String getSymbolText();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlSqlSymbol#getSymbolText <em>Symbol Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Text</em>' attribute.
	 * @see #getSymbolText()
	 * @generated
	 */
	void setSymbolText(String value);

} // SqmlSqlSymbol
