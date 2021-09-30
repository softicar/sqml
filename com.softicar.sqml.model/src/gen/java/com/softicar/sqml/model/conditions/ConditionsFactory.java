/**
 */
package com.softicar.sqml.model.conditions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.conditions.ConditionsPackage
 * @generated
 */
public interface ConditionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConditionsFactory eINSTANCE = com.softicar.sqml.model.conditions.impl.ConditionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml And</em>'.
	 * @generated
	 */
	SqmlAnd createSqmlAnd();

	/**
	 * Returns a new object of class '<em>Sqml Between</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Between</em>'.
	 * @generated
	 */
	SqmlBetween createSqmlBetween();

	/**
	 * Returns a new object of class '<em>Sqml Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Comparison</em>'.
	 * @generated
	 */
	SqmlComparison createSqmlComparison();

	/**
	 * Returns a new object of class '<em>Sqml Exists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Exists</em>'.
	 * @generated
	 */
	SqmlExists createSqmlExists();

	/**
	 * Returns a new object of class '<em>Sqml In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml In</em>'.
	 * @generated
	 */
	SqmlIn createSqmlIn();

	/**
	 * Returns a new object of class '<em>Sqml Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Is Null</em>'.
	 * @generated
	 */
	SqmlIsNull createSqmlIsNull();

	/**
	 * Returns a new object of class '<em>Sqml Like</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Like</em>'.
	 * @generated
	 */
	SqmlLike createSqmlLike();

	/**
	 * Returns a new object of class '<em>Sqml Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Not</em>'.
	 * @generated
	 */
	SqmlNot createSqmlNot();

	/**
	 * Returns a new object of class '<em>Sqml Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Or</em>'.
	 * @generated
	 */
	SqmlOr createSqmlOr();

	/**
	 * Returns a new object of class '<em>Sqml Regexp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Regexp</em>'.
	 * @generated
	 */
	SqmlRegexp createSqmlRegexp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConditionsPackage getConditionsPackage();

} //ConditionsFactory
