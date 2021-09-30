/**
 */
package com.softicar.sqml.model.tables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.tables.TablesPackage
 * @generated
 */
public interface TablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TablesFactory eINSTANCE = com.softicar.sqml.model.tables.impl.TablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml Literal Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Literal Default Value</em>'.
	 * @generated
	 */
	SqmlLiteralDefaultValue createSqmlLiteralDefaultValue();

	/**
	 * Returns a new object of class '<em>Sqml Row Constructor Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Row Constructor Default Value</em>'.
	 * @generated
	 */
	SqmlRowConstructorDefaultValue createSqmlRowConstructorDefaultValue();

	/**
	 * Returns a new object of class '<em>Sqml Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Table</em>'.
	 * @generated
	 */
	SqmlTable createSqmlTable();

	/**
	 * Returns a new object of class '<em>Sqml Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Table Column</em>'.
	 * @generated
	 */
	SqmlTableColumn createSqmlTableColumn();

	/**
	 * Returns a new object of class '<em>Sqml Unique Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Unique Key</em>'.
	 * @generated
	 */
	SqmlUniqueKey createSqmlUniqueKey();

	/**
	 * Returns a new object of class '<em>Sqml Index Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Index Key</em>'.
	 * @generated
	 */
	SqmlIndexKey createSqmlIndexKey();

	/**
	 * Returns a new object of class '<em>Sqml Value Reference Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Value Reference Default Value</em>'.
	 * @generated
	 */
	SqmlValueReferenceDefaultValue createSqmlValueReferenceDefaultValue();

	/**
	 * Returns a new object of class '<em>Sqml Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Table Row</em>'.
	 * @generated
	 */
	SqmlTableRow createSqmlTableRow();

	/**
	 * Returns a new object of class '<em>Sqml Table Row Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Table Row Value</em>'.
	 * @generated
	 */
	SqmlTableRowValue createSqmlTableRowValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TablesPackage getTablesPackage();

} //TablesFactory
