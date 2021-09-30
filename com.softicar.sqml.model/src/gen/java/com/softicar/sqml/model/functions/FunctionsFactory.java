/**
 */
package com.softicar.sqml.model.functions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.functions.FunctionsPackage
 * @generated
 */
public interface FunctionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsFactory eINSTANCE = com.softicar.sqml.model.functions.impl.FunctionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Function</em>'.
	 * @generated
	 */
	SqmlFunction createSqmlFunction();

	/**
	 * Returns a new object of class '<em>Sqml Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Function Call</em>'.
	 * @generated
	 */
	SqmlFunctionCall createSqmlFunctionCall();

	/**
	 * Returns a new object of class '<em>Sqml Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Function Parameter</em>'.
	 * @generated
	 */
	SqmlFunctionParameter createSqmlFunctionParameter();

	/**
	 * Returns a new object of class '<em>Sqml Sql</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sql</em>'.
	 * @generated
	 */
	SqmlSql createSqmlSql();

	/**
	 * Returns a new object of class '<em>Sqml Sql Id</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sql Id</em>'.
	 * @generated
	 */
	SqmlSqlId createSqmlSqlId();

	/**
	 * Returns a new object of class '<em>Sqml Sql Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sql Keyword</em>'.
	 * @generated
	 */
	SqmlSqlKeyword createSqmlSqlKeyword();

	/**
	 * Returns a new object of class '<em>Sqml Sql Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sql Number Literal</em>'.
	 * @generated
	 */
	SqmlSqlNumberLiteral createSqmlSqlNumberLiteral();

	/**
	 * Returns a new object of class '<em>Sqml Sql String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sql String Literal</em>'.
	 * @generated
	 */
	SqmlSqlStringLiteral createSqmlSqlStringLiteral();

	/**
	 * Returns a new object of class '<em>Sqml Sql Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sql Symbol</em>'.
	 * @generated
	 */
	SqmlSqlSymbol createSqmlSqlSymbol();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FunctionsPackage getFunctionsPackage();

} //FunctionsFactory
