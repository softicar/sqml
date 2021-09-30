/**
 */
package com.softicar.sqml.model.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsFactory eINSTANCE = com.softicar.sqml.model.expressions.impl.ExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Negation</em>'.
	 * @generated
	 */
	SqmlNegation createSqmlNegation();

	/**
	 * Returns a new object of class '<em>Sqml Addition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Addition</em>'.
	 * @generated
	 */
	SqmlAddition createSqmlAddition();

	/**
	 * Returns a new object of class '<em>Sqml Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Multiplication</em>'.
	 * @generated
	 */
	SqmlMultiplication createSqmlMultiplication();

	/**
	 * Returns a new object of class '<em>Sqml Static Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static Variable Reference</em>'.
	 * @generated
	 */
	SqmlStaticVariableReference createSqmlStaticVariableReference();

	/**
	 * Returns a new object of class '<em>Sqml Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Path</em>'.
	 * @generated
	 */
	SqmlPath createSqmlPath();

	/**
	 * Returns a new object of class '<em>Sqml Group Concat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Group Concat</em>'.
	 * @generated
	 */
	SqmlGroupConcat createSqmlGroupConcat();

	/**
	 * Returns a new object of class '<em>Sqml Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Case</em>'.
	 * @generated
	 */
	SqmlCase createSqmlCase();

	/**
	 * Returns a new object of class '<em>Sqml Case When</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Case When</em>'.
	 * @generated
	 */
	SqmlCaseWhen createSqmlCaseWhen();

	/**
	 * Returns a new object of class '<em>Sqml If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml If</em>'.
	 * @generated
	 */
	SqmlIf createSqmlIf();

	/**
	 * Returns a new object of class '<em>Sqml If Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml If Null</em>'.
	 * @generated
	 */
	SqmlIfNull createSqmlIfNull();

	/**
	 * Returns a new object of class '<em>Sqml Row Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Row Constructor</em>'.
	 * @generated
	 */
	SqmlRowConstructor createSqmlRowConstructor();

	/**
	 * Returns a new object of class '<em>Sqml Static And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static And</em>'.
	 * @generated
	 */
	SqmlStaticAnd createSqmlStaticAnd();

	/**
	 * Returns a new object of class '<em>Sqml Static If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static If</em>'.
	 * @generated
	 */
	SqmlStaticIf createSqmlStaticIf();

	/**
	 * Returns a new object of class '<em>Sqml Static Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static Is Empty</em>'.
	 * @generated
	 */
	SqmlStaticIsEmpty createSqmlStaticIsEmpty();

	/**
	 * Returns a new object of class '<em>Sqml Static Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static Is Null</em>'.
	 * @generated
	 */
	SqmlStaticIsNull createSqmlStaticIsNull();

	/**
	 * Returns a new object of class '<em>Sqml Static Is True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static Is True</em>'.
	 * @generated
	 */
	SqmlStaticIsTrue createSqmlStaticIsTrue();

	/**
	 * Returns a new object of class '<em>Sqml Static Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static Or</em>'.
	 * @generated
	 */
	SqmlStaticOr createSqmlStaticOr();

	/**
	 * Returns a new object of class '<em>Sqml Static Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Static Parentheses</em>'.
	 * @generated
	 */
	SqmlStaticParentheses createSqmlStaticParentheses();

	/**
	 * Returns a new object of class '<em>Sqml Sub Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Sub Select</em>'.
	 * @generated
	 */
	SqmlSubSelect createSqmlSubSelect();

	/**
	 * Returns a new object of class '<em>Sqml Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Value Reference</em>'.
	 * @generated
	 */
	SqmlValueReference createSqmlValueReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionsPackage getExpressionsPackage();

} //ExpressionsFactory
