/**
 */
package com.softicar.sqml.model.tables;

import com.softicar.sqml.model.literals.ISqmlLiteral;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Table Row Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableRowValue#getRow <em>Row</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableRowValue#getLiteral <em>Literal</em>}</li>
 *   <li>{@link com.softicar.sqml.model.tables.SqmlTableRowValue#isNull <em>Null</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableRowValue()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlTableRowValue"
 * @generated
 */
public interface SqmlTableRowValue extends EObject, ISqmlTableRowValue {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.softicar.sqml.model.tables.SqmlTableRow#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' container reference.
	 * @see #setRow(SqmlTableRow)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableRowValue_Row()
	 * @see com.softicar.sqml.model.tables.SqmlTableRow#getValues
	 * @model opposite="values" transient="false"
	 * @generated
	 */
	SqmlTableRow getRow();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableRowValue#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(SqmlTableRow value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(ISqmlLiteral)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableRowValue_Literal()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlLiteral" containment="true"
	 * @generated
	 */
	ISqmlLiteral<?> getLiteral();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableRowValue#getLiteral <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(ISqmlLiteral<?> value);

	/**
	 * Returns the value of the '<em><b>Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' attribute.
	 * @see #setNull(boolean)
	 * @see com.softicar.sqml.model.tables.TablesPackage#getSqmlTableRowValue_Null()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNull();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.tables.SqmlTableRowValue#isNull <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null</em>' attribute.
	 * @see #isNull()
	 * @generated
	 */
	void setNull(boolean value);

} // SqmlTableRowValue
