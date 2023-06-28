/**
 */
package com.softicar.sqml.model.functions.impl;

import com.softicar.sqml.model.externals.ExternalsPackage;

import com.softicar.sqml.model.files.FilesPackage;

import com.softicar.sqml.model.functions.FunctionsFactory;
import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.SqmlFunction;
import com.softicar.sqml.model.functions.SqmlFunctionCall;
import com.softicar.sqml.model.functions.SqmlFunctionParameter;
import com.softicar.sqml.model.functions.SqmlSql;
import com.softicar.sqml.model.functions.SqmlSqlId;
import com.softicar.sqml.model.functions.SqmlSqlKeyword;
import com.softicar.sqml.model.functions.SqmlSqlNumberLiteral;
import com.softicar.sqml.model.functions.SqmlSqlStringLiteral;
import com.softicar.sqml.model.functions.SqmlSqlSymbol;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionsPackageImpl extends EPackageImpl implements FunctionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlFunctionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSqlIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSqlKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSqlNumberLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSqlStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSqlSymbolEClass = null;

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
	 * @see com.softicar.sqml.model.functions.FunctionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FunctionsPackageImpl() {
		super(eNS_URI, FunctionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FunctionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FunctionsPackage init() {
		if (isInited) return (FunctionsPackage)EPackage.Registry.INSTANCE.getEPackage(FunctionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFunctionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FunctionsPackageImpl theFunctionsPackage = registeredFunctionsPackage instanceof FunctionsPackageImpl ? (FunctionsPackageImpl)registeredFunctionsPackage : new FunctionsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		FilesPackage.eINSTANCE.eClass();
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		ExternalsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFunctionsPackage.createPackageContents();

		// Initialize created meta-data
		theFunctionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFunctionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FunctionsPackage.eNS_URI, theFunctionsPackage);
		return theFunctionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlFunction() {
		return sqmlFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunction_ReturnType() {
		return (EReference)sqmlFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunction_Parameters() {
		return (EReference)sqmlFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunction_Sql() {
		return (EReference)sqmlFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunction_Expression() {
		return (EReference)sqmlFunctionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSqmlFunction__ToString() {
		return sqmlFunctionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlFunctionCall() {
		return sqmlFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunctionCall_Function() {
		return (EReference)sqmlFunctionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunctionCall_Arguments() {
		return (EReference)sqmlFunctionCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlFunctionParameter() {
		return sqmlFunctionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlFunctionParameter_Name() {
		return (EAttribute)sqmlFunctionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunctionParameter_Function() {
		return (EReference)sqmlFunctionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlFunctionParameter_TypeReference() {
		return (EReference)sqmlFunctionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlSql() {
		return sqmlSqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSqmlSql_Tokens() {
		return (EReference)sqmlSqlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlSqlId() {
		return sqmlSqlIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlSqlId_Identifier() {
		return (EAttribute)sqmlSqlIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlSqlKeyword() {
		return sqmlSqlKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlSqlKeyword_KeywordText() {
		return (EAttribute)sqmlSqlKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlSqlNumberLiteral() {
		return sqmlSqlNumberLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlSqlNumberLiteral_Integer() {
		return (EAttribute)sqmlSqlNumberLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlSqlNumberLiteral_Decimal() {
		return (EAttribute)sqmlSqlNumberLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlSqlStringLiteral() {
		return sqmlSqlStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlSqlStringLiteral_String() {
		return (EAttribute)sqmlSqlStringLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSqmlSqlSymbol() {
		return sqmlSqlSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSqmlSqlSymbol_SymbolText() {
		return (EAttribute)sqmlSqlSymbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionsFactory getFunctionsFactory() {
		return (FunctionsFactory)getEFactoryInstance();
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
		sqmlFunctionEClass = createEClass(SQML_FUNCTION);
		createEReference(sqmlFunctionEClass, SQML_FUNCTION__RETURN_TYPE);
		createEReference(sqmlFunctionEClass, SQML_FUNCTION__PARAMETERS);
		createEReference(sqmlFunctionEClass, SQML_FUNCTION__SQL);
		createEReference(sqmlFunctionEClass, SQML_FUNCTION__EXPRESSION);
		createEOperation(sqmlFunctionEClass, SQML_FUNCTION___TO_STRING);

		sqmlFunctionCallEClass = createEClass(SQML_FUNCTION_CALL);
		createEReference(sqmlFunctionCallEClass, SQML_FUNCTION_CALL__FUNCTION);
		createEReference(sqmlFunctionCallEClass, SQML_FUNCTION_CALL__ARGUMENTS);

		sqmlFunctionParameterEClass = createEClass(SQML_FUNCTION_PARAMETER);
		createEAttribute(sqmlFunctionParameterEClass, SQML_FUNCTION_PARAMETER__NAME);
		createEReference(sqmlFunctionParameterEClass, SQML_FUNCTION_PARAMETER__FUNCTION);
		createEReference(sqmlFunctionParameterEClass, SQML_FUNCTION_PARAMETER__TYPE_REFERENCE);

		sqmlSqlEClass = createEClass(SQML_SQL);
		createEReference(sqmlSqlEClass, SQML_SQL__TOKENS);

		sqmlSqlIdEClass = createEClass(SQML_SQL_ID);
		createEAttribute(sqmlSqlIdEClass, SQML_SQL_ID__IDENTIFIER);

		sqmlSqlKeywordEClass = createEClass(SQML_SQL_KEYWORD);
		createEAttribute(sqmlSqlKeywordEClass, SQML_SQL_KEYWORD__KEYWORD_TEXT);

		sqmlSqlNumberLiteralEClass = createEClass(SQML_SQL_NUMBER_LITERAL);
		createEAttribute(sqmlSqlNumberLiteralEClass, SQML_SQL_NUMBER_LITERAL__INTEGER);
		createEAttribute(sqmlSqlNumberLiteralEClass, SQML_SQL_NUMBER_LITERAL__DECIMAL);

		sqmlSqlStringLiteralEClass = createEClass(SQML_SQL_STRING_LITERAL);
		createEAttribute(sqmlSqlStringLiteralEClass, SQML_SQL_STRING_LITERAL__STRING);

		sqmlSqlSymbolEClass = createEClass(SQML_SQL_SYMBOL);
		createEAttribute(sqmlSqlSymbolEClass, SQML_SQL_SYMBOL__SYMBOL_TEXT);
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
		FilesPackage theFilesPackage = (FilesPackage)EPackage.Registry.INSTANCE.getEPackage(FilesPackage.eNS_URI);
		InterfacesPackage theInterfacesPackage = (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ExternalsPackage theExternalsPackage = (ExternalsPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sqmlFunctionEClass.getESuperTypes().add(theFilesPackage.getSqmlFileElement());
		sqmlFunctionEClass.getESuperTypes().add(theInterfacesPackage.getISqmlFunction());
		sqmlFunctionCallEClass.getESuperTypes().add(theInterfacesPackage.getISqmlFunctionCall());
		sqmlFunctionParameterEClass.getESuperTypes().add(theInterfacesPackage.getISqmlFunctionParameter());
		sqmlSqlEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSql());
		sqmlSqlIdEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSqlId());
		sqmlSqlKeywordEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSqlKeyword());
		sqmlSqlNumberLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSqlNumberLiteral());
		sqmlSqlStringLiteralEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSqlStringLiteral());
		sqmlSqlSymbolEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSqlSymbol());

		// Initialize classes, features, and operations; add parameters
		initEClass(sqmlFunctionEClass, SqmlFunction.class, "SqmlFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlFunction_ReturnType(), theInterfacesPackage.getISqmlTypeReference(), null, "returnType", null, 0, 1, SqmlFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFunction_Parameters(), this.getSqmlFunctionParameter(), this.getSqmlFunctionParameter_Function(), "parameters", null, 0, -1, SqmlFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFunction_Sql(), theInterfacesPackage.getISqmlSql(), null, "sql", null, 0, 1, SqmlFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFunction_Expression(), theInterfacesPackage.getISqmlExpression(), null, "expression", null, 0, 1, SqmlFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSqmlFunction__ToString(), theEcorePackage.getEString(), "toString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sqmlFunctionCallEClass, SqmlFunctionCall.class, "SqmlFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlFunctionCall_Function(), theInterfacesPackage.getISqmlFunction(), null, "function", null, 0, 1, SqmlFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFunctionCall_Arguments(), theInterfacesPackage.getISqmlExpression(), null, "arguments", null, 0, -1, SqmlFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlFunctionParameterEClass, SqmlFunctionParameter.class, "SqmlFunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlFunctionParameter_Name(), theEcorePackage.getEString(), "name", null, 0, 1, SqmlFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFunctionParameter_Function(), this.getSqmlFunction(), this.getSqmlFunction_Parameters(), "function", null, 0, 1, SqmlFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlFunctionParameter_TypeReference(), theInterfacesPackage.getISqmlTypeReference(), null, "typeReference", null, 0, 1, SqmlFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSqlEClass, SqmlSql.class, "SqmlSql", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlSql_Tokens(), theInterfacesPackage.getISqmlModelElement(), null, "tokens", null, 0, -1, SqmlSql.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSqlIdEClass, SqmlSqlId.class, "SqmlSqlId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSqlId_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, SqmlSqlId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSqlKeywordEClass, SqmlSqlKeyword.class, "SqmlSqlKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSqlKeyword_KeywordText(), theEcorePackage.getEString(), "keywordText", null, 0, 1, SqmlSqlKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSqlNumberLiteralEClass, SqmlSqlNumberLiteral.class, "SqmlSqlNumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSqlNumberLiteral_Integer(), theEcorePackage.getEIntegerObject(), "integer", null, 0, 1, SqmlSqlNumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlSqlNumberLiteral_Decimal(), theExternalsPackage.getBigDecimal(), "decimal", null, 0, 1, SqmlSqlNumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSqlStringLiteralEClass, SqmlSqlStringLiteral.class, "SqmlSqlStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSqlStringLiteral_String(), theEcorePackage.getEString(), "string", null, 0, 1, SqmlSqlStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSqlSymbolEClass, SqmlSqlSymbol.class, "SqmlSqlSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlSqlSymbol_SymbolText(), theEcorePackage.getEString(), "symbolText", null, 0, 1, SqmlSqlSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FunctionsPackageImpl
