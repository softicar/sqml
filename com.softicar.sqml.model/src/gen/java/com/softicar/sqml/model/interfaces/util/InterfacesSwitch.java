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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.softicar.sqml.model.interfaces.InterfacesPackage
 * @generated
 */
public class InterfacesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InterfacesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesSwitch() {
		if (modelPackage == null) {
			modelPackage = InterfacesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InterfacesPackage.ISQML_AND: {
				ISqmlAnd iSqmlAnd = (ISqmlAnd)theEObject;
				T result = caseISqmlAnd(iSqmlAnd);
				if (result == null) result = caseISqmlCondition(iSqmlAnd);
				if (result == null) result = caseISqmlExpression(iSqmlAnd);
				if (result == null) result = caseISqmlValue(iSqmlAnd);
				if (result == null) result = caseISqmlModelElement(iSqmlAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_BETWEEN: {
				ISqmlBetween iSqmlBetween = (ISqmlBetween)theEObject;
				T result = caseISqmlBetween(iSqmlBetween);
				if (result == null) result = caseISqmlCondition(iSqmlBetween);
				if (result == null) result = caseISqmlExpression(iSqmlBetween);
				if (result == null) result = caseISqmlValue(iSqmlBetween);
				if (result == null) result = caseISqmlModelElement(iSqmlBetween);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_COMPARISON: {
				ISqmlComparison iSqmlComparison = (ISqmlComparison)theEObject;
				T result = caseISqmlComparison(iSqmlComparison);
				if (result == null) result = caseISqmlBinaryOperation(iSqmlComparison);
				if (result == null) result = caseISqmlCondition(iSqmlComparison);
				if (result == null) result = caseISqmlFunctionCall(iSqmlComparison);
				if (result == null) result = caseISqmlExpression(iSqmlComparison);
				if (result == null) result = caseISqmlValue(iSqmlComparison);
				if (result == null) result = caseISqmlModelElement(iSqmlComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_CONDITION: {
				ISqmlCondition iSqmlCondition = (ISqmlCondition)theEObject;
				T result = caseISqmlCondition(iSqmlCondition);
				if (result == null) result = caseISqmlExpression(iSqmlCondition);
				if (result == null) result = caseISqmlValue(iSqmlCondition);
				if (result == null) result = caseISqmlModelElement(iSqmlCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_EXISTS: {
				ISqmlExists iSqmlExists = (ISqmlExists)theEObject;
				T result = caseISqmlExists(iSqmlExists);
				if (result == null) result = caseISqmlCondition(iSqmlExists);
				if (result == null) result = caseISqmlExpression(iSqmlExists);
				if (result == null) result = caseISqmlValue(iSqmlExists);
				if (result == null) result = caseISqmlModelElement(iSqmlExists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_IN: {
				ISqmlIn iSqmlIn = (ISqmlIn)theEObject;
				T result = caseISqmlIn(iSqmlIn);
				if (result == null) result = caseISqmlCondition(iSqmlIn);
				if (result == null) result = caseISqmlExpression(iSqmlIn);
				if (result == null) result = caseISqmlValue(iSqmlIn);
				if (result == null) result = caseISqmlModelElement(iSqmlIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_IS_NULL: {
				ISqmlIsNull iSqmlIsNull = (ISqmlIsNull)theEObject;
				T result = caseISqmlIsNull(iSqmlIsNull);
				if (result == null) result = caseISqmlCondition(iSqmlIsNull);
				if (result == null) result = caseISqmlExpression(iSqmlIsNull);
				if (result == null) result = caseISqmlValue(iSqmlIsNull);
				if (result == null) result = caseISqmlModelElement(iSqmlIsNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_LIKE: {
				ISqmlLike iSqmlLike = (ISqmlLike)theEObject;
				T result = caseISqmlLike(iSqmlLike);
				if (result == null) result = caseISqmlCondition(iSqmlLike);
				if (result == null) result = caseISqmlExpression(iSqmlLike);
				if (result == null) result = caseISqmlValue(iSqmlLike);
				if (result == null) result = caseISqmlModelElement(iSqmlLike);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_NOT: {
				ISqmlNot iSqmlNot = (ISqmlNot)theEObject;
				T result = caseISqmlNot(iSqmlNot);
				if (result == null) result = caseISqmlCondition(iSqmlNot);
				if (result == null) result = caseISqmlExpression(iSqmlNot);
				if (result == null) result = caseISqmlValue(iSqmlNot);
				if (result == null) result = caseISqmlModelElement(iSqmlNot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_OR: {
				ISqmlOr iSqmlOr = (ISqmlOr)theEObject;
				T result = caseISqmlOr(iSqmlOr);
				if (result == null) result = caseISqmlCondition(iSqmlOr);
				if (result == null) result = caseISqmlExpression(iSqmlOr);
				if (result == null) result = caseISqmlValue(iSqmlOr);
				if (result == null) result = caseISqmlModelElement(iSqmlOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_REGEXP: {
				ISqmlRegexp iSqmlRegexp = (ISqmlRegexp)theEObject;
				T result = caseISqmlRegexp(iSqmlRegexp);
				if (result == null) result = caseISqmlCondition(iSqmlRegexp);
				if (result == null) result = caseISqmlExpression(iSqmlRegexp);
				if (result == null) result = caseISqmlValue(iSqmlRegexp);
				if (result == null) result = caseISqmlModelElement(iSqmlRegexp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ADDITION: {
				ISqmlAddition iSqmlAddition = (ISqmlAddition)theEObject;
				T result = caseISqmlAddition(iSqmlAddition);
				if (result == null) result = caseISqmlBinaryOperation(iSqmlAddition);
				if (result == null) result = caseISqmlFunctionCall(iSqmlAddition);
				if (result == null) result = caseISqmlExpression(iSqmlAddition);
				if (result == null) result = caseISqmlValue(iSqmlAddition);
				if (result == null) result = caseISqmlModelElement(iSqmlAddition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_CASE: {
				ISqmlCase iSqmlCase = (ISqmlCase)theEObject;
				T result = caseISqmlCase(iSqmlCase);
				if (result == null) result = caseISqmlExpression(iSqmlCase);
				if (result == null) result = caseISqmlValue(iSqmlCase);
				if (result == null) result = caseISqmlModelElement(iSqmlCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_CASE_WHEN: {
				ISqmlCaseWhen iSqmlCaseWhen = (ISqmlCaseWhen)theEObject;
				T result = caseISqmlCaseWhen(iSqmlCaseWhen);
				if (result == null) result = caseISqmlModelElement(iSqmlCaseWhen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_BINARY_OPERATION: {
				ISqmlBinaryOperation iSqmlBinaryOperation = (ISqmlBinaryOperation)theEObject;
				T result = caseISqmlBinaryOperation(iSqmlBinaryOperation);
				if (result == null) result = caseISqmlFunctionCall(iSqmlBinaryOperation);
				if (result == null) result = caseISqmlExpression(iSqmlBinaryOperation);
				if (result == null) result = caseISqmlValue(iSqmlBinaryOperation);
				if (result == null) result = caseISqmlModelElement(iSqmlBinaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_EXPRESSION: {
				ISqmlExpression iSqmlExpression = (ISqmlExpression)theEObject;
				T result = caseISqmlExpression(iSqmlExpression);
				if (result == null) result = caseISqmlValue(iSqmlExpression);
				if (result == null) result = caseISqmlModelElement(iSqmlExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_GROUP_CONCAT: {
				ISqmlGroupConcat iSqmlGroupConcat = (ISqmlGroupConcat)theEObject;
				T result = caseISqmlGroupConcat(iSqmlGroupConcat);
				if (result == null) result = caseISqmlExpression(iSqmlGroupConcat);
				if (result == null) result = caseISqmlValue(iSqmlGroupConcat);
				if (result == null) result = caseISqmlModelElement(iSqmlGroupConcat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_IF: {
				ISqmlIf iSqmlIf = (ISqmlIf)theEObject;
				T result = caseISqmlIf(iSqmlIf);
				if (result == null) result = caseISqmlExpression(iSqmlIf);
				if (result == null) result = caseISqmlValue(iSqmlIf);
				if (result == null) result = caseISqmlModelElement(iSqmlIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_IF_NULL: {
				ISqmlIfNull iSqmlIfNull = (ISqmlIfNull)theEObject;
				T result = caseISqmlIfNull(iSqmlIfNull);
				if (result == null) result = caseISqmlExpression(iSqmlIfNull);
				if (result == null) result = caseISqmlValue(iSqmlIfNull);
				if (result == null) result = caseISqmlModelElement(iSqmlIfNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_MULTIPLICATION: {
				ISqmlMultiplication iSqmlMultiplication = (ISqmlMultiplication)theEObject;
				T result = caseISqmlMultiplication(iSqmlMultiplication);
				if (result == null) result = caseISqmlBinaryOperation(iSqmlMultiplication);
				if (result == null) result = caseISqmlFunctionCall(iSqmlMultiplication);
				if (result == null) result = caseISqmlExpression(iSqmlMultiplication);
				if (result == null) result = caseISqmlValue(iSqmlMultiplication);
				if (result == null) result = caseISqmlModelElement(iSqmlMultiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_NEGATION: {
				ISqmlNegation iSqmlNegation = (ISqmlNegation)theEObject;
				T result = caseISqmlNegation(iSqmlNegation);
				if (result == null) result = caseISqmlUnaryOperation(iSqmlNegation);
				if (result == null) result = caseISqmlExpression(iSqmlNegation);
				if (result == null) result = caseISqmlValue(iSqmlNegation);
				if (result == null) result = caseISqmlModelElement(iSqmlNegation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_PATH: {
				ISqmlPath iSqmlPath = (ISqmlPath)theEObject;
				T result = caseISqmlPath(iSqmlPath);
				if (result == null) result = caseISqmlValidatable(iSqmlPath);
				if (result == null) result = caseISqmlModelElement(iSqmlPath);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ROW_CONSTRUCTOR: {
				ISqmlRowConstructor iSqmlRowConstructor = (ISqmlRowConstructor)theEObject;
				T result = caseISqmlRowConstructor(iSqmlRowConstructor);
				if (result == null) result = caseISqmlExpression(iSqmlRowConstructor);
				if (result == null) result = caseISqmlValue(iSqmlRowConstructor);
				if (result == null) result = caseISqmlModelElement(iSqmlRowConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_AND: {
				ISqmlStaticAnd iSqmlStaticAnd = (ISqmlStaticAnd)theEObject;
				T result = caseISqmlStaticAnd(iSqmlStaticAnd);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticAnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_EXPRESSION: {
				ISqmlStaticExpression iSqmlStaticExpression = (ISqmlStaticExpression)theEObject;
				T result = caseISqmlStaticExpression(iSqmlStaticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_IF: {
				ISqmlStaticIf iSqmlStaticIf = (ISqmlStaticIf)theEObject;
				T result = caseISqmlStaticIf(iSqmlStaticIf);
				if (result == null) result = caseISqmlExpression(iSqmlStaticIf);
				if (result == null) result = caseISqmlValue(iSqmlStaticIf);
				if (result == null) result = caseISqmlModelElement(iSqmlStaticIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_IS_EMPTY: {
				ISqmlStaticIsEmpty iSqmlStaticIsEmpty = (ISqmlStaticIsEmpty)theEObject;
				T result = caseISqmlStaticIsEmpty(iSqmlStaticIsEmpty);
				if (result == null) result = caseISqmlStaticParameterTest(iSqmlStaticIsEmpty);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticIsEmpty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_IS_NULL: {
				ISqmlStaticIsNull iSqmlStaticIsNull = (ISqmlStaticIsNull)theEObject;
				T result = caseISqmlStaticIsNull(iSqmlStaticIsNull);
				if (result == null) result = caseISqmlStaticParameterTest(iSqmlStaticIsNull);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticIsNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_IS_TRUE: {
				ISqmlStaticIsTrue iSqmlStaticIsTrue = (ISqmlStaticIsTrue)theEObject;
				T result = caseISqmlStaticIsTrue(iSqmlStaticIsTrue);
				if (result == null) result = caseISqmlStaticParameterTest(iSqmlStaticIsTrue);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticIsTrue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_OR: {
				ISqmlStaticOr iSqmlStaticOr = (ISqmlStaticOr)theEObject;
				T result = caseISqmlStaticOr(iSqmlStaticOr);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticOr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_PARAMETER_TEST: {
				ISqmlStaticParameterTest iSqmlStaticParameterTest = (ISqmlStaticParameterTest)theEObject;
				T result = caseISqmlStaticParameterTest(iSqmlStaticParameterTest);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticParameterTest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_PARENTHESES: {
				ISqmlStaticParentheses iSqmlStaticParentheses = (ISqmlStaticParentheses)theEObject;
				T result = caseISqmlStaticParentheses(iSqmlStaticParentheses);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticParentheses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_VARIABLE_REFERENCE: {
				ISqmlStaticVariableReference iSqmlStaticVariableReference = (ISqmlStaticVariableReference)theEObject;
				T result = caseISqmlStaticVariableReference(iSqmlStaticVariableReference);
				if (result == null) result = caseISqmlExpression(iSqmlStaticVariableReference);
				if (result == null) result = caseISqmlStaticExpression(iSqmlStaticVariableReference);
				if (result == null) result = caseISqmlValue(iSqmlStaticVariableReference);
				if (result == null) result = caseISqmlModelElement(iSqmlStaticVariableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SUB_SELECT: {
				ISqmlSubSelect iSqmlSubSelect = (ISqmlSubSelect)theEObject;
				T result = caseISqmlSubSelect(iSqmlSubSelect);
				if (result == null) result = caseISqmlExpression(iSqmlSubSelect);
				if (result == null) result = caseISqmlValue(iSqmlSubSelect);
				if (result == null) result = caseISqmlModelElement(iSqmlSubSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_UNARY_OPERATION: {
				ISqmlUnaryOperation iSqmlUnaryOperation = (ISqmlUnaryOperation)theEObject;
				T result = caseISqmlUnaryOperation(iSqmlUnaryOperation);
				if (result == null) result = caseISqmlExpression(iSqmlUnaryOperation);
				if (result == null) result = caseISqmlValue(iSqmlUnaryOperation);
				if (result == null) result = caseISqmlModelElement(iSqmlUnaryOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_VALUE_REFERENCE: {
				ISqmlValueReference iSqmlValueReference = (ISqmlValueReference)theEObject;
				T result = caseISqmlValueReference(iSqmlValueReference);
				if (result == null) result = caseISqmlValidatable(iSqmlValueReference);
				if (result == null) result = caseISqmlExpression(iSqmlValueReference);
				if (result == null) result = caseISqmlValue(iSqmlValueReference);
				if (result == null) result = caseISqmlModelElement(iSqmlValueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FILE: {
				ISqmlFile iSqmlFile = (ISqmlFile)theEObject;
				T result = caseISqmlFile(iSqmlFile);
				if (result == null) result = caseISqmlValidatable(iSqmlFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FILE_ELEMENT: {
				ISqmlFileElement iSqmlFileElement = (ISqmlFileElement)theEObject;
				T result = caseISqmlFileElement(iSqmlFileElement);
				if (result == null) result = caseISqmlGlobalObject(iSqmlFileElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_IMPORT: {
				ISqmlImport iSqmlImport = (ISqmlImport)theEObject;
				T result = caseISqmlImport(iSqmlImport);
				if (result == null) result = caseISqmlModelElement(iSqmlImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_PACKAGE_DECLARATION: {
				ISqmlPackageDeclaration iSqmlPackageDeclaration = (ISqmlPackageDeclaration)theEObject;
				T result = caseISqmlPackageDeclaration(iSqmlPackageDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FUNCTION: {
				ISqmlFunction iSqmlFunction = (ISqmlFunction)theEObject;
				T result = caseISqmlFunction(iSqmlFunction);
				if (result == null) result = caseISqmlFileElement(iSqmlFunction);
				if (result == null) result = caseISqmlGeneratable(iSqmlFunction);
				if (result == null) result = caseISqmlModelElement(iSqmlFunction);
				if (result == null) result = caseISqmlValidatable(iSqmlFunction);
				if (result == null) result = caseISqmlGlobalObject(iSqmlFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FUNCTION_CALL: {
				ISqmlFunctionCall iSqmlFunctionCall = (ISqmlFunctionCall)theEObject;
				T result = caseISqmlFunctionCall(iSqmlFunctionCall);
				if (result == null) result = caseISqmlExpression(iSqmlFunctionCall);
				if (result == null) result = caseISqmlValue(iSqmlFunctionCall);
				if (result == null) result = caseISqmlModelElement(iSqmlFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FUNCTION_PARAMETER: {
				ISqmlFunctionParameter iSqmlFunctionParameter = (ISqmlFunctionParameter)theEObject;
				T result = caseISqmlFunctionParameter(iSqmlFunctionParameter);
				if (result == null) result = caseISqmlValidatable(iSqmlFunctionParameter);
				if (result == null) result = caseISqmlStaticVariable(iSqmlFunctionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SQL: {
				ISqmlSql iSqmlSql = (ISqmlSql)theEObject;
				T result = caseISqmlSql(iSqmlSql);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SQL_ID: {
				ISqmlSqlId iSqmlSqlId = (ISqmlSqlId)theEObject;
				T result = caseISqmlSqlId(iSqmlSqlId);
				if (result == null) result = caseISqmlModelElement(iSqmlSqlId);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SQL_KEYWORD: {
				ISqmlSqlKeyword iSqmlSqlKeyword = (ISqmlSqlKeyword)theEObject;
				T result = caseISqmlSqlKeyword(iSqmlSqlKeyword);
				if (result == null) result = caseISqmlModelElement(iSqmlSqlKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SQL_NUMBER_LITERAL: {
				ISqmlSqlNumberLiteral iSqmlSqlNumberLiteral = (ISqmlSqlNumberLiteral)theEObject;
				T result = caseISqmlSqlNumberLiteral(iSqmlSqlNumberLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlSqlNumberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SQL_STRING_LITERAL: {
				ISqmlSqlStringLiteral iSqmlSqlStringLiteral = (ISqmlSqlStringLiteral)theEObject;
				T result = caseISqmlSqlStringLiteral(iSqmlSqlStringLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlSqlStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SQL_SYMBOL: {
				ISqmlSqlSymbol iSqmlSqlSymbol = (ISqmlSqlSymbol)theEObject;
				T result = caseISqmlSqlSymbol(iSqmlSqlSymbol);
				if (result == null) result = caseISqmlModelElement(iSqmlSqlSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_BOOLEAN_LITERAL: {
				ISqmlBooleanLiteral iSqmlBooleanLiteral = (ISqmlBooleanLiteral)theEObject;
				T result = caseISqmlBooleanLiteral(iSqmlBooleanLiteral);
				if (result == null) result = caseISqmlLiteral(iSqmlBooleanLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlBooleanLiteral);
				if (result == null) result = caseISqmlValue(iSqmlBooleanLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlBooleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_DECIMAL_LITERAL: {
				ISqmlDecimalLiteral iSqmlDecimalLiteral = (ISqmlDecimalLiteral)theEObject;
				T result = caseISqmlDecimalLiteral(iSqmlDecimalLiteral);
				if (result == null) result = caseISqmlLiteral(iSqmlDecimalLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlDecimalLiteral);
				if (result == null) result = caseISqmlValue(iSqmlDecimalLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlDecimalLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_DOUBLE_LITERAL: {
				ISqmlDoubleLiteral iSqmlDoubleLiteral = (ISqmlDoubleLiteral)theEObject;
				T result = caseISqmlDoubleLiteral(iSqmlDoubleLiteral);
				if (result == null) result = caseISqmlLiteral(iSqmlDoubleLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlDoubleLiteral);
				if (result == null) result = caseISqmlValue(iSqmlDoubleLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlDoubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FLOAT_LITERAL: {
				ISqmlFloatLiteral iSqmlFloatLiteral = (ISqmlFloatLiteral)theEObject;
				T result = caseISqmlFloatLiteral(iSqmlFloatLiteral);
				if (result == null) result = caseISqmlLiteral(iSqmlFloatLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlFloatLiteral);
				if (result == null) result = caseISqmlValue(iSqmlFloatLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlFloatLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_INTEGER_LITERAL: {
				ISqmlIntegerLiteral iSqmlIntegerLiteral = (ISqmlIntegerLiteral)theEObject;
				T result = caseISqmlIntegerLiteral(iSqmlIntegerLiteral);
				if (result == null) result = caseISqmlLiteral(iSqmlIntegerLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlIntegerLiteral);
				if (result == null) result = caseISqmlValue(iSqmlIntegerLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlIntegerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_LITERAL: {
				ISqmlLiteral<?> iSqmlLiteral = (ISqmlLiteral<?>)theEObject;
				T result = caseISqmlLiteral(iSqmlLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlLiteral);
				if (result == null) result = caseISqmlValue(iSqmlLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_LONG_LITERAL: {
				ISqmlLongLiteral iSqmlLongLiteral = (ISqmlLongLiteral)theEObject;
				T result = caseISqmlLongLiteral(iSqmlLongLiteral);
				if (result == null) result = caseISqmlLiteral(iSqmlLongLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlLongLiteral);
				if (result == null) result = caseISqmlValue(iSqmlLongLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlLongLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STRING_LITERAL: {
				ISqmlStringLiteral iSqmlStringLiteral = (ISqmlStringLiteral)theEObject;
				T result = caseISqmlStringLiteral(iSqmlStringLiteral);
				if (result == null) result = caseISqmlLiteral(iSqmlStringLiteral);
				if (result == null) result = caseISqmlExpression(iSqmlStringLiteral);
				if (result == null) result = caseISqmlValue(iSqmlStringLiteral);
				if (result == null) result = caseISqmlModelElement(iSqmlStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_COLUMN: {
				ISqmlColumn iSqmlColumn = (ISqmlColumn)theEObject;
				T result = caseISqmlColumn(iSqmlColumn);
				if (result == null) result = caseISqmlValue(iSqmlColumn);
				if (result == null) result = caseISqmlModelElement(iSqmlColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_GENERATABLE: {
				ISqmlGeneratable iSqmlGeneratable = (ISqmlGeneratable)theEObject;
				T result = caseISqmlGeneratable(iSqmlGeneratable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_GLOBAL_OBJECT: {
				ISqmlGlobalObject iSqmlGlobalObject = (ISqmlGlobalObject)theEObject;
				T result = caseISqmlGlobalObject(iSqmlGlobalObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_MODEL_ELEMENT: {
				ISqmlModelElement iSqmlModelElement = (ISqmlModelElement)theEObject;
				T result = caseISqmlModelElement(iSqmlModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_MODEL_VISITOR: {
				ISqmlModelVisitor iSqmlModelVisitor = (ISqmlModelVisitor)theEObject;
				T result = caseISqmlModelVisitor(iSqmlModelVisitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_STATIC_VARIABLE: {
				ISqmlStaticVariable iSqmlStaticVariable = (ISqmlStaticVariable)theEObject;
				T result = caseISqmlStaticVariable(iSqmlStaticVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TABULAR: {
				ISqmlTabular iSqmlTabular = (ISqmlTabular)theEObject;
				T result = caseISqmlTabular(iSqmlTabular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_VALUE: {
				ISqmlValue iSqmlValue = (ISqmlValue)theEObject;
				T result = caseISqmlValue(iSqmlValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_QUERY: {
				ISqmlQuery iSqmlQuery = (ISqmlQuery)theEObject;
				T result = caseISqmlQuery(iSqmlQuery);
				if (result == null) result = caseISqmlFileElement(iSqmlQuery);
				if (result == null) result = caseISqmlValidatable(iSqmlQuery);
				if (result == null) result = caseISqmlGlobalObject(iSqmlQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_QUERY_PARAMETER: {
				ISqmlQueryParameter iSqmlQueryParameter = (ISqmlQueryParameter)theEObject;
				T result = caseISqmlQueryParameter(iSqmlQueryParameter);
				if (result == null) result = caseISqmlValidatable(iSqmlQueryParameter);
				if (result == null) result = caseISqmlStaticVariable(iSqmlQueryParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FOREIGN_KEY_VARIABLE: {
				ISqmlForeignKeyVariable iSqmlForeignKeyVariable = (ISqmlForeignKeyVariable)theEObject;
				T result = caseISqmlForeignKeyVariable(iSqmlForeignKeyVariable);
				if (result == null) result = caseISqmlVariable(iSqmlForeignKeyVariable);
				if (result == null) result = caseISqmlGeneratable(iSqmlForeignKeyVariable);
				if (result == null) result = caseISqmlValue(iSqmlForeignKeyVariable);
				if (result == null) result = caseISqmlModelElement(iSqmlForeignKeyVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_FROM_CLAUSE: {
				ISqmlFromClause iSqmlFromClause = (ISqmlFromClause)theEObject;
				T result = caseISqmlFromClause(iSqmlFromClause);
				if (result == null) result = caseISqmlSelectPart(iSqmlFromClause);
				if (result == null) result = caseISqmlModelElement(iSqmlFromClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_GROUP_BY_CLAUSE: {
				ISqmlGroupByClause iSqmlGroupByClause = (ISqmlGroupByClause)theEObject;
				T result = caseISqmlGroupByClause(iSqmlGroupByClause);
				if (result == null) result = caseISqmlSelectPart(iSqmlGroupByClause);
				if (result == null) result = caseISqmlModelElement(iSqmlGroupByClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_HAVING_CLAUSE: {
				ISqmlHavingClause iSqmlHavingClause = (ISqmlHavingClause)theEObject;
				T result = caseISqmlHavingClause(iSqmlHavingClause);
				if (result == null) result = caseISqmlSelectPart(iSqmlHavingClause);
				if (result == null) result = caseISqmlModelElement(iSqmlHavingClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_JOIN_CLAUSE: {
				ISqmlJoinClause iSqmlJoinClause = (ISqmlJoinClause)theEObject;
				T result = caseISqmlJoinClause(iSqmlJoinClause);
				if (result == null) result = caseISqmlValidatable(iSqmlJoinClause);
				if (result == null) result = caseISqmlSelectPart(iSqmlJoinClause);
				if (result == null) result = caseISqmlModelElement(iSqmlJoinClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ORDER_BY_CLAUSE: {
				ISqmlOrderByClause iSqmlOrderByClause = (ISqmlOrderByClause)theEObject;
				T result = caseISqmlOrderByClause(iSqmlOrderByClause);
				if (result == null) result = caseISqmlSelectPart(iSqmlOrderByClause);
				if (result == null) result = caseISqmlModelElement(iSqmlOrderByClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ORDER_BY_EXPRESSION: {
				ISqmlOrderByExpression iSqmlOrderByExpression = (ISqmlOrderByExpression)theEObject;
				T result = caseISqmlOrderByExpression(iSqmlOrderByExpression);
				if (result == null) result = caseISqmlModelElement(iSqmlOrderByExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT: {
				ISqmlSelect iSqmlSelect = (ISqmlSelect)theEObject;
				T result = caseISqmlSelect(iSqmlSelect);
				if (result == null) result = caseISqmlExpression(iSqmlSelect);
				if (result == null) result = caseISqmlTabular(iSqmlSelect);
				if (result == null) result = caseISqmlSelectPart(iSqmlSelect);
				if (result == null) result = caseISqmlValidatable(iSqmlSelect);
				if (result == null) result = caseISqmlValue(iSqmlSelect);
				if (result == null) result = caseISqmlModelElement(iSqmlSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT_BLOCK: {
				ISqmlSelectBlock iSqmlSelectBlock = (ISqmlSelectBlock)theEObject;
				T result = caseISqmlSelectBlock(iSqmlSelectBlock);
				if (result == null) result = caseISqmlSelectPart(iSqmlSelectBlock);
				if (result == null) result = caseISqmlModelElement(iSqmlSelectBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT_CLAUSE: {
				ISqmlSelectClause iSqmlSelectClause = (ISqmlSelectClause)theEObject;
				T result = caseISqmlSelectClause(iSqmlSelectClause);
				if (result == null) result = caseISqmlSelectPart(iSqmlSelectClause);
				if (result == null) result = caseISqmlModelElement(iSqmlSelectClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT_COLUMN: {
				ISqmlSelectColumn iSqmlSelectColumn = (ISqmlSelectColumn)theEObject;
				T result = caseISqmlSelectColumn(iSqmlSelectColumn);
				if (result == null) result = caseISqmlValidatable(iSqmlSelectColumn);
				if (result == null) result = caseISqmlColumn(iSqmlSelectColumn);
				if (result == null) result = caseISqmlValue(iSqmlSelectColumn);
				if (result == null) result = caseISqmlModelElement(iSqmlSelectColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT_ELSE: {
				ISqmlSelectElse iSqmlSelectElse = (ISqmlSelectElse)theEObject;
				T result = caseISqmlSelectElse(iSqmlSelectElse);
				if (result == null) result = caseISqmlSelectPart(iSqmlSelectElse);
				if (result == null) result = caseISqmlModelElement(iSqmlSelectElse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT_ELSE_IF: {
				ISqmlSelectElseIf iSqmlSelectElseIf = (ISqmlSelectElseIf)theEObject;
				T result = caseISqmlSelectElseIf(iSqmlSelectElseIf);
				if (result == null) result = caseISqmlSelectPart(iSqmlSelectElseIf);
				if (result == null) result = caseISqmlModelElement(iSqmlSelectElseIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT_IF: {
				ISqmlSelectIf iSqmlSelectIf = (ISqmlSelectIf)theEObject;
				T result = caseISqmlSelectIf(iSqmlSelectIf);
				if (result == null) result = caseISqmlSelectPart(iSqmlSelectIf);
				if (result == null) result = caseISqmlModelElement(iSqmlSelectIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SELECT_PART: {
				ISqmlSelectPart iSqmlSelectPart = (ISqmlSelectPart)theEObject;
				T result = caseISqmlSelectPart(iSqmlSelectPart);
				if (result == null) result = caseISqmlModelElement(iSqmlSelectPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_SUB_SELECT_VARIABLE: {
				ISqmlSubSelectVariable iSqmlSubSelectVariable = (ISqmlSubSelectVariable)theEObject;
				T result = caseISqmlSubSelectVariable(iSqmlSubSelectVariable);
				if (result == null) result = caseISqmlVariable(iSqmlSubSelectVariable);
				if (result == null) result = caseISqmlGeneratable(iSqmlSubSelectVariable);
				if (result == null) result = caseISqmlValue(iSqmlSubSelectVariable);
				if (result == null) result = caseISqmlModelElement(iSqmlSubSelectVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TABLE_VARIABLE: {
				ISqmlTableVariable iSqmlTableVariable = (ISqmlTableVariable)theEObject;
				T result = caseISqmlTableVariable(iSqmlTableVariable);
				if (result == null) result = caseISqmlVariable(iSqmlTableVariable);
				if (result == null) result = caseISqmlGeneratable(iSqmlTableVariable);
				if (result == null) result = caseISqmlValue(iSqmlTableVariable);
				if (result == null) result = caseISqmlModelElement(iSqmlTableVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_VARIABLE: {
				ISqmlVariable iSqmlVariable = (ISqmlVariable)theEObject;
				T result = caseISqmlVariable(iSqmlVariable);
				if (result == null) result = caseISqmlGeneratable(iSqmlVariable);
				if (result == null) result = caseISqmlValue(iSqmlVariable);
				if (result == null) result = caseISqmlModelElement(iSqmlVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_WHERE_CLAUSE: {
				ISqmlWhereClause iSqmlWhereClause = (ISqmlWhereClause)theEObject;
				T result = caseISqmlWhereClause(iSqmlWhereClause);
				if (result == null) result = caseISqmlValidatable(iSqmlWhereClause);
				if (result == null) result = caseISqmlSelectPart(iSqmlWhereClause);
				if (result == null) result = caseISqmlModelElement(iSqmlWhereClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_DEFAULT_VALUE: {
				ISqmlDefaultValue iSqmlDefaultValue = (ISqmlDefaultValue)theEObject;
				T result = caseISqmlDefaultValue(iSqmlDefaultValue);
				if (result == null) result = caseISqmlExpression(iSqmlDefaultValue);
				if (result == null) result = caseISqmlValue(iSqmlDefaultValue);
				if (result == null) result = caseISqmlModelElement(iSqmlDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_INDEX_KEY: {
				ISqmlIndexKey iSqmlIndexKey = (ISqmlIndexKey)theEObject;
				T result = caseISqmlIndexKey(iSqmlIndexKey);
				if (result == null) result = caseISqmlTableKey(iSqmlIndexKey);
				if (result == null) result = caseISqmlModelElement(iSqmlIndexKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_LITERAL_DEFAULT_VALUE: {
				ISqmlLiteralDefaultValue iSqmlLiteralDefaultValue = (ISqmlLiteralDefaultValue)theEObject;
				T result = caseISqmlLiteralDefaultValue(iSqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlDefaultValue(iSqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlExpression(iSqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlValue(iSqmlLiteralDefaultValue);
				if (result == null) result = caseISqmlModelElement(iSqmlLiteralDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ROW_CONSTRUCTOR_DEFAULT_VALUE: {
				ISqmlRowConstructorDefaultValue iSqmlRowConstructorDefaultValue = (ISqmlRowConstructorDefaultValue)theEObject;
				T result = caseISqmlRowConstructorDefaultValue(iSqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlDefaultValue(iSqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlExpression(iSqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlValue(iSqmlRowConstructorDefaultValue);
				if (result == null) result = caseISqmlModelElement(iSqmlRowConstructorDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TABLE: {
				ISqmlTable iSqmlTable = (ISqmlTable)theEObject;
				T result = caseISqmlTable(iSqmlTable);
				if (result == null) result = caseISqmlFileElement(iSqmlTable);
				if (result == null) result = caseISqmlTabular(iSqmlTable);
				if (result == null) result = caseISqmlTypeDefinition(iSqmlTable);
				if (result == null) result = caseISqmlGlobalObject(iSqmlTable);
				if (result == null) result = caseISqmlType(iSqmlTable);
				if (result == null) result = caseISqmlModelElement(iSqmlTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TABLE_COLUMN: {
				ISqmlTableColumn iSqmlTableColumn = (ISqmlTableColumn)theEObject;
				T result = caseISqmlTableColumn(iSqmlTableColumn);
				if (result == null) result = caseISqmlValidatable(iSqmlTableColumn);
				if (result == null) result = caseISqmlColumn(iSqmlTableColumn);
				if (result == null) result = caseISqmlValue(iSqmlTableColumn);
				if (result == null) result = caseISqmlModelElement(iSqmlTableColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TABLE_KEY: {
				ISqmlTableKey iSqmlTableKey = (ISqmlTableKey)theEObject;
				T result = caseISqmlTableKey(iSqmlTableKey);
				if (result == null) result = caseISqmlModelElement(iSqmlTableKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TABLE_ROW: {
				ISqmlTableRow iSqmlTableRow = (ISqmlTableRow)theEObject;
				T result = caseISqmlTableRow(iSqmlTableRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TABLE_ROW_VALUE: {
				ISqmlTableRowValue iSqmlTableRowValue = (ISqmlTableRowValue)theEObject;
				T result = caseISqmlTableRowValue(iSqmlTableRowValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_UNIQUE_KEY: {
				ISqmlUniqueKey iSqmlUniqueKey = (ISqmlUniqueKey)theEObject;
				T result = caseISqmlUniqueKey(iSqmlUniqueKey);
				if (result == null) result = caseISqmlTableKey(iSqmlUniqueKey);
				if (result == null) result = caseISqmlModelElement(iSqmlUniqueKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_VALUE_REFERENCE_DEFAULT_VALUE: {
				ISqmlValueReferenceDefaultValue iSqmlValueReferenceDefaultValue = (ISqmlValueReferenceDefaultValue)theEObject;
				T result = caseISqmlValueReferenceDefaultValue(iSqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlDefaultValue(iSqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlExpression(iSqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlValue(iSqmlValueReferenceDefaultValue);
				if (result == null) result = caseISqmlModelElement(iSqmlValueReferenceDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ENUM: {
				ISqmlEnum iSqmlEnum = (ISqmlEnum)theEObject;
				T result = caseISqmlEnum(iSqmlEnum);
				if (result == null) result = caseISqmlTypeDefinition(iSqmlEnum);
				if (result == null) result = caseISqmlGlobalObject(iSqmlEnum);
				if (result == null) result = caseISqmlType(iSqmlEnum);
				if (result == null) result = caseISqmlModelElement(iSqmlEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ENUMERATOR: {
				ISqmlEnumerator iSqmlEnumerator = (ISqmlEnumerator)theEObject;
				T result = caseISqmlEnumerator(iSqmlEnumerator);
				if (result == null) result = caseISqmlValidatable(iSqmlEnumerator);
				if (result == null) result = caseISqmlValue(iSqmlEnumerator);
				if (result == null) result = caseISqmlModelElement(iSqmlEnumerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TOP_LEVEL_TYPE_DEFINITION: {
				ISqmlTopLevelTypeDefinition iSqmlTopLevelTypeDefinition = (ISqmlTopLevelTypeDefinition)theEObject;
				T result = caseISqmlTopLevelTypeDefinition(iSqmlTopLevelTypeDefinition);
				if (result == null) result = caseISqmlTypeDefinition(iSqmlTopLevelTypeDefinition);
				if (result == null) result = caseISqmlFileElement(iSqmlTopLevelTypeDefinition);
				if (result == null) result = caseISqmlType(iSqmlTopLevelTypeDefinition);
				if (result == null) result = caseISqmlModelElement(iSqmlTopLevelTypeDefinition);
				if (result == null) result = caseISqmlGlobalObject(iSqmlTopLevelTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TYPE: {
				ISqmlType iSqmlType = (ISqmlType)theEObject;
				T result = caseISqmlType(iSqmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TYPE_DEFINITION: {
				ISqmlTypeDefinition iSqmlTypeDefinition = (ISqmlTypeDefinition)theEObject;
				T result = caseISqmlTypeDefinition(iSqmlTypeDefinition);
				if (result == null) result = caseISqmlType(iSqmlTypeDefinition);
				if (result == null) result = caseISqmlModelElement(iSqmlTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_TYPE_REFERENCE: {
				ISqmlTypeReference iSqmlTypeReference = (ISqmlTypeReference)theEObject;
				T result = caseISqmlTypeReference(iSqmlTypeReference);
				if (result == null) result = caseISqmlModelElement(iSqmlTypeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_VALUE_TYPE: {
				ISqmlValueType iSqmlValueType = (ISqmlValueType)theEObject;
				T result = caseISqmlValueType(iSqmlValueType);
				if (result == null) result = caseISqmlFileElement(iSqmlValueType);
				if (result == null) result = caseISqmlTypeDefinition(iSqmlValueType);
				if (result == null) result = caseISqmlGlobalObject(iSqmlValueType);
				if (result == null) result = caseISqmlType(iSqmlValueType);
				if (result == null) result = caseISqmlModelElement(iSqmlValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_ISSUE_ACCEPTOR: {
				ISqmlIssueAcceptor iSqmlIssueAcceptor = (ISqmlIssueAcceptor)theEObject;
				T result = caseISqmlIssueAcceptor(iSqmlIssueAcceptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InterfacesPackage.ISQML_VALIDATABLE: {
				ISqmlValidatable iSqmlValidatable = (ISqmlValidatable)theEObject;
				T result = caseISqmlValidatable(iSqmlValidatable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlAnd(ISqmlAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Between</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Between</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlBetween(ISqmlBetween object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlComparison(ISqmlComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlCondition(ISqmlCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlExists(ISqmlExists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIn(ISqmlIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIsNull(ISqmlIsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Like</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Like</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLike(ISqmlLike object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Not</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Not</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlNot(ISqmlNot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlOr(ISqmlOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Regexp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Regexp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlRegexp(ISqmlRegexp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Addition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlAddition(ISqmlAddition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlCase(ISqmlCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Case When</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Case When</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlCaseWhen(ISqmlCaseWhen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Binary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Binary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlBinaryOperation(ISqmlBinaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlExpression(ISqmlExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Group Concat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Group Concat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGroupConcat(ISqmlGroupConcat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIf(ISqmlIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml If Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml If Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIfNull(ISqmlIfNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Multiplication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlMultiplication(ISqmlMultiplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlNegation(ISqmlNegation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlPath(ISqmlPath object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Row Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Row Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlRowConstructor(ISqmlRowConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticAnd(ISqmlStaticAnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticExpression(ISqmlStaticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIf(ISqmlStaticIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Is Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Is Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIsEmpty(ISqmlStaticIsEmpty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Is Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Is Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIsNull(ISqmlStaticIsNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Is True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Is True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticIsTrue(ISqmlStaticIsTrue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticOr(ISqmlStaticOr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Parameter Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Parameter Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticParameterTest(ISqmlStaticParameterTest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Parentheses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticParentheses(ISqmlStaticParentheses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticVariableReference(ISqmlStaticVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sub Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sub Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSubSelect(ISqmlSubSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Unary Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Unary Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlUnaryOperation(ISqmlUnaryOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Value Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Value Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValueReference(ISqmlValueReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFile(ISqmlFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml File Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml File Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFileElement(ISqmlFileElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlImport(ISqmlImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Package Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Package Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlPackageDeclaration(ISqmlPackageDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFunction(ISqmlFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFunctionCall(ISqmlFunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFunctionParameter(ISqmlFunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSql(ISqmlSql object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Id</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Id</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlId(ISqmlSqlId object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlKeyword(ISqmlSqlKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlNumberLiteral(ISqmlSqlNumberLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlStringLiteral(ISqmlSqlStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sql Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sql Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSqlSymbol(ISqmlSqlSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlBooleanLiteral(ISqmlBooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Decimal Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Decimal Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlDecimalLiteral(ISqmlDecimalLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlDoubleLiteral(ISqmlDoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Float Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Float Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFloatLiteral(ISqmlFloatLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIntegerLiteral(ISqmlIntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLiteral(ISqmlLiteral<?> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Long Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Long Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLongLiteral(ISqmlLongLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStringLiteral(ISqmlStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlColumn(ISqmlColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Generatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Generatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGeneratable(ISqmlGeneratable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Global Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Global Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGlobalObject(ISqmlGlobalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlModelElement(ISqmlModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Model Visitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Model Visitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlModelVisitor(ISqmlModelVisitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Static Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Static Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlStaticVariable(ISqmlStaticVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Tabular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Tabular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTabular(ISqmlTabular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValue(ISqmlValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlQuery(ISqmlQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Query Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Query Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlQueryParameter(ISqmlQueryParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Foreign Key Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Foreign Key Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlForeignKeyVariable(ISqmlForeignKeyVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml From Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlFromClause(ISqmlFromClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Group By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Group By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlGroupByClause(ISqmlGroupByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Having Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Having Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlHavingClause(ISqmlHavingClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Join Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Join Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlJoinClause(ISqmlJoinClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Order By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlOrderByClause(ISqmlOrderByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Order By Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Order By Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlOrderByExpression(ISqmlOrderByExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelect(ISqmlSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectBlock(ISqmlSelectBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectClause(ISqmlSelectClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectColumn(ISqmlSelectColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Else</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Else</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectElse(ISqmlSelectElse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Else If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectElseIf(ISqmlSelectElseIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectIf(ISqmlSelectIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Select Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Select Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSelectPart(ISqmlSelectPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Sub Select Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Sub Select Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlSubSelectVariable(ISqmlSubSelectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableVariable(ISqmlTableVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlVariable(ISqmlVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Where Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlWhereClause(ISqmlWhereClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlDefaultValue(ISqmlDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Index Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Index Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIndexKey(ISqmlIndexKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Literal Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Literal Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlLiteralDefaultValue(ISqmlLiteralDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Row Constructor Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Row Constructor Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlRowConstructorDefaultValue(ISqmlRowConstructorDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTable(ISqmlTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableColumn(ISqmlTableColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableKey(ISqmlTableKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableRow(ISqmlTableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Table Row Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Table Row Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTableRowValue(ISqmlTableRowValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Unique Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Unique Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlUniqueKey(ISqmlUniqueKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Value Reference Default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Value Reference Default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValueReferenceDefaultValue(ISqmlValueReferenceDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlEnum(ISqmlEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Enumerator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Enumerator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlEnumerator(ISqmlEnumerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Top Level Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Top Level Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTopLevelTypeDefinition(ISqmlTopLevelTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlType(ISqmlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTypeDefinition(ISqmlTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Type Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlTypeReference(ISqmlTypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValueType(ISqmlValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Issue Acceptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Issue Acceptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlIssueAcceptor(ISqmlIssueAcceptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISqml Validatable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISqml Validatable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISqmlValidatable(ISqmlValidatable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //InterfacesSwitch
