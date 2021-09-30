/**
 */
package com.softicar.sqml.model.expressions;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.expressions.ExpressionsFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expressions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.expressions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expressions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsPackage eINSTANCE = com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.AbstractSqmlBinaryOperationImpl <em>Abstract Sqml Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.AbstractSqmlBinaryOperationImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getAbstractSqmlBinaryOperation()
	 * @generated
	 */
	int ABSTRACT_SQML_BINARY_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_BINARY_OPERATION__FUNCTION = InterfacesPackage.ISQML_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_BINARY_OPERATION__LEFT = InterfacesPackage.ISQML_BINARY_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_BINARY_OPERATION__RIGHT = InterfacesPackage.ISQML_BINARY_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Sqml Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_BINARY_OPERATION_FEATURE_COUNT = InterfacesPackage.ISQML_BINARY_OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Sqml Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SQML_BINARY_OPERATION_OPERATION_COUNT = InterfacesPackage.ISQML_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlNegationImpl <em>Sqml Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlNegationImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlNegation()
	 * @generated
	 */
	int SQML_NEGATION = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_NEGATION__EXPRESSION = InterfacesPackage.ISQML_NEGATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_NEGATION_FEATURE_COUNT = InterfacesPackage.ISQML_NEGATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_NEGATION_OPERATION_COUNT = InterfacesPackage.ISQML_NEGATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlAdditionImpl <em>Sqml Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlAdditionImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlAddition()
	 * @generated
	 */
	int SQML_ADDITION = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ADDITION__FUNCTION = ABSTRACT_SQML_BINARY_OPERATION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ADDITION__LEFT = ABSTRACT_SQML_BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ADDITION__RIGHT = ABSTRACT_SQML_BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Sqml Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ADDITION_FEATURE_COUNT = ABSTRACT_SQML_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqml Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ADDITION_OPERATION_COUNT = ABSTRACT_SQML_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlMultiplicationImpl <em>Sqml Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlMultiplicationImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlMultiplication()
	 * @generated
	 */
	int SQML_MULTIPLICATION = 3;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_MULTIPLICATION__FUNCTION = ABSTRACT_SQML_BINARY_OPERATION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_MULTIPLICATION__LEFT = ABSTRACT_SQML_BINARY_OPERATION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_MULTIPLICATION__RIGHT = ABSTRACT_SQML_BINARY_OPERATION__RIGHT;

	/**
	 * The number of structural features of the '<em>Sqml Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_MULTIPLICATION_FEATURE_COUNT = ABSTRACT_SQML_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqml Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_MULTIPLICATION_OPERATION_COUNT = ABSTRACT_SQML_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticVariableReferenceImpl <em>Sqml Static Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticVariableReferenceImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticVariableReference()
	 * @generated
	 */
	int SQML_STATIC_VARIABLE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Next Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION = InterfacesPackage.ISQML_STATIC_VARIABLE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_VARIABLE_REFERENCE__VARIABLE = InterfacesPackage.ISQML_STATIC_VARIABLE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Static Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_VARIABLE_REFERENCE_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_VARIABLE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Static Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_VARIABLE_REFERENCE_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_VARIABLE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlPathImpl <em>Sqml Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlPathImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlPath()
	 * @generated
	 */
	int SQML_PATH = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PATH__PARENT = InterfacesPackage.ISQML_PATH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PATH__TARGET = InterfacesPackage.ISQML_PATH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PATH_FEATURE_COUNT = InterfacesPackage.ISQML_PATH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_PATH_OPERATION_COUNT = InterfacesPackage.ISQML_PATH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl <em>Sqml Group Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlGroupConcat()
	 * @generated
	 */
	int SQML_GROUP_CONCAT = 6;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_CONCAT__DISTINCT = InterfacesPackage.ISQML_GROUP_CONCAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_CONCAT__EXPRESSIONS = InterfacesPackage.ISQML_GROUP_CONCAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order By Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS = InterfacesPackage.ISQML_GROUP_CONCAT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_CONCAT__SEPARATOR = InterfacesPackage.ISQML_GROUP_CONCAT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sqml Group Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_CONCAT_FEATURE_COUNT = InterfacesPackage.ISQML_GROUP_CONCAT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sqml Group Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_GROUP_CONCAT_OPERATION_COUNT = InterfacesPackage.ISQML_GROUP_CONCAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlCaseImpl <em>Sqml Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlCaseImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlCase()
	 * @generated
	 */
	int SQML_CASE = 7;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE__OPERAND = InterfacesPackage.ISQML_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Whens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE__WHENS = InterfacesPackage.ISQML_CASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE__ELSE_EXPRESSION = InterfacesPackage.ISQML_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE_FEATURE_COUNT = InterfacesPackage.ISQML_CASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE_OPERATION_COUNT = InterfacesPackage.ISQML_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlCaseWhenImpl <em>Sqml Case When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlCaseWhenImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlCaseWhen()
	 * @generated
	 */
	int SQML_CASE_WHEN = 8;

	/**
	 * The feature id for the '<em><b>When Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE_WHEN__WHEN_EXPRESSION = InterfacesPackage.ISQML_CASE_WHEN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE_WHEN__THEN_EXPRESSION = InterfacesPackage.ISQML_CASE_WHEN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Case When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE_WHEN_FEATURE_COUNT = InterfacesPackage.ISQML_CASE_WHEN_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Case When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_CASE_WHEN_OPERATION_COUNT = InterfacesPackage.ISQML_CASE_WHEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlIfImpl <em>Sqml If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlIfImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlIf()
	 * @generated
	 */
	int SQML_IF = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF__CONDITION = InterfacesPackage.ISQML_IF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF__THEN_EXPRESSION = InterfacesPackage.ISQML_IF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF__ELSE_EXPRESSION = InterfacesPackage.ISQML_IF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF_FEATURE_COUNT = InterfacesPackage.ISQML_IF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF_OPERATION_COUNT = InterfacesPackage.ISQML_IF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlIfNullImpl <em>Sqml If Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlIfNullImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlIfNull()
	 * @generated
	 */
	int SQML_IF_NULL = 10;

	/**
	 * The feature id for the '<em><b>Test Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF_NULL__TEST_EXPRESSION = InterfacesPackage.ISQML_IF_NULL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF_NULL__THEN_EXPRESSION = InterfacesPackage.ISQML_IF_NULL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml If Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF_NULL_FEATURE_COUNT = InterfacesPackage.ISQML_IF_NULL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml If Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_IF_NULL_OPERATION_COUNT = InterfacesPackage.ISQML_IF_NULL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlRowConstructorImpl <em>Sqml Row Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlRowConstructorImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlRowConstructor()
	 * @generated
	 */
	int SQML_ROW_CONSTRUCTOR = 11;

	/**
	 * The feature id for the '<em><b>Explicit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ROW_CONSTRUCTOR__EXPLICIT = InterfacesPackage.ISQML_ROW_CONSTRUCTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ROW_CONSTRUCTOR__EXPRESSIONS = InterfacesPackage.ISQML_ROW_CONSTRUCTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Row Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ROW_CONSTRUCTOR_FEATURE_COUNT = InterfacesPackage.ISQML_ROW_CONSTRUCTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Row Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_ROW_CONSTRUCTOR_OPERATION_COUNT = InterfacesPackage.ISQML_ROW_CONSTRUCTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticAndImpl <em>Sqml Static And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticAndImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticAnd()
	 * @generated
	 */
	int SQML_STATIC_AND = 12;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_AND__LEFT = InterfacesPackage.ISQML_STATIC_AND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_AND__RIGHT = InterfacesPackage.ISQML_STATIC_AND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Static And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_AND_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_AND_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Static And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_AND_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_AND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIfImpl <em>Sqml Static If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIfImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIf()
	 * @generated
	 */
	int SQML_STATIC_IF = 13;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IF__CONDITIONS = InterfacesPackage.ISQML_STATIC_IF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IF__EXPRESSIONS = InterfacesPackage.ISQML_STATIC_IF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IF__ELSE_EXPRESSION = InterfacesPackage.ISQML_STATIC_IF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Static If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IF_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_IF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Static If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IF_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_IF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsEmptyImpl <em>Sqml Static Is Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIsEmptyImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIsEmpty()
	 * @generated
	 */
	int SQML_STATIC_IS_EMPTY = 14;

	/**
	 * The feature id for the '<em><b>Parameter Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE = InterfacesPackage.ISQML_STATIC_IS_EMPTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_EMPTY__NOT = InterfacesPackage.ISQML_STATIC_IS_EMPTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Static Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_EMPTY_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_IS_EMPTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Static Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_EMPTY_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_IS_EMPTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsNullImpl <em>Sqml Static Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIsNullImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIsNull()
	 * @generated
	 */
	int SQML_STATIC_IS_NULL = 15;

	/**
	 * The feature id for the '<em><b>Parameter Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_NULL__PARAMETER_REFERENCE = InterfacesPackage.ISQML_STATIC_IS_NULL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_NULL__NOT = InterfacesPackage.ISQML_STATIC_IS_NULL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Static Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_NULL_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_IS_NULL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Static Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_NULL_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_IS_NULL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsTrueImpl <em>Sqml Static Is True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIsTrueImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIsTrue()
	 * @generated
	 */
	int SQML_STATIC_IS_TRUE = 16;

	/**
	 * The feature id for the '<em><b>Parameter Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_TRUE__PARAMETER_REFERENCE = InterfacesPackage.ISQML_STATIC_IS_TRUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_TRUE__NOT = InterfacesPackage.ISQML_STATIC_IS_TRUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Static Is True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_TRUE_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_IS_TRUE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Static Is True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_IS_TRUE_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_IS_TRUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticOrImpl <em>Sqml Static Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticOrImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticOr()
	 * @generated
	 */
	int SQML_STATIC_OR = 17;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_OR__LEFT = InterfacesPackage.ISQML_STATIC_OR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_OR__RIGHT = InterfacesPackage.ISQML_STATIC_OR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Static Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_OR_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_OR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Static Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_OR_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_OR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticParenthesesImpl <em>Sqml Static Parentheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticParenthesesImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticParentheses()
	 * @generated
	 */
	int SQML_STATIC_PARENTHESES = 18;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_PARENTHESES__EXPRESSION = InterfacesPackage.ISQML_STATIC_PARENTHESES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Static Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_PARENTHESES_FEATURE_COUNT = InterfacesPackage.ISQML_STATIC_PARENTHESES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Static Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_STATIC_PARENTHESES_OPERATION_COUNT = InterfacesPackage.ISQML_STATIC_PARENTHESES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlSubSelectImpl <em>Sqml Sub Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlSubSelectImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlSubSelect()
	 * @generated
	 */
	int SQML_SUB_SELECT = 19;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SUB_SELECT__SELECT = InterfacesPackage.ISQML_SUB_SELECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SUB_SELECT_FEATURE_COUNT = InterfacesPackage.ISQML_SUB_SELECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SUB_SELECT_OPERATION_COUNT = InterfacesPackage.ISQML_SUB_SELECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.impl.SqmlValueReferenceImpl <em>Sqml Value Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.impl.SqmlValueReferenceImpl
	 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlValueReference()
	 * @generated
	 */
	int SQML_VALUE_REFERENCE = 20;

	/**
	 * The feature id for the '<em><b>Next Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE__NEXT_ITERATION = InterfacesPackage.ISQML_VALUE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dot Star</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE__DOT_STAR = InterfacesPackage.ISQML_VALUE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE__PATH = InterfacesPackage.ISQML_VALUE_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE_FEATURE_COUNT = InterfacesPackage.ISQML_VALUE_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_VALUE_REFERENCE_OPERATION_COUNT = InterfacesPackage.ISQML_VALUE_REFERENCE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation <em>Abstract Sqml Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sqml Binary Operation</em>'.
	 * @see com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation
	 * @generated
	 */
	EClass getAbstractSqmlBinaryOperation();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getFunction()
	 * @see #getAbstractSqmlBinaryOperation()
	 * @generated
	 */
	EReference getAbstractSqmlBinaryOperation_Function();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getLeft()
	 * @see #getAbstractSqmlBinaryOperation()
	 * @generated
	 */
	EReference getAbstractSqmlBinaryOperation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.expressions.AbstractSqmlBinaryOperation#getRight()
	 * @see #getAbstractSqmlBinaryOperation()
	 * @generated
	 */
	EReference getAbstractSqmlBinaryOperation_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlNegation <em>Sqml Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Negation</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlNegation
	 * @generated
	 */
	EClass getSqmlNegation();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlNegation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlNegation#getExpression()
	 * @see #getSqmlNegation()
	 * @generated
	 */
	EReference getSqmlNegation_Expression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlAddition <em>Sqml Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Addition</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlAddition
	 * @generated
	 */
	EClass getSqmlAddition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlMultiplication <em>Sqml Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Multiplication</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlMultiplication
	 * @generated
	 */
	EClass getSqmlMultiplication();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference <em>Sqml Static Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static Variable Reference</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticVariableReference
	 * @generated
	 */
	EClass getSqmlStaticVariableReference();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference#isNextIteration <em>Next Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Iteration</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticVariableReference#isNextIteration()
	 * @see #getSqmlStaticVariableReference()
	 * @generated
	 */
	EAttribute getSqmlStaticVariableReference_NextIteration();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.expressions.SqmlStaticVariableReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticVariableReference#getVariable()
	 * @see #getSqmlStaticVariableReference()
	 * @generated
	 */
	EReference getSqmlStaticVariableReference_Variable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlPath <em>Sqml Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Path</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlPath
	 * @generated
	 */
	EClass getSqmlPath();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlPath#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parent</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlPath#getParent()
	 * @see #getSqmlPath()
	 * @generated
	 */
	EReference getSqmlPath_Parent();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.expressions.SqmlPath#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlPath#getTarget()
	 * @see #getSqmlPath()
	 * @generated
	 */
	EReference getSqmlPath_Target();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat <em>Sqml Group Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Group Concat</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlGroupConcat
	 * @generated
	 */
	EClass getSqmlGroupConcat();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlGroupConcat#isDistinct()
	 * @see #getSqmlGroupConcat()
	 * @generated
	 */
	EAttribute getSqmlGroupConcat_Distinct();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlGroupConcat#getExpressions()
	 * @see #getSqmlGroupConcat()
	 * @generated
	 */
	EReference getSqmlGroupConcat_Expressions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#getOrderByExpressions <em>Order By Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order By Expressions</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlGroupConcat#getOrderByExpressions()
	 * @see #getSqmlGroupConcat()
	 * @generated
	 */
	EReference getSqmlGroupConcat_OrderByExpressions();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlGroupConcat#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlGroupConcat#getSeparator()
	 * @see #getSqmlGroupConcat()
	 * @generated
	 */
	EAttribute getSqmlGroupConcat_Separator();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlCase <em>Sqml Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Case</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlCase
	 * @generated
	 */
	EClass getSqmlCase();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlCase#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlCase#getOperand()
	 * @see #getSqmlCase()
	 * @generated
	 */
	EReference getSqmlCase_Operand();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.expressions.SqmlCase#getWhens <em>Whens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Whens</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlCase#getWhens()
	 * @see #getSqmlCase()
	 * @generated
	 */
	EReference getSqmlCase_Whens();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlCase#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlCase#getElseExpression()
	 * @see #getSqmlCase()
	 * @generated
	 */
	EReference getSqmlCase_ElseExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlCaseWhen <em>Sqml Case When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Case When</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlCaseWhen
	 * @generated
	 */
	EClass getSqmlCaseWhen();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlCaseWhen#getWhenExpression <em>When Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>When Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlCaseWhen#getWhenExpression()
	 * @see #getSqmlCaseWhen()
	 * @generated
	 */
	EReference getSqmlCaseWhen_WhenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlCaseWhen#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlCaseWhen#getThenExpression()
	 * @see #getSqmlCaseWhen()
	 * @generated
	 */
	EReference getSqmlCaseWhen_ThenExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlIf <em>Sqml If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml If</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlIf
	 * @generated
	 */
	EClass getSqmlIf();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlIf#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlIf#getCondition()
	 * @see #getSqmlIf()
	 * @generated
	 */
	EReference getSqmlIf_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlIf#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlIf#getThenExpression()
	 * @see #getSqmlIf()
	 * @generated
	 */
	EReference getSqmlIf_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlIf#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlIf#getElseExpression()
	 * @see #getSqmlIf()
	 * @generated
	 */
	EReference getSqmlIf_ElseExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlIfNull <em>Sqml If Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml If Null</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlIfNull
	 * @generated
	 */
	EClass getSqmlIfNull();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlIfNull#getTestExpression <em>Test Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlIfNull#getTestExpression()
	 * @see #getSqmlIfNull()
	 * @generated
	 */
	EReference getSqmlIfNull_TestExpression();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlIfNull#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlIfNull#getThenExpression()
	 * @see #getSqmlIfNull()
	 * @generated
	 */
	EReference getSqmlIfNull_ThenExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlRowConstructor <em>Sqml Row Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Row Constructor</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlRowConstructor
	 * @generated
	 */
	EClass getSqmlRowConstructor();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlRowConstructor#isExplicit <em>Explicit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explicit</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlRowConstructor#isExplicit()
	 * @see #getSqmlRowConstructor()
	 * @generated
	 */
	EAttribute getSqmlRowConstructor_Explicit();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.expressions.SqmlRowConstructor#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlRowConstructor#getExpressions()
	 * @see #getSqmlRowConstructor()
	 * @generated
	 */
	EReference getSqmlRowConstructor_Expressions();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticAnd <em>Sqml Static And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static And</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticAnd
	 * @generated
	 */
	EClass getSqmlStaticAnd();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticAnd#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticAnd#getLeft()
	 * @see #getSqmlStaticAnd()
	 * @generated
	 */
	EReference getSqmlStaticAnd_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticAnd#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticAnd#getRight()
	 * @see #getSqmlStaticAnd()
	 * @generated
	 */
	EReference getSqmlStaticAnd_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticIf <em>Sqml Static If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static If</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIf
	 * @generated
	 */
	EClass getSqmlStaticIf();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.expressions.SqmlStaticIf#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIf#getConditions()
	 * @see #getSqmlStaticIf()
	 * @generated
	 */
	EReference getSqmlStaticIf_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.expressions.SqmlStaticIf#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIf#getExpressions()
	 * @see #getSqmlStaticIf()
	 * @generated
	 */
	EReference getSqmlStaticIf_Expressions();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticIf#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIf#getElseExpression()
	 * @see #getSqmlStaticIf()
	 * @generated
	 */
	EReference getSqmlStaticIf_ElseExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticIsEmpty <em>Sqml Static Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static Is Empty</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsEmpty
	 * @generated
	 */
	EClass getSqmlStaticIsEmpty();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticIsEmpty#getParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Reference</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsEmpty#getParameterReference()
	 * @see #getSqmlStaticIsEmpty()
	 * @generated
	 */
	EReference getSqmlStaticIsEmpty_ParameterReference();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlStaticIsEmpty#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsEmpty#isNot()
	 * @see #getSqmlStaticIsEmpty()
	 * @generated
	 */
	EAttribute getSqmlStaticIsEmpty_Not();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull <em>Sqml Static Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static Is Null</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsNull
	 * @generated
	 */
	EClass getSqmlStaticIsNull();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull#getParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Reference</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsNull#getParameterReference()
	 * @see #getSqmlStaticIsNull()
	 * @generated
	 */
	EReference getSqmlStaticIsNull_ParameterReference();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlStaticIsNull#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsNull#isNot()
	 * @see #getSqmlStaticIsNull()
	 * @generated
	 */
	EAttribute getSqmlStaticIsNull_Not();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticIsTrue <em>Sqml Static Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static Is True</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsTrue
	 * @generated
	 */
	EClass getSqmlStaticIsTrue();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticIsTrue#getParameterReference <em>Parameter Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Reference</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsTrue#getParameterReference()
	 * @see #getSqmlStaticIsTrue()
	 * @generated
	 */
	EReference getSqmlStaticIsTrue_ParameterReference();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlStaticIsTrue#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticIsTrue#isNot()
	 * @see #getSqmlStaticIsTrue()
	 * @generated
	 */
	EAttribute getSqmlStaticIsTrue_Not();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticOr <em>Sqml Static Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static Or</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticOr
	 * @generated
	 */
	EClass getSqmlStaticOr();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticOr#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticOr#getLeft()
	 * @see #getSqmlStaticOr()
	 * @generated
	 */
	EReference getSqmlStaticOr_Left();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticOr#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticOr#getRight()
	 * @see #getSqmlStaticOr()
	 * @generated
	 */
	EReference getSqmlStaticOr_Right();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlStaticParentheses <em>Sqml Static Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Static Parentheses</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticParentheses
	 * @generated
	 */
	EClass getSqmlStaticParentheses();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlStaticParentheses#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlStaticParentheses#getExpression()
	 * @see #getSqmlStaticParentheses()
	 * @generated
	 */
	EReference getSqmlStaticParentheses_Expression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlSubSelect <em>Sqml Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sub Select</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlSubSelect
	 * @generated
	 */
	EClass getSqmlSubSelect();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlSubSelect#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlSubSelect#getSelect()
	 * @see #getSqmlSubSelect()
	 * @generated
	 */
	EReference getSqmlSubSelect_Select();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.SqmlValueReference <em>Sqml Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Value Reference</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlValueReference
	 * @generated
	 */
	EClass getSqmlValueReference();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlValueReference#isNextIteration <em>Next Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Iteration</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlValueReference#isNextIteration()
	 * @see #getSqmlValueReference()
	 * @generated
	 */
	EAttribute getSqmlValueReference_NextIteration();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.expressions.SqmlValueReference#isDotStar <em>Dot Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot Star</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlValueReference#isDotStar()
	 * @see #getSqmlValueReference()
	 * @generated
	 */
	EAttribute getSqmlValueReference_DotStar();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.expressions.SqmlValueReference#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Path</em>'.
	 * @see com.softicar.sqml.model.expressions.SqmlValueReference#getPath()
	 * @see #getSqmlValueReference()
	 * @generated
	 */
	EReference getSqmlValueReference_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionsFactory getExpressionsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.AbstractSqmlBinaryOperationImpl <em>Abstract Sqml Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.AbstractSqmlBinaryOperationImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getAbstractSqmlBinaryOperation()
		 * @generated
		 */
		EClass ABSTRACT_SQML_BINARY_OPERATION = eINSTANCE.getAbstractSqmlBinaryOperation();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SQML_BINARY_OPERATION__FUNCTION = eINSTANCE.getAbstractSqmlBinaryOperation_Function();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SQML_BINARY_OPERATION__LEFT = eINSTANCE.getAbstractSqmlBinaryOperation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_SQML_BINARY_OPERATION__RIGHT = eINSTANCE.getAbstractSqmlBinaryOperation_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlNegationImpl <em>Sqml Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlNegationImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlNegation()
		 * @generated
		 */
		EClass SQML_NEGATION = eINSTANCE.getSqmlNegation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_NEGATION__EXPRESSION = eINSTANCE.getSqmlNegation_Expression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlAdditionImpl <em>Sqml Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlAdditionImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlAddition()
		 * @generated
		 */
		EClass SQML_ADDITION = eINSTANCE.getSqmlAddition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlMultiplicationImpl <em>Sqml Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlMultiplicationImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlMultiplication()
		 * @generated
		 */
		EClass SQML_MULTIPLICATION = eINSTANCE.getSqmlMultiplication();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticVariableReferenceImpl <em>Sqml Static Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticVariableReferenceImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticVariableReference()
		 * @generated
		 */
		EClass SQML_STATIC_VARIABLE_REFERENCE = eINSTANCE.getSqmlStaticVariableReference();

		/**
		 * The meta object literal for the '<em><b>Next Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_STATIC_VARIABLE_REFERENCE__NEXT_ITERATION = eINSTANCE.getSqmlStaticVariableReference_NextIteration();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getSqmlStaticVariableReference_Variable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlPathImpl <em>Sqml Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlPathImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlPath()
		 * @generated
		 */
		EClass SQML_PATH = eINSTANCE.getSqmlPath();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_PATH__PARENT = eINSTANCE.getSqmlPath_Parent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_PATH__TARGET = eINSTANCE.getSqmlPath_Target();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl <em>Sqml Group Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlGroupConcatImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlGroupConcat()
		 * @generated
		 */
		EClass SQML_GROUP_CONCAT = eINSTANCE.getSqmlGroupConcat();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_GROUP_CONCAT__DISTINCT = eINSTANCE.getSqmlGroupConcat_Distinct();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_GROUP_CONCAT__EXPRESSIONS = eINSTANCE.getSqmlGroupConcat_Expressions();

		/**
		 * The meta object literal for the '<em><b>Order By Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_GROUP_CONCAT__ORDER_BY_EXPRESSIONS = eINSTANCE.getSqmlGroupConcat_OrderByExpressions();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_GROUP_CONCAT__SEPARATOR = eINSTANCE.getSqmlGroupConcat_Separator();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlCaseImpl <em>Sqml Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlCaseImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlCase()
		 * @generated
		 */
		EClass SQML_CASE = eINSTANCE.getSqmlCase();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_CASE__OPERAND = eINSTANCE.getSqmlCase_Operand();

		/**
		 * The meta object literal for the '<em><b>Whens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_CASE__WHENS = eINSTANCE.getSqmlCase_Whens();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_CASE__ELSE_EXPRESSION = eINSTANCE.getSqmlCase_ElseExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlCaseWhenImpl <em>Sqml Case When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlCaseWhenImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlCaseWhen()
		 * @generated
		 */
		EClass SQML_CASE_WHEN = eINSTANCE.getSqmlCaseWhen();

		/**
		 * The meta object literal for the '<em><b>When Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_CASE_WHEN__WHEN_EXPRESSION = eINSTANCE.getSqmlCaseWhen_WhenExpression();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_CASE_WHEN__THEN_EXPRESSION = eINSTANCE.getSqmlCaseWhen_ThenExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlIfImpl <em>Sqml If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlIfImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlIf()
		 * @generated
		 */
		EClass SQML_IF = eINSTANCE.getSqmlIf();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IF__CONDITION = eINSTANCE.getSqmlIf_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IF__THEN_EXPRESSION = eINSTANCE.getSqmlIf_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IF__ELSE_EXPRESSION = eINSTANCE.getSqmlIf_ElseExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlIfNullImpl <em>Sqml If Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlIfNullImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlIfNull()
		 * @generated
		 */
		EClass SQML_IF_NULL = eINSTANCE.getSqmlIfNull();

		/**
		 * The meta object literal for the '<em><b>Test Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IF_NULL__TEST_EXPRESSION = eINSTANCE.getSqmlIfNull_TestExpression();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_IF_NULL__THEN_EXPRESSION = eINSTANCE.getSqmlIfNull_ThenExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlRowConstructorImpl <em>Sqml Row Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlRowConstructorImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlRowConstructor()
		 * @generated
		 */
		EClass SQML_ROW_CONSTRUCTOR = eINSTANCE.getSqmlRowConstructor();

		/**
		 * The meta object literal for the '<em><b>Explicit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_ROW_CONSTRUCTOR__EXPLICIT = eINSTANCE.getSqmlRowConstructor_Explicit();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_ROW_CONSTRUCTOR__EXPRESSIONS = eINSTANCE.getSqmlRowConstructor_Expressions();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticAndImpl <em>Sqml Static And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticAndImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticAnd()
		 * @generated
		 */
		EClass SQML_STATIC_AND = eINSTANCE.getSqmlStaticAnd();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_AND__LEFT = eINSTANCE.getSqmlStaticAnd_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_AND__RIGHT = eINSTANCE.getSqmlStaticAnd_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIfImpl <em>Sqml Static If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIfImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIf()
		 * @generated
		 */
		EClass SQML_STATIC_IF = eINSTANCE.getSqmlStaticIf();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_IF__CONDITIONS = eINSTANCE.getSqmlStaticIf_Conditions();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_IF__EXPRESSIONS = eINSTANCE.getSqmlStaticIf_Expressions();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_IF__ELSE_EXPRESSION = eINSTANCE.getSqmlStaticIf_ElseExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsEmptyImpl <em>Sqml Static Is Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIsEmptyImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIsEmpty()
		 * @generated
		 */
		EClass SQML_STATIC_IS_EMPTY = eINSTANCE.getSqmlStaticIsEmpty();

		/**
		 * The meta object literal for the '<em><b>Parameter Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_IS_EMPTY__PARAMETER_REFERENCE = eINSTANCE.getSqmlStaticIsEmpty_ParameterReference();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_STATIC_IS_EMPTY__NOT = eINSTANCE.getSqmlStaticIsEmpty_Not();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsNullImpl <em>Sqml Static Is Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIsNullImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIsNull()
		 * @generated
		 */
		EClass SQML_STATIC_IS_NULL = eINSTANCE.getSqmlStaticIsNull();

		/**
		 * The meta object literal for the '<em><b>Parameter Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_IS_NULL__PARAMETER_REFERENCE = eINSTANCE.getSqmlStaticIsNull_ParameterReference();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_STATIC_IS_NULL__NOT = eINSTANCE.getSqmlStaticIsNull_Not();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticIsTrueImpl <em>Sqml Static Is True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticIsTrueImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticIsTrue()
		 * @generated
		 */
		EClass SQML_STATIC_IS_TRUE = eINSTANCE.getSqmlStaticIsTrue();

		/**
		 * The meta object literal for the '<em><b>Parameter Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_IS_TRUE__PARAMETER_REFERENCE = eINSTANCE.getSqmlStaticIsTrue_ParameterReference();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_STATIC_IS_TRUE__NOT = eINSTANCE.getSqmlStaticIsTrue_Not();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticOrImpl <em>Sqml Static Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticOrImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticOr()
		 * @generated
		 */
		EClass SQML_STATIC_OR = eINSTANCE.getSqmlStaticOr();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_OR__LEFT = eINSTANCE.getSqmlStaticOr_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_OR__RIGHT = eINSTANCE.getSqmlStaticOr_Right();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlStaticParenthesesImpl <em>Sqml Static Parentheses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlStaticParenthesesImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlStaticParentheses()
		 * @generated
		 */
		EClass SQML_STATIC_PARENTHESES = eINSTANCE.getSqmlStaticParentheses();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_STATIC_PARENTHESES__EXPRESSION = eINSTANCE.getSqmlStaticParentheses_Expression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlSubSelectImpl <em>Sqml Sub Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlSubSelectImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlSubSelect()
		 * @generated
		 */
		EClass SQML_SUB_SELECT = eINSTANCE.getSqmlSubSelect();

		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SUB_SELECT__SELECT = eINSTANCE.getSqmlSubSelect_Select();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.impl.SqmlValueReferenceImpl <em>Sqml Value Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.impl.SqmlValueReferenceImpl
		 * @see com.softicar.sqml.model.expressions.impl.ExpressionsPackageImpl#getSqmlValueReference()
		 * @generated
		 */
		EClass SQML_VALUE_REFERENCE = eINSTANCE.getSqmlValueReference();

		/**
		 * The meta object literal for the '<em><b>Next Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_VALUE_REFERENCE__NEXT_ITERATION = eINSTANCE.getSqmlValueReference_NextIteration();

		/**
		 * The meta object literal for the '<em><b>Dot Star</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_VALUE_REFERENCE__DOT_STAR = eINSTANCE.getSqmlValueReference_DotStar();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_VALUE_REFERENCE__PATH = eINSTANCE.getSqmlValueReference_Path();

	}

} //ExpressionsPackage
