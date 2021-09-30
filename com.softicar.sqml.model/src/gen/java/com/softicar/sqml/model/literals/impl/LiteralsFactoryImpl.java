/**
 */
package com.softicar.sqml.model.literals.impl;

import com.softicar.sqml.model.literals.*;

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
public class LiteralsFactoryImpl extends EFactoryImpl implements LiteralsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LiteralsFactory init() {
		try {
			LiteralsFactory theLiteralsFactory = (LiteralsFactory)EPackage.Registry.INSTANCE.getEFactory(LiteralsPackage.eNS_URI);
			if (theLiteralsFactory != null) {
				return theLiteralsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LiteralsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsFactoryImpl() {
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
			case LiteralsPackage.SQML_BOOLEAN_LITERAL: return createSqmlBooleanLiteral();
			case LiteralsPackage.SQML_INTEGER_LITERAL: return createSqmlIntegerLiteral();
			case LiteralsPackage.SQML_LONG_LITERAL: return createSqmlLongLiteral();
			case LiteralsPackage.SQML_FLOAT_LITERAL: return createSqmlFloatLiteral();
			case LiteralsPackage.SQML_DOUBLE_LITERAL: return createSqmlDoubleLiteral();
			case LiteralsPackage.SQML_DECIMAL_LITERAL: return createSqmlDecimalLiteral();
			case LiteralsPackage.SQML_STRING_LITERAL: return createSqmlStringLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlBooleanLiteral createSqmlBooleanLiteral() {
		SqmlBooleanLiteralImpl sqmlBooleanLiteral = new SqmlBooleanLiteralImpl();
		return sqmlBooleanLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlIntegerLiteral createSqmlIntegerLiteral() {
		SqmlIntegerLiteralImpl sqmlIntegerLiteral = new SqmlIntegerLiteralImpl();
		return sqmlIntegerLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlLongLiteral createSqmlLongLiteral() {
		SqmlLongLiteralImpl sqmlLongLiteral = new SqmlLongLiteralImpl();
		return sqmlLongLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlFloatLiteral createSqmlFloatLiteral() {
		SqmlFloatLiteralImpl sqmlFloatLiteral = new SqmlFloatLiteralImpl();
		return sqmlFloatLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlDoubleLiteral createSqmlDoubleLiteral() {
		SqmlDoubleLiteralImpl sqmlDoubleLiteral = new SqmlDoubleLiteralImpl();
		return sqmlDoubleLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlDecimalLiteral createSqmlDecimalLiteral() {
		SqmlDecimalLiteralImpl sqmlDecimalLiteral = new SqmlDecimalLiteralImpl();
		return sqmlDecimalLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SqmlStringLiteral createSqmlStringLiteral() {
		SqmlStringLiteralImpl sqmlStringLiteral = new SqmlStringLiteralImpl();
		return sqmlStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsPackage getLiteralsPackage() {
		return (LiteralsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LiteralsPackage getPackage() {
		return LiteralsPackage.eINSTANCE;
	}

} //LiteralsFactoryImpl
