/**
 */
package com.softicar.sqml.model.selects;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.selects.SelectsPackage
 * @generated
 */
public interface SelectsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SelectsFactory eINSTANCE = com.softicar.sqml.model.selects.impl.SelectsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml Foreign Key Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Foreign Key Variable</em>'.
	 * @generated
	 */
	SqmlForeignKeyVariable createSqmlForeignKeyVariable();

	/**
	 * Returns a new object of class '<em>Sqml From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml From Clause</em>'.
	 * @generated
	 */
	SqmlFromClause createSqmlFromClause();

	/**
	 * Returns a new object of class '<em>Sqml Group By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Group By Clause</em>'.
	 * @generated
	 */
	SqmlGroupByClause createSqmlGroupByClause();

	/**
	 * Returns a new object of class '<em>Sqml Having Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Having Clause</em>'.
	 * @generated
	 */
	SqmlHavingClause createSqmlHavingClause();

	/**
	 * Returns a new object of class '<em>Sqml Join Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Join Clause</em>'.
	 * @generated
	 */
	SqmlJoinClause createSqmlJoinClause();

	/**
	 * Returns a new object of class '<em>Sqml Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Order By Clause</em>'.
	 * @generated
	 */
	SqmlOrderByClause createSqmlOrderByClause();

	/**
	 * Returns a new object of class '<em>Sqml Order By Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Order By Expression</em>'.
	 * @generated
	 */
	SqmlOrderByExpression createSqmlOrderByExpression();

	/**
	 * Returns a new object of class '<em>Sqml Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Select</em>'.
	 * @generated
	 */
	SqmlSelect createSqmlSelect();

	/**
	 * Returns a new object of class '<em>Sqml Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Select Clause</em>'.
	 * @generated
	 */
	SqmlSelectClause createSqmlSelectClause();

	/**
	 * Returns a new object of class '<em>Sqml Select Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Select Column</em>'.
	 * @generated
	 */
	SqmlSelectColumn createSqmlSelectColumn();

	/**
	 * Returns a new object of class '<em>Sqml Select Else</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Select Else</em>'.
	 * @generated
	 */
	SqmlSelectElse createSqmlSelectElse();

	/**
	 * Returns a new object of class '<em>Sqml Select Else If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Select Else If</em>'.
	 * @generated
	 */
	SqmlSelectElseIf createSqmlSelectElseIf();

	/**
	 * Returns a new object of class '<em>Sqml Select If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Select If</em>'.
	 * @generated
	 */
	SqmlSelectIf createSqmlSelectIf();

	/**
	 * Returns a new object of class '<em>Sqml Sub Select Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sub Select Variable</em>'.
	 * @generated
	 */
	SqmlSubSelectVariable createSqmlSubSelectVariable();

	/**
	 * Returns a new object of class '<em>Sqml Table Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Table Variable</em>'.
	 * @generated
	 */
	SqmlTableVariable createSqmlTableVariable();

	/**
	 * Returns a new object of class '<em>Sqml Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Where Clause</em>'.
	 * @generated
	 */
	SqmlWhereClause createSqmlWhereClause();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SelectsPackage getSelectsPackage();

} //SelectsFactory
