/**
 */
package com.softicar.sqml.model.expressions.impl;

import com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation;
import com.softicar.sqml.model.expressions.ExpressionsFactory;
import com.softicar.sqml.model.expressions.ExpressionsPackage;
import com.softicar.sqml.model.expressions.SqmlAddition;
import com.softicar.sqml.model.expressions.SqmlCase;
import com.softicar.sqml.model.expressions.SqmlCaseWhen;
import com.softicar.sqml.model.expressions.SqmlGroupConcat;
import com.softicar.sqml.model.expressions.SqmlIf;
import com.softicar.sqml.model.expressions.SqmlIfNull;
import com.softicar.sqml.model.expressions.SqmlMultiplication;
import com.softicar.sqml.model.expressions.SqmlNegation;
import com.softicar.sqml.model.expressions.SqmlPath;
import com.softicar.sqml.model.expressions.SqmlRowConstructor;
import com.softicar.sqml.model.expressions.SqmlStaticAnd;
import com.softicar.sqml.model.expressions.SqmlStaticIf;
import com.softicar.sqml.model.expressions.SqmlStaticIsEmpty;
import com.softicar.sqml.model.expressions.SqmlStaticIsNull;
import com.softicar.sqml.model.expressions.SqmlStaticIsTrue;
import com.softicar.sqml.model.expressions.SqmlStaticOr;
import com.softicar.sqml.model.expressions.SqmlStaticParentheses;
import com.softicar.sqml.model.expressions.SqmlStaticVariableReference;
import com.softicar.sqml.model.expressions.SqmlSubSelect;
import com.softicar.sqml.model.expressions.SqmlValueReference;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class ExpressionsPackageImpl extends EPackageImpl implements ExpressionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSqmlBinaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlNegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlAdditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlMultiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticVariableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlGroupConcatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlCaseWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlIfNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlRowConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticIsEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticIsNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticIsTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlStaticParenthesesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlSubSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqmlValueReferenceEClass = null;

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
	 * @see com.softicar.sqml.model.expressions.ExpressionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionsPackageImpl() {
		super(eNS_URI, ExpressionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionsPackage init() {
		if (isInited) return (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExpressionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExpressionsPackageImpl theExpressionsPackage = registeredExpressionsPackage instanceof ExpressionsPackageImpl ? (ExpressionsPackageImpl)registeredExpressionsPackage : new ExpressionsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		InterfacesPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExpressionsPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionsPackage.eNS_URI, theExpressionsPackage);
		return theExpressionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSqmlBinaryOperation() {
		return abstractSqmlBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSqmlBinaryOperation_Function() {
		return (EReference)abstractSqmlBinaryOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSqmlBinaryOperation_Left() {
		return (EReference)abstractSqmlBinaryOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractSqmlBinaryOperation_Right() {
		return (EReference)abstractSqmlBinaryOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlNegation() {
		return sqmlNegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlNegation_Expression() {
		return (EReference)sqmlNegationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlAddition() {
		return sqmlAdditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlMultiplication() {
		return sqmlMultiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticVariableReference() {
		return sqmlStaticVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlStaticVariableReference_NextIteration() {
		return (EAttribute)sqmlStaticVariableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticVariableReference_Variable() {
		return (EReference)sqmlStaticVariableReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlPath() {
		return sqmlPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlPath_Parent() {
		return (EReference)sqmlPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlPath_Target() {
		return (EReference)sqmlPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlGroupConcat() {
		return sqmlGroupConcatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlGroupConcat_Distinct() {
		return (EAttribute)sqmlGroupConcatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlGroupConcat_Expressions() {
		return (EReference)sqmlGroupConcatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlGroupConcat_OrderByExpressions() {
		return (EReference)sqmlGroupConcatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlGroupConcat_Separator() {
		return (EAttribute)sqmlGroupConcatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlCase() {
		return sqmlCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlCase_Operand() {
		return (EReference)sqmlCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlCase_Whens() {
		return (EReference)sqmlCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlCase_ElseExpression() {
		return (EReference)sqmlCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlCaseWhen() {
		return sqmlCaseWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlCaseWhen_WhenExpression() {
		return (EReference)sqmlCaseWhenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlCaseWhen_ThenExpression() {
		return (EReference)sqmlCaseWhenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlIf() {
		return sqmlIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlIf_Condition() {
		return (EReference)sqmlIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlIf_ThenExpression() {
		return (EReference)sqmlIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlIf_ElseExpression() {
		return (EReference)sqmlIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlIfNull() {
		return sqmlIfNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlIfNull_TestExpression() {
		return (EReference)sqmlIfNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlIfNull_ThenExpression() {
		return (EReference)sqmlIfNullEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlRowConstructor() {
		return sqmlRowConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlRowConstructor_Explicit() {
		return (EAttribute)sqmlRowConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlRowConstructor_Expressions() {
		return (EReference)sqmlRowConstructorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticAnd() {
		return sqmlStaticAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticAnd_Left() {
		return (EReference)sqmlStaticAndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticAnd_Right() {
		return (EReference)sqmlStaticAndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticIf() {
		return sqmlStaticIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticIf_Conditions() {
		return (EReference)sqmlStaticIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticIf_Expressions() {
		return (EReference)sqmlStaticIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticIf_ElseExpression() {
		return (EReference)sqmlStaticIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticIsEmpty() {
		return sqmlStaticIsEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticIsEmpty_ParameterReference() {
		return (EReference)sqmlStaticIsEmptyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlStaticIsEmpty_Not() {
		return (EAttribute)sqmlStaticIsEmptyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticIsNull() {
		return sqmlStaticIsNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticIsNull_ParameterReference() {
		return (EReference)sqmlStaticIsNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlStaticIsNull_Not() {
		return (EAttribute)sqmlStaticIsNullEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticIsTrue() {
		return sqmlStaticIsTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticIsTrue_ParameterReference() {
		return (EReference)sqmlStaticIsTrueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlStaticIsTrue_Not() {
		return (EAttribute)sqmlStaticIsTrueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticOr() {
		return sqmlStaticOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticOr_Left() {
		return (EReference)sqmlStaticOrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticOr_Right() {
		return (EReference)sqmlStaticOrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlStaticParentheses() {
		return sqmlStaticParenthesesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlStaticParentheses_Expression() {
		return (EReference)sqmlStaticParenthesesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlSubSelect() {
		return sqmlSubSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlSubSelect_Select() {
		return (EReference)sqmlSubSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSqmlValueReference() {
		return sqmlValueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlValueReference_NextIteration() {
		return (EAttribute)sqmlValueReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSqmlValueReference_DotStar() {
		return (EAttribute)sqmlValueReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSqmlValueReference_Path() {
		return (EReference)sqmlValueReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionsFactory getExpressionsFactory() {
		return (ExpressionsFactory)getEFactoryInstance();
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
		abstractSqmlBinaryOperationEClass = createEClass(ABSTRACT_SQML_BINARY_OPERATION);
		createEReference(abstractSqmlBinaryOperationEClass, ABSTRACT_SQML_BINARY_OPERATION__FUNCTION);
		createEReference(abstractSqmlBinaryOperationEClass, ABSTRACT_SQML_BINARY_OPERATION__LEFT);
		createEReference(abstractSqmlBinaryOperationEClass, ABSTRACT_SQML_BINARY_OPERATION__RIGHT);

		sqmlNegationEClass = createEClass(SQML_NEGATION);
		createEReference(sqmlNegationEClass, SQML_NEGATION__EXPRESSION);

		sqmlAdditionEClass = createEClass(SQML_ADDITION);

		sqmlMultiplicationEClass = createEClass(SQML_MULTIPLICATION);

		sqmlStaticVariableReferenceEClass = createEClass(SQML_STATIC_VARIABLE_REFERENCE);
		createEAttribute(sqmlStaticVariableReferenceEClass, SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION);
		createEReference(sqmlStaticVariableReferenceEClass, SQML_STATIC_VARIABLE_REFERENCE__VARIABLE);

		sqmlPathEClass = createEClass(SQML_PATH);
		createEReference(sqmlPathEClass, SQML_PATH__PARENT);
		createEReference(sqmlPathEClass, SQML_PATH__TARGET);

		sqmlGroupConcatEClass = createEClass(SQML_GROUP_CONCAT);
		createEAttribute(sqmlGroupConcatEClass, SQML_GROUP_CONCAT__DISTINCT);
		createEReference(sqmlGroupConcatEClass, SQML_GROUP_CONCAT__EXPRESSIONS);
		createEReference(sqmlGroupConcatEClass, SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS);
		createEAttribute(sqmlGroupConcatEClass, SQML_GROUP_CONCAT__SEPARATOR);

		sqmlCaseEClass = createEClass(SQML_CASE);
		createEReference(sqmlCaseEClass, SQML_CASE__OPERAND);
		createEReference(sqmlCaseEClass, SQML_CASE__WHENS);
		createEReference(sqmlCaseEClass, SQML_CASE__ELSE_EXPRESSION);

		sqmlCaseWhenEClass = createEClass(SQML_CASE_WHEN);
		createEReference(sqmlCaseWhenEClass, SQML_CASE_WHEN__WHEN_EXPRESSION);
		createEReference(sqmlCaseWhenEClass, SQML_CASE_WHEN__THEN_EXPRESSION);

		sqmlIfEClass = createEClass(SQML_IF);
		createEReference(sqmlIfEClass, SQML_IF__CONDITION);
		createEReference(sqmlIfEClass, SQML_IF__THEN_EXPRESSION);
		createEReference(sqmlIfEClass, SQML_IF__ELSE_EXPRESSION);

		sqmlIfNullEClass = createEClass(SQML_IF_NULL);
		createEReference(sqmlIfNullEClass, SQML_IF_NULL__TEST_EXPRESSION);
		createEReference(sqmlIfNullEClass, SQML_IF_NULL__THEN_EXPRESSION);

		sqmlRowConstructorEClass = createEClass(SQML_ROW_CONSTRUCTOR);
		createEAttribute(sqmlRowConstructorEClass, SQML_ROW_CONSTRUCTOR__EXPLICIT);
		createEReference(sqmlRowConstructorEClass, SQML_ROW_CONSTRUCTOR__EXPRESSIONS);

		sqmlStaticAndEClass = createEClass(SQML_STATIC_AND);
		createEReference(sqmlStaticAndEClass, SQML_STATIC_AND__LEFT);
		createEReference(sqmlStaticAndEClass, SQML_STATIC_AND__RIGHT);

		sqmlStaticIfEClass = createEClass(SQML_STATIC_IF);
		createEReference(sqmlStaticIfEClass, SQML_STATIC_IF__CONDITIONS);
		createEReference(sqmlStaticIfEClass, SQML_STATIC_IF__EXPRESSIONS);
		createEReference(sqmlStaticIfEClass, SQML_STATIC_IF__ELSE_EXPRESSION);

		sqmlStaticIsEmptyEClass = createEClass(SQML_STATIC_IS_EMPTY);
		createEReference(sqmlStaticIsEmptyEClass, SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE);
		createEAttribute(sqmlStaticIsEmptyEClass, SQML_STATIC_IS_EMPTY__NOT);

		sqmlStaticIsNullEClass = createEClass(SQML_STATIC_IS_NULL);
		createEReference(sqmlStaticIsNullEClass, SQML_STATIC_IS_NULL__PARAMETER_REFERENCE);
		createEAttribute(sqmlStaticIsNullEClass, SQML_STATIC_IS_NULL__NOT);

		sqmlStaticIsTrueEClass = createEClass(SQML_STATIC_IS_TRUE);
		createEReference(sqmlStaticIsTrueEClass, SQML_STATIC_IS_TRUE__PARAMETER_REFERENCE);
		createEAttribute(sqmlStaticIsTrueEClass, SQML_STATIC_IS_TRUE__NOT);

		sqmlStaticOrEClass = createEClass(SQML_STATIC_OR);
		createEReference(sqmlStaticOrEClass, SQML_STATIC_OR__LEFT);
		createEReference(sqmlStaticOrEClass, SQML_STATIC_OR__RIGHT);

		sqmlStaticParenthesesEClass = createEClass(SQML_STATIC_PARENTHESES);
		createEReference(sqmlStaticParenthesesEClass, SQML_STATIC_PARENTHESES__EXPRESSION);

		sqmlSubSelectEClass = createEClass(SQML_SUB_SELECT);
		createEReference(sqmlSubSelectEClass, SQML_SUB_SELECT__SELECT);

		sqmlValueReferenceEClass = createEClass(SQML_VALUE_REFERENCE);
		createEAttribute(sqmlValueReferenceEClass, SQML_VALUE_REFERENCE__NEXT_ITERATION);
		createEAttribute(sqmlValueReferenceEClass, SQML_VALUE_REFERENCE__DOT_STAR);
		createEReference(sqmlValueReferenceEClass, SQML_VALUE_REFERENCE__PATH);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractSqmlBinaryOperationEClass.getESuperTypes().add(theInterfacesPackage.getISqmlBinaryOperation());
		sqmlNegationEClass.getESuperTypes().add(theInterfacesPackage.getISqmlNegation());
		sqmlAdditionEClass.getESuperTypes().add(this.getAbstractSqmlBinaryOperation());
		sqmlAdditionEClass.getESuperTypes().add(theInterfacesPackage.getISqmlAddition());
		sqmlMultiplicationEClass.getESuperTypes().add(this.getAbstractSqmlBinaryOperation());
		sqmlMultiplicationEClass.getESuperTypes().add(theInterfacesPackage.getISqmlMultiplication());
		sqmlStaticVariableReferenceEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticVariableReference());
		sqmlPathEClass.getESuperTypes().add(theInterfacesPackage.getISqmlPath());
		sqmlGroupConcatEClass.getESuperTypes().add(theInterfacesPackage.getISqmlGroupConcat());
		sqmlCaseEClass.getESuperTypes().add(theInterfacesPackage.getISqmlCase());
		sqmlCaseWhenEClass.getESuperTypes().add(theInterfacesPackage.getISqmlCaseWhen());
		sqmlIfEClass.getESuperTypes().add(theInterfacesPackage.getISqmlIf());
		sqmlIfNullEClass.getESuperTypes().add(theInterfacesPackage.getISqmlIfNull());
		sqmlRowConstructorEClass.getESuperTypes().add(theInterfacesPackage.getISqmlRowConstructor());
		sqmlStaticAndEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticAnd());
		sqmlStaticIfEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticIf());
		sqmlStaticIsEmptyEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticIsEmpty());
		sqmlStaticIsNullEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticIsNull());
		sqmlStaticIsTrueEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticIsTrue());
		sqmlStaticOrEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticOr());
		sqmlStaticParenthesesEClass.getESuperTypes().add(theInterfacesPackage.getISqmlStaticParentheses());
		sqmlSubSelectEClass.getESuperTypes().add(theInterfacesPackage.getISqmlSubSelect());
		sqmlValueReferenceEClass.getESuperTypes().add(theInterfacesPackage.getISqmlValueReference());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractSqmlBinaryOperationEClass, AbstractSqmlBinaryOperation.class, "AbstractSqmlBinaryOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractSqmlBinaryOperation_Function(), theInterfacesPackage.getISqmlFunction(), null, "function", null, 0, 1, AbstractSqmlBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSqmlBinaryOperation_Left(), theInterfacesPackage.getISqmlExpression(), null, "left", null, 0, 1, AbstractSqmlBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractSqmlBinaryOperation_Right(), theInterfacesPackage.getISqmlExpression(), null, "right", null, 0, 1, AbstractSqmlBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlNegationEClass, SqmlNegation.class, "SqmlNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlNegation_Expression(), theInterfacesPackage.getISqmlExpression(), null, "expression", null, 0, 1, SqmlNegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlAdditionEClass, SqmlAddition.class, "SqmlAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlMultiplicationEClass, SqmlMultiplication.class, "SqmlMultiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sqmlStaticVariableReferenceEClass, SqmlStaticVariableReference.class, "SqmlStaticVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlStaticVariableReference_NextIteration(), theEcorePackage.getEBoolean(), "nextIteration", null, 0, 1, SqmlStaticVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlStaticVariableReference_Variable(), theInterfacesPackage.getISqmlStaticVariable(), null, "variable", null, 0, 1, SqmlStaticVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlPathEClass, SqmlPath.class, "SqmlPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlPath_Parent(), this.getSqmlPath(), null, "parent", null, 0, 1, SqmlPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlPath_Target(), theInterfacesPackage.getISqmlModelElement(), null, "target", null, 0, 1, SqmlPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlGroupConcatEClass, SqmlGroupConcat.class, "SqmlGroupConcat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlGroupConcat_Distinct(), theEcorePackage.getEBoolean(), "distinct", null, 0, 1, SqmlGroupConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlGroupConcat_Expressions(), theInterfacesPackage.getISqmlExpression(), null, "expressions", null, 0, -1, SqmlGroupConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlGroupConcat_OrderByExpressions(), theInterfacesPackage.getISqmlOrderByExpression(), null, "orderByExpressions", null, 0, -1, SqmlGroupConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlGroupConcat_Separator(), theEcorePackage.getEString(), "separator", null, 0, 1, SqmlGroupConcat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlCaseEClass, SqmlCase.class, "SqmlCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlCase_Operand(), theInterfacesPackage.getISqmlExpression(), null, "operand", null, 0, 1, SqmlCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlCase_Whens(), this.getSqmlCaseWhen(), null, "whens", null, 0, -1, SqmlCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlCase_ElseExpression(), theInterfacesPackage.getISqmlExpression(), null, "elseExpression", null, 0, 1, SqmlCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlCaseWhenEClass, SqmlCaseWhen.class, "SqmlCaseWhen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlCaseWhen_WhenExpression(), theInterfacesPackage.getISqmlExpression(), null, "whenExpression", null, 0, 1, SqmlCaseWhen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlCaseWhen_ThenExpression(), theInterfacesPackage.getISqmlExpression(), null, "thenExpression", null, 0, 1, SqmlCaseWhen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlIfEClass, SqmlIf.class, "SqmlIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlIf_Condition(), theInterfacesPackage.getISqmlExpression(), null, "condition", null, 0, 1, SqmlIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlIf_ThenExpression(), theInterfacesPackage.getISqmlExpression(), null, "thenExpression", null, 0, 1, SqmlIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlIf_ElseExpression(), theInterfacesPackage.getISqmlExpression(), null, "elseExpression", null, 0, 1, SqmlIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlIfNullEClass, SqmlIfNull.class, "SqmlIfNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlIfNull_TestExpression(), theInterfacesPackage.getISqmlExpression(), null, "testExpression", null, 0, 1, SqmlIfNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlIfNull_ThenExpression(), theInterfacesPackage.getISqmlExpression(), null, "thenExpression", null, 0, 1, SqmlIfNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlRowConstructorEClass, SqmlRowConstructor.class, "SqmlRowConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlRowConstructor_Explicit(), theEcorePackage.getEBoolean(), "explicit", null, 0, 1, SqmlRowConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlRowConstructor_Expressions(), theInterfacesPackage.getISqmlExpression(), null, "expressions", null, 0, -1, SqmlRowConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStaticAndEClass, SqmlStaticAnd.class, "SqmlStaticAnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlStaticAnd_Left(), theInterfacesPackage.getISqmlStaticExpression(), null, "left", null, 0, 1, SqmlStaticAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlStaticAnd_Right(), theInterfacesPackage.getISqmlStaticExpression(), null, "right", null, 0, 1, SqmlStaticAnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStaticIfEClass, SqmlStaticIf.class, "SqmlStaticIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlStaticIf_Conditions(), theInterfacesPackage.getISqmlStaticExpression(), null, "conditions", null, 0, -1, SqmlStaticIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlStaticIf_Expressions(), theInterfacesPackage.getISqmlExpression(), null, "expressions", null, 0, -1, SqmlStaticIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlStaticIf_ElseExpression(), theInterfacesPackage.getISqmlExpression(), null, "elseExpression", null, 0, 1, SqmlStaticIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStaticIsEmptyEClass, SqmlStaticIsEmpty.class, "SqmlStaticIsEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlStaticIsEmpty_ParameterReference(), theInterfacesPackage.getISqmlStaticVariableReference(), null, "parameterReference", null, 0, 1, SqmlStaticIsEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlStaticIsEmpty_Not(), theEcorePackage.getEBoolean(), "not", null, 0, 1, SqmlStaticIsEmpty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStaticIsNullEClass, SqmlStaticIsNull.class, "SqmlStaticIsNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlStaticIsNull_ParameterReference(), theInterfacesPackage.getISqmlStaticVariableReference(), null, "parameterReference", null, 0, 1, SqmlStaticIsNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlStaticIsNull_Not(), theEcorePackage.getEBoolean(), "not", null, 0, 1, SqmlStaticIsNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStaticIsTrueEClass, SqmlStaticIsTrue.class, "SqmlStaticIsTrue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlStaticIsTrue_ParameterReference(), theInterfacesPackage.getISqmlStaticVariableReference(), null, "parameterReference", null, 0, 1, SqmlStaticIsTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlStaticIsTrue_Not(), theEcorePackage.getEBoolean(), "not", null, 0, 1, SqmlStaticIsTrue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStaticOrEClass, SqmlStaticOr.class, "SqmlStaticOr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlStaticOr_Left(), theInterfacesPackage.getISqmlStaticExpression(), null, "left", null, 0, 1, SqmlStaticOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlStaticOr_Right(), theInterfacesPackage.getISqmlStaticExpression(), null, "right", null, 0, 1, SqmlStaticOr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlStaticParenthesesEClass, SqmlStaticParentheses.class, "SqmlStaticParentheses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlStaticParentheses_Expression(), theInterfacesPackage.getISqmlStaticExpression(), null, "expression", null, 0, 1, SqmlStaticParentheses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlSubSelectEClass, SqmlSubSelect.class, "SqmlSubSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSqmlSubSelect_Select(), theInterfacesPackage.getISqmlSelect(), null, "select", null, 0, 1, SqmlSubSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sqmlValueReferenceEClass, SqmlValueReference.class, "SqmlValueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSqmlValueReference_NextIteration(), theEcorePackage.getEBoolean(), "nextIteration", null, 0, 1, SqmlValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSqmlValueReference_DotStar(), theEcorePackage.getEBoolean(), "dotStar", null, 0, 1, SqmlValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSqmlValueReference_Path(), this.getSqmlPath(), null, "path", null, 0, 1, SqmlValueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpressionsPackageImpl
