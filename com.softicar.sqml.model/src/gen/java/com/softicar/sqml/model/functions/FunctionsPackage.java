/**
 */
package com.softicar.sqml.model.functions;

import com.softicar.sqml.model.files.FilesPackage;

import com.softicar.sqml.model.interfaces.InterfacesPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see com.softicar.sqml.model.functions.FunctionsFactory
 * @model kind="package"
 * @generated
 */
public interface FunctionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "functions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.softicar.sqml.model.functions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "functions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FunctionsPackage eINSTANCE = com.softicar.sqml.model.functions.impl.FunctionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlFunctionImpl <em>Sqml Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlFunctionImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlFunction()
	 * @generated
	 */
	int SQML_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION__NAME = FilesPackage.SQML_FILE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION__RETURN_TYPE = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION__PARAMETERS = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sql</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION__SQL = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION__EXPRESSION = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sqml Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_FEATURE_COUNT = FilesPackage.SQML_FILE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION___TO_STRING = FilesPackage.SQML_FILE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sqml Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_OPERATION_COUNT = FilesPackage.SQML_FILE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlFunctionCallImpl <em>Sqml Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlFunctionCallImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlFunctionCall()
	 * @generated
	 */
	int SQML_FUNCTION_CALL = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_CALL__FUNCTION = InterfacesPackage.ISQML_FUNCTION_CALL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_CALL__ARGUMENTS = InterfacesPackage.ISQML_FUNCTION_CALL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_CALL_FEATURE_COUNT = InterfacesPackage.ISQML_FUNCTION_CALL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_CALL_OPERATION_COUNT = InterfacesPackage.ISQML_FUNCTION_CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl <em>Sqml Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlFunctionParameter()
	 * @generated
	 */
	int SQML_FUNCTION_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_PARAMETER__NAME = InterfacesPackage.ISQML_FUNCTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_PARAMETER__FUNCTION = InterfacesPackage.ISQML_FUNCTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_PARAMETER__TYPE_REFERENCE = InterfacesPackage.ISQML_FUNCTION_PARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sqml Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_PARAMETER_FEATURE_COUNT = InterfacesPackage.ISQML_FUNCTION_PARAMETER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sqml Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_FUNCTION_PARAMETER_OPERATION_COUNT = InterfacesPackage.ISQML_FUNCTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlImpl <em>Sqml Sql</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlSqlImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSql()
	 * @generated
	 */
	int SQML_SQL = 3;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL__TOKENS = InterfacesPackage.ISQML_SQL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_FEATURE_COUNT = InterfacesPackage.ISQML_SQL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Sql</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_OPERATION_COUNT = InterfacesPackage.ISQML_SQL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlIdImpl <em>Sqml Sql Id</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlSqlIdImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlId()
	 * @generated
	 */
	int SQML_SQL_ID = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_ID__IDENTIFIER = InterfacesPackage.ISQML_SQL_ID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Sql Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_ID_FEATURE_COUNT = InterfacesPackage.ISQML_SQL_ID_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Sql Id</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_ID_OPERATION_COUNT = InterfacesPackage.ISQML_SQL_ID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlKeywordImpl <em>Sqml Sql Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlSqlKeywordImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlKeyword()
	 * @generated
	 */
	int SQML_SQL_KEYWORD = 5;

	/**
	 * The feature id for the '<em><b>Keyword Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_KEYWORD__KEYWORD_TEXT = InterfacesPackage.ISQML_SQL_KEYWORD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Sql Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_KEYWORD_FEATURE_COUNT = InterfacesPackage.ISQML_SQL_KEYWORD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Sql Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_KEYWORD_OPERATION_COUNT = InterfacesPackage.ISQML_SQL_KEYWORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlNumberLiteralImpl <em>Sqml Sql Number Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlSqlNumberLiteralImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlNumberLiteral()
	 * @generated
	 */
	int SQML_SQL_NUMBER_LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_NUMBER_LITERAL__INTEGER = InterfacesPackage.ISQML_SQL_NUMBER_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_NUMBER_LITERAL__DECIMAL = InterfacesPackage.ISQML_SQL_NUMBER_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sqml Sql Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_NUMBER_LITERAL_FEATURE_COUNT = InterfacesPackage.ISQML_SQL_NUMBER_LITERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sqml Sql Number Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_NUMBER_LITERAL_OPERATION_COUNT = InterfacesPackage.ISQML_SQL_NUMBER_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlStringLiteralImpl <em>Sqml Sql String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlSqlStringLiteralImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlStringLiteral()
	 * @generated
	 */
	int SQML_SQL_STRING_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_STRING_LITERAL__STRING = InterfacesPackage.ISQML_SQL_STRING_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Sql String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_STRING_LITERAL_FEATURE_COUNT = InterfacesPackage.ISQML_SQL_STRING_LITERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Sql String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_STRING_LITERAL_OPERATION_COUNT = InterfacesPackage.ISQML_SQL_STRING_LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlSymbolImpl <em>Sqml Sql Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.softicar.sqml.model.functions.impl.SqmlSqlSymbolImpl
	 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlSymbol()
	 * @generated
	 */
	int SQML_SQL_SYMBOL = 8;

	/**
	 * The feature id for the '<em><b>Symbol Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_SYMBOL__SYMBOL_TEXT = InterfacesPackage.ISQML_SQL_SYMBOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sqml Sql Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_SYMBOL_FEATURE_COUNT = InterfacesPackage.ISQML_SQL_SYMBOL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sqml Sql Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQML_SQL_SYMBOL_OPERATION_COUNT = InterfacesPackage.ISQML_SQL_SYMBOL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlFunction <em>Sqml Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Function</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunction
	 * @generated
	 */
	EClass getSqmlFunction();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.functions.SqmlFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunction#getReturnType()
	 * @see #getSqmlFunction()
	 * @generated
	 */
	EReference getSqmlFunction_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.functions.SqmlFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunction#getParameters()
	 * @see #getSqmlFunction()
	 * @generated
	 */
	EReference getSqmlFunction_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.functions.SqmlFunction#getSql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sql</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunction#getSql()
	 * @see #getSqmlFunction()
	 * @generated
	 */
	EReference getSqmlFunction_Sql();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.functions.SqmlFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunction#getExpression()
	 * @see #getSqmlFunction()
	 * @generated
	 */
	EReference getSqmlFunction_Expression();

	/**
	 * Returns the meta object for the '{@link com.softicar.sqml.model.functions.SqmlFunction#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see com.softicar.sqml.model.functions.SqmlFunction#toString()
	 * @generated
	 */
	EOperation getSqmlFunction__ToString();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlFunctionCall <em>Sqml Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Function Call</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionCall
	 * @generated
	 */
	EClass getSqmlFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link com.softicar.sqml.model.functions.SqmlFunctionCall#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionCall#getFunction()
	 * @see #getSqmlFunctionCall()
	 * @generated
	 */
	EReference getSqmlFunctionCall_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.functions.SqmlFunctionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionCall#getArguments()
	 * @see #getSqmlFunctionCall()
	 * @generated
	 */
	EReference getSqmlFunctionCall_Arguments();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter <em>Sqml Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Function Parameter</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionParameter
	 * @generated
	 */
	EClass getSqmlFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionParameter#getName()
	 * @see #getSqmlFunctionParameter()
	 * @generated
	 */
	EAttribute getSqmlFunctionParameter_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Function</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionParameter#getFunction()
	 * @see #getSqmlFunctionParameter()
	 * @generated
	 */
	EReference getSqmlFunctionParameter_Function();

	/**
	 * Returns the meta object for the containment reference '{@link com.softicar.sqml.model.functions.SqmlFunctionParameter#getTypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Reference</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlFunctionParameter#getTypeReference()
	 * @see #getSqmlFunctionParameter()
	 * @generated
	 */
	EReference getSqmlFunctionParameter_TypeReference();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlSql <em>Sqml Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sql</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSql
	 * @generated
	 */
	EClass getSqmlSql();

	/**
	 * Returns the meta object for the containment reference list '{@link com.softicar.sqml.model.functions.SqmlSql#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSql#getTokens()
	 * @see #getSqmlSql()
	 * @generated
	 */
	EReference getSqmlSql_Tokens();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlSqlId <em>Sqml Sql Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sql Id</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlId
	 * @generated
	 */
	EClass getSqmlSqlId();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.functions.SqmlSqlId#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlId#getIdentifier()
	 * @see #getSqmlSqlId()
	 * @generated
	 */
	EAttribute getSqmlSqlId_Identifier();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlSqlKeyword <em>Sqml Sql Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sql Keyword</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlKeyword
	 * @generated
	 */
	EClass getSqmlSqlKeyword();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.functions.SqmlSqlKeyword#getKeywordText <em>Keyword Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword Text</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlKeyword#getKeywordText()
	 * @see #getSqmlSqlKeyword()
	 * @generated
	 */
	EAttribute getSqmlSqlKeyword_KeywordText();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral <em>Sqml Sql Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sql Number Literal</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlNumberLiteral
	 * @generated
	 */
	EClass getSqmlSqlNumberLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getInteger()
	 * @see #getSqmlSqlNumberLiteral()
	 * @generated
	 */
	EAttribute getSqmlSqlNumberLiteral_Integer();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlNumberLiteral#getDecimal()
	 * @see #getSqmlSqlNumberLiteral()
	 * @generated
	 */
	EAttribute getSqmlSqlNumberLiteral_Decimal();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlSqlStringLiteral <em>Sqml Sql String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sql String Literal</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlStringLiteral
	 * @generated
	 */
	EClass getSqmlSqlStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.functions.SqmlSqlStringLiteral#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlStringLiteral#getString()
	 * @see #getSqmlSqlStringLiteral()
	 * @generated
	 */
	EAttribute getSqmlSqlStringLiteral_String();

	/**
	 * Returns the meta object for class '{@link com.softicar.sqml.model.functions.SqmlSqlSymbol <em>Sqml Sql Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sqml Sql Symbol</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlSymbol
	 * @generated
	 */
	EClass getSqmlSqlSymbol();

	/**
	 * Returns the meta object for the attribute '{@link com.softicar.sqml.model.functions.SqmlSqlSymbol#getSymbolText <em>Symbol Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Text</em>'.
	 * @see com.softicar.sqml.model.functions.SqmlSqlSymbol#getSymbolText()
	 * @see #getSqmlSqlSymbol()
	 * @generated
	 */
	EAttribute getSqmlSqlSymbol_SymbolText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FunctionsFactory getFunctionsFactory();

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
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlFunctionImpl <em>Sqml Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlFunctionImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlFunction()
		 * @generated
		 */
		EClass SQML_FUNCTION = eINSTANCE.getSqmlFunction();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION__RETURN_TYPE = eINSTANCE.getSqmlFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION__PARAMETERS = eINSTANCE.getSqmlFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Sql</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION__SQL = eINSTANCE.getSqmlFunction_Sql();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION__EXPRESSION = eINSTANCE.getSqmlFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SQML_FUNCTION___TO_STRING = eINSTANCE.getSqmlFunction__ToString();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlFunctionCallImpl <em>Sqml Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlFunctionCallImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlFunctionCall()
		 * @generated
		 */
		EClass SQML_FUNCTION_CALL = eINSTANCE.getSqmlFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION_CALL__FUNCTION = eINSTANCE.getSqmlFunctionCall_Function();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION_CALL__ARGUMENTS = eINSTANCE.getSqmlFunctionCall_Arguments();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl <em>Sqml Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlFunctionParameterImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlFunctionParameter()
		 * @generated
		 */
		EClass SQML_FUNCTION_PARAMETER = eINSTANCE.getSqmlFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_FUNCTION_PARAMETER__NAME = eINSTANCE.getSqmlFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION_PARAMETER__FUNCTION = eINSTANCE.getSqmlFunctionParameter_Function();

		/**
		 * The meta object literal for the '<em><b>Type Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_FUNCTION_PARAMETER__TYPE_REFERENCE = eINSTANCE.getSqmlFunctionParameter_TypeReference();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlImpl <em>Sqml Sql</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlSqlImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSql()
		 * @generated
		 */
		EClass SQML_SQL = eINSTANCE.getSqmlSql();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQML_SQL__TOKENS = eINSTANCE.getSqmlSql_Tokens();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlIdImpl <em>Sqml Sql Id</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlSqlIdImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlId()
		 * @generated
		 */
		EClass SQML_SQL_ID = eINSTANCE.getSqmlSqlId();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SQL_ID__IDENTIFIER = eINSTANCE.getSqmlSqlId_Identifier();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlKeywordImpl <em>Sqml Sql Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlSqlKeywordImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlKeyword()
		 * @generated
		 */
		EClass SQML_SQL_KEYWORD = eINSTANCE.getSqmlSqlKeyword();

		/**
		 * The meta object literal for the '<em><b>Keyword Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SQL_KEYWORD__KEYWORD_TEXT = eINSTANCE.getSqmlSqlKeyword_KeywordText();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlNumberLiteralImpl <em>Sqml Sql Number Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlSqlNumberLiteralImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlNumberLiteral()
		 * @generated
		 */
		EClass SQML_SQL_NUMBER_LITERAL = eINSTANCE.getSqmlSqlNumberLiteral();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SQL_NUMBER_LITERAL__INTEGER = eINSTANCE.getSqmlSqlNumberLiteral_Integer();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SQL_NUMBER_LITERAL__DECIMAL = eINSTANCE.getSqmlSqlNumberLiteral_Decimal();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlStringLiteralImpl <em>Sqml Sql String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlSqlStringLiteralImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlStringLiteral()
		 * @generated
		 */
		EClass SQML_SQL_STRING_LITERAL = eINSTANCE.getSqmlSqlStringLiteral();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SQL_STRING_LITERAL__STRING = eINSTANCE.getSqmlSqlStringLiteral_String();

		/**
		 * The meta object literal for the '{@link com.softicar.sqml.model.functions.impl.SqmlSqlSymbolImpl <em>Sqml Sql Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.softicar.sqml.model.functions.impl.SqmlSqlSymbolImpl
		 * @see com.softicar.sqml.model.functions.impl.FunctionsPackageImpl#getSqmlSqlSymbol()
		 * @generated
		 */
		EClass SQML_SQL_SYMBOL = eINSTANCE.getSqmlSqlSymbol();

		/**
		 * The meta object literal for the '<em><b>Symbol Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQML_SQL_SYMBOL__SYMBOL_TEXT = eINSTANCE.getSqmlSqlSymbol_SymbolText();

	}

} //FunctionsPackage
