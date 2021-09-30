/**
 */
package com.softicar.sqml.model.literals;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.literals.LiteralsPackage
 * @generated
 */
public interface LiteralsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LiteralsFactory eINSTANCE = com.softicar.sqml.model.literals.impl.LiteralsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Boolean Literal</em>'.
	 * @generated
	 */
	SqmlBooleanLiteral createSqmlBooleanLiteral();

	/**
	 * Returns a new object of class '<em>Sqml Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Integer Literal</em>'.
	 * @generated
	 */
	SqmlIntegerLiteral createSqmlIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Sqml Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Long Literal</em>'.
	 * @generated
	 */
	SqmlLongLiteral createSqmlLongLiteral();

	/**
	 * Returns a new object of class '<em>Sqml Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Float Literal</em>'.
	 * @generated
	 */
	SqmlFloatLiteral createSqmlFloatLiteral();

	/**
	 * Returns a new object of class '<em>Sqml Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Double Literal</em>'.
	 * @generated
	 */
	SqmlDoubleLiteral createSqmlDoubleLiteral();

	/**
	 * Returns a new object of class '<em>Sqml Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Decimal Literal</em>'.
	 * @generated
	 */
	SqmlDecimalLiteral createSqmlDecimalLiteral();

	/**
	 * Returns a new object of class '<em>Sqml String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml String Literal</em>'.
	 * @generated
	 */
	SqmlStringLiteral createSqmlStringLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LiteralsPackage getLiteralsPackage();

} //LiteralsFactory
