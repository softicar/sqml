/**
 */
package com.softicar.sqml.model.queries;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.queries.QueriesPackage
 * @generated
 */
public interface QueriesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueriesFactory eINSTANCE = com.softicar.sqml.model.queries.impl.QueriesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Query</em>'.
	 * @generated
	 */
	SqmlQuery createSqmlQuery();

	/**
	 * Returns a new object of class '<em>Sqml Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Query Parameter</em>'.
	 * @generated
	 */
	SqmlQueryParameter createSqmlQueryParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QueriesPackage getQueriesPackage();

} //QueriesFactory
