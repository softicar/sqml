/**
 */
package com.softicar.sqml.model.conditions.impl;

import com.softicar.sqml.model.conditions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionsFactoryImpl extends EFactoryImpl implements ConditionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConditionsFactory init() {
		try {
			ConditionsFactory theConditionsFactory = (ConditionsFactory)EPackage.Registry.INSTANCE.getEFactory(ConditionsPackage.eNS_URI);
			if (theConditionsFactory != null) {
				return theConditionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConditionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConditionsPackage.SQML_AND: return createSqmlAnd();
			case ConditionsPackage.SQML_BETWEEN: return createSqmlBetween();
			case ConditionsPackage.SQML_COMPARISON: return createSqmlComparison();
			case ConditionsPackage.SQML_EXISTS: return createSqmlExists();
			case ConditionsPackage.SQML_IN: return createSqmlIn();
			case ConditionsPackage.SQML_IS_NULL: return createSqmlIsNull();
			case ConditionsPackage.SQML_LIKE: return createSqmlLike();
			case ConditionsPackage.SQML_NOT: return createSqmlNot();
			case ConditionsPackage.SQML_OR: return createSqmlOr();
			case ConditionsPackage.SQML_REGEXP: return createSqmlRegexp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlAnd createSqmlAnd() {
		SqmlAndImpl sqmlAnd = new SqmlAndImpl();
		return sqmlAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlBetween createSqmlBetween() {
		SqmlBetweenImpl sqmlBetween = new SqmlBetweenImpl();
		return sqmlBetween;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlComparison createSqmlComparison() {
		SqmlComparisonImpl sqmlComparison = new SqmlComparisonImpl();
		return sqmlComparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlExists createSqmlExists() {
		SqmlExistsImpl sqmlExists = new SqmlExistsImpl();
		return sqmlExists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlIn createSqmlIn() {
		SqmlInImpl sqmlIn = new SqmlInImpl();
		return sqmlIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlIsNull createSqmlIsNull() {
		SqmlIsNullImpl sqmlIsNull = new SqmlIsNullImpl();
		return sqmlIsNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlLike createSqmlLike() {
		SqmlLikeImpl sqmlLike = new SqmlLikeImpl();
		return sqmlLike;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlNot createSqmlNot() {
		SqmlNotImpl sqmlNot = new SqmlNotImpl();
		return sqmlNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlOr createSqmlOr() {
		SqmlOrImpl sqmlOr = new SqmlOrImpl();
		return sqmlOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlRegexp createSqmlRegexp() {
		SqmlRegexpImpl sqmlRegexp = new SqmlRegexpImpl();
		return sqmlRegexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsPackage getConditionsPackage() {
		return (ConditionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConditionsPackage getPackage() {
		return ConditionsPackage.eINSTANCE;
	}

} //ConditionsFactoryImpl
