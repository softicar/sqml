/**
 */
package com.softicar.sqml.model.interfaces.util;

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

import com.softicar.sqml.model.interfaces.*;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.interfaces.InterfacesPackage
 * @generated
 */
public class InterfacesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfacesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = InterfacesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfacesSwitch<Adapter> modelSwitch =
		new InterfacesSwitch<Adapter>() {
			@Override
			public Adapter caseISqmlAnd(ISqmlAnd object) {
				return createISqmlAndAdapter();
			}
			@Override
			public Adapter caseISqmlBetween(ISqmlBetween object) {
				return createISqmlBetweenAdapter();
			}
			@Override
			public Adapter caseISqmlComparison(ISqmlComparison object) {
				return createISqmlComparisonAdapter();
			}
			@Override
			public Adapter caseISqmlCondition(ISqmlCondition object) {
				return createISqmlConditionAdapter();
			}
			@Override
			public Adapter caseISqmlExists(ISqmlExists object) {
				return createISqmlExistsAdapter();
			}
			@Override
			public Adapter caseISqmlIn(ISqmlIn object) {
				return createISqmlInAdapter();
			}
			@Override
			public Adapter caseISqmlIsNull(ISqmlIsNull object) {
				return createISqmlIsNullAdapter();
			}
			@Override
			public Adapter caseISqmlLike(ISqmlLike object) {
				return createISqmlLikeAdapter();
			}
			@Override
			public Adapter caseISqmlNot(ISqmlNot object) {
				return createISqmlNotAdapter();
			}
			@Override
			public Adapter caseISqmlOr(ISqmlOr object) {
				return createISqmlOrAdapter();
			}
			@Override
			public Adapter caseISqmlRegexp(ISqmlRegexp object) {
				return createISqmlRegexpAdapter();
			}
			@Override
			public Adapter caseISqmlAddition(ISqmlAddition object) {
				return createISqmlAdditionAdapter();
			}
			@Override
			public Adapter caseISqmlCase(ISqmlCase object) {
				return createISqmlCaseAdapter();
			}
			@Override
			public Adapter caseISqmlCaseWhen(ISqmlCaseWhen object) {
				return createISqmlCaseWhenAdapter();
			}
			@Override
			public Adapter caseISqmlBinaryOperation(ISqmlBinaryOperation object) {
				return createISqmlBinaryOperationAdapter();
			}
			@Override
			public Adapter caseISqmlExpression(ISqmlExpression object) {
				return createISqmlExpressionAdapter();
			}
			@Override
			public Adapter caseISqmlGroupConcat(ISqmlGroupConcat object) {
				return createISqmlGroupConcatAdapter();
			}
			@Override
			public Adapter caseISqmlIf(ISqmlIf object) {
				return createISqmlIfAdapter();
			}
			@Override
			public Adapter caseISqmlIfNull(ISqmlIfNull object) {
				return createISqmlIfNullAdapter();
			}
			@Override
			public Adapter caseISqmlMultiplication(ISqmlMultiplication object) {
				return createISqmlMultiplicationAdapter();
			}
			@Override
			public Adapter caseISqmlNegation(ISqmlNegation object) {
				return createISqmlNegationAdapter();
			}
			@Override
			public Adapter caseISqmlPath(ISqmlPath object) {
				return createISqmlPathAdapter();
			}
			@Override
			public Adapter caseISqmlRowConstructor(ISqmlRowConstructor object) {
				return createISqmlRowConstructorAdapter();
			}
			@Override
			public Adapter caseISqmlStaticAnd(ISqmlStaticAnd object) {
				return createISqmlStaticAndAdapter();
			}
			@Override
			public Adapter caseISqmlStaticExpression(ISqmlStaticExpression object) {
				return createISqmlStaticExpressionAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIf(ISqmlStaticIf object) {
				return createISqmlStaticIfAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIsEmpty(ISqmlStaticIsEmpty object) {
				return createISqmlStaticIsEmptyAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIsNull(ISqmlStaticIsNull object) {
				return createISqmlStaticIsNullAdapter();
			}
			@Override
			public Adapter caseISqmlStaticIsTrue(ISqmlStaticIsTrue object) {
				return createISqmlStaticIsTrueAdapter();
			}
			@Override
			public Adapter caseISqmlStaticOr(ISqmlStaticOr object) {
				return createISqmlStaticOrAdapter();
			}
			@Override
			public Adapter caseISqmlStaticParameterTest(ISqmlStaticParameterTest object) {
				return createISqmlStaticParameterTestAdapter();
			}
			@Override
			public Adapter caseISqmlStaticParentheses(ISqmlStaticParentheses object) {
				return createISqmlStaticParenthesesAdapter();
			}
			@Override
			public Adapter caseISqmlStaticVariableReference(ISqmlStaticVariableReference object) {
				return createISqmlStaticVariableReferenceAdapter();
			}
			@Override
			public Adapter caseISqmlSubSelect(ISqmlSubSelect object) {
				return createISqmlSubSelectAdapter();
			}
			@Override
			public Adapter caseISqmlUnaryOperation(ISqmlUnaryOperation object) {
				return createISqmlUnaryOperationAdapter();
			}
			@Override
			public Adapter caseISqmlValueReference(ISqmlValueReference object) {
				return createISqmlValueReferenceAdapter();
			}
			@Override
			public Adapter caseISqmlFile(ISqmlFile object) {
				return createISqmlFileAdapter();
			}
			@Override
			public Adapter caseISqmlFileElement(ISqmlFileElement object) {
				return createISqmlFileElementAdapter();
			}
			@Override
			public Adapter caseISqmlImport(ISqmlImport object) {
				return createISqmlImportAdapter();
			}
			@Override
			public Adapter caseISqmlPackageDeclaration(ISqmlPackageDeclaration object) {
				return createISqmlPackageDeclarationAdapter();
			}
			@Override
			public Adapter caseISqmlFunction(ISqmlFunction object) {
				return createISqmlFunctionAdapter();
			}
			@Override
			public Adapter caseISqmlFunctionCall(ISqmlFunctionCall object) {
				return createISqmlFunctionCallAdapter();
			}
			@Override
			public Adapter caseISqmlFunctionParameter(ISqmlFunctionParameter object) {
				return createISqmlFunctionParameterAdapter();
			}
			@Override
			public Adapter caseISqmlSql(ISqmlSql object) {
				return createISqmlSqlAdapter();
			}
			@Override
			public Adapter caseISqmlSqlId(ISqmlSqlId object) {
				return createISqmlSqlIdAdapter();
			}
			@Override
			public Adapter caseISqmlSqlKeyword(ISqmlSqlKeyword object) {
				return createISqmlSqlKeywordAdapter();
			}
			@Override
			public Adapter caseISqmlSqlNumberLiteral(ISqmlSqlNumberLiteral object) {
				return createISqmlSqlNumberLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlSqlStringLiteral(ISqmlSqlStringLiteral object) {
				return createISqmlSqlStringLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlSqlSymbol(ISqmlSqlSymbol object) {
				return createISqmlSqlSymbolAdapter();
			}
			@Override
			public Adapter caseISqmlBooleanLiteral(ISqmlBooleanLiteral object) {
				return createISqmlBooleanLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlDecimalLiteral(ISqmlDecimalLiteral object) {
				return createISqmlDecimalLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlDoubleLiteral(ISqmlDoubleLiteral object) {
				return createISqmlDoubleLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlFloatLiteral(ISqmlFloatLiteral object) {
				return createISqmlFloatLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlIntegerLiteral(ISqmlIntegerLiteral object) {
				return createISqmlIntegerLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlLiteral(ISqmlLiteral<?> object) {
				return createISqmlLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlLongLiteral(ISqmlLongLiteral object) {
				return createISqmlLongLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlStringLiteral(ISqmlStringLiteral object) {
				return createISqmlStringLiteralAdapter();
			}
			@Override
			public Adapter caseISqmlColumn(ISqmlColumn object) {
				return createISqmlColumnAdapter();
			}
			@Override
			public Adapter caseISqmlGeneratable(ISqmlGeneratable object) {
				return createISqmlGeneratableAdapter();
			}
			@Override
			public Adapter caseISqmlGlobalObject(ISqmlGlobalObject object) {
				return createISqmlGlobalObjectAdapter();
			}
			@Override
			public Adapter caseISqmlModelElement(ISqmlModelElement object) {
				return createISqmlModelElementAdapter();
			}
			@Override
			public Adapter caseISqmlModelVisitor(ISqmlModelVisitor object) {
				return createISqmlModelVisitorAdapter();
			}
			@Override
			public Adapter caseISqmlStaticVariable(ISqmlStaticVariable object) {
				return createISqmlStaticVariableAdapter();
			}
			@Override
			public Adapter caseISqmlTabular(ISqmlTabular object) {
				return createISqmlTabularAdapter();
			}
			@Override
			public Adapter caseISqmlValue(ISqmlValue object) {
				return createISqmlValueAdapter();
			}
			@Override
			public Adapter caseISqmlQuery(ISqmlQuery object) {
				return createISqmlQueryAdapter();
			}
			@Override
			public Adapter caseISqmlQueryParameter(ISqmlQueryParameter object) {
				return createISqmlQueryParameterAdapter();
			}
			@Override
			public Adapter caseISqmlForeignKeyVariable(ISqmlForeignKeyVariable object) {
				return createISqmlForeignKeyVariableAdapter();
			}
			@Override
			public Adapter caseISqmlFromClause(ISqmlFromClause object) {
				return createISqmlFromClauseAdapter();
			}
			@Override
			public Adapter caseISqmlGroupByClause(ISqmlGroupByClause object) {
				return createISqmlGroupByClauseAdapter();
			}
			@Override
			public Adapter caseISqmlHavingClause(ISqmlHavingClause object) {
				return createISqmlHavingClauseAdapter();
			}
			@Override
			public Adapter caseISqmlJoinClause(ISqmlJoinClause object) {
				return createISqmlJoinClauseAdapter();
			}
			@Override
			public Adapter caseISqmlOrderByClause(ISqmlOrderByClause object) {
				return createISqmlOrderByClauseAdapter();
			}
			@Override
			public Adapter caseISqmlOrderByExpression(ISqmlOrderByExpression object) {
				return createISqmlOrderByExpressionAdapter();
			}
			@Override
			public Adapter caseISqmlSelect(ISqmlSelect object) {
				return createISqmlSelectAdapter();
			}
			@Override
			public Adapter caseISqmlSelectBlock(ISqmlSelectBlock object) {
				return createISqmlSelectBlockAdapter();
			}
			@Override
			public Adapter caseISqmlSelectClause(ISqmlSelectClause object) {
				return createISqmlSelectClauseAdapter();
			}
			@Override
			public Adapter caseISqmlSelectColumn(ISqmlSelectColumn object) {
				return createISqmlSelectColumnAdapter();
			}
			@Override
			public Adapter caseISqmlSelectElse(ISqmlSelectElse object) {
				return createISqmlSelectElseAdapter();
			}
			@Override
			public Adapter caseISqmlSelectElseIf(ISqmlSelectElseIf object) {
				return createISqmlSelectElseIfAdapter();
			}
			@Override
			public Adapter caseISqmlSelectIf(ISqmlSelectIf object) {
				return createISqmlSelectIfAdapter();
			}
			@Override
			public Adapter caseISqmlSelectPart(ISqmlSelectPart object) {
				return createISqmlSelectPartAdapter();
			}
			@Override
			public Adapter caseISqmlSubSelectVariable(ISqmlSubSelectVariable object) {
				return createISqmlSubSelectVariableAdapter();
			}
			@Override
			public Adapter caseISqmlTableVariable(ISqmlTableVariable object) {
				return createISqmlTableVariableAdapter();
			}
			@Override
			public Adapter caseISqmlVariable(ISqmlVariable object) {
				return createISqmlVariableAdapter();
			}
			@Override
			public Adapter caseISqmlWhereClause(ISqmlWhereClause object) {
				return createISqmlWhereClauseAdapter();
			}
			@Override
			public Adapter caseISqmlDefaultValue(ISqmlDefaultValue object) {
				return createISqmlDefaultValueAdapter();
			}
			@Override
			public Adapter caseISqmlIndexKey(ISqmlIndexKey object) {
				return createISqmlIndexKeyAdapter();
			}
			@Override
			public Adapter caseISqmlLiteralDefaultValue(ISqmlLiteralDefaultValue object) {
				return createISqmlLiteralDefaultValueAdapter();
			}
			@Override
			public Adapter caseISqmlRowConstructorDefaultValue(ISqmlRowConstructorDefaultValue object) {
				return createISqmlRowConstructorDefaultValueAdapter();
			}
			@Override
			public Adapter caseISqmlTable(ISqmlTable object) {
				return createISqmlTableAdapter();
			}
			@Override
			public Adapter caseISqmlTableColumn(ISqmlTableColumn object) {
				return createISqmlTableColumnAdapter();
			}
			@Override
			public Adapter caseISqmlTableKey(ISqmlTableKey object) {
				return createISqmlTableKeyAdapter();
			}
			@Override
			public Adapter caseISqmlTableRow(ISqmlTableRow object) {
				return createISqmlTableRowAdapter();
			}
			@Override
			public Adapter caseISqmlTableRowValue(ISqmlTableRowValue object) {
				return createISqmlTableRowValueAdapter();
			}
			@Override
			public Adapter caseISqmlUniqueKey(ISqmlUniqueKey object) {
				return createISqmlUniqueKeyAdapter();
			}
			@Override
			public Adapter caseISqmlValueReferenceDefaultValue(ISqmlValueReferenceDefaultValue object) {
				return createISqmlValueReferenceDefaultValueAdapter();
			}
			@Override
			public Adapter caseISqmlEnum(ISqmlEnum object) {
				return createISqmlEnumAdapter();
			}
			@Override
			public Adapter caseISqmlEnumerator(ISqmlEnumerator object) {
				return createISqmlEnumeratorAdapter();
			}
			@Override
			public Adapter caseISqmlTopLevelTypeDefinition(ISqmlTopLevelTypeDefinition object) {
				return createISqmlTopLevelTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseISqmlType(ISqmlType object) {
				return createISqmlTypeAdapter();
			}
			@Override
			public Adapter caseISqmlTypeDefinition(ISqmlTypeDefinition object) {
				return createISqmlTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseISqmlTypeReference(ISqmlTypeReference object) {
				return createISqmlTypeReferenceAdapter();
			}
			@Override
			public Adapter caseISqmlValueType(ISqmlValueType object) {
				return createISqmlValueTypeAdapter();
			}
			@Override
			public Adapter caseISqmlIssueAcceptor(ISqmlIssueAcceptor object) {
				return createISqmlIssueAcceptorAdapter();
			}
			@Override
			public Adapter caseISqmlValidatable(ISqmlValidatable object) {
				return createISqmlValidatableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlAnd <em>ISqml And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlAnd
	 * @generated
	 */
	public Adapter createISqmlAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlBetween <em>ISqml Between</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlBetween
	 * @generated
	 */
	public Adapter createISqmlBetweenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlComparison <em>ISqml Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlComparison
	 * @generated
	 */
	public Adapter createISqmlComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlCondition <em>ISqml Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlCondition
	 * @generated
	 */
	public Adapter createISqmlConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlExists <em>ISqml Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlExists
	 * @generated
	 */
	public Adapter createISqmlExistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlIn <em>ISqml In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlIn
	 * @generated
	 */
	public Adapter createISqmlInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlIsNull <em>ISqml Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlIsNull
	 * @generated
	 */
	public Adapter createISqmlIsNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlLike <em>ISqml Like</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlLike
	 * @generated
	 */
	public Adapter createISqmlLikeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlNot <em>ISqml Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlNot
	 * @generated
	 */
	public Adapter createISqmlNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlOr <em>ISqml Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlOr
	 * @generated
	 */
	public Adapter createISqmlOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.conditions.ISqmlRegexp <em>ISqml Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.conditions.ISqmlRegexp
	 * @generated
	 */
	public Adapter createISqmlRegexpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlAddition <em>ISqml Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlAddition
	 * @generated
	 */
	public Adapter createISqmlAdditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlCase <em>ISqml Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlCase
	 * @generated
	 */
	public Adapter createISqmlCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlCaseWhen <em>ISqml Case When</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlCaseWhen
	 * @generated
	 */
	public Adapter createISqmlCaseWhenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlBinaryOperation <em>ISqml Binary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlBinaryOperation
	 * @generated
	 */
	public Adapter createISqmlBinaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlExpression <em>ISqml Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlExpression
	 * @generated
	 */
	public Adapter createISqmlExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlGroupConcat <em>ISqml Group Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlGroupConcat
	 * @generated
	 */
	public Adapter createISqmlGroupConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlIf <em>ISqml If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlIf
	 * @generated
	 */
	public Adapter createISqmlIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlIfNull <em>ISqml If Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlIfNull
	 * @generated
	 */
	public Adapter createISqmlIfNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlMultiplication <em>ISqml Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlMultiplication
	 * @generated
	 */
	public Adapter createISqmlMultiplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlNegation <em>ISqml Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlNegation
	 * @generated
	 */
	public Adapter createISqmlNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlPath <em>ISqml Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlPath
	 * @generated
	 */
	public Adapter createISqmlPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlRowConstructor <em>ISqml Row Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlRowConstructor
	 * @generated
	 */
	public Adapter createISqmlRowConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticAnd <em>ISqml Static And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticAnd
	 * @generated
	 */
	public Adapter createISqmlStaticAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticExpression <em>ISqml Static Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticExpression
	 * @generated
	 */
	public Adapter createISqmlStaticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIf <em>ISqml Static If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIf
	 * @generated
	 */
	public Adapter createISqmlStaticIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty <em>ISqml Static Is Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsEmpty
	 * @generated
	 */
	public Adapter createISqmlStaticIsEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsNull <em>ISqml Static Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsNull
	 * @generated
	 */
	public Adapter createISqmlStaticIsNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticIsTrue <em>ISqml Static Is True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticIsTrue
	 * @generated
	 */
	public Adapter createISqmlStaticIsTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticOr <em>ISqml Static Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticOr
	 * @generated
	 */
	public Adapter createISqmlStaticOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticParameterTest <em>ISqml Static Parameter Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParameterTest
	 * @generated
	 */
	public Adapter createISqmlStaticParameterTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticParentheses <em>ISqml Static Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticParentheses
	 * @generated
	 */
	public Adapter createISqmlStaticParenthesesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlStaticVariableReference <em>ISqml Static Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlStaticVariableReference
	 * @generated
	 */
	public Adapter createISqmlStaticVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlSubSelect <em>ISqml Sub Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlSubSelect
	 * @generated
	 */
	public Adapter createISqmlSubSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlUnaryOperation <em>ISqml Unary Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlUnaryOperation
	 * @generated
	 */
	public Adapter createISqmlUnaryOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.expressions.ISqmlValueReference <em>ISqml Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.expressions.ISqmlValueReference
	 * @generated
	 */
	public Adapter createISqmlValueReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlFile <em>ISqml File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlFile
	 * @generated
	 */
	public Adapter createISqmlFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlFileElement <em>ISqml File Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlFileElement
	 * @generated
	 */
	public Adapter createISqmlFileElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlImport <em>ISqml Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlImport
	 * @generated
	 */
	public Adapter createISqmlImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.files.ISqmlPackageDeclaration <em>ISqml Package Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.files.ISqmlPackageDeclaration
	 * @generated
	 */
	public Adapter createISqmlPackageDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlFunction <em>ISqml Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlFunction
	 * @generated
	 */
	public Adapter createISqmlFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlFunctionCall <em>ISqml Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionCall
	 * @generated
	 */
	public Adapter createISqmlFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlFunctionParameter <em>ISqml Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlFunctionParameter
	 * @generated
	 */
	public Adapter createISqmlFunctionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSql <em>ISqml Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSql
	 * @generated
	 */
	public Adapter createISqmlSqlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlId <em>ISqml Sql Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlId
	 * @generated
	 */
	public Adapter createISqmlSqlIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlKeyword <em>ISqml Sql Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlKeyword
	 * @generated
	 */
	public Adapter createISqmlSqlKeywordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral <em>ISqml Sql Number Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral
	 * @generated
	 */
	public Adapter createISqmlSqlNumberLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlStringLiteral <em>ISqml Sql String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlStringLiteral
	 * @generated
	 */
	public Adapter createISqmlSqlStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.functions.ISqmlSqlSymbol <em>ISqml Sql Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.functions.ISqmlSqlSymbol
	 * @generated
	 */
	public Adapter createISqmlSqlSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlBooleanLiteral <em>ISqml Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlBooleanLiteral
	 * @generated
	 */
	public Adapter createISqmlBooleanLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlDecimalLiteral <em>ISqml Decimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlDecimalLiteral
	 * @generated
	 */
	public Adapter createISqmlDecimalLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlDoubleLiteral <em>ISqml Double Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlDoubleLiteral
	 * @generated
	 */
	public Adapter createISqmlDoubleLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlFloatLiteral <em>ISqml Float Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlFloatLiteral
	 * @generated
	 */
	public Adapter createISqmlFloatLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlIntegerLiteral <em>ISqml Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlIntegerLiteral
	 * @generated
	 */
	public Adapter createISqmlIntegerLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlLiteral <em>ISqml Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlLiteral
	 * @generated
	 */
	public Adapter createISqmlLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlLongLiteral <em>ISqml Long Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlLongLiteral
	 * @generated
	 */
	public Adapter createISqmlLongLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.literals.ISqmlStringLiteral <em>ISqml String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.literals.ISqmlStringLiteral
	 * @generated
	 */
	public Adapter createISqmlStringLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlColumn <em>ISqml Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlColumn
	 * @generated
	 */
	public Adapter createISqmlColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlGeneratable <em>ISqml Generatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlGeneratable
	 * @generated
	 */
	public Adapter createISqmlGeneratableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlGlobalObject <em>ISqml Global Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlGlobalObject
	 * @generated
	 */
	public Adapter createISqmlGlobalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlModelElement <em>ISqml Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlModelElement
	 * @generated
	 */
	public Adapter createISqmlModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlModelVisitor <em>ISqml Model Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlModelVisitor
	 * @generated
	 */
	public Adapter createISqmlModelVisitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlStaticVariable <em>ISqml Static Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlStaticVariable
	 * @generated
	 */
	public Adapter createISqmlStaticVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlTabular <em>ISqml Tabular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlTabular
	 * @generated
	 */
	public Adapter createISqmlTabularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.ISqmlValue <em>ISqml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.ISqmlValue
	 * @generated
	 */
	public Adapter createISqmlValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.queries.ISqmlQuery <em>ISqml Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.queries.ISqmlQuery
	 * @generated
	 */
	public Adapter createISqmlQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.queries.ISqmlQueryParameter <em>ISqml Query Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.queries.ISqmlQueryParameter
	 * @generated
	 */
	public Adapter createISqmlQueryParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlForeignKeyVariable <em>ISqml Foreign Key Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlForeignKeyVariable
	 * @generated
	 */
	public Adapter createISqmlForeignKeyVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlFromClause <em>ISqml From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlFromClause
	 * @generated
	 */
	public Adapter createISqmlFromClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlGroupByClause <em>ISqml Group By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlGroupByClause
	 * @generated
	 */
	public Adapter createISqmlGroupByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlHavingClause <em>ISqml Having Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlHavingClause
	 * @generated
	 */
	public Adapter createISqmlHavingClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlJoinClause <em>ISqml Join Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlJoinClause
	 * @generated
	 */
	public Adapter createISqmlJoinClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlOrderByClause <em>ISqml Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByClause
	 * @generated
	 */
	public Adapter createISqmlOrderByClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlOrderByExpression <em>ISqml Order By Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlOrderByExpression
	 * @generated
	 */
	public Adapter createISqmlOrderByExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelect <em>ISqml Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelect
	 * @generated
	 */
	public Adapter createISqmlSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectBlock <em>ISqml Select Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectBlock
	 * @generated
	 */
	public Adapter createISqmlSelectBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectClause <em>ISqml Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectClause
	 * @generated
	 */
	public Adapter createISqmlSelectClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectColumn <em>ISqml Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectColumn
	 * @generated
	 */
	public Adapter createISqmlSelectColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectElse <em>ISqml Select Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElse
	 * @generated
	 */
	public Adapter createISqmlSelectElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectElseIf <em>ISqml Select Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectElseIf
	 * @generated
	 */
	public Adapter createISqmlSelectElseIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectIf <em>ISqml Select If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectIf
	 * @generated
	 */
	public Adapter createISqmlSelectIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSelectPart <em>ISqml Select Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSelectPart
	 * @generated
	 */
	public Adapter createISqmlSelectPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlSubSelectVariable <em>ISqml Sub Select Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlSubSelectVariable
	 * @generated
	 */
	public Adapter createISqmlSubSelectVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlTableVariable <em>ISqml Table Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlTableVariable
	 * @generated
	 */
	public Adapter createISqmlTableVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlVariable <em>ISqml Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlVariable
	 * @generated
	 */
	public Adapter createISqmlVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.selects.ISqmlWhereClause <em>ISqml Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.selects.ISqmlWhereClause
	 * @generated
	 */
	public Adapter createISqmlWhereClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlDefaultValue <em>ISqml Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlDefaultValue
	 * @generated
	 */
	public Adapter createISqmlDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlIndexKey <em>ISqml Index Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlIndexKey
	 * @generated
	 */
	public Adapter createISqmlIndexKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue <em>ISqml Literal Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue
	 * @generated
	 */
	public Adapter createISqmlLiteralDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue <em>ISqml Row Constructor Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue
	 * @generated
	 */
	public Adapter createISqmlRowConstructorDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTable <em>ISqml Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTable
	 * @generated
	 */
	public Adapter createISqmlTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableColumn <em>ISqml Table Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableColumn
	 * @generated
	 */
	public Adapter createISqmlTableColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableKey <em>ISqml Table Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableKey
	 * @generated
	 */
	public Adapter createISqmlTableKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableRow <em>ISqml Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableRow
	 * @generated
	 */
	public Adapter createISqmlTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlTableRowValue <em>ISqml Table Row Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlTableRowValue
	 * @generated
	 */
	public Adapter createISqmlTableRowValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlUniqueKey <em>ISqml Unique Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlUniqueKey
	 * @generated
	 */
	public Adapter createISqmlUniqueKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue <em>ISqml Value Reference Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue
	 * @generated
	 */
	public Adapter createISqmlValueReferenceDefaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlEnum <em>ISqml Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlEnum
	 * @generated
	 */
	public Adapter createISqmlEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlEnumerator <em>ISqml Enumerator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlEnumerator
	 * @generated
	 */
	public Adapter createISqmlEnumeratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition <em>ISqml Top Level Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlTopLevelTypeDefinition
	 * @generated
	 */
	public Adapter createISqmlTopLevelTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlType <em>ISqml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlType
	 * @generated
	 */
	public Adapter createISqmlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlTypeDefinition <em>ISqml Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlTypeDefinition
	 * @generated
	 */
	public Adapter createISqmlTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlTypeReference <em>ISqml Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlTypeReference
	 * @generated
	 */
	public Adapter createISqmlTypeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.types.ISqmlValueType <em>ISqml Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.types.ISqmlValueType
	 * @generated
	 */
	public Adapter createISqmlValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.validation.ISqmlIssueAcceptor <em>ISqml Issue Acceptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.validation.ISqmlIssueAcceptor
	 * @generated
	 */
	public Adapter createISqmlIssueAcceptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.softicar.sqml.model.validation.ISqmlValidatable <em>ISqml Validatable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.softicar.sqml.model.validation.ISqmlValidatable
	 * @generated
	 */
	public Adapter createISqmlValidatableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //InterfacesAdapterFactory
