/**
 */
package com.softicar.sqml.model.expressions.impl;

import com.softicar.sqml.model.expressions.*;

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
public class ExpressionsFactoryImpl extends EFactoryImpl implements ExpressionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionsFactory init() {
		try {
			ExpressionsFactory theExpressionsFactory = (ExpressionsFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionsPackage.eNS_URI);
			if (theExpressionsFactory != null) {
				return theExpressionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactoryImpl() {
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
			case ExpressionsPackage.SQML_NEGATION: return createSqmlNegation();
			case ExpressionsPackage.SQML_ADDITION: return createSqmlAddition();
			case ExpressionsPackage.SQML_MULTIPLICATION: return createSqmlMultiplication();
			case ExpressionsPackage.SQML_STATIC_VARIABLE_REFERENCE: return createSqmlStaticVariableReference();
			case ExpressionsPackage.SQML_PATH: return createSqmlPath();
			case ExpressionsPackage.SQML_GROUP_CONCAT: return createSqmlGroupConcat();
			case ExpressionsPackage.SQML_CASE: return createSqmlCase();
			case ExpressionsPackage.SQML_CASE_WHEN: return createSqmlCaseWhen();
			case ExpressionsPackage.SQML_IF: return createSqmlIf();
			case ExpressionsPackage.SQML_IF_NULL: return createSqmlIfNull();
			case ExpressionsPackage.SQML_ROW_CONSTRUCTOR: return createSqmlRowConstructor();
			case ExpressionsPackage.SQML_STATIC_AND: return createSqmlStaticAnd();
			case ExpressionsPackage.SQML_STATIC_IF: return createSqmlStaticIf();
			case ExpressionsPackage.SQML_STATIC_IS_EMPTY: return createSqmlStaticIsEmpty();
			case ExpressionsPackage.SQML_STATIC_IS_NULL: return createSqmlStaticIsNull();
			case ExpressionsPackage.SQML_STATIC_IS_TRUE: return createSqmlStaticIsTrue();
			case ExpressionsPackage.SQML_STATIC_OR: return createSqmlStaticOr();
			case ExpressionsPackage.SQML_STATIC_PARENTHESES: return createSqmlStaticParentheses();
			case ExpressionsPackage.SQML_SUB_SELECT: return createSqmlSubSelect();
			case ExpressionsPackage.SQML_VALUE_REFERENCE: return createSqmlValueReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlNegation createSqmlNegation() {
		SqmlNegationImpl sqmlNegation = new SqmlNegationImpl();
		return sqmlNegation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlAddition createSqmlAddition() {
		SqmlAdditionImpl sqmlAddition = new SqmlAdditionImpl();
		return sqmlAddition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlMultiplication createSqmlMultiplication() {
		SqmlMultiplicationImpl sqmlMultiplication = new SqmlMultiplicationImpl();
		return sqmlMultiplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticVariableReference createSqmlStaticVariableReference() {
		SqmlStaticVariableReferenceImpl sqmlStaticVariableReference = new SqmlStaticVariableReferenceImpl();
		return sqmlStaticVariableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlPath createSqmlPath() {
		SqmlPathImpl sqmlPath = new SqmlPathImpl();
		return sqmlPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlGroupConcat createSqmlGroupConcat() {
		SqmlGroupConcatImpl sqmlGroupConcat = new SqmlGroupConcatImpl();
		return sqmlGroupConcat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlCase createSqmlCase() {
		SqmlCaseImpl sqmlCase = new SqmlCaseImpl();
		return sqmlCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlCaseWhen createSqmlCaseWhen() {
		SqmlCaseWhenImpl sqmlCaseWhen = new SqmlCaseWhenImpl();
		return sqmlCaseWhen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlIf createSqmlIf() {
		SqmlIfImpl sqmlIf = new SqmlIfImpl();
		return sqmlIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlIfNull createSqmlIfNull() {
		SqmlIfNullImpl sqmlIfNull = new SqmlIfNullImpl();
		return sqmlIfNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlRowConstructor createSqmlRowConstructor() {
		SqmlRowConstructorImpl sqmlRowConstructor = new SqmlRowConstructorImpl();
		return sqmlRowConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticAnd createSqmlStaticAnd() {
		SqmlStaticAndImpl sqmlStaticAnd = new SqmlStaticAndImpl();
		return sqmlStaticAnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticIf createSqmlStaticIf() {
		SqmlStaticIfImpl sqmlStaticIf = new SqmlStaticIfImpl();
		return sqmlStaticIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticIsEmpty createSqmlStaticIsEmpty() {
		SqmlStaticIsEmptyImpl sqmlStaticIsEmpty = new SqmlStaticIsEmptyImpl();
		return sqmlStaticIsEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticIsNull createSqmlStaticIsNull() {
		SqmlStaticIsNullImpl sqmlStaticIsNull = new SqmlStaticIsNullImpl();
		return sqmlStaticIsNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticIsTrue createSqmlStaticIsTrue() {
		SqmlStaticIsTrueImpl sqmlStaticIsTrue = new SqmlStaticIsTrueImpl();
		return sqmlStaticIsTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticOr createSqmlStaticOr() {
		SqmlStaticOrImpl sqmlStaticOr = new SqmlStaticOrImpl();
		return sqmlStaticOr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStaticParentheses createSqmlStaticParentheses() {
		SqmlStaticParenthesesImpl sqmlStaticParentheses = new SqmlStaticParenthesesImpl();
		return sqmlStaticParentheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlSubSelect createSqmlSubSelect() {
		SqmlSubSelectImpl sqmlSubSelect = new SqmlSubSelectImpl();
		return sqmlSubSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlValueReference createSqmlValueReference() {
		SqmlValueReferenceImpl sqmlValueReference = new SqmlValueReferenceImpl();
		return sqmlValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsPackage getExpressionsPackage() {
		return (ExpressionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionsPackage getPackage() {
		return ExpressionsPackage.eINSTANCE;
	}

} //ExpressionsFactoryImpl
