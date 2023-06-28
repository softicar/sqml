/**
 */
package com.softicar.sqml.model.interfaces.impl;

import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.ISqmlValue;

import com.softicar.sqml.model.conditions.ISqmlAnd;
import com.softicar.sqml.model.conditions.ISqmlBetween;
import com.softicar.sqml.model.conditions.ISqmlComparison;
import com.softicar.sqml.model.conditions.ISqmlCondition;
import com.softicar.sqml.model.conditions.ISqmlExists;
import com.softicar.sqml.model.conditions.ISqmlIn;
import com.softicar.sqml.model.conditions.ISqmlIsNull;
import com.softicar.sqml.model.conditions.ISqmlLike;
import com.softicar.sqml.model.conditions.ISqmlNot;
import com.softicar.sqml.model.conditions.ISqmlOr;
import com.softicar.sqml.model.conditions.ISqmlRegexp;

import com.softicar.sqml.model.expressions.ISqmlAddition;
import com.softicar.sqml.model.expressions.ISqmlBinaryOperation;
import com.softicar.sqml.model.expressions.ISqmlCase;
import com.softicar.sqml.model.expressions.ISqmlCaseWhen;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.expressions.ISqmlGroupConcat;
import com.softicar.sqml.model.expressions.ISqmlIf;
import com.softicar.sqml.model.expressions.ISqmlIfNull;
import com.softicar.sqml.model.expressions.ISqmlMultiplication;
import com.softicar.sqml.model.expressions.ISqmlNegation;
import com.softicar.sqml.model.expressions.ISqmlPath;
import com.softicar.sqml.model.expressions.ISqmlRowConstructor;
import com.softicar.sqml.model.expressions.ISqmlStaticAnd;
import com.softicar.sqml.model.expressions.ISqmlStaticExpression;
import com.softicar.sqml.model.expressions.ISqmlStaticIf;
import com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty;
import com.softicar.sqml.model.expressions.ISqmlStaticIsNull;
import com.softicar.sqml.model.expressions.ISqmlStaticIsTrue;
import com.softicar.sqml.model.expressions.ISqmlStaticOr;
import com.softicar.sqml.model.expressions.ISqmlStaticParameterTest;
import com.softicar.sqml.model.expressions.ISqmlStaticParentheses;
import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.expressions.ISqmlSubSelect;
import com.softicar.sqml.model.expressions.ISqmlUnaryOperation;
import com.softicar.sqml.model.expressions.ISqmlValueReference;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlFileElement;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.files.ISqmlPackageDeclaration;

import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.ISqmlFunctionParameter;
import com.softicar.sqml.model.functions.ISqmlSql;
import com.softicar.sqml.model.functions.ISqmlSqlId;
import com.softicar.sqml.model.functions.ISqmlSqlKeyword;
import com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral;
import com.softicar.sqml.model.functions.ISqmlSqlStringLiteral;
import com.softicar.sqml.model.functions.ISqmlSqlSymbol;

import com.softicar.sqml.model.interfaces.InterfacesFactory;
import com.softicar.sqml.model.interfaces.InterfacesPackage;

import com.softicar.sqml.model.literals.ISqmlBooleanLiteral;
import com.softicar.sqml.model.literals.ISqmlDecimalLiteral;
import com.softicar.sqml.model.literals.ISqmlDoubleLiteral;
import com.softicar.sqml.model.literals.ISqmlFloatLiteral;
import com.softicar.sqml.model.literals.ISqmlIntegerLiteral;
import com.softicar.sqml.model.literals.ISqmlLiteral;
import com.softicar.sqml.model.literals.ISqmlLongLiteral;
import com.softicar.sqml.model.literals.ISqmlStringLiteral;

import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;

import com.softicar.sqml.model.selects.ISqmlForeignKeyVariable;
import com.softicar.sqml.model.selects.ISqmlFromClause;
import com.softicar.sqml.model.selects.ISqmlGroupByClause;
import com.softicar.sqml.model.selects.ISqmlHavingClause;
import com.softicar.sqml.model.selects.ISqmlJoinClause;
import com.softicar.sqml.model.selects.ISqmlOrderByClause;
import com.softicar.sqml.model.selects.ISqmlOrderByExpression;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.ISqmlSelectBlock;
import com.softicar.sqml.model.selects.ISqmlSelectClause;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlSelectElse;
import com.softicar.sqml.model.selects.ISqmlSelectElseIf;
import com.softicar.sqml.model.selects.ISqmlSelectIf;
import com.softicar.sqml.model.selects.ISqmlSelectPart;
import com.softicar.sqml.model.selects.ISqmlSubSelectVariable;
import com.softicar.sqml.model.selects.ISqmlTableVariable;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.selects.ISqmlWhereClause;

