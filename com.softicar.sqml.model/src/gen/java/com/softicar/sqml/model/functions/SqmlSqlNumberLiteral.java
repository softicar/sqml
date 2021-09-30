/**
 */
package com.softicar.sqml.model.functions;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Sql Number Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getInteger <em>Integer</em>}</li>
 *   <li>{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getDecimal <em>Decimal</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlNumberLiteral()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlSqlNumberLiteral"
 * @generated
 */
public interface SqmlSqlNumberLiteral extends EObject, ISqmlSqlNumberLiteral {
	/**
	 * Returns the value of the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' attribute.
	 * @see #setInteger(Integer)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlNumberLiteral_Integer()
	 * @model unique="false"
	 * @generated
	 */
	Integer getInteger();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getInteger <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' attribute.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(Integer value);

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #setDecimal(BigDecimal)
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#getSqmlSqlNumberLiteral_Decimal()
	 * @model unique="false" dataType="com.softicar.sqml.model.externals.BigDecimal"
	 * @generated
	 */
	BigDecimal getDecimal();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(BigDecimal value);

} // SqmlSqlNumberLiteral
