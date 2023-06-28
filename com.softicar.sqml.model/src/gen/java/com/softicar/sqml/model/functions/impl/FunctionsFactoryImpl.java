/**
 */
package com.softicar.sqml.model.functions.impl;

import com.softicar.sqml.model.functions.*;

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
public class FunctionsFactoryImpl extends EFactoryImpl implements FunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionsFactory init() {
		try {
			FunctionsFactory theFunctionsFactory = (FunctionsFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionsPackage.eNS_URI);
			if (theFunctionsFactory != null) {
				return theFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsFactoryImpl() {
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
			case FunctionsPackage.SQML_FUNCTION: return createSqmlFunction();
			case FunctionsPackage.SQML_FUNCTION_CALL: return createSqmlFunctionCall();
			case FunctionsPackage.SQML_FUNCTION_PARAMETER: return createSqmlFunctionParameter();
			case FunctionsPackage.SQML_SQL: return createSqmlSql();
			case FunctionsPackage.SQML_SQL_ID: return createSqmlSqlId();
			case FunctionsPackage.SQML_SQL_KEYWORD: return createSqmlSqlKeyword();
			case FunctionsPackage.SQML_SQL_NUMBER_LITERAL: return createSqmlSqlNumberLiteral();
			case FunctionsPackage.SQML_SQL_STRING_LITERAL: return createSqmlSqlStringLiteral();
			case FunctionsPackage.SQML_SQL_SYMBOL: return createSqmlSqlSymbol();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlFunction createSqmlFunction() {
		SqmlFunctionImpl sqmlFunction = new SqmlFunctionImpl();
		return sqmlFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlFunctionCall createSqmlFunctionCall() {
		SqmlFunctionCallImpl sqmlFunctionCall = new SqmlFunctionCallImpl();
		return sqmlFunctionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlFunctionParameter createSqmlFunctionParameter() {
		SqmlFunctionParameterImpl sqmlFunctionParameter = new SqmlFunctionParameterImpl();
		return sqmlFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlSql createSqmlSql() {
		SqmlSqlImpl sqmlSql = new SqmlSqlImpl();
		return sqmlSql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlSqlId createSqmlSqlId() {
		SqmlSqlIdImpl sqmlSqlId = new SqmlSqlIdImpl();
		return sqmlSqlId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlSqlKeyword createSqmlSqlKeyword() {
		SqmlSqlKeywordImpl sqmlSqlKeyword = new SqmlSqlKeywordImpl();
		return sqmlSqlKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlSqlNumberLiteral createSqmlSqlNumberLiteral() {
		SqmlSqlNumberLiteralImpl sqmlSqlNumberLiteral = new SqmlSqlNumberLiteralImpl();
		return sqmlSqlNumberLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlSqlStringLiteral createSqmlSqlStringLiteral() {
		SqmlSqlStringLiteralImpl sqmlSqlStringLiteral = new SqmlSqlStringLiteralImpl();
		return sqmlSqlStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SqmlSqlSymbol createSqmlSqlSymbol() {
		SqmlSqlSymbolImpl sqmlSqlSymbol = new SqmlSqlSymbolImpl();
		return sqmlSqlSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionsPackage getFunctionsPackage() {
		return (FunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionsPackage getPackage() {
		return FunctionsPackage.eINSTANCE;
	}

} //FunctionsFactoryImpl
