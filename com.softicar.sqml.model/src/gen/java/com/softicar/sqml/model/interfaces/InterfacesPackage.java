/**
 */
package com.softicar.sqml.model.interfaces;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.softicar.sqml.model.interfaces.InterfacesFactory
 * @model kind="package"
 * @generated
 */
public interface InterfacesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "interfaces";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.interfaces";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "interfaces";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfacesPackage eINSTANCE = com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlValue <em>ISqml Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlValue
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValue()
	 * @generated
	 */
	int ISQML_VALUE = 64;

	/**
	 * The number of structural features of the '<em>ISqml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlExpression <em>ISqml Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlExpression
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlExpression()
	 * @generated
	 */
	int ISQML_EXPRESSION = 15;

	/**
	 * The number of structural features of the '<em>ISqml Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_EXPRESSION_FEATURE_COUNT = ISQML_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_EXPRESSION_OPERATION_COUNT = ISQML_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlCondition <em>ISqml Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlCondition
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlCondition()
	 * @generated
	 */
	int ISQML_CONDITION = 3;

	/**
	 * The number of structural features of the '<em>ISqml Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_CONDITION_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_CONDITION_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlAnd <em>ISqml And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlAnd
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlAnd()
	 * @generated
	 */
	int ISQML_AND = 0;

	/**
	 * The number of structural features of the '<em>ISqml And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_AND_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_AND_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlBetween <em>ISqml Between</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlBetween
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlBetween()
	 * @generated
	 */
	int ISQML_BETWEEN = 1;

	/**
	 * The number of structural features of the '<em>ISqml Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_BETWEEN_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_BETWEEN_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlFunctionCall <em>ISqml Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionCall
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFunctionCall()
	 * @generated
	 */
	int ISQML_FUNCTION_CALL = 41;

	/**
	 * The number of structural features of the '<em>ISqml Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FUNCTION_CALL_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FUNCTION_CALL_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlBinaryOperation <em>ISqml Binary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlBinaryOperation
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlBinaryOperation()
	 * @generated
	 */
	int ISQML_BINARY_OPERATION = 14;

	/**
	 * The number of structural features of the '<em>ISqml Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_BINARY_OPERATION_FEATURE_COUNT = ISQML_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Binary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_BINARY_OPERATION_OPERATION_COUNT = ISQML_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlComparison <em>ISqml Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlComparison
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlComparison()
	 * @generated
	 */
	int ISQML_COMPARISON = 2;

	/**
	 * The number of structural features of the '<em>ISqml Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_COMPARISON_FEATURE_COUNT = ISQML_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_COMPARISON_OPERATION_COUNT = ISQML_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlExists <em>ISqml Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlExists
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlExists()
	 * @generated
	 */
	int ISQML_EXISTS = 4;

	/**
	 * The number of structural features of the '<em>ISqml Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_EXISTS_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_EXISTS_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlIn <em>ISqml In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlIn
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIn()
	 * @generated
	 */
	int ISQML_IN = 5;

	/**
	 * The number of structural features of the '<em>ISqml In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IN_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IN_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlIsNull <em>ISqml Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlIsNull
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIsNull()
	 * @generated
	 */
	int ISQML_IS_NULL = 6;

	/**
	 * The number of structural features of the '<em>ISqml Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IS_NULL_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IS_NULL_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlLike <em>ISqml Like</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlLike
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLike()
	 * @generated
	 */
	int ISQML_LIKE = 7;

	/**
	 * The number of structural features of the '<em>ISqml Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LIKE_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Like</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LIKE_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlNot <em>ISqml Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlNot
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlNot()
	 * @generated
	 */
	int ISQML_NOT = 8;

	/**
	 * The number of structural features of the '<em>ISqml Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_NOT_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_NOT_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlOr <em>ISqml Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlOr
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlOr()
	 * @generated
	 */
	int ISQML_OR = 9;

	/**
	 * The number of structural features of the '<em>ISqml Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_OR_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_OR_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.conditions.ISqmlRegexp <em>ISqml Regexp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.conditions.ISqmlRegexp
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlRegexp()
	 * @generated
	 */
	int ISQML_REGEXP = 10;

	/**
	 * The number of structural features of the '<em>ISqml Regexp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_REGEXP_FEATURE_COUNT = ISQML_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Regexp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_REGEXP_OPERATION_COUNT = ISQML_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlAddition <em>ISqml Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlAddition
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlAddition()
	 * @generated
	 */
	int ISQML_ADDITION = 11;

	/**
	 * The number of structural features of the '<em>ISqml Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ADDITION_FEATURE_COUNT = ISQML_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ADDITION_OPERATION_COUNT = ISQML_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlCase <em>ISqml Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlCase
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlCase()
	 * @generated
	 */
	int ISQML_CASE = 12;

	/**
	 * The number of structural features of the '<em>ISqml Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_CASE_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_CASE_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlModelElement <em>ISqml Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlModelElement
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlModelElement()
	 * @generated
	 */
	int ISQML_MODEL_ELEMENT = 60;

	/**
	 * The number of structural features of the '<em>ISqml Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlCaseWhen <em>ISqml Case When</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlCaseWhen
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlCaseWhen()
	 * @generated
	 */
	int ISQML_CASE_WHEN = 13;

	/**
	 * The number of structural features of the '<em>ISqml Case When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_CASE_WHEN_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Case When</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_CASE_WHEN_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlGroupConcat <em>ISqml Group Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlGroupConcat
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGroupConcat()
	 * @generated
	 */
	int ISQML_GROUP_CONCAT = 16;

	/**
	 * The number of structural features of the '<em>ISqml Group Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GROUP_CONCAT_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Group Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GROUP_CONCAT_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlIf <em>ISqml If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlIf
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIf()
	 * @generated
	 */
	int ISQML_IF = 17;

	/**
	 * The number of structural features of the '<em>ISqml If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IF_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IF_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlIfNull <em>ISqml If Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlIfNull
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIfNull()
	 * @generated
	 */
	int ISQML_IF_NULL = 18;

	/**
	 * The number of structural features of the '<em>ISqml If Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IF_NULL_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml If Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IF_NULL_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlMultiplication <em>ISqml Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlMultiplication
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlMultiplication()
	 * @generated
	 */
	int ISQML_MULTIPLICATION = 19;

	/**
	 * The number of structural features of the '<em>ISqml Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_MULTIPLICATION_FEATURE_COUNT = ISQML_BINARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_MULTIPLICATION_OPERATION_COUNT = ISQML_BINARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlUnaryOperation <em>ISqml Unary Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlUnaryOperation
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlUnaryOperation()
	 * @generated
	 */
	int ISQML_UNARY_OPERATION = 34;

	/**
	 * The number of structural features of the '<em>ISqml Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_UNARY_OPERATION_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Unary Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_UNARY_OPERATION_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlNegation <em>ISqml Negation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlNegation
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlNegation()
	 * @generated
	 */
	int ISQML_NEGATION = 20;

	/**
	 * The number of structural features of the '<em>ISqml Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_NEGATION_FEATURE_COUNT = ISQML_UNARY_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Negation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_NEGATION_OPERATION_COUNT = ISQML_UNARY_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.validation.ISqmlValidatable <em>ISqml Validatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.validation.ISqmlValidatable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValidatable()
	 * @generated
	 */
	int ISQML_VALIDATABLE = 105;

	/**
	 * The number of structural features of the '<em>ISqml Validatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALIDATABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Validatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALIDATABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlPath <em>ISqml Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlPath
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlPath()
	 * @generated
	 */
	int ISQML_PATH = 21;

	/**
	 * The number of structural features of the '<em>ISqml Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_PATH_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_PATH_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlRowConstructor <em>ISqml Row Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlRowConstructor
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlRowConstructor()
	 * @generated
	 */
	int ISQML_ROW_CONSTRUCTOR = 22;

	/**
	 * The number of structural features of the '<em>ISqml Row Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ROW_CONSTRUCTOR_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Row Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ROW_CONSTRUCTOR_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticExpression <em>ISqml Static Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticExpression
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticExpression()
	 * @generated
	 */
	int ISQML_STATIC_EXPRESSION = 24;

	/**
	 * The number of structural features of the '<em>ISqml Static Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Static Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticAnd <em>ISqml Static And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticAnd
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticAnd()
	 * @generated
	 */
	int ISQML_STATIC_AND = 23;

	/**
	 * The number of structural features of the '<em>ISqml Static And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_AND_FEATURE_COUNT = ISQML_STATIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_AND_OPERATION_COUNT = ISQML_STATIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIf <em>ISqml Static If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIf
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIf()
	 * @generated
	 */
	int ISQML_STATIC_IF = 25;

	/**
	 * The number of structural features of the '<em>ISqml Static If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IF_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IF_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticParameterTest <em>ISqml Static Parameter Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParameterTest
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticParameterTest()
	 * @generated
	 */
	int ISQML_STATIC_PARAMETER_TEST = 30;

	/**
	 * The number of structural features of the '<em>ISqml Static Parameter Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_PARAMETER_TEST_FEATURE_COUNT = ISQML_STATIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static Parameter Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_PARAMETER_TEST_OPERATION_COUNT = ISQML_STATIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty <em>ISqml Static Is Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIsEmpty()
	 * @generated
	 */
	int ISQML_STATIC_IS_EMPTY = 26;

	/**
	 * The number of structural features of the '<em>ISqml Static Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IS_EMPTY_FEATURE_COUNT = ISQML_STATIC_PARAMETER_TEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static Is Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IS_EMPTY_OPERATION_COUNT = ISQML_STATIC_PARAMETER_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsNull <em>ISqml Static Is Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsNull
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIsNull()
	 * @generated
	 */
	int ISQML_STATIC_IS_NULL = 27;

	/**
	 * The number of structural features of the '<em>ISqml Static Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IS_NULL_FEATURE_COUNT = ISQML_STATIC_PARAMETER_TEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static Is Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IS_NULL_OPERATION_COUNT = ISQML_STATIC_PARAMETER_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsTrue <em>ISqml Static Is True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsTrue
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIsTrue()
	 * @generated
	 */
	int ISQML_STATIC_IS_TRUE = 28;

	/**
	 * The number of structural features of the '<em>ISqml Static Is True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IS_TRUE_FEATURE_COUNT = ISQML_STATIC_PARAMETER_TEST_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static Is True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_IS_TRUE_OPERATION_COUNT = ISQML_STATIC_PARAMETER_TEST_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticOr <em>ISqml Static Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticOr
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticOr()
	 * @generated
	 */
	int ISQML_STATIC_OR = 29;

	/**
	 * The number of structural features of the '<em>ISqml Static Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_OR_FEATURE_COUNT = ISQML_STATIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_OR_OPERATION_COUNT = ISQML_STATIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticParentheses <em>ISqml Static Parentheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParentheses
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticParentheses()
	 * @generated
	 */
	int ISQML_STATIC_PARENTHESES = 31;

	/**
	 * The number of structural features of the '<em>ISqml Static Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_PARENTHESES_FEATURE_COUNT = ISQML_STATIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_PARENTHESES_OPERATION_COUNT = ISQML_STATIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticVariableReference <em>ISqml Static Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticVariableReference
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticVariableReference()
	 * @generated
	 */
	int ISQML_STATIC_VARIABLE_REFERENCE = 32;

	/**
	 * The number of structural features of the '<em>ISqml Static Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_VARIABLE_REFERENCE_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Static Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_VARIABLE_REFERENCE_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlSubSelect <em>ISqml Sub Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlSubSelect
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSubSelect()
	 * @generated
	 */
	int ISQML_SUB_SELECT = 33;

	/**
	 * The number of structural features of the '<em>ISqml Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SUB_SELECT_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Sub Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SUB_SELECT_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.expressions.ISqmlValueReference <em>ISqml Value Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.expressions.ISqmlValueReference
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValueReference()
	 * @generated
	 */
	int ISQML_VALUE_REFERENCE = 35;

	/**
	 * The number of structural features of the '<em>ISqml Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_REFERENCE_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Value Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_REFERENCE_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.ISqmlFile <em>ISqml File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.ISqmlFile
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFile()
	 * @generated
	 */
	int ISQML_FILE = 36;

	/**
	 * The number of structural features of the '<em>ISqml File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FILE_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FILE_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlGlobalObject <em>ISqml Global Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlGlobalObject
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGlobalObject()
	 * @generated
	 */
	int ISQML_GLOBAL_OBJECT = 59;

	/**
	 * The number of structural features of the '<em>ISqml Global Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GLOBAL_OBJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Global Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GLOBAL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.ISqmlFileElement <em>ISqml File Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.ISqmlFileElement
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFileElement()
	 * @generated
	 */
	int ISQML_FILE_ELEMENT = 37;

	/**
	 * The number of structural features of the '<em>ISqml File Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FILE_ELEMENT_FEATURE_COUNT = ISQML_GLOBAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml File Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FILE_ELEMENT_OPERATION_COUNT = ISQML_GLOBAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.ISqmlImport <em>ISqml Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.ISqmlImport
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlImport()
	 * @generated
	 */
	int ISQML_IMPORT = 38;

	/**
	 * The number of structural features of the '<em>ISqml Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IMPORT_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_IMPORT_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.files.ISqmlPackageDeclaration <em>ISqml Package Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.files.ISqmlPackageDeclaration
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlPackageDeclaration()
	 * @generated
	 */
	int ISQML_PACKAGE_DECLARATION = 39;

	/**
	 * The number of structural features of the '<em>ISqml Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_PACKAGE_DECLARATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Package Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_PACKAGE_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlFunction <em>ISqml Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlFunction
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFunction()
	 * @generated
	 */
	int ISQML_FUNCTION = 40;

	/**
	 * The number of structural features of the '<em>ISqml Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FUNCTION_FEATURE_COUNT = ISQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FUNCTION_OPERATION_COUNT = ISQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlFunctionParameter <em>ISqml Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionParameter
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFunctionParameter()
	 * @generated
	 */
	int ISQML_FUNCTION_PARAMETER = 42;

	/**
	 * The number of structural features of the '<em>ISqml Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FUNCTION_PARAMETER_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FUNCTION_PARAMETER_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlSql <em>ISqml Sql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlSql
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSql()
	 * @generated
	 */
	int ISQML_SQL = 43;

	/**
	 * The number of structural features of the '<em>ISqml Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlSqlId <em>ISqml Sql Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlSqlId
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlId()
	 * @generated
	 */
	int ISQML_SQL_ID = 44;

	/**
	 * The number of structural features of the '<em>ISqml Sql Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_ID_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Sql Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_ID_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlSqlKeyword <em>ISqml Sql Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlSqlKeyword
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlKeyword()
	 * @generated
	 */
	int ISQML_SQL_KEYWORD = 45;

	/**
	 * The number of structural features of the '<em>ISqml Sql Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_KEYWORD_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Sql Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_KEYWORD_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral <em>ISqml Sql Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlNumberLiteral()
	 * @generated
	 */
	int ISQML_SQL_NUMBER_LITERAL = 46;

	/**
	 * The number of structural features of the '<em>ISqml Sql Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_NUMBER_LITERAL_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Sql Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_NUMBER_LITERAL_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlSqlStringLiteral <em>ISqml Sql String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlSqlStringLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlStringLiteral()
	 * @generated
	 */
	int ISQML_SQL_STRING_LITERAL = 47;

	/**
	 * The number of structural features of the '<em>ISqml Sql String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_STRING_LITERAL_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Sql String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_STRING_LITERAL_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.ISqmlSqlSymbol <em>ISqml Sql Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.ISqmlSqlSymbol
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlSymbol()
	 * @generated
	 */
	int ISQML_SQL_SYMBOL = 48;

	/**
	 * The number of structural features of the '<em>ISqml Sql Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_SYMBOL_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Sql Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SQL_SYMBOL_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlLiteral <em>ISqml Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLiteral()
	 * @generated
	 */
	int ISQML_LITERAL = 54;

	/**
	 * The number of structural features of the '<em>ISqml Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LITERAL_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LITERAL_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlBooleanLiteral <em>ISqml Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlBooleanLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlBooleanLiteral()
	 * @generated
	 */
	int ISQML_BOOLEAN_LITERAL = 49;

	/**
	 * The number of structural features of the '<em>ISqml Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_BOOLEAN_LITERAL_FEATURE_COUNT = ISQML_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_BOOLEAN_LITERAL_OPERATION_COUNT = ISQML_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlDecimalLiteral <em>ISqml Decimal Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlDecimalLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlDecimalLiteral()
	 * @generated
	 */
	int ISQML_DECIMAL_LITERAL = 50;

	/**
	 * The number of structural features of the '<em>ISqml Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_DECIMAL_LITERAL_FEATURE_COUNT = ISQML_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Decimal Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_DECIMAL_LITERAL_OPERATION_COUNT = ISQML_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlDoubleLiteral <em>ISqml Double Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlDoubleLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlDoubleLiteral()
	 * @generated
	 */
	int ISQML_DOUBLE_LITERAL = 51;

	/**
	 * The number of structural features of the '<em>ISqml Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_DOUBLE_LITERAL_FEATURE_COUNT = ISQML_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Double Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_DOUBLE_LITERAL_OPERATION_COUNT = ISQML_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlFloatLiteral <em>ISqml Float Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlFloatLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFloatLiteral()
	 * @generated
	 */
	int ISQML_FLOAT_LITERAL = 52;

	/**
	 * The number of structural features of the '<em>ISqml Float Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FLOAT_LITERAL_FEATURE_COUNT = ISQML_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Float Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FLOAT_LITERAL_OPERATION_COUNT = ISQML_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlIntegerLiteral <em>ISqml Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlIntegerLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIntegerLiteral()
	 * @generated
	 */
	int ISQML_INTEGER_LITERAL = 53;

	/**
	 * The number of structural features of the '<em>ISqml Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_INTEGER_LITERAL_FEATURE_COUNT = ISQML_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_INTEGER_LITERAL_OPERATION_COUNT = ISQML_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlLongLiteral <em>ISqml Long Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlLongLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLongLiteral()
	 * @generated
	 */
	int ISQML_LONG_LITERAL = 55;

	/**
	 * The number of structural features of the '<em>ISqml Long Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LONG_LITERAL_FEATURE_COUNT = ISQML_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Long Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LONG_LITERAL_OPERATION_COUNT = ISQML_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.literals.ISqmlStringLiteral <em>ISqml String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.literals.ISqmlStringLiteral
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStringLiteral()
	 * @generated
	 */
	int ISQML_STRING_LITERAL = 56;

	/**
	 * The number of structural features of the '<em>ISqml String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STRING_LITERAL_FEATURE_COUNT = ISQML_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STRING_LITERAL_OPERATION_COUNT = ISQML_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlColumn <em>ISqml Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlColumn
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlColumn()
	 * @generated
	 */
	int ISQML_COLUMN = 57;

	/**
	 * The number of structural features of the '<em>ISqml Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_COLUMN_FEATURE_COUNT = ISQML_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_COLUMN_OPERATION_COUNT = ISQML_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlGeneratable <em>ISqml Generatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlGeneratable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGeneratable()
	 * @generated
	 */
	int ISQML_GENERATABLE = 58;

	/**
	 * The number of structural features of the '<em>ISqml Generatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GENERATABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Generatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GENERATABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlModelVisitor <em>ISqml Model Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlModelVisitor
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlModelVisitor()
	 * @generated
	 */
	int ISQML_MODEL_VISITOR = 61;

	/**
	 * The number of structural features of the '<em>ISqml Model Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_MODEL_VISITOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Model Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_MODEL_VISITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlStaticVariable <em>ISqml Static Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlStaticVariable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticVariable()
	 * @generated
	 */
	int ISQML_STATIC_VARIABLE = 62;

	/**
	 * The number of structural features of the '<em>ISqml Static Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Static Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_STATIC_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.ISqmlTabular <em>ISqml Tabular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.ISqmlTabular
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTabular()
	 * @generated
	 */
	int ISQML_TABULAR = 63;

	/**
	 * The number of structural features of the '<em>ISqml Tabular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABULAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Tabular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABULAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.queries.ISqmlQuery <em>ISqml Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.queries.ISqmlQuery
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlQuery()
	 * @generated
	 */
	int ISQML_QUERY = 65;

	/**
	 * The number of structural features of the '<em>ISqml Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_QUERY_FEATURE_COUNT = ISQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_QUERY_OPERATION_COUNT = ISQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.queries.ISqmlQueryParameter <em>ISqml Query Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.queries.ISqmlQueryParameter
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlQueryParameter()
	 * @generated
	 */
	int ISQML_QUERY_PARAMETER = 66;

	/**
	 * The number of structural features of the '<em>ISqml Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_QUERY_PARAMETER_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Query Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_QUERY_PARAMETER_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlVariable <em>ISqml Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlVariable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlVariable()
	 * @generated
	 */
	int ISQML_VARIABLE = 84;

	/**
	 * The number of structural features of the '<em>ISqml Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VARIABLE_FEATURE_COUNT = ISQML_GENERATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VARIABLE_OPERATION_COUNT = ISQML_GENERATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlForeignKeyVariable <em>ISqml Foreign Key Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlForeignKeyVariable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlForeignKeyVariable()
	 * @generated
	 */
	int ISQML_FOREIGN_KEY_VARIABLE = 67;

	/**
	 * The number of structural features of the '<em>ISqml Foreign Key Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FOREIGN_KEY_VARIABLE_FEATURE_COUNT = ISQML_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Foreign Key Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FOREIGN_KEY_VARIABLE_OPERATION_COUNT = ISQML_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelectPart <em>ISqml Select Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelectPart
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectPart()
	 * @generated
	 */
	int ISQML_SELECT_PART = 81;

	/**
	 * The number of structural features of the '<em>ISqml Select Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_PART_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_PART_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlFromClause <em>ISqml From Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlFromClause
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFromClause()
	 * @generated
	 */
	int ISQML_FROM_CLAUSE = 68;

	/**
	 * The number of structural features of the '<em>ISqml From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FROM_CLAUSE_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_FROM_CLAUSE_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlGroupByClause <em>ISqml Group By Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlGroupByClause
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGroupByClause()
	 * @generated
	 */
	int ISQML_GROUP_BY_CLAUSE = 69;

	/**
	 * The number of structural features of the '<em>ISqml Group By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GROUP_BY_CLAUSE_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Group By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_GROUP_BY_CLAUSE_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlHavingClause <em>ISqml Having Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlHavingClause
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlHavingClause()
	 * @generated
	 */
	int ISQML_HAVING_CLAUSE = 70;

	/**
	 * The number of structural features of the '<em>ISqml Having Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_HAVING_CLAUSE_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Having Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_HAVING_CLAUSE_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlJoinClause <em>ISqml Join Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlJoinClause
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlJoinClause()
	 * @generated
	 */
	int ISQML_JOIN_CLAUSE = 71;

	/**
	 * The number of structural features of the '<em>ISqml Join Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_JOIN_CLAUSE_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Join Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_JOIN_CLAUSE_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlOrderByClause <em>ISqml Order By Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByClause
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlOrderByClause()
	 * @generated
	 */
	int ISQML_ORDER_BY_CLAUSE = 72;

	/**
	 * The number of structural features of the '<em>ISqml Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ORDER_BY_CLAUSE_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ORDER_BY_CLAUSE_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlOrderByExpression <em>ISqml Order By Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByExpression
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlOrderByExpression()
	 * @generated
	 */
	int ISQML_ORDER_BY_EXPRESSION = 73;

	/**
	 * The number of structural features of the '<em>ISqml Order By Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ORDER_BY_EXPRESSION_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Order By Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ORDER_BY_EXPRESSION_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelect <em>ISqml Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelect
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelect()
	 * @generated
	 */
	int ISQML_SELECT = 74;

	/**
	 * The number of structural features of the '<em>ISqml Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelectBlock <em>ISqml Select Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelectBlock
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectBlock()
	 * @generated
	 */
	int ISQML_SELECT_BLOCK = 75;

	/**
	 * The number of structural features of the '<em>ISqml Select Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_BLOCK_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_BLOCK_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelectClause <em>ISqml Select Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelectClause
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectClause()
	 * @generated
	 */
	int ISQML_SELECT_CLAUSE = 76;

	/**
	 * The number of structural features of the '<em>ISqml Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_CLAUSE_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_CLAUSE_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelectColumn <em>ISqml Select Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelectColumn
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectColumn()
	 * @generated
	 */
	int ISQML_SELECT_COLUMN = 77;

	/**
	 * The number of structural features of the '<em>ISqml Select Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_COLUMN_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_COLUMN_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelectElse <em>ISqml Select Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElse
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectElse()
	 * @generated
	 */
	int ISQML_SELECT_ELSE = 78;

	/**
	 * The number of structural features of the '<em>ISqml Select Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_ELSE_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_ELSE_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelectElseIf <em>ISqml Select Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElseIf
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectElseIf()
	 * @generated
	 */
	int ISQML_SELECT_ELSE_IF = 79;

	/**
	 * The number of structural features of the '<em>ISqml Select Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_ELSE_IF_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_ELSE_IF_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSelectIf <em>ISqml Select If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSelectIf
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectIf()
	 * @generated
	 */
	int ISQML_SELECT_IF = 80;

	/**
	 * The number of structural features of the '<em>ISqml Select If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_IF_FEATURE_COUNT = ISQML_SELECT_PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Select If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SELECT_IF_OPERATION_COUNT = ISQML_SELECT_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlSubSelectVariable <em>ISqml Sub Select Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlSubSelectVariable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSubSelectVariable()
	 * @generated
	 */
	int ISQML_SUB_SELECT_VARIABLE = 82;

	/**
	 * The number of structural features of the '<em>ISqml Sub Select Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SUB_SELECT_VARIABLE_FEATURE_COUNT = ISQML_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Sub Select Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_SUB_SELECT_VARIABLE_OPERATION_COUNT = ISQML_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlTableVariable <em>ISqml Table Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlTableVariable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableVariable()
	 * @generated
	 */
	int ISQML_TABLE_VARIABLE = 83;

	/**
	 * The number of structural features of the '<em>ISqml Table Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_VARIABLE_FEATURE_COUNT = ISQML_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Table Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_VARIABLE_OPERATION_COUNT = ISQML_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.selects.ISqmlWhereClause <em>ISqml Where Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.selects.ISqmlWhereClause
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlWhereClause()
	 * @generated
	 */
	int ISQML_WHERE_CLAUSE = 85;

	/**
	 * The number of structural features of the '<em>ISqml Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_WHERE_CLAUSE_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_WHERE_CLAUSE_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlDefaultValue <em>ISqml Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlDefaultValue
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlDefaultValue()
	 * @generated
	 */
	int ISQML_DEFAULT_VALUE = 86;

	/**
	 * The number of structural features of the '<em>ISqml Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_DEFAULT_VALUE_FEATURE_COUNT = ISQML_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_DEFAULT_VALUE_OPERATION_COUNT = ISQML_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlTableKey <em>ISqml Table Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlTableKey
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableKey()
	 * @generated
	 */
	int ISQML_TABLE_KEY = 92;

	/**
	 * The number of structural features of the '<em>ISqml Table Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_KEY_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Table Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_KEY_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlIndexKey <em>ISqml Index Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlIndexKey
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIndexKey()
	 * @generated
	 */
	int ISQML_INDEX_KEY = 87;

	/**
	 * The number of structural features of the '<em>ISqml Index Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_INDEX_KEY_FEATURE_COUNT = ISQML_TABLE_KEY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Index Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_INDEX_KEY_OPERATION_COUNT = ISQML_TABLE_KEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue <em>ISqml Literal Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLiteralDefaultValue()
	 * @generated
	 */
	int ISQML_LITERAL_DEFAULT_VALUE = 88;

	/**
	 * The number of structural features of the '<em>ISqml Literal Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LITERAL_DEFAULT_VALUE_FEATURE_COUNT = ISQML_DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Literal Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_LITERAL_DEFAULT_VALUE_OPERATION_COUNT = ISQML_DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue <em>ISqml Row Constructor Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlRowConstructorDefaultValue()
	 * @generated
	 */
	int ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE = 89;

	/**
	 * The number of structural features of the '<em>ISqml Row Constructor Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE_FEATURE_COUNT = ISQML_DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Row Constructor Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE_OPERATION_COUNT = ISQML_DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlTable <em>ISqml Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlTable
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTable()
	 * @generated
	 */
	int ISQML_TABLE = 90;

	/**
	 * The number of structural features of the '<em>ISqml Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_FEATURE_COUNT = ISQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_OPERATION_COUNT = ISQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlTableColumn <em>ISqml Table Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlTableColumn
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableColumn()
	 * @generated
	 */
	int ISQML_TABLE_COLUMN = 91;

	/**
	 * The number of structural features of the '<em>ISqml Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_COLUMN_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Table Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_COLUMN_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlTableRow <em>ISqml Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlTableRow
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableRow()
	 * @generated
	 */
	int ISQML_TABLE_ROW = 93;

	/**
	 * The number of structural features of the '<em>ISqml Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_ROW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlTableRowValue <em>ISqml Table Row Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlTableRowValue
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableRowValue()
	 * @generated
	 */
	int ISQML_TABLE_ROW_VALUE = 94;

	/**
	 * The number of structural features of the '<em>ISqml Table Row Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_ROW_VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Table Row Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TABLE_ROW_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlUniqueKey <em>ISqml Unique Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlUniqueKey
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlUniqueKey()
	 * @generated
	 */
	int ISQML_UNIQUE_KEY = 95;

	/**
	 * The number of structural features of the '<em>ISqml Unique Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_UNIQUE_KEY_FEATURE_COUNT = ISQML_TABLE_KEY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Unique Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_UNIQUE_KEY_OPERATION_COUNT = ISQML_TABLE_KEY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue <em>ISqml Value Reference Default Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValueReferenceDefaultValue()
	 * @generated
	 */
	int ISQML_VALUE_REFERENCE_DEFAULT_VALUE = 96;

	/**
	 * The number of structural features of the '<em>ISqml Value Reference Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_REFERENCE_DEFAULT_VALUE_FEATURE_COUNT = ISQML_DEFAULT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Value Reference Default Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_REFERENCE_DEFAULT_VALUE_OPERATION_COUNT = ISQML_DEFAULT_VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.ISqmlType <em>ISqml Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.ISqmlType
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlType()
	 * @generated
	 */
	int ISQML_TYPE = 100;

	/**
	 * The number of structural features of the '<em>ISqml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.ISqmlTypeDefinition <em>ISqml Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.ISqmlTypeDefinition
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTypeDefinition()
	 * @generated
	 */
	int ISQML_TYPE_DEFINITION = 101;

	/**
	 * The number of structural features of the '<em>ISqml Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TYPE_DEFINITION_FEATURE_COUNT = ISQML_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TYPE_DEFINITION_OPERATION_COUNT = ISQML_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.ISqmlEnum <em>ISqml Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.ISqmlEnum
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlEnum()
	 * @generated
	 */
	int ISQML_ENUM = 97;

	/**
	 * The number of structural features of the '<em>ISqml Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ENUM_FEATURE_COUNT = ISQML_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ENUM_OPERATION_COUNT = ISQML_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.ISqmlEnumerator <em>ISqml Enumerator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.ISqmlEnumerator
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlEnumerator()
	 * @generated
	 */
	int ISQML_ENUMERATOR = 98;

	/**
	 * The number of structural features of the '<em>ISqml Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ENUMERATOR_FEATURE_COUNT = ISQML_VALIDATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Enumerator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ENUMERATOR_OPERATION_COUNT = ISQML_VALIDATABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition <em>ISqml Top Level Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTopLevelTypeDefinition()
	 * @generated
	 */
	int ISQML_TOP_LEVEL_TYPE_DEFINITION = 99;

	/**
	 * The number of structural features of the '<em>ISqml Top Level Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TOP_LEVEL_TYPE_DEFINITION_FEATURE_COUNT = ISQML_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Top Level Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TOP_LEVEL_TYPE_DEFINITION_OPERATION_COUNT = ISQML_TYPE_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.ISqmlTypeReference <em>ISqml Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.ISqmlTypeReference
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTypeReference()
	 * @generated
	 */
	int ISQML_TYPE_REFERENCE = 102;

	/**
	 * The number of structural features of the '<em>ISqml Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TYPE_REFERENCE_FEATURE_COUNT = ISQML_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_TYPE_REFERENCE_OPERATION_COUNT = ISQML_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.types.ISqmlValueType <em>ISqml Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.types.ISqmlValueType
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValueType()
	 * @generated
	 */
	int ISQML_VALUE_TYPE = 103;

	/**
	 * The number of structural features of the '<em>ISqml Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_TYPE_FEATURE_COUNT = ISQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ISqml Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_VALUE_TYPE_OPERATION_COUNT = ISQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.validation.ISqmlIssueAcceptor <em>ISqml Issue Acceptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.validation.ISqmlIssueAcceptor
	 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIssueAcceptor()
	 * @generated
	 */
	int ISQML_ISSUE_ACCEPTOR = 104;

	/**
	 * The number of structural features of the '<em>ISqml Issue Acceptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ISSUE_ACCEPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>ISqml Issue Acceptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISQML_ISSUE_ACCEPTOR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlAnd <em>ISqml And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml And</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlAnd
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlAnd" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlAnd();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlBetween <em>ISqml Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Between</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlBetween
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlBetween" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlBetween();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlComparison <em>ISqml Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Comparison</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlComparison
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlComparison" superTypes="com.softicar.sqml.model.interfaces.ISqmlBinaryOperation com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlComparison();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlCondition <em>ISqml Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Condition</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlCondition
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlCondition" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlCondition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlExists <em>ISqml Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Exists</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlExists
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlExists" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlExists();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlIn <em>ISqml In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml In</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlIn
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlIn" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlIn();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlIsNull <em>ISqml Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Is Null</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlIsNull
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlIsNull" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlIsNull();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlLike <em>ISqml Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Like</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlLike
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlLike" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlLike();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlNot <em>ISqml Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Not</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlNot
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlNot" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlNot();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlOr <em>ISqml Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Or</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlOr
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlOr" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlOr();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.conditions.ISqmlRegexp <em>ISqml Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Regexp</em>'.
	 * @see com.softicar.sqml.model.conditions.ISqmlRegexp
	 * @model instanceClass="com.softicar.sqml.model.conditions.ISqmlRegexp" superTypes="com.softicar.sqml.model.interfaces.ISqmlCondition"
	 * @generated
	 */
	EClass getISqmlRegexp();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlAddition <em>ISqml Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Addition</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlAddition
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlAddition" superTypes="com.softicar.sqml.model.interfaces.ISqmlBinaryOperation"
	 * @generated
	 */
	EClass getISqmlAddition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlCase <em>ISqml Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Case</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlCase
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlCase" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlCase();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlCaseWhen <em>ISqml Case When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Case When</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlCaseWhen
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlCaseWhen" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlCaseWhen();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlBinaryOperation <em>ISqml Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Binary Operation</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlBinaryOperation
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlBinaryOperation" superTypes="com.softicar.sqml.model.interfaces.ISqmlFunctionCall"
	 * @generated
	 */
	EClass getISqmlBinaryOperation();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlExpression <em>ISqml Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlExpression
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlExpression" superTypes="com.softicar.sqml.model.interfaces.ISqmlValue com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlGroupConcat <em>ISqml Group Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Group Concat</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlGroupConcat
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlGroupConcat" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlGroupConcat();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlIf <em>ISqml If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml If</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlIf
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlIf" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlIf();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlIfNull <em>ISqml If Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml If Null</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlIfNull
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlIfNull" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlIfNull();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlMultiplication <em>ISqml Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Multiplication</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlMultiplication
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlMultiplication" superTypes="com.softicar.sqml.model.interfaces.ISqmlBinaryOperation"
	 * @generated
	 */
	EClass getISqmlMultiplication();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlNegation <em>ISqml Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Negation</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlNegation
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlNegation" superTypes="com.softicar.sqml.model.interfaces.ISqmlUnaryOperation"
	 * @generated
	 */
	EClass getISqmlNegation();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlPath <em>ISqml Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Path</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlPath
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlPath" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlPath();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlRowConstructor <em>ISqml Row Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Row Constructor</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlRowConstructor
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlRowConstructor" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlRowConstructor();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticAnd <em>ISqml Static And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static And</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticAnd
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticAnd" superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticExpression"
	 * @generated
	 */
	EClass getISqmlStaticAnd();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticExpression <em>ISqml Static Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Expression</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticExpression
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticExpression"
	 * @generated
	 */
	EClass getISqmlStaticExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIf <em>ISqml Static If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static If</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIf
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticIf" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlStaticIf();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty <em>ISqml Static Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Is Empty</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty" superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticParameterTest"
	 * @generated
	 */
	EClass getISqmlStaticIsEmpty();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsNull <em>ISqml Static Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Is Null</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsNull
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticIsNull" superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticParameterTest"
	 * @generated
	 */
	EClass getISqmlStaticIsNull();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsTrue <em>ISqml Static Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Is True</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsTrue
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticIsTrue" superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticParameterTest"
	 * @generated
	 */
	EClass getISqmlStaticIsTrue();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticOr <em>ISqml Static Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Or</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticOr
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticOr" superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticExpression"
	 * @generated
	 */
	EClass getISqmlStaticOr();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticParameterTest <em>ISqml Static Parameter Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Parameter Test</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParameterTest
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticParameterTest" superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticExpression"
	 * @generated
	 */
	EClass getISqmlStaticParameterTest();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticParentheses <em>ISqml Static Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Parentheses</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParentheses
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticParentheses" superTypes="com.softicar.sqml.model.interfaces.ISqmlStaticExpression"
	 * @generated
	 */
	EClass getISqmlStaticParentheses();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlStaticVariableReference <em>ISqml Static Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Variable Reference</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticVariableReference
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlStaticVariableReference" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression com.softicar.sqml.model.interfaces.ISqmlStaticExpression"
	 * @generated
	 */
	EClass getISqmlStaticVariableReference();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlSubSelect <em>ISqml Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sub Select</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlSubSelect
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlSubSelect" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlSubSelect();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlUnaryOperation <em>ISqml Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Unary Operation</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlUnaryOperation
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlUnaryOperation" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlUnaryOperation();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.expressions.ISqmlValueReference <em>ISqml Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Value Reference</em>'.
	 * @see com.softicar.sqml.model.expressions.ISqmlValueReference
	 * @model instanceClass="com.softicar.sqml.model.expressions.ISqmlValueReference" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlValueReference();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.ISqmlFile <em>ISqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml File</em>'.
	 * @see com.softicar.sqml.model.files.ISqmlFile
	 * @model instanceClass="com.softicar.sqml.model.files.ISqmlFile" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable"
	 * @generated
	 */
	EClass getISqmlFile();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.ISqmlFileElement <em>ISqml File Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml File Element</em>'.
	 * @see com.softicar.sqml.model.files.ISqmlFileElement
	 * @model instanceClass="com.softicar.sqml.model.files.ISqmlFileElement" superTypes="com.softicar.sqml.model.interfaces.ISqmlGlobalObject"
	 * @generated
	 */
	EClass getISqmlFileElement();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.ISqmlImport <em>ISqml Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Import</em>'.
	 * @see com.softicar.sqml.model.files.ISqmlImport
	 * @model instanceClass="com.softicar.sqml.model.files.ISqmlImport" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlImport();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.files.ISqmlPackageDeclaration <em>ISqml Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Package Declaration</em>'.
	 * @see com.softicar.sqml.model.files.ISqmlPackageDeclaration
	 * @model instanceClass="com.softicar.sqml.model.files.ISqmlPackageDeclaration"
	 * @generated
	 */
	EClass getISqmlPackageDeclaration();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlFunction <em>ISqml Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Function</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlFunction
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlFunction" superTypes="com.softicar.sqml.model.interfaces.ISqmlFileElement com.softicar.sqml.model.interfaces.ISqmlGeneratable com.softicar.sqml.model.interfaces.ISqmlModelElement com.softicar.sqml.model.interfaces.ISqmlValidatable"
	 * @generated
	 */
	EClass getISqmlFunction();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlFunctionCall <em>ISqml Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Function Call</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionCall
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlFunctionCall" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlFunctionCall();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlFunctionParameter <em>ISqml Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Function Parameter</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionParameter
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlFunctionParameter" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlStaticVariable"
	 * @generated
	 */
	EClass getISqmlFunctionParameter();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlSql <em>ISqml Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sql</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlSql
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlSql"
	 * @generated
	 */
	EClass getISqmlSql();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlSqlId <em>ISqml Sql Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sql Id</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlId
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlSqlId" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlSqlId();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlSqlKeyword <em>ISqml Sql Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sql Keyword</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlKeyword
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlSqlKeyword" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlSqlKeyword();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral <em>ISqml Sql Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sql Number Literal</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlSqlNumberLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlSqlStringLiteral <em>ISqml Sql String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sql String Literal</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlStringLiteral
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlSqlStringLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlSqlStringLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.ISqmlSqlSymbol <em>ISqml Sql Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sql Symbol</em>'.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlSymbol
	 * @model instanceClass="com.softicar.sqml.model.functions.ISqmlSqlSymbol" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlSqlSymbol();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlBooleanLiteral <em>ISqml Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Boolean Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlBooleanLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlBooleanLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteral"
	 * @generated
	 */
	EClass getISqmlBooleanLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlDecimalLiteral <em>ISqml Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Decimal Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlDecimalLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlDecimalLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteral"
	 * @generated
	 */
	EClass getISqmlDecimalLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlDoubleLiteral <em>ISqml Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Double Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlDoubleLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlDoubleLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteral"
	 * @generated
	 */
	EClass getISqmlDoubleLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlFloatLiteral <em>ISqml Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Float Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlFloatLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlFloatLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteral"
	 * @generated
	 */
	EClass getISqmlFloatLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlIntegerLiteral <em>ISqml Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Integer Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlIntegerLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlIntegerLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteral"
	 * @generated
	 */
	EClass getISqmlIntegerLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlLiteral <em>ISqml Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlLiteral&lt;?&gt;" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlLongLiteral <em>ISqml Long Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Long Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlLongLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlLongLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteral"
	 * @generated
	 */
	EClass getISqmlLongLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.literals.ISqmlStringLiteral <em>ISqml String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml String Literal</em>'.
	 * @see com.softicar.sqml.model.literals.ISqmlStringLiteral
	 * @model instanceClass="com.softicar.sqml.model.literals.ISqmlStringLiteral" superTypes="com.softicar.sqml.model.interfaces.ISqmlLiteral"
	 * @generated
	 */
	EClass getISqmlStringLiteral();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlColumn <em>ISqml Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Column</em>'.
	 * @see com.softicar.sqml.model.ISqmlColumn
	 * @model instanceClass="com.softicar.sqml.model.ISqmlColumn" superTypes="com.softicar.sqml.model.interfaces.ISqmlValue com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlColumn();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlGeneratable <em>ISqml Generatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Generatable</em>'.
	 * @see com.softicar.sqml.model.ISqmlGeneratable
	 * @model instanceClass="com.softicar.sqml.model.ISqmlGeneratable"
	 * @generated
	 */
	EClass getISqmlGeneratable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlGlobalObject <em>ISqml Global Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Global Object</em>'.
	 * @see com.softicar.sqml.model.ISqmlGlobalObject
	 * @model instanceClass="com.softicar.sqml.model.ISqmlGlobalObject"
	 * @generated
	 */
	EClass getISqmlGlobalObject();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlModelElement <em>ISqml Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Model Element</em>'.
	 * @see com.softicar.sqml.model.ISqmlModelElement
	 * @model instanceClass="com.softicar.sqml.model.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlModelElement();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlModelVisitor <em>ISqml Model Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Model Visitor</em>'.
	 * @see com.softicar.sqml.model.ISqmlModelVisitor
	 * @model instanceClass="com.softicar.sqml.model.ISqmlModelVisitor"
	 * @generated
	 */
	EClass getISqmlModelVisitor();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlStaticVariable <em>ISqml Static Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Static Variable</em>'.
	 * @see com.softicar.sqml.model.ISqmlStaticVariable
	 * @model instanceClass="com.softicar.sqml.model.ISqmlStaticVariable"
	 * @generated
	 */
	EClass getISqmlStaticVariable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlTabular <em>ISqml Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Tabular</em>'.
	 * @see com.softicar.sqml.model.ISqmlTabular
	 * @model instanceClass="com.softicar.sqml.model.ISqmlTabular"
	 * @generated
	 */
	EClass getISqmlTabular();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.ISqmlValue <em>ISqml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Value</em>'.
	 * @see com.softicar.sqml.model.ISqmlValue
	 * @model instanceClass="com.softicar.sqml.model.ISqmlValue"
	 * @generated
	 */
	EClass getISqmlValue();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.queries.ISqmlQuery <em>ISqml Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Query</em>'.
	 * @see com.softicar.sqml.model.queries.ISqmlQuery
	 * @model instanceClass="com.softicar.sqml.model.queries.ISqmlQuery" superTypes="com.softicar.sqml.model.interfaces.ISqmlFileElement com.softicar.sqml.model.interfaces.ISqmlValidatable"
	 * @generated
	 */
	EClass getISqmlQuery();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.queries.ISqmlQueryParameter <em>ISqml Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Query Parameter</em>'.
	 * @see com.softicar.sqml.model.queries.ISqmlQueryParameter
	 * @model instanceClass="com.softicar.sqml.model.queries.ISqmlQueryParameter" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlStaticVariable"
	 * @generated
	 */
	EClass getISqmlQueryParameter();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlForeignKeyVariable <em>ISqml Foreign Key Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Foreign Key Variable</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlForeignKeyVariable
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlForeignKeyVariable" superTypes="com.softicar.sqml.model.interfaces.ISqmlVariable"
	 * @generated
	 */
	EClass getISqmlForeignKeyVariable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlFromClause <em>ISqml From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml From Clause</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlFromClause
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlFromClause" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlFromClause();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlGroupByClause <em>ISqml Group By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Group By Clause</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlGroupByClause
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlGroupByClause" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlGroupByClause();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlHavingClause <em>ISqml Having Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Having Clause</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlHavingClause
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlHavingClause" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlHavingClause();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlJoinClause <em>ISqml Join Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Join Clause</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlJoinClause
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlJoinClause" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlJoinClause();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlOrderByClause <em>ISqml Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Order By Clause</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByClause
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlOrderByClause" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlOrderByClause();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlOrderByExpression <em>ISqml Order By Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Order By Expression</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByExpression
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlOrderByExpression" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlOrderByExpression();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelect <em>ISqml Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelect
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelect" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression com.softicar.sqml.model.interfaces.ISqmlTabular com.softicar.sqml.model.interfaces.ISqmlSelectPart com.softicar.sqml.model.interfaces.ISqmlValidatable"
	 * @generated
	 */
	EClass getISqmlSelect();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelectBlock <em>ISqml Select Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select Block</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectBlock
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelectBlock" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlSelectBlock();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelectClause <em>ISqml Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select Clause</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectClause
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelectClause" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlSelectClause();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelectColumn <em>ISqml Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select Column</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectColumn
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelectColumn" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlColumn"
	 * @generated
	 */
	EClass getISqmlSelectColumn();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelectElse <em>ISqml Select Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select Else</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElse
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelectElse" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlSelectElse();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelectElseIf <em>ISqml Select Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select Else If</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElseIf
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelectElseIf" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlSelectElseIf();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelectIf <em>ISqml Select If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select If</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectIf
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelectIf" superTypes="com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlSelectIf();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSelectPart <em>ISqml Select Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Select Part</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectPart
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSelectPart" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlSelectPart();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlSubSelectVariable <em>ISqml Sub Select Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Sub Select Variable</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlSubSelectVariable
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlSubSelectVariable" superTypes="com.softicar.sqml.model.interfaces.ISqmlVariable"
	 * @generated
	 */
	EClass getISqmlSubSelectVariable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlTableVariable <em>ISqml Table Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Table Variable</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlTableVariable
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlTableVariable" superTypes="com.softicar.sqml.model.interfaces.ISqmlVariable"
	 * @generated
	 */
	EClass getISqmlTableVariable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlVariable <em>ISqml Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Variable</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlVariable
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlVariable" superTypes="com.softicar.sqml.model.interfaces.ISqmlGeneratable com.softicar.sqml.model.interfaces.ISqmlValue com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlVariable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.selects.ISqmlWhereClause <em>ISqml Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Where Clause</em>'.
	 * @see com.softicar.sqml.model.selects.ISqmlWhereClause
	 * @model instanceClass="com.softicar.sqml.model.selects.ISqmlWhereClause" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlSelectPart"
	 * @generated
	 */
	EClass getISqmlWhereClause();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlDefaultValue <em>ISqml Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlDefaultValue
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlDefaultValue" superTypes="com.softicar.sqml.model.interfaces.ISqmlExpression"
	 * @generated
	 */
	EClass getISqmlDefaultValue();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlIndexKey <em>ISqml Index Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Index Key</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlIndexKey
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlIndexKey" superTypes="com.softicar.sqml.model.interfaces.ISqmlTableKey"
	 * @generated
	 */
	EClass getISqmlIndexKey();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue <em>ISqml Literal Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Literal Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue" superTypes="com.softicar.sqml.model.interfaces.ISqmlDefaultValue"
	 * @generated
	 */
	EClass getISqmlLiteralDefaultValue();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue <em>ISqml Row Constructor Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Row Constructor Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue" superTypes="com.softicar.sqml.model.interfaces.ISqmlDefaultValue"
	 * @generated
	 */
	EClass getISqmlRowConstructorDefaultValue();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlTable <em>ISqml Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Table</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlTable
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlTable" superTypes="com.softicar.sqml.model.interfaces.ISqmlFileElement com.softicar.sqml.model.interfaces.ISqmlTabular com.softicar.sqml.model.interfaces.ISqmlTypeDefinition"
	 * @generated
	 */
	EClass getISqmlTable();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlTableColumn <em>ISqml Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Table Column</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlTableColumn
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlTableColumn" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlColumn"
	 * @generated
	 */
	EClass getISqmlTableColumn();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlTableKey <em>ISqml Table Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Table Key</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlTableKey
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlTableKey" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlTableKey();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlTableRow <em>ISqml Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Table Row</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlTableRow
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlTableRow"
	 * @generated
	 */
	EClass getISqmlTableRow();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlTableRowValue <em>ISqml Table Row Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Table Row Value</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlTableRowValue
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlTableRowValue"
	 * @generated
	 */
	EClass getISqmlTableRowValue();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlUniqueKey <em>ISqml Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Unique Key</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlUniqueKey
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlUniqueKey" superTypes="com.softicar.sqml.model.interfaces.ISqmlTableKey"
	 * @generated
	 */
	EClass getISqmlUniqueKey();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue <em>ISqml Value Reference Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Value Reference Default Value</em>'.
	 * @see com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue
	 * @model instanceClass="com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue" superTypes="com.softicar.sqml.model.interfaces.ISqmlDefaultValue"
	 * @generated
	 */
	EClass getISqmlValueReferenceDefaultValue();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.ISqmlEnum <em>ISqml Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Enum</em>'.
	 * @see com.softicar.sqml.model.types.ISqmlEnum
	 * @model instanceClass="com.softicar.sqml.model.types.ISqmlEnum" superTypes="com.softicar.sqml.model.interfaces.ISqmlTypeDefinition com.softicar.sqml.model.interfaces.ISqmlGlobalObject"
	 * @generated
	 */
	EClass getISqmlEnum();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.ISqmlEnumerator <em>ISqml Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Enumerator</em>'.
	 * @see com.softicar.sqml.model.types.ISqmlEnumerator
	 * @model instanceClass="com.softicar.sqml.model.types.ISqmlEnumerator" superTypes="com.softicar.sqml.model.interfaces.ISqmlValidatable com.softicar.sqml.model.interfaces.ISqmlValue com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlEnumerator();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition <em>ISqml Top Level Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Top Level Type Definition</em>'.
	 * @see com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition
	 * @model instanceClass="com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition" superTypes="com.softicar.sqml.model.interfaces.ISqmlTypeDefinition com.softicar.sqml.model.interfaces.ISqmlFileElement"
	 * @generated
	 */
	EClass getISqmlTopLevelTypeDefinition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.ISqmlType <em>ISqml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Type</em>'.
	 * @see com.softicar.sqml.model.types.ISqmlType
	 * @model instanceClass="com.softicar.sqml.model.types.ISqmlType"
	 * @generated
	 */
	EClass getISqmlType();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.ISqmlTypeDefinition <em>ISqml Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Type Definition</em>'.
	 * @see com.softicar.sqml.model.types.ISqmlTypeDefinition
	 * @model instanceClass="com.softicar.sqml.model.types.ISqmlTypeDefinition" superTypes="com.softicar.sqml.model.interfaces.ISqmlType com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlTypeDefinition();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.ISqmlTypeReference <em>ISqml Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Type Reference</em>'.
	 * @see com.softicar.sqml.model.types.ISqmlTypeReference
	 * @model instanceClass="com.softicar.sqml.model.types.ISqmlTypeReference" superTypes="com.softicar.sqml.model.interfaces.ISqmlModelElement"
	 * @generated
	 */
	EClass getISqmlTypeReference();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.types.ISqmlValueType <em>ISqml Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Value Type</em>'.
	 * @see com.softicar.sqml.model.types.ISqmlValueType
	 * @model instanceClass="com.softicar.sqml.model.types.ISqmlValueType" superTypes="com.softicar.sqml.model.interfaces.ISqmlFileElement com.softicar.sqml.model.interfaces.ISqmlTypeDefinition"
	 * @generated
	 */
	EClass getISqmlValueType();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.validation.ISqmlIssueAcceptor <em>ISqml Issue Acceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Issue Acceptor</em>'.
	 * @see com.softicar.sqml.model.validation.ISqmlIssueAcceptor
	 * @model instanceClass="com.softicar.sqml.model.validation.ISqmlIssueAcceptor"
	 * @generated
	 */
	EClass getISqmlIssueAcceptor();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.validation.ISqmlValidatable <em>ISqml Validatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISqml Validatable</em>'.
	 * @see com.softicar.sqml.model.validation.ISqmlValidatable
	 * @model instanceClass="com.softicar.sqml.model.validation.ISqmlValidatable"
	 * @generated
	 */
	EClass getISqmlValidatable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfacesFactory getInterfacesFactory();

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
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlAnd <em>ISqml And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlAnd
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlAnd()
		 * @generated
		 */
		EClass ISQML_AND = eINSTANCE.getISqmlAnd();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlBetween <em>ISqml Between</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlBetween
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlBetween()
		 * @generated
		 */
		EClass ISQML_BETWEEN = eINSTANCE.getISqmlBetween();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlComparison <em>ISqml Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlComparison
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlComparison()
		 * @generated
		 */
		EClass ISQML_COMPARISON = eINSTANCE.getISqmlComparison();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlCondition <em>ISqml Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlCondition
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlCondition()
		 * @generated
		 */
		EClass ISQML_CONDITION = eINSTANCE.getISqmlCondition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlExists <em>ISqml Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlExists
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlExists()
		 * @generated
		 */
		EClass ISQML_EXISTS = eINSTANCE.getISqmlExists();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlIn <em>ISqml In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlIn
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIn()
		 * @generated
		 */
		EClass ISQML_IN = eINSTANCE.getISqmlIn();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlIsNull <em>ISqml Is Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlIsNull
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIsNull()
		 * @generated
		 */
		EClass ISQML_IS_NULL = eINSTANCE.getISqmlIsNull();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlLike <em>ISqml Like</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlLike
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLike()
		 * @generated
		 */
		EClass ISQML_LIKE = eINSTANCE.getISqmlLike();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlNot <em>ISqml Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlNot
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlNot()
		 * @generated
		 */
		EClass ISQML_NOT = eINSTANCE.getISqmlNot();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlOr <em>ISqml Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlOr
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlOr()
		 * @generated
		 */
		EClass ISQML_OR = eINSTANCE.getISqmlOr();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.conditions.ISqmlRegexp <em>ISqml Regexp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.conditions.ISqmlRegexp
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlRegexp()
		 * @generated
		 */
		EClass ISQML_REGEXP = eINSTANCE.getISqmlRegexp();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlAddition <em>ISqml Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlAddition
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlAddition()
		 * @generated
		 */
		EClass ISQML_ADDITION = eINSTANCE.getISqmlAddition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlCase <em>ISqml Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlCase
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlCase()
		 * @generated
		 */
		EClass ISQML_CASE = eINSTANCE.getISqmlCase();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlCaseWhen <em>ISqml Case When</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlCaseWhen
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlCaseWhen()
		 * @generated
		 */
		EClass ISQML_CASE_WHEN = eINSTANCE.getISqmlCaseWhen();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlBinaryOperation <em>ISqml Binary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlBinaryOperation
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlBinaryOperation()
		 * @generated
		 */
		EClass ISQML_BINARY_OPERATION = eINSTANCE.getISqmlBinaryOperation();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlExpression <em>ISqml Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlExpression
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlExpression()
		 * @generated
		 */
		EClass ISQML_EXPRESSION = eINSTANCE.getISqmlExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlGroupConcat <em>ISqml Group Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlGroupConcat
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGroupConcat()
		 * @generated
		 */
		EClass ISQML_GROUP_CONCAT = eINSTANCE.getISqmlGroupConcat();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlIf <em>ISqml If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlIf
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIf()
		 * @generated
		 */
		EClass ISQML_IF = eINSTANCE.getISqmlIf();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlIfNull <em>ISqml If Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlIfNull
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIfNull()
		 * @generated
		 */
		EClass ISQML_IF_NULL = eINSTANCE.getISqmlIfNull();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlMultiplication <em>ISqml Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlMultiplication
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlMultiplication()
		 * @generated
		 */
		EClass ISQML_MULTIPLICATION = eINSTANCE.getISqmlMultiplication();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlNegation <em>ISqml Negation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlNegation
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlNegation()
		 * @generated
		 */
		EClass ISQML_NEGATION = eINSTANCE.getISqmlNegation();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlPath <em>ISqml Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlPath
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlPath()
		 * @generated
		 */
		EClass ISQML_PATH = eINSTANCE.getISqmlPath();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlRowConstructor <em>ISqml Row Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlRowConstructor
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlRowConstructor()
		 * @generated
		 */
		EClass ISQML_ROW_CONSTRUCTOR = eINSTANCE.getISqmlRowConstructor();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticAnd <em>ISqml Static And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticAnd
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticAnd()
		 * @generated
		 */
		EClass ISQML_STATIC_AND = eINSTANCE.getISqmlStaticAnd();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticExpression <em>ISqml Static Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticExpression
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticExpression()
		 * @generated
		 */
		EClass ISQML_STATIC_EXPRESSION = eINSTANCE.getISqmlStaticExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIf <em>ISqml Static If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticIf
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIf()
		 * @generated
		 */
		EClass ISQML_STATIC_IF = eINSTANCE.getISqmlStaticIf();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty <em>ISqml Static Is Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIsEmpty()
		 * @generated
		 */
		EClass ISQML_STATIC_IS_EMPTY = eINSTANCE.getISqmlStaticIsEmpty();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsNull <em>ISqml Static Is Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsNull
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIsNull()
		 * @generated
		 */
		EClass ISQML_STATIC_IS_NULL = eINSTANCE.getISqmlStaticIsNull();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsTrue <em>ISqml Static Is True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsTrue
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticIsTrue()
		 * @generated
		 */
		EClass ISQML_STATIC_IS_TRUE = eINSTANCE.getISqmlStaticIsTrue();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticOr <em>ISqml Static Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticOr
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticOr()
		 * @generated
		 */
		EClass ISQML_STATIC_OR = eINSTANCE.getISqmlStaticOr();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticParameterTest <em>ISqml Static Parameter Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticParameterTest
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticParameterTest()
		 * @generated
		 */
		EClass ISQML_STATIC_PARAMETER_TEST = eINSTANCE.getISqmlStaticParameterTest();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticParentheses <em>ISqml Static Parentheses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticParentheses
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticParentheses()
		 * @generated
		 */
		EClass ISQML_STATIC_PARENTHESES = eINSTANCE.getISqmlStaticParentheses();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlStaticVariableReference <em>ISqml Static Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlStaticVariableReference
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticVariableReference()
		 * @generated
		 */
		EClass ISQML_STATIC_VARIABLE_REFERENCE = eINSTANCE.getISqmlStaticVariableReference();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlSubSelect <em>ISqml Sub Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlSubSelect
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSubSelect()
		 * @generated
		 */
		EClass ISQML_SUB_SELECT = eINSTANCE.getISqmlSubSelect();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlUnaryOperation <em>ISqml Unary Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlUnaryOperation
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlUnaryOperation()
		 * @generated
		 */
		EClass ISQML_UNARY_OPERATION = eINSTANCE.getISqmlUnaryOperation();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.expressions.ISqmlValueReference <em>ISqml Value Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.expressions.ISqmlValueReference
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValueReference()
		 * @generated
		 */
		EClass ISQML_VALUE_REFERENCE = eINSTANCE.getISqmlValueReference();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.ISqmlFile <em>ISqml File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.ISqmlFile
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFile()
		 * @generated
		 */
		EClass ISQML_FILE = eINSTANCE.getISqmlFile();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.ISqmlFileElement <em>ISqml File Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.ISqmlFileElement
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFileElement()
		 * @generated
		 */
		EClass ISQML_FILE_ELEMENT = eINSTANCE.getISqmlFileElement();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.ISqmlImport <em>ISqml Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.ISqmlImport
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlImport()
		 * @generated
		 */
		EClass ISQML_IMPORT = eINSTANCE.getISqmlImport();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.files.ISqmlPackageDeclaration <em>ISqml Package Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.files.ISqmlPackageDeclaration
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlPackageDeclaration()
		 * @generated
		 */
		EClass ISQML_PACKAGE_DECLARATION = eINSTANCE.getISqmlPackageDeclaration();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlFunction <em>ISqml Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlFunction
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFunction()
		 * @generated
		 */
		EClass ISQML_FUNCTION = eINSTANCE.getISqmlFunction();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlFunctionCall <em>ISqml Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlFunctionCall
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFunctionCall()
		 * @generated
		 */
		EClass ISQML_FUNCTION_CALL = eINSTANCE.getISqmlFunctionCall();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlFunctionParameter <em>ISqml Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlFunctionParameter
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFunctionParameter()
		 * @generated
		 */
		EClass ISQML_FUNCTION_PARAMETER = eINSTANCE.getISqmlFunctionParameter();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlSql <em>ISqml Sql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlSql
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSql()
		 * @generated
		 */
		EClass ISQML_SQL = eINSTANCE.getISqmlSql();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlSqlId <em>ISqml Sql Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlSqlId
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlId()
		 * @generated
		 */
		EClass ISQML_SQL_ID = eINSTANCE.getISqmlSqlId();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlSqlKeyword <em>ISqml Sql Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlSqlKeyword
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlKeyword()
		 * @generated
		 */
		EClass ISQML_SQL_KEYWORD = eINSTANCE.getISqmlSqlKeyword();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral <em>ISqml Sql Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlNumberLiteral()
		 * @generated
		 */
		EClass ISQML_SQL_NUMBER_LITERAL = eINSTANCE.getISqmlSqlNumberLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlSqlStringLiteral <em>ISqml Sql String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlSqlStringLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlStringLiteral()
		 * @generated
		 */
		EClass ISQML_SQL_STRING_LITERAL = eINSTANCE.getISqmlSqlStringLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.ISqmlSqlSymbol <em>ISqml Sql Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.ISqmlSqlSymbol
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSqlSymbol()
		 * @generated
		 */
		EClass ISQML_SQL_SYMBOL = eINSTANCE.getISqmlSqlSymbol();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlBooleanLiteral <em>ISqml Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlBooleanLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlBooleanLiteral()
		 * @generated
		 */
		EClass ISQML_BOOLEAN_LITERAL = eINSTANCE.getISqmlBooleanLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlDecimalLiteral <em>ISqml Decimal Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlDecimalLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlDecimalLiteral()
		 * @generated
		 */
		EClass ISQML_DECIMAL_LITERAL = eINSTANCE.getISqmlDecimalLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlDoubleLiteral <em>ISqml Double Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlDoubleLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlDoubleLiteral()
		 * @generated
		 */
		EClass ISQML_DOUBLE_LITERAL = eINSTANCE.getISqmlDoubleLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlFloatLiteral <em>ISqml Float Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlFloatLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFloatLiteral()
		 * @generated
		 */
		EClass ISQML_FLOAT_LITERAL = eINSTANCE.getISqmlFloatLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlIntegerLiteral <em>ISqml Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlIntegerLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIntegerLiteral()
		 * @generated
		 */
		EClass ISQML_INTEGER_LITERAL = eINSTANCE.getISqmlIntegerLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlLiteral <em>ISqml Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLiteral()
		 * @generated
		 */
		EClass ISQML_LITERAL = eINSTANCE.getISqmlLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlLongLiteral <em>ISqml Long Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlLongLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLongLiteral()
		 * @generated
		 */
		EClass ISQML_LONG_LITERAL = eINSTANCE.getISqmlLongLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.literals.ISqmlStringLiteral <em>ISqml String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.literals.ISqmlStringLiteral
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStringLiteral()
		 * @generated
		 */
		EClass ISQML_STRING_LITERAL = eINSTANCE.getISqmlStringLiteral();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlColumn <em>ISqml Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlColumn
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlColumn()
		 * @generated
		 */
		EClass ISQML_COLUMN = eINSTANCE.getISqmlColumn();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlGeneratable <em>ISqml Generatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlGeneratable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGeneratable()
		 * @generated
		 */
		EClass ISQML_GENERATABLE = eINSTANCE.getISqmlGeneratable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlGlobalObject <em>ISqml Global Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlGlobalObject
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGlobalObject()
		 * @generated
		 */
		EClass ISQML_GLOBAL_OBJECT = eINSTANCE.getISqmlGlobalObject();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlModelElement <em>ISqml Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlModelElement
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlModelElement()
		 * @generated
		 */
		EClass ISQML_MODEL_ELEMENT = eINSTANCE.getISqmlModelElement();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlModelVisitor <em>ISqml Model Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlModelVisitor
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlModelVisitor()
		 * @generated
		 */
		EClass ISQML_MODEL_VISITOR = eINSTANCE.getISqmlModelVisitor();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlStaticVariable <em>ISqml Static Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlStaticVariable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlStaticVariable()
		 * @generated
		 */
		EClass ISQML_STATIC_VARIABLE = eINSTANCE.getISqmlStaticVariable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlTabular <em>ISqml Tabular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlTabular
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTabular()
		 * @generated
		 */
		EClass ISQML_TABULAR = eINSTANCE.getISqmlTabular();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.ISqmlValue <em>ISqml Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.ISqmlValue
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValue()
		 * @generated
		 */
		EClass ISQML_VALUE = eINSTANCE.getISqmlValue();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.queries.ISqmlQuery <em>ISqml Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.queries.ISqmlQuery
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlQuery()
		 * @generated
		 */
		EClass ISQML_QUERY = eINSTANCE.getISqmlQuery();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.queries.ISqmlQueryParameter <em>ISqml Query Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.queries.ISqmlQueryParameter
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlQueryParameter()
		 * @generated
		 */
		EClass ISQML_QUERY_PARAMETER = eINSTANCE.getISqmlQueryParameter();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlForeignKeyVariable <em>ISqml Foreign Key Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlForeignKeyVariable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlForeignKeyVariable()
		 * @generated
		 */
		EClass ISQML_FOREIGN_KEY_VARIABLE = eINSTANCE.getISqmlForeignKeyVariable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlFromClause <em>ISqml From Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlFromClause
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlFromClause()
		 * @generated
		 */
		EClass ISQML_FROM_CLAUSE = eINSTANCE.getISqmlFromClause();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlGroupByClause <em>ISqml Group By Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlGroupByClause
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlGroupByClause()
		 * @generated
		 */
		EClass ISQML_GROUP_BY_CLAUSE = eINSTANCE.getISqmlGroupByClause();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlHavingClause <em>ISqml Having Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlHavingClause
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlHavingClause()
		 * @generated
		 */
		EClass ISQML_HAVING_CLAUSE = eINSTANCE.getISqmlHavingClause();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlJoinClause <em>ISqml Join Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlJoinClause
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlJoinClause()
		 * @generated
		 */
		EClass ISQML_JOIN_CLAUSE = eINSTANCE.getISqmlJoinClause();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlOrderByClause <em>ISqml Order By Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlOrderByClause
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlOrderByClause()
		 * @generated
		 */
		EClass ISQML_ORDER_BY_CLAUSE = eINSTANCE.getISqmlOrderByClause();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlOrderByExpression <em>ISqml Order By Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlOrderByExpression
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlOrderByExpression()
		 * @generated
		 */
		EClass ISQML_ORDER_BY_EXPRESSION = eINSTANCE.getISqmlOrderByExpression();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelect <em>ISqml Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelect
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelect()
		 * @generated
		 */
		EClass ISQML_SELECT = eINSTANCE.getISqmlSelect();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelectBlock <em>ISqml Select Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelectBlock
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectBlock()
		 * @generated
		 */
		EClass ISQML_SELECT_BLOCK = eINSTANCE.getISqmlSelectBlock();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelectClause <em>ISqml Select Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelectClause
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectClause()
		 * @generated
		 */
		EClass ISQML_SELECT_CLAUSE = eINSTANCE.getISqmlSelectClause();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelectColumn <em>ISqml Select Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelectColumn
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectColumn()
		 * @generated
		 */
		EClass ISQML_SELECT_COLUMN = eINSTANCE.getISqmlSelectColumn();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelectElse <em>ISqml Select Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelectElse
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectElse()
		 * @generated
		 */
		EClass ISQML_SELECT_ELSE = eINSTANCE.getISqmlSelectElse();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelectElseIf <em>ISqml Select Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelectElseIf
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectElseIf()
		 * @generated
		 */
		EClass ISQML_SELECT_ELSE_IF = eINSTANCE.getISqmlSelectElseIf();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelectIf <em>ISqml Select If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelectIf
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectIf()
		 * @generated
		 */
		EClass ISQML_SELECT_IF = eINSTANCE.getISqmlSelectIf();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSelectPart <em>ISqml Select Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSelectPart
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSelectPart()
		 * @generated
		 */
		EClass ISQML_SELECT_PART = eINSTANCE.getISqmlSelectPart();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlSubSelectVariable <em>ISqml Sub Select Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlSubSelectVariable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlSubSelectVariable()
		 * @generated
		 */
		EClass ISQML_SUB_SELECT_VARIABLE = eINSTANCE.getISqmlSubSelectVariable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlTableVariable <em>ISqml Table Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlTableVariable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableVariable()
		 * @generated
		 */
		EClass ISQML_TABLE_VARIABLE = eINSTANCE.getISqmlTableVariable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlVariable <em>ISqml Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlVariable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlVariable()
		 * @generated
		 */
		EClass ISQML_VARIABLE = eINSTANCE.getISqmlVariable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.selects.ISqmlWhereClause <em>ISqml Where Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.selects.ISqmlWhereClause
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlWhereClause()
		 * @generated
		 */
		EClass ISQML_WHERE_CLAUSE = eINSTANCE.getISqmlWhereClause();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlDefaultValue <em>ISqml Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlDefaultValue
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlDefaultValue()
		 * @generated
		 */
		EClass ISQML_DEFAULT_VALUE = eINSTANCE.getISqmlDefaultValue();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlIndexKey <em>ISqml Index Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlIndexKey
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIndexKey()
		 * @generated
		 */
		EClass ISQML_INDEX_KEY = eINSTANCE.getISqmlIndexKey();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue <em>ISqml Literal Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlLiteralDefaultValue()
		 * @generated
		 */
		EClass ISQML_LITERAL_DEFAULT_VALUE = eINSTANCE.getISqmlLiteralDefaultValue();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue <em>ISqml Row Constructor Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlRowConstructorDefaultValue()
		 * @generated
		 */
		EClass ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE = eINSTANCE.getISqmlRowConstructorDefaultValue();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlTable <em>ISqml Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlTable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTable()
		 * @generated
		 */
		EClass ISQML_TABLE = eINSTANCE.getISqmlTable();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlTableColumn <em>ISqml Table Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlTableColumn
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableColumn()
		 * @generated
		 */
		EClass ISQML_TABLE_COLUMN = eINSTANCE.getISqmlTableColumn();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlTableKey <em>ISqml Table Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlTableKey
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableKey()
		 * @generated
		 */
		EClass ISQML_TABLE_KEY = eINSTANCE.getISqmlTableKey();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlTableRow <em>ISqml Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlTableRow
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableRow()
		 * @generated
		 */
		EClass ISQML_TABLE_ROW = eINSTANCE.getISqmlTableRow();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlTableRowValue <em>ISqml Table Row Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlTableRowValue
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTableRowValue()
		 * @generated
		 */
		EClass ISQML_TABLE_ROW_VALUE = eINSTANCE.getISqmlTableRowValue();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlUniqueKey <em>ISqml Unique Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlUniqueKey
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlUniqueKey()
		 * @generated
		 */
		EClass ISQML_UNIQUE_KEY = eINSTANCE.getISqmlUniqueKey();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue <em>ISqml Value Reference Default Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValueReferenceDefaultValue()
		 * @generated
		 */
		EClass ISQML_VALUE_REFERENCE_DEFAULT_VALUE = eINSTANCE.getISqmlValueReferenceDefaultValue();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.ISqmlEnum <em>ISqml Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.ISqmlEnum
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlEnum()
		 * @generated
		 */
		EClass ISQML_ENUM = eINSTANCE.getISqmlEnum();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.ISqmlEnumerator <em>ISqml Enumerator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.ISqmlEnumerator
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlEnumerator()
		 * @generated
		 */
		EClass ISQML_ENUMERATOR = eINSTANCE.getISqmlEnumerator();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition <em>ISqml Top Level Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTopLevelTypeDefinition()
		 * @generated
		 */
		EClass ISQML_TOP_LEVEL_TYPE_DEFINITION = eINSTANCE.getISqmlTopLevelTypeDefinition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.ISqmlType <em>ISqml Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.ISqmlType
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlType()
		 * @generated
		 */
		EClass ISQML_TYPE = eINSTANCE.getISqmlType();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.ISqmlTypeDefinition <em>ISqml Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.ISqmlTypeDefinition
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTypeDefinition()
		 * @generated
		 */
		EClass ISQML_TYPE_DEFINITION = eINSTANCE.getISqmlTypeDefinition();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.ISqmlTypeReference <em>ISqml Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.ISqmlTypeReference
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlTypeReference()
		 * @generated
		 */
		EClass ISQML_TYPE_REFERENCE = eINSTANCE.getISqmlTypeReference();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.types.ISqmlValueType <em>ISqml Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.types.ISqmlValueType
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValueType()
		 * @generated
		 */
		EClass ISQML_VALUE_TYPE = eINSTANCE.getISqmlValueType();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.validation.ISqmlIssueAcceptor <em>ISqml Issue Acceptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.validation.ISqmlIssueAcceptor
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlIssueAcceptor()
		 * @generated
		 */
		EClass ISQML_ISSUE_ACCEPTOR = eINSTANCE.getISqmlIssueAcceptor();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.validation.ISqmlValidatable <em>ISqml Validatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.validation.ISqmlValidatable
		 * @see com.softicar.sqml.model.interfaces.impl.InterfacesPackageImpl#getISqmlValidatable()
		 * @generated
		 */
		EClass ISQML_VALIDATABLE = eINSTANCE.getISqmlValidatable();

	}

} //InterfacesPackage
