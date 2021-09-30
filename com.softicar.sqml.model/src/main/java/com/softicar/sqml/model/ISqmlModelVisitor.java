package com.softicar.sqml.model;

import com.softicar.sqml.model.conditions.ISqmlAnd;
import com.softicar.sqml.model.conditions.ISqmlBetween;
import com.softicar.sqml.model.conditions.ISqmlComparison;
import com.softicar.sqml.model.conditions.ISqmlExists;
import com.softicar.sqml.model.conditions.ISqmlIn;
import com.softicar.sqml.model.conditions.ISqmlIsNull;
import com.softicar.sqml.model.conditions.ISqmlLike;
import com.softicar.sqml.model.conditions.ISqmlNot;
import com.softicar.sqml.model.conditions.ISqmlOr;
import com.softicar.sqml.model.conditions.ISqmlRegexp;
import com.softicar.sqml.model.expressions.ISqmlAddition;
import com.softicar.sqml.model.expressions.ISqmlCase;
import com.softicar.sqml.model.expressions.ISqmlCaseWhen;
import com.softicar.sqml.model.expressions.ISqmlGroupConcat;
import com.softicar.sqml.model.expressions.ISqmlIf;
import com.softicar.sqml.model.expressions.ISqmlIfNull;
import com.softicar.sqml.model.expressions.ISqmlMultiplication;
import com.softicar.sqml.model.expressions.ISqmlNegation;
import com.softicar.sqml.model.expressions.ISqmlPath;
import com.softicar.sqml.model.expressions.ISqmlRowConstructor;
import com.softicar.sqml.model.expressions.ISqmlStaticIf;
import com.softicar.sqml.model.expressions.ISqmlStaticVariableReference;
import com.softicar.sqml.model.expressions.ISqmlSubSelect;
import com.softicar.sqml.model.expressions.ISqmlValueReference;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.ISqmlFunctionParameter;
import com.softicar.sqml.model.functions.ISqmlSqlId;
import com.softicar.sqml.model.functions.ISqmlSqlKeyword;
import com.softicar.sqml.model.functions.ISqmlSqlNumberLiteral;
import com.softicar.sqml.model.functions.ISqmlSqlStringLiteral;
import com.softicar.sqml.model.functions.ISqmlSqlSymbol;
import com.softicar.sqml.model.literals.ISqmlBooleanLiteral;
import com.softicar.sqml.model.literals.ISqmlDecimalLiteral;
import com.softicar.sqml.model.literals.ISqmlDoubleLiteral;
import com.softicar.sqml.model.literals.ISqmlFloatLiteral;
import com.softicar.sqml.model.literals.ISqmlIntegerLiteral;
import com.softicar.sqml.model.literals.ISqmlLongLiteral;
import com.softicar.sqml.model.literals.ISqmlStringLiteral;
import com.softicar.sqml.model.selects.ISqmlForeignKeyVariable;
import com.softicar.sqml.model.selects.ISqmlFromClause;
import com.softicar.sqml.model.selects.ISqmlGroupByClause;
import com.softicar.sqml.model.selects.ISqmlHavingClause;
import com.softicar.sqml.model.selects.ISqmlJoinClause;
import com.softicar.sqml.model.selects.ISqmlOrderByClause;
import com.softicar.sqml.model.selects.ISqmlOrderByExpression;
import com.softicar.sqml.model.selects.ISqmlSelect;
import com.softicar.sqml.model.selects.ISqmlSelectClause;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlSelectElse;
import com.softicar.sqml.model.selects.ISqmlSelectElseIf;
import com.softicar.sqml.model.selects.ISqmlSelectIf;
import com.softicar.sqml.model.selects.ISqmlSubSelectVariable;
import com.softicar.sqml.model.selects.ISqmlTableVariable;
import com.softicar.sqml.model.selects.ISqmlWhereClause;
import com.softicar.sqml.model.tables.ISqmlLiteralDefaultValue;
import com.softicar.sqml.model.tables.ISqmlRowConstructorDefaultValue;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.tables.ISqmlTableKey;
import com.softicar.sqml.model.tables.ISqmlValueReferenceDefaultValue;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlEnumerator;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.types.ISqmlValueType;