import com.softicar.sqml.model.tables.ISqmlDefaultValue;
import com.softicar.sqml.model.tables.ISqmlIndexKey;
import com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue;
import com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.ISqmlTableKey;
import com.softicar.sqml.model.tables.ISqmlTableRow;
import com.softicar.sqml.model.tables.ISqmlTableRowValue;
import com.softicar.sqml.model.tables.ISqmlUniqueKey;
import com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue;

import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.types.ISqmlValueType;

import com.softicar.sqml.model.validation.ISqmlIssueAcceptor;
import com.softicar.sqml.model.validation.ISqmlValidatable;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterfacesPackageImpl extends EPackageImpl implements InterfacesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlBetweenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlComparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlExistsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlIsNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlLikeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlNotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlRegexpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlAdditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlCaseWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlBinaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlGroupConcatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlIfNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlMultiplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlNegationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlRowConstructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticAndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticIsEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticIsNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticIsTrueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticOrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticParameterTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticParenthesesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticVariableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSubSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlUnaryOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlValueReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlFileElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlPackageDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlFunctionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlFunctionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSqlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSqlIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSqlKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSqlNumberLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSqlStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSqlSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlBooleanLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlDecimalLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlDoubleLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlFloatLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlIntegerLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlLongLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlGeneratableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlGlobalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlModelVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlStaticVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTabularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlQueryParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlForeignKeyVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlFromClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlGroupByClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlHavingClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlJoinClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlOrderByClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlOrderByExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectElseIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSelectPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlSubSelectVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTableVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlWhereClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlIndexKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlLiteralDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlRowConstructorDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTableColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTableKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTableRowValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlUniqueKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlValueReferenceDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlEnumeratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTopLevelTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlTypeReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlIssueAcceptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSqmlValidatableEClass = null;

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
	 * @see com.softicar.sqml.model.interfaces.InterfacesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfacesPackageImpl() {
		super(eNS_URI, InterfacesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfacesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfacesPackage init() {
		if (isInited) return (InterfacesPackage)EPackage.Registry.INSTANCE.getEPackage(InterfacesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInterfacesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InterfacesPackageImpl theInterfacesPackage = registeredInterfacesPackage instanceof InterfacesPackageImpl ? (InterfacesPackageImpl)registeredInterfacesPackage : new InterfacesPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theInterfacesPackage.createPackageContents();

		// Initialize created meta-data
		theInterfacesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfacesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfacesPackage.eNS_URI, theInterfacesPackage);
		return theInterfacesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlAnd() {
		return iSqmlAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlBetween() {
		return iSqmlBetweenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlComparison() {
		return iSqmlComparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlCondition() {
		return iSqmlConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlExists() {
		return iSqmlExistsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlIn() {
		return iSqmlInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlIsNull() {
		return iSqmlIsNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlLike() {
		return iSqmlLikeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlNot() {
		return iSqmlNotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlOr() {
		return iSqmlOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlRegexp() {
		return iSqmlRegexpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlAddition() {
		return iSqmlAdditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlCase() {
		return iSqmlCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlCaseWhen() {
		return iSqmlCaseWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlBinaryOperation() {
		return iSqmlBinaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlExpression() {
		return iSqmlExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlGroupConcat() {
		return iSqmlGroupConcatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlIf() {
		return iSqmlIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlIfNull() {
		return iSqmlIfNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlMultiplication() {
		return iSqmlMultiplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlNegation() {
		return iSqmlNegationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlPath() {
		return iSqmlPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlRowConstructor() {
		return iSqmlRowConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticAnd() {
		return iSqmlStaticAndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticExpression() {
		return iSqmlStaticExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticIf() {
		return iSqmlStaticIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticIsEmpty() {
		return iSqmlStaticIsEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticIsNull() {
		return iSqmlStaticIsNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticIsTrue() {
		return iSqmlStaticIsTrueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticOr() {
		return iSqmlStaticOrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticParameterTest() {
		return iSqmlStaticParameterTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticParentheses() {
		return iSqmlStaticParenthesesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticVariableReference() {
		return iSqmlStaticVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSubSelect() {
		return iSqmlSubSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlUnaryOperation() {
		return iSqmlUnaryOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlValueReference() {
		return iSqmlValueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlFile() {
		return iSqmlFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlFileElement() {
		return iSqmlFileElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlImport() {
		return iSqmlImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlPackageDeclaration() {
		return iSqmlPackageDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlFunction() {
		return iSqmlFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlFunctionCall() {
		return iSqmlFunctionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlFunctionParameter() {
		return iSqmlFunctionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSql() {
		return iSqmlSqlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSqlId() {
		return iSqmlSqlIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSqlKeyword() {
		return iSqmlSqlKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSqlNumberLiteral() {
		return iSqmlSqlNumberLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSqlStringLiteral() {
		return iSqmlSqlStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSqlSymbol() {
		return iSqmlSqlSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlBooleanLiteral() {
		return iSqmlBooleanLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlDecimalLiteral() {
		return iSqmlDecimalLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlDoubleLiteral() {
		return iSqmlDoubleLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlFloatLiteral() {
		return iSqmlFloatLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlIntegerLiteral() {
		return iSqmlIntegerLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlLiteral() {
		return iSqmlLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlLongLiteral() {
		return iSqmlLongLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStringLiteral() {
		return iSqmlStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlColumn() {
		return iSqmlColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlGeneratable() {
		return iSqmlGeneratableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlGlobalObject() {
		return iSqmlGlobalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlModelElement() {
		return iSqmlModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlModelVisitor() {
		return iSqmlModelVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlStaticVariable() {
		return iSqmlStaticVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTabular() {
		return iSqmlTabularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlValue() {
		return iSqmlValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlQuery() {
		return iSqmlQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlQueryParameter() {
		return iSqmlQueryParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlForeignKeyVariable() {
		return iSqmlForeignKeyVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlFromClause() {
		return iSqmlFromClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlGroupByClause() {
		return iSqmlGroupByClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlHavingClause() {
		return iSqmlHavingClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlJoinClause() {
		return iSqmlJoinClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlOrderByClause() {
		return iSqmlOrderByClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlOrderByExpression() {
		return iSqmlOrderByExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelect() {
		return iSqmlSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelectBlock() {
		return iSqmlSelectBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelectClause() {
		return iSqmlSelectClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelectColumn() {
		return iSqmlSelectColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelectElse() {
		return iSqmlSelectElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelectElseIf() {
		return iSqmlSelectElseIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelectIf() {
		return iSqmlSelectIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSelectPart() {
		return iSqmlSelectPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlSubSelectVariable() {
		return iSqmlSubSelectVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTableVariable() {
		return iSqmlTableVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlVariable() {
		return iSqmlVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlWhereClause() {
		return iSqmlWhereClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlDefaultValue() {
		return iSqmlDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlIndexKey() {
		return iSqmlIndexKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlLiteralDefaultValue() {
		return iSqmlLiteralDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlRowConstructorDefaultValue() {
		return iSqmlRowConstructorDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTable() {
		return iSqmlTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTableColumn() {
		return iSqmlTableColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTableKey() {
		return iSqmlTableKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTableRow() {
		return iSqmlTableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTableRowValue() {
		return iSqmlTableRowValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlUniqueKey() {
		return iSqmlUniqueKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlValueReferenceDefaultValue() {
		return iSqmlValueReferenceDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlEnum() {
		return iSqmlEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlEnumerator() {
		return iSqmlEnumeratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTopLevelTypeDefinition() {
		return iSqmlTopLevelTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlType() {
		return iSqmlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTypeDefinition() {
		return iSqmlTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlTypeReference() {
		return iSqmlTypeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlValueType() {
		return iSqmlValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlIssueAcceptor() {
		return iSqmlIssueAcceptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISqmlValidatable() {
		return iSqmlValidatableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfacesFactory getInterfacesFactory() {
		return (InterfacesFactory)getEFactoryInstance();
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
		iSqmlAndEClass = createEClass(ISQML_AND);

		iSqmlBetweenEClass = createEClass(ISQML_BETWEEN);

		iSqmlComparisonEClass = createEClass(ISQML_COMPARISON);

		iSqmlConditionEClass = createEClass(ISQML_CONDITION);

		iSqmlExistsEClass = createEClass(ISQML_EXISTS);

		iSqmlInEClass = createEClass(ISQML_IN);

		iSqmlIsNullEClass = createEClass(ISQML_IS_NULL);

		iSqmlLikeEClass = createEClass(ISQML_LIKE);

		iSqmlNotEClass = createEClass(ISQML_NOT);

		iSqmlOrEClass = createEClass(ISQML_OR);

		iSqmlRegexpEClass = createEClass(ISQML_REGEXP);

		iSqmlAdditionEClass = createEClass(ISQML_ADDITION);

		iSqmlCaseEClass = createEClass(ISQML_CASE);

		iSqmlCaseWhenEClass = createEClass(ISQML_CASE_WHEN);

		iSqmlBinaryOperationEClass = createEClass(ISQML_BINARY_OPERATION);

		iSqmlExpressionEClass = createEClass(ISQML_EXPRESSION);

		iSqmlGroupConcatEClass = createEClass(ISQML_GROUP_CONCAT);

		iSqmlIfEClass = createEClass(ISQML_IF);

		iSqmlIfNullEClass = createEClass(ISQML_IF_NULL);

		iSqmlMultiplicationEClass = createEClass(ISQML_MULTIPLICATION);

		iSqmlNegationEClass = createEClass(ISQML_NEGATION);

		iSqmlPathEClass = createEClass(ISQML_PATH);

		iSqmlRowConstructorEClass = createEClass(ISQML_ROW_CONSTRUCTOR);

		iSqmlStaticAndEClass = createEClass(ISQML_STATIC_AND);

		iSqmlStaticExpressionEClass = createEClass(ISQML_STATIC_EXPRESSION);

		iSqmlStaticIfEClass = createEClass(ISQML_STATIC_IF);

		iSqmlStaticIsEmptyEClass = createEClass(ISQML_STATIC_IS_EMPTY);

		iSqmlStaticIsNullEClass = createEClass(ISQML_STATIC_IS_NULL);

		iSqmlStaticIsTrueEClass = createEClass(ISQML_STATIC_IS_TRUE);

		iSqmlStaticOrEClass = createEClass(ISQML_STATIC_OR);

		iSqmlStaticParameterTestEClass = createEClass(ISQML_STATIC_PARAMETER_TEST);

		iSqmlStaticParenthesesEClass = createEClass(ISQML_STATIC_PARENTHESES);

		iSqmlStaticVariableReferenceEClass = createEClass(ISQML_STATIC_VARIABLE_REFERENCE);

		iSqmlSubSelectEClass = createEClass(ISQML_SUB_SELECT);

		iSqmlUnaryOperationEClass = createEClass(ISQML_UNARY_OPERATION);

		iSqmlValueReferenceEClass = createEClass(ISQML_VALUE_REFERENCE);

		iSqmlFileEClass = createEClass(ISQML_FILE);

		iSqmlFileElementEClass = createEClass(ISQML_FILE_ELEMENT);

		iSqmlImportEClass = createEClass(ISQML_IMPORT);

		iSqmlPackageDeclarationEClass = createEClass(ISQML_PACKAGE_DECLARATION);

		iSqmlFunctionEClass = createEClass(ISQML_FUNCTION);

		iSqmlFunctionCallEClass = createEClass(ISQML_FUNCTION_CALL);

		iSqmlFunctionParameterEClass = createEClass(ISQML_FUNCTION_PARAMETER);

		iSqmlSqlEClass = createEClass(ISQML_SQL);

		iSqmlSqlIdEClass = createEClass(ISQML_SQL_ID);

		iSqmlSqlKeywordEClass = createEClass(ISQML_SQL_KEYWORD);

		iSqmlSqlNumberLiteralEClass = createEClass(ISQML_SQL_NUMBER_LITERAL);

		iSqmlSqlStringLiteralEClass = createEClass(ISQML_SQL_STRING_LITERAL);

		iSqmlSqlSymbolEClass = createEClass(ISQML_SQL_SYMBOL);

		iSqmlBooleanLiteralEClass = createEClass(ISQML_BOOLEAN_LITERAL);

		iSqmlDecimalLiteralEClass = createEClass(ISQML_DECIMAL_LITERAL);

		iSqmlDoubleLiteralEClass = createEClass(ISQML_DOUBLE_LITERAL);

		iSqmlFloatLiteralEClass = createEClass(ISQML_FLOAT_LITERAL);

		iSqmlIntegerLiteralEClass = createEClass(ISQML_INTEGER_LITERAL);

		iSqmlLiteralEClass = createEClass(ISQML_LITERAL);

		iSqmlLongLiteralEClass = createEClass(ISQML_LONG_LITERAL);

		iSqmlStringLiteralEClass = createEClass(ISQML_STRING_LITERAL);

		iSqmlColumnEClass = createEClass(ISQML_COLUMN);

		iSqmlGeneratableEClass = createEClass(ISQML_GENERATABLE);

		iSqmlGlobalObjectEClass = createEClass(ISQML_GLOBAL_OBJECT);

		iSqmlModelElementEClass = createEClass(ISQML_MODEL_ELEMENT);

		iSqmlModelVisitorEClass = createEClass(ISQML_MODEL_VISITOR);

		iSqmlStaticVariableEClass = createEClass(ISQML_STATIC_VARIABLE);

		iSqmlTabularEClass = createEClass(ISQML_TABULAR);

		iSqmlValueEClass = createEClass(ISQML_VALUE);

		iSqmlQueryEClass = createEClass(ISQML_QUERY);

		iSqmlQueryParameterEClass = createEClass(ISQML_QUERY_PARAMETER);

		iSqmlForeignKeyVariableEClass = createEClass(ISQML_FOREIGN_KEY_VARIABLE);

		iSqmlFromClauseEClass = createEClass(ISQML_FROM_CLAUSE);

		iSqmlGroupByClauseEClass = createEClass(ISQML_GROUP_BY_CLAUSE);

		iSqmlHavingClauseEClass = createEClass(ISQML_HAVING_CLAUSE);

		iSqmlJoinClauseEClass = createEClass(ISQML_JOIN_CLAUSE);

		iSqmlOrderByClauseEClass = createEClass(ISQML_ORDER_BY_CLAUSE);

		iSqmlOrderByExpressionEClass = createEClass(ISQML_ORDER_BY_EXPRESSION);

		iSqmlSelectEClass = createEClass(ISQML_SELECT);

		iSqmlSelectBlockEClass = createEClass(ISQML_SELECT_BLOCK);

		iSqmlSelectClauseEClass = createEClass(ISQML_SELECT_CLAUSE);

		iSqmlSelectColumnEClass = createEClass(ISQML_SELECT_COLUMN);

		iSqmlSelectElseEClass = createEClass(ISQML_SELECT_ELSE);

		iSqmlSelectElseIfEClass = createEClass(ISQML_SELECT_ELSE_IF);

		iSqmlSelectIfEClass = createEClass(ISQML_SELECT_IF);

		iSqmlSelectPartEClass = createEClass(ISQML_SELECT_PART);

		iSqmlSubSelectVariableEClass = createEClass(ISQML_SUB_SELECT_VARIABLE);

		iSqmlTableVariableEClass = createEClass(ISQML_TABLE_VARIABLE);

		iSqmlVariableEClass = createEClass(ISQML_VARIABLE);

		iSqmlWhereClauseEClass = createEClass(ISQML_WHERE_CLAUSE);

		iSqmlDefaultValueEClass = createEClass(ISQML_DEFAULT_VALUE);

		iSqmlIndexKeyEClass = createEClass(ISQML_INDEX_KEY);

		iSqmlLiteralDefaultValueEClass = createEClass(ISQML_LITERAL_DEFAULT_VALUE);

		iSqmlRowConstructorDefaultValueEClass = createEClass(ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE);

		iSqmlTableEClass = createEClass(ISQML_TABLE);

		iSqmlTableColumnEClass = createEClass(ISQML_TABLE_COLUMN);

		iSqmlTableKeyEClass = createEClass(ISQML_TABLE_KEY);

		iSqmlTableRowEClass = createEClass(ISQML_TABLE_ROW);

		iSqmlTableRowValueEClass = createEClass(ISQML_TABLE_ROW_VALUE);

		iSqmlUniqueKeyEClass = createEClass(ISQML_UNIQUE_KEY);

		iSqmlValueReferenceDefaultValueEClass = createEClass(ISQML_VALUE_REFERENCE_DEFAULT_VALUE);

		iSqmlEnumEClass = createEClass(ISQML_ENUM);

		iSqmlEnumeratorEClass = createEClass(ISQML_ENUMERATOR);

		iSqmlTopLevelTypeDefinitionEClass = createEClass(ISQML_TOP_LEVEL_TYPE_DEFINITION);

		iSqmlTypeEClass = createEClass(ISQML_TYPE);

		iSqmlTypeDefinitionEClass = createEClass(ISQML_TYPE_DEFINITION);

		iSqmlTypeReferenceEClass = createEClass(ISQML_TYPE_REFERENCE);

		iSqmlValueTypeEClass = createEClass(ISQML_VALUE_TYPE);

		iSqmlIssueAcceptorEClass = createEClass(ISQML_ISSUE_ACCEPTOR);

		iSqmlValidatableEClass = createEClass(ISQML_VALIDATABLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iSqmlAndEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlBetweenEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlComparisonEClass.getESuperTypes().add(this.getISqmlBinaryOperation());
		iSqmlComparisonEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlConditionEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlExistsEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlInEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlIsNullEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlLikeEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlNotEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlOrEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlRegexpEClass.getESuperTypes().add(this.getISqmlCondition());
		iSqmlAdditionEClass.getESuperTypes().add(this.getISqmlBinaryOperation());
		iSqmlCaseEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlCaseWhenEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlBinaryOperationEClass.getESuperTypes().add(this.getISqmlFunctionCall());
		iSqmlExpressionEClass.getESuperTypes().add(this.getISqmlValue());
		iSqmlExpressionEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlGroupConcatEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlIfEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlIfNullEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlMultiplicationEClass.getESuperTypes().add(this.getISqmlBinaryOperation());
		iSqmlNegationEClass.getESuperTypes().add(this.getISqmlUnaryOperation());
		iSqmlPathEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlPathEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlRowConstructorEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlStaticAndEClass.getESuperTypes().add(this.getISqmlStaticExpression());
		iSqmlStaticIfEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlStaticIsEmptyEClass.getESuperTypes().add(this.getISqmlStaticParameterTest());
		iSqmlStaticIsNullEClass.getESuperTypes().add(this.getISqmlStaticParameterTest());
		iSqmlStaticIsTrueEClass.getESuperTypes().add(this.getISqmlStaticParameterTest());
		iSqmlStaticOrEClass.getESuperTypes().add(this.getISqmlStaticExpression());
		iSqmlStaticParameterTestEClass.getESuperTypes().add(this.getISqmlStaticExpression());
		iSqmlStaticParenthesesEClass.getESuperTypes().add(this.getISqmlStaticExpression());
		iSqmlStaticVariableReferenceEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlStaticVariableReferenceEClass.getESuperTypes().add(this.getISqmlStaticExpression());
		iSqmlSubSelectEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlUnaryOperationEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlValueReferenceEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlValueReferenceEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlFileEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlFileElementEClass.getESuperTypes().add(this.getISqmlGlobalObject());
		iSqmlImportEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlFunctionEClass.getESuperTypes().add(this.getISqmlFileElement());
		iSqmlFunctionEClass.getESuperTypes().add(this.getISqmlGeneratable());
		iSqmlFunctionEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlFunctionEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlFunctionCallEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlFunctionParameterEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlFunctionParameterEClass.getESuperTypes().add(this.getISqmlStaticVariable());
		iSqmlSqlIdEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlSqlKeywordEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlSqlNumberLiteralEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlSqlStringLiteralEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlSqlSymbolEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlBooleanLiteralEClass.getESuperTypes().add(this.getISqmlLiteral());
		iSqmlDecimalLiteralEClass.getESuperTypes().add(this.getISqmlLiteral());
		iSqmlDoubleLiteralEClass.getESuperTypes().add(this.getISqmlLiteral());
		iSqmlFloatLiteralEClass.getESuperTypes().add(this.getISqmlLiteral());
		iSqmlIntegerLiteralEClass.getESuperTypes().add(this.getISqmlLiteral());
		iSqmlLiteralEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlLongLiteralEClass.getESuperTypes().add(this.getISqmlLiteral());
		iSqmlStringLiteralEClass.getESuperTypes().add(this.getISqmlLiteral());
		iSqmlColumnEClass.getESuperTypes().add(this.getISqmlValue());
		iSqmlColumnEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlQueryEClass.getESuperTypes().add(this.getISqmlFileElement());
		iSqmlQueryEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlQueryParameterEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlQueryParameterEClass.getESuperTypes().add(this.getISqmlStaticVariable());
		iSqmlForeignKeyVariableEClass.getESuperTypes().add(this.getISqmlVariable());
		iSqmlFromClauseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlGroupByClauseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlHavingClauseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlJoinClauseEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlJoinClauseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlOrderByClauseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlOrderByExpressionEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlSelectEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlSelectEClass.getESuperTypes().add(this.getISqmlTabular());
		iSqmlSelectEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlSelectEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlSelectBlockEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlSelectClauseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlSelectColumnEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlSelectColumnEClass.getESuperTypes().add(this.getISqmlColumn());
		iSqmlSelectElseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlSelectElseIfEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlSelectIfEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlSelectPartEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlSubSelectVariableEClass.getESuperTypes().add(this.getISqmlVariable());
		iSqmlTableVariableEClass.getESuperTypes().add(this.getISqmlVariable());
		iSqmlVariableEClass.getESuperTypes().add(this.getISqmlGeneratable());
		iSqmlVariableEClass.getESuperTypes().add(this.getISqmlValue());
		iSqmlVariableEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlWhereClauseEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlWhereClauseEClass.getESuperTypes().add(this.getISqmlSelectPart());
		iSqmlDefaultValueEClass.getESuperTypes().add(this.getISqmlExpression());
		iSqmlIndexKeyEClass.getESuperTypes().add(this.getISqmlTableKey());
		iSqmlLiteralDefaultValueEClass.getESuperTypes().add(this.getISqmlDefaultValue());
		iSqmlRowConstructorDefaultValueEClass.getESuperTypes().add(this.getISqmlDefaultValue());
		iSqmlTableEClass.getESuperTypes().add(this.getISqmlFileElement());
		iSqmlTableEClass.getESuperTypes().add(this.getISqmlTabular());
		iSqmlTableEClass.getESuperTypes().add(this.getISqmlTypeDefinition());
		iSqmlTableColumnEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlTableColumnEClass.getESuperTypes().add(this.getISqmlColumn());
		iSqmlTableKeyEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlUniqueKeyEClass.getESuperTypes().add(this.getISqmlTableKey());
		iSqmlValueReferenceDefaultValueEClass.getESuperTypes().add(this.getISqmlDefaultValue());
		iSqmlEnumEClass.getESuperTypes().add(this.getISqmlTypeDefinition());
		iSqmlEnumEClass.getESuperTypes().add(this.getISqmlGlobalObject());
		iSqmlEnumeratorEClass.getESuperTypes().add(this.getISqmlValidatable());
		iSqmlEnumeratorEClass.getESuperTypes().add(this.getISqmlValue());
		iSqmlEnumeratorEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlTopLevelTypeDefinitionEClass.getESuperTypes().add(this.getISqmlTypeDefinition());
		iSqmlTopLevelTypeDefinitionEClass.getESuperTypes().add(this.getISqmlFileElement());
		iSqmlTypeDefinitionEClass.getESuperTypes().add(this.getISqmlType());
		iSqmlTypeDefinitionEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlTypeReferenceEClass.getESuperTypes().add(this.getISqmlModelElement());
		iSqmlValueTypeEClass.getESuperTypes().add(this.getISqmlFileElement());
		iSqmlValueTypeEClass.getESuperTypes().add(this.getISqmlTypeDefinition());

		// Initialize classes, features, and operations; add parameters
		initEClass(iSqmlAndEClass, ISqmlAnd.class, "ISqmlAnd", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlBetweenEClass, ISqmlBetween.class, "ISqmlBetween", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlComparisonEClass, ISqmlComparison.class, "ISqmlComparison", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlConditionEClass, ISqmlCondition.class, "ISqmlCondition", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlExistsEClass, ISqmlExists.class, "ISqmlExists", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlInEClass, ISqmlIn.class, "ISqmlIn", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlIsNullEClass, ISqmlIsNull.class, "ISqmlIsNull", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlLikeEClass, ISqmlLike.class, "ISqmlLike", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlNotEClass, ISqmlNot.class, "ISqmlNot", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlOrEClass, ISqmlOr.class, "ISqmlOr", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlRegexpEClass, ISqmlRegexp.class, "ISqmlRegexp", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlAdditionEClass, ISqmlAddition.class, "ISqmlAddition", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlCaseEClass, ISqmlCase.class, "ISqmlCase", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlCaseWhenEClass, ISqmlCaseWhen.class, "ISqmlCaseWhen", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlBinaryOperationEClass, ISqmlBinaryOperation.class, "ISqmlBinaryOperation", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlExpressionEClass, ISqmlExpression.class, "ISqmlExpression", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlGroupConcatEClass, ISqmlGroupConcat.class, "ISqmlGroupConcat", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlIfEClass, ISqmlIf.class, "ISqmlIf", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlIfNullEClass, ISqmlIfNull.class, "ISqmlIfNull", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlMultiplicationEClass, ISqmlMultiplication.class, "ISqmlMultiplication", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlNegationEClass, ISqmlNegation.class, "ISqmlNegation", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlPathEClass, ISqmlPath.class, "ISqmlPath", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlRowConstructorEClass, ISqmlRowConstructor.class, "ISqmlRowConstructor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticAndEClass, ISqmlStaticAnd.class, "ISqmlStaticAnd", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticExpressionEClass, ISqmlStaticExpression.class, "ISqmlStaticExpression", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticIfEClass, ISqmlStaticIf.class, "ISqmlStaticIf", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticIsEmptyEClass, ISqmlStaticIsEmpty.class, "ISqmlStaticIsEmpty", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticIsNullEClass, ISqmlStaticIsNull.class, "ISqmlStaticIsNull", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticIsTrueEClass, ISqmlStaticIsTrue.class, "ISqmlStaticIsTrue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticOrEClass, ISqmlStaticOr.class, "ISqmlStaticOr", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticParameterTestEClass, ISqmlStaticParameterTest.class, "ISqmlStaticParameterTest", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticParenthesesEClass, ISqmlStaticParentheses.class, "ISqmlStaticParentheses", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticVariableReferenceEClass, ISqmlStaticVariableReference.class, "ISqmlStaticVariableReference", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSubSelectEClass, ISqmlSubSelect.class, "ISqmlSubSelect", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlUnaryOperationEClass, ISqmlUnaryOperation.class, "ISqmlUnaryOperation", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlValueReferenceEClass, ISqmlValueReference.class, "ISqmlValueReference", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlFileEClass, ISqmlFile.class, "ISqmlFile", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlFileElementEClass, ISqmlFileElement.class, "ISqmlFileElement", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlImportEClass, ISqmlImport.class, "ISqmlImport", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlPackageDeclarationEClass, ISqmlPackageDeclaration.class, "ISqmlPackageDeclaration", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlFunctionEClass, ISqmlFunction.class, "ISqmlFunction", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlFunctionCallEClass, ISqmlFunctionCall.class, "ISqmlFunctionCall", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlFunctionParameterEClass, ISqmlFunctionParameter.class, "ISqmlFunctionParameter", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSqlEClass, ISqmlSql.class, "ISqmlSql", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSqlIdEClass, ISqmlSqlId.class, "ISqmlSqlId", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSqlKeywordEClass, ISqmlSqlKeyword.class, "ISqmlSqlKeyword", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSqlNumberLiteralEClass, ISqmlSqlNumberLiteral.class, "ISqmlSqlNumberLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSqlStringLiteralEClass, ISqmlSqlStringLiteral.class, "ISqmlSqlStringLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSqlSymbolEClass, ISqmlSqlSymbol.class, "ISqmlSqlSymbol", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlBooleanLiteralEClass, ISqmlBooleanLiteral.class, "ISqmlBooleanLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlDecimalLiteralEClass, ISqmlDecimalLiteral.class, "ISqmlDecimalLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlDoubleLiteralEClass, ISqmlDoubleLiteral.class, "ISqmlDoubleLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlFloatLiteralEClass, ISqmlFloatLiteral.class, "ISqmlFloatLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlIntegerLiteralEClass, ISqmlIntegerLiteral.class, "ISqmlIntegerLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlLiteralEClass, ISqmlLiteral.class, "ISqmlLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS, "com.softicar.sqml.model.literals.ISqmlLiteral<?>");

		initEClass(iSqmlLongLiteralEClass, ISqmlLongLiteral.class, "ISqmlLongLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStringLiteralEClass, ISqmlStringLiteral.class, "ISqmlStringLiteral", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlColumnEClass, ISqmlColumn.class, "ISqmlColumn", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlGeneratableEClass, ISqmlGeneratable.class, "ISqmlGeneratable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlGlobalObjectEClass, ISqmlGlobalObject.class, "ISqmlGlobalObject", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlModelElementEClass, ISqmlModelElement.class, "ISqmlModelElement", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlModelVisitorEClass, ISqmlModelVisitor.class, "ISqmlModelVisitor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlStaticVariableEClass, ISqmlStaticVariable.class, "ISqmlStaticVariable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTabularEClass, ISqmlTabular.class, "ISqmlTabular", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlValueEClass, ISqmlValue.class, "ISqmlValue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlQueryEClass, ISqmlQuery.class, "ISqmlQuery", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlQueryParameterEClass, ISqmlQueryParameter.class, "ISqmlQueryParameter", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlForeignKeyVariableEClass, ISqmlForeignKeyVariable.class, "ISqmlForeignKeyVariable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlFromClauseEClass, ISqmlFromClause.class, "ISqmlFromClause", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlGroupByClauseEClass, ISqmlGroupByClause.class, "ISqmlGroupByClause", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlHavingClauseEClass, ISqmlHavingClause.class, "ISqmlHavingClause", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlJoinClauseEClass, ISqmlJoinClause.class, "ISqmlJoinClause", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlOrderByClauseEClass, ISqmlOrderByClause.class, "ISqmlOrderByClause", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlOrderByExpressionEClass, ISqmlOrderByExpression.class, "ISqmlOrderByExpression", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectEClass, ISqmlSelect.class, "ISqmlSelect", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectBlockEClass, ISqmlSelectBlock.class, "ISqmlSelectBlock", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectClauseEClass, ISqmlSelectClause.class, "ISqmlSelectClause", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectColumnEClass, ISqmlSelectColumn.class, "ISqmlSelectColumn", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectElseEClass, ISqmlSelectElse.class, "ISqmlSelectElse", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectElseIfEClass, ISqmlSelectElseIf.class, "ISqmlSelectElseIf", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectIfEClass, ISqmlSelectIf.class, "ISqmlSelectIf", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSelectPartEClass, ISqmlSelectPart.class, "ISqmlSelectPart", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlSubSelectVariableEClass, ISqmlSubSelectVariable.class, "ISqmlSubSelectVariable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTableVariableEClass, ISqmlTableVariable.class, "ISqmlTableVariable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlVariableEClass, ISqmlVariable.class, "ISqmlVariable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlWhereClauseEClass, ISqmlWhereClause.class, "ISqmlWhereClause", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlDefaultValueEClass, ISqmlDefaultValue.class, "ISqmlDefaultValue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlIndexKeyEClass, ISqmlIndexKey.class, "ISqmlIndexKey", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlLiteralDefaultValueEClass, ISqmlLiteralDefaultValue.class, "ISqmlLiteralDefaultValue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlRowConstructorDefaultValueEClass, ISqmlRowConstructorDefaultValue.class, "ISqmlRowConstructorDefaultValue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTableEClass, ISqmlTable.class, "ISqmlTable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTableColumnEClass, ISqmlTableColumn.class, "ISqmlTableColumn", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTableKeyEClass, ISqmlTableKey.class, "ISqmlTableKey", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTableRowEClass, ISqmlTableRow.class, "ISqmlTableRow", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTableRowValueEClass, ISqmlTableRowValue.class, "ISqmlTableRowValue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlUniqueKeyEClass, ISqmlUniqueKey.class, "ISqmlUniqueKey", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlValueReferenceDefaultValueEClass, ISqmlValueReferenceDefaultValue.class, "ISqmlValueReferenceDefaultValue", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlEnumEClass, ISqmlEnum.class, "ISqmlEnum", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlEnumeratorEClass, ISqmlEnumerator.class, "ISqmlEnumerator", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTopLevelTypeDefinitionEClass, ISqmlTopLevelTypeDefinition.class, "ISqmlTopLevelTypeDefinition", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTypeEClass, ISqmlType.class, "ISqmlType", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTypeDefinitionEClass, ISqmlTypeDefinition.class, "ISqmlTypeDefinition", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlTypeReferenceEClass, ISqmlTypeReference.class, "ISqmlTypeReference", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlValueTypeEClass, ISqmlValueType.class, "ISqmlValueType", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlIssueAcceptorEClass, ISqmlIssueAcceptor.class, "ISqmlIssueAcceptor", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSqmlValidatableEClass, ISqmlValidatable.class, "ISqmlValidatable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //InterfacesPackageImpl
