/**
 */
package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlColumn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sqml Foreign Key Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getName <em>Name</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getVariable <em>Variable</em>}</li>
 *   <li>{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlForeignKeyVariable()
 * @model superTypes="com.softicar.sqml.model.interfaces.ISqmlForeignKeyVariable"
 * @generated
 */
public interface SqmlForeignKeyVariable extends EObject, ISqmlForeignKeyVariable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlForeignKeyVariable_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(ISqmlVariable)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlForeignKeyVariable_Variable()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlVariable"
	 * @generated
	 */
	ISqmlVariable getVariable();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ISqmlVariable value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(ISqmlColumn)
	 * @see com.softicar.sqml.model.selects.SelectsPackage#getSqmlForeignKeyVariable_Column()
	 * @model type="com.softicar.sqml.model.interfaces.ISqmlColumn"
	 * @generated
	 */
	ISqmlColumn getColumn();

	/**
	 * Sets the value of the '{@link com.softicar.sqml.model.selects.SqmlForeignKeyVariable#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(ISqmlColumn value);

} // SqmlForeignKeyVariable