public interface ISqmlModelVisitor {

	// -------------------- conditions -------------------- //

	void visit(ISqmlBetween between);

	void visit(ISqmlComparison comparison);

	void visit(ISqmlExists exists);

	void visit(ISqmlIn in);

	void visit(ISqmlIsNull isNull);

	void visit(ISqmlLike like);

	void visit(ISqmlNot not);

	void visit(ISqmlRegexp regexp);

	// -------------------- expressions -------------------- //

	void visit(ISqmlAddition addition);

	void visit(ISqmlAnd and);

	void visit(ISqmlCase sqmlCase);

	void visit(ISqmlCaseWhen caseWhen);

	void visit(ISqmlGroupConcat groupConcat);

	void visit(ISqmlIf sqmlIf);

	void visit(ISqmlIfNull ifNull);

	void visit(ISqmlMultiplication multiplication);

	void visit(ISqmlNegation negation);

	void visit(ISqmlOr or);

	void visit(ISqmlStaticVariableReference reference);

	void visit(ISqmlPath path);

	void visit(ISqmlRowConstructor rowConstructor);

	void visit(ISqmlStaticIf staticIf);

	void visit(ISqmlSubSelect subSelect);

	void visit(ISqmlValueReference valueReference);

	// -------------------- files -------------------- //

	void visit(ISqmlImport sqmlImport);

	// -------------------- functions -------------------- //

	void visit(ISqmlFunction function);

	void visit(ISqmlFunctionCall functionCall);

	void visit(ISqmlFunctionParameter functionParameter);

	void visit(ISqmlSqlId id);

	void visit(ISqmlSqlKeyword keyword);

	void visit(ISqmlSqlNumberLiteral numberLiteral);

	void visit(ISqmlSqlStringLiteral stringLiteral);

	void visit(ISqmlSqlSymbol symbol);

	// -------------------- literals -------------------- //

	void visit(ISqmlBooleanLiteral booleanLiteral);

	void visit(ISqmlDecimalLiteral decimalLiteral);

	void visit(ISqmlDoubleLiteral doubleLiteral);

	void visit(ISqmlFloatLiteral floatLiteral);

	void visit(ISqmlIntegerLiteral integerLiteral);

	void visit(ISqmlLongLiteral longLiteral);

	void visit(ISqmlStringLiteral stringLiteral);

	// -------------------- selects -------------------- //

	void visit(ISqmlForeignKeyVariable variable);

	void visit(ISqmlFromClause fromClause);

	void visit(ISqmlGroupByClause groupByClause);

	void visit(ISqmlHavingClause havingClause);

	void visit(ISqmlJoinClause joinClause);

	void visit(ISqmlOrderByClause orderByClause);

	void visit(ISqmlOrderByExpression orderByExpression);

	void visit(ISqmlSelect selectStatement);

	void visit(ISqmlSelectClause selectClause);

	void visit(ISqmlSelectColumn selectColumn);

	void visit(ISqmlSelectElse selectElse);

	void visit(ISqmlSelectElseIf selectElseIf);

	void visit(ISqmlSelectIf selectIf);

	void visit(ISqmlSubSelectVariable variable);

	void visit(ISqmlTableVariable variable);

	void visit(ISqmlWhereClause whereClause);

	// -------------------- tables -------------------- //

	void visit(ISqmlRowConstructorDefaultValue defaultValue);

	void visit(ISqmlLiteralDefaultValue defaultValue);

	void visit(ISqmlTable table);

	void visit(ISqmlTableColumn tableColumn);

	void visit(ISqmlTableKey tableKey);

	void visit(ISqmlValueReferenceDefaultValue defaultValue);

	// -------------------- types -------------------- //

	void visit(ISqmlEnum sqmlEnum);

	void visit(ISqmlEnumerator enumerator);

	void visit(ISqmlTypeReference typeReference);

	void visit(ISqmlValueType valueType);
}
