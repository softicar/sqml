/**
 */
package com.softicar.sqml.model.types;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.types.TypesPackage
 * @generated
 */
public interface TypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesFactory eINSTANCE = com.softicar.sqml.model.types.impl.TypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sqml Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Value Type</em>'.
	 * @generated
	 */
	SqmlValueType createSqmlValueType();

	/**
	 * Returns a new object of class '<em>Sqml Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Enum</em>'.
	 * @generated
	 */
	SqmlEnum createSqmlEnum();

	/**
	 * Returns a new object of class '<em>Sqml Enumerator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Enumerator</em>'.
	 * @generated
	 */
	SqmlEnumerator createSqmlEnumerator();

	/**
	 * Returns a new object of class '<em>Sqml Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sqml Type Reference</em>'.
	 * @generated
	 */
	SqmlTypeReference createSqmlTypeReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypesPackage getTypesPackage();

} //TypesFactory
