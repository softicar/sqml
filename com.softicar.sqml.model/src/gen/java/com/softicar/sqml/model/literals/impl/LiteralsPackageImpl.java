/**
 */
package com.softicar.sqml.model.literals.impl;

import com.softicar.sqml.model.externals.ExternalsPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import com.softicar.sqml.model.literals.LiteralsFactory;
import com.softicar.sqml.model.literals.LiteralsPackage;
import com.softicar.sqml.model.literals.SqmlBooleanLiteral;
import com.softicar.sqml.model.literals.SqmlDecimalLiteral;
import com.softicar.sqml.model.literals.SqmlDoubleLiteral;
import com.softicar.sqml.model.literals.SqmlFloatLiteral;
import com.softicar.sqml.model.literals.SqmlIntegerLiteral;
import com.softicar.sqml.model.literals.SqmlLongLiteral;
import com.softicar.sqml.model.literals.SqmlStringLiteral;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LiteralsPackageImpl extends EPackageImpl implements LiteralsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlBooleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlFloatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlDoubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlDecimalLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStringLiteralEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.softicar.sqml.model.literals.LiteralsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LiteralsPackageImpl() {
		super(eNS_URI, LiteralsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LiteralsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LiteralsPackage init() {
		if (isInited) return (LiteralsPackage)EPackage.Registry.INSTANCE.getEPackage(LiteralsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLiteralsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LiteralsPackageImpl theLiteralsPackage = registeredLiteralsPackage instanceof LiteralsPackageImpl ? (LiteralsPackageImpl)registeredLiteralsPackage : new LiteralsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ExternalsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLiteralsPackage.createPackageContents();

		// Initialize created meta-data
		theLiteralsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLiteralsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LiteralsPackage.eNS_URI, theLiteralsPackage);
		return theLiteralsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlBooleanLiteral() {
		return sqmlBooleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlBooleanLiteral_True() {
		return (EAttribute)sqmlBooleanLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlIntegerLiteral() {
		return sqmlIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlIntegerLiteral_Value() {
		return (EAttribute)sqmlIntegerLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlLongLiteral() {
		return sqmlLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlLongLiteral_Value() {
		return (EAttribute)sqmlLongLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlFloatLiteral() {
		return sqmlFloatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlFloatLiteral_Value() {
		return (EAttribute)sqmlFloatLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlDoubleLiteral() {
		return sqmlDoubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlDoubleLiteral_Value() {
		return (EAttribute)sqmlDoubleLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlDecimalLiteral() {
		return sqmlDecimalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlDecimalLiteral_Value() {
		return (EAttribute)sqmlDecimalLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStringLiteral() {
		return sqmlStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlStringLiteral_Value() {
		return (EAttribute)sqmlStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralsFactory getLiteralsFactory() {
		return (LiteralsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sqmlBooleanLiteralEClass = createEClass(SQML_BOOLEAN_LITERAL);
		createEAttribute(sqmlBooleanLiteralEClass, SQML_BOOLEAN_LITERAL__TRUE);

		sqmlIntegerLiteralEClass = createEClass(SQML_INTEGER_LITERAL);
		createEAttribute(sqmlIntegerLiteralEClass, SQML_INTEGER_LITERAL__VALUE);

		sqmlLongLiteralEClass = createEClass(SQML_LONG_LITERAL);
		createEAttribute(sqmlLongLiteralEClass, SQML_LONG_LITERAL__VALUE);

		sqmlFloatLiteralEClass = createEClass(SQML_FLOAT_LITERAL);
		createEAttribute(sqmlFloatLiteralEClass, SQML_FLOAT_LITERAL__VALUE);

		sqmlDoubleLiteralEClass = createEClass(SQML_DOUBLE_LITERAL);
		createEAttribute(sqmlDoubleLiteralEClass, SQML_DOUBLE_LITERAL__VALUE);

		sqmlDecimalLiteralEClass = createEClass(SQML_DECIMAL_LITERAL);
		createEAttribute(sqmlDecimalLiteralEClass, SQML_DECIMAL_LITERAL__VALUE);

		sqmlStringLiteralEClass = createEClass(SQML_STRING_LITERAL);
		createEAttribute(sqmlStringLiteralEClass, SQML_STRING_LITERAL__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExternalsPackage theExternalsPackage = (ExternalsPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqmlBooleanLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlBooleanLiteral());
		sqmlIntegerLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlIntegerLiteral());
		sqmlLongLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlLongLiteral());
		sqmlFloatLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlFloatLiteral());
		sqmlDoubleLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlDoubleLiteral());
		sqmlDecimalLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlDecimalLiteral());
		sqmlStringLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStringLiteral());

		// Initialize classes, features, and operations; add parameters
		initEClass(sqmlBooleanLiteralEClass, SqmlBooleanLiteral.class, "SqmlBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlBooleanLiteral_True(), theEcorePackage.getEBoolean(), "true", null, 0, 1, SqmlBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlIntegerLiteralEClass, SqmlIntegerLiteral.class, "SqmlIntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlIntegerLiteral_Value(), theEcorePackage.getEIntegerObject(), "value", null, 0, 1, SqmlIntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlLongLiteralEClass, SqmlLongLiteral.class, "SqmlLongLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlLongLiteral_Value(), theEcorePackage.getELongObject(), "value", null, 0, 1, SqmlLongLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlFloatLiteralEClass, SqmlFloatLiteral.class, "SqmlFloatLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlFloatLiteral_Value(), theExternalsPackage.getBigDecimal(), "value", null, 0, 1, SqmlFloatLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlDoubleLiteralEClass, SqmlDoubleLiteral.class, "SqmlDoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlDoubleLiteral_Value(), theExternalsPackage.getBigDecimal(), "value", null, 0, 1, SqmlDoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlDecimalLiteralEClass, SqmlDecimalLiteral.class, "SqmlDecimalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlDecimalLiteral_Value(), theExternalsPackage.getBigDecimal(), "value", null, 0, 1, SqmlDecimalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStringLiteralEClass, SqmlStringLiteral.class, "SqmlStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlStringLiteral_Value(), theEcorePackage.getEString(), "value", null, 0, 1, SqmlStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LiteralsPackageImpl
