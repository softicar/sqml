package com.softicar.sqml.generator.select;

import com.softicar.platform.db.runtime.select.DbSqlRawToken;
import com.softicar.platform.db.sql.token.ISqlToken;
import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlStaticVariable;
import com.softicar.sqml.model.ISqmlValue;
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
import com.softicar.sqml.model.expressions.ISqmlExpression;
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
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.literals.ISqmlBooleanLiteral;
import com.softicar.sqml.model.literals.ISqmlDecimalLiteral;
import com.softicar.sqml.model.literals.ISqmlDoubleLiteral;
import com.softicar.sqml.model.literals.ISqmlFloatLiteral;
import com.softicar.sqml.model.literals.ISqmlIntegerLiteral;
import com.softicar.sqml.model.literals.ISqmlLongLiteral;
import com.softicar.sqml.model.literals.ISqmlStringLiteral;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
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
import com.softicar.sqml.model.selects.ISqmlSelectPart;
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
import com.softicar.sqml.model.utils.ISqmlFunctionCallArguments;
import com.softicar.sqml.model.utils.SqmlFunctionCallArguments;
import com.softicar.sqml.model.utils.SqmlLogicError;
import java.util.Optional;

public class SqmlSelectGenerator implements ISqmlSelectGenerator {

	private final ISqlBuilderBuilder builder;
	private final ISqmlGeneratorPreferences preferences;

	public SqmlSelectGenerator(ISqlBuilderBuilder builder, ISqmlGeneratorPreferences preferences) {

		this.builder = builder;
		this.preferences = preferences;
	}

	@Override
	public ISqlBuilderBuilder getBuilder() {

		return builder;
	}

	public ISqmlGeneratorPreferences getPreferences() {

		return preferences;
	}

	// -------------------- conditions -------------------- //

	@Override
	public void visit(ISqmlBetween between) {

		between.generateSql(this);
	}

	@Override
	public void visit(ISqmlComparison comparison) {

		comparison.generateSql(this);
	}

	@Override
	public void visit(ISqmlExists exists) {

		exists.generateSql(this);
	}

	@Override
	public void visit(ISqmlIn in) {

		ISqmlExpression rightOperand = in.getRight();
		if (rightOperand instanceof ISqmlStaticVariableReference
				&& ((ISqmlStaticVariableReference) rightOperand).getVariable() instanceof ISqmlQueryParameter) {
			buildInList(in, (ISqmlQueryParameter) ((ISqmlStaticVariableReference) rightOperand).getVariable());
		} else {
			in.getLeft().accept(this);
			if (in.isNot()) {
				builder.addToken(SqlKeyword.NOT);
			}
			builder.addToken(SqlKeyword.IN);
			in.getRight().accept(this);
		}
	}

	private void buildInList(ISqmlIn in, ISqmlQueryParameter queryParameter) {

		// if list is empty
		builder.beginIfEmpty(queryParameter);
		if (in.isNot()) {
			// check for NOT IN on an empty list always returns TRUE
			builder.addToken(SqlKeyword.TRUE);
		} else {
			// check for IN on an empty list always returns FALSE
			builder.addToken(SqlKeyword.FALSE);
		}

		// if list is not empty
		builder.beginElse();
		in.getLeft().accept(this);
		if (in.isNot()) {
			builder.addToken(SqlKeyword.NOT);
		}
		builder.addToken(SqlKeyword.IN);
		builder.addParameter(queryParameter);
		builder.endIf();
	}

	@Override
	public void visit(ISqmlIsNull isNull) {

		isNull.getOperand().accept(this);
		builder.addToken(SqlKeyword.IS);
		if (isNull.isNot()) {
			builder.addToken(SqlKeyword.NOT);
		}
		builder.addToken(SqlKeyword.NULL);
	}

	@Override
	public void visit(ISqmlLike like) {

		like.getLeft().accept(this);
		if (like.isNot()) {
			builder.addToken(SqlKeyword.NOT);
		}
		builder.addToken(SqlKeyword.LIKE);
		like.getRight().accept(this);
		if (like.getEscape() != null) {
			builder.addToken(SqlKeyword.ESCAPE);
			builder.addLiteral(like.getEscape());
		}
	}

	@Override
	public void visit(ISqmlNot not) {

		builder.addToken(SqlKeyword.NOT);
		not.getCondition().accept(this);
	}

	@Override
	public void visit(ISqmlRegexp regexp) {

		regexp.getOperand().accept(this);
		if (regexp.isNot()) {
			builder.addToken(SqlKeyword.NOT);
		}
		builder.addToken(SqlKeyword.REGEXP);
		regexp.getRegexp().accept(this);
	}

	// -------------------- expressions -------------------- //

	@Override
	public void visit(ISqmlAddition addition) {

		builder.pushCallArguments(new SqmlFunctionCallArguments(addition));
		visit(addition.getFunction());
		builder.popCallArguments();
	}

	@Override
	public void visit(ISqmlAnd and) {

		generateBinaryOperation(and.getLeft(), SqlKeyword.AND, and.getRight());
	}

	@Override
	public void visit(ISqmlCase sqmlCase) {

		builder.addToken(SqlKeyword.CASE);

		// build operand
		Optional//
			.ofNullable(sqmlCase.getOperand())
			.ifPresent(operand -> operand.accept(this));

		// build whens
		sqmlCase//
			.getWhens()
			.forEach(when -> when.accept(this));

		// build else
		ISqmlExpression elseExpression = sqmlCase.getElseExpression();
		if (elseExpression != null) {
			builder.addToken(SqlKeyword.ELSE);
			elseExpression.accept(this);
		}

		builder.addToken(SqlKeyword.END);
	}

	@Override
	public void visit(ISqmlCaseWhen caseWhen) {

		builder.addToken(SqlKeyword.WHEN);
		caseWhen.getWhenExpression().accept(this);
		builder.addToken(SqlKeyword.THEN);
		caseWhen.getThenExpression().accept(this);
	}

	@Override
	public void visit(ISqmlGroupConcat groupConcat) {

		builder.addToken(SqlKeyword.GROUP_CONCAT);
		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		if (groupConcat.isDistinct()) {
			builder.addToken(SqlKeyword.DISTINCT);
		}
		implode(groupConcat.getExpressions(), SqlSymbol.COMMA);
		if (!groupConcat.getOrderByExpressions().isEmpty()) {
			builder.addToken(SqlKeyword.ORDER);
			builder.addToken(SqlKeyword.BY);
			implode(groupConcat.getOrderByExpressions(), SqlSymbol.COMMA);
		}
		if (groupConcat.getSeparator() != null) {
			builder.addToken(SqlKeyword.SEPARATOR);
			builder.addLiteral(groupConcat.getSeparator());
		}
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);

	}

	@Override
	public void visit(ISqmlIf sqmlIf) {

		builder.addToken(SqlKeyword.CASE);
		builder.addToken(SqlKeyword.WHEN);
		sqmlIf.getCondition().accept(this);
		builder.addToken(SqlKeyword.THEN);
		sqmlIf.getThenExpression().accept(this);
		builder.addToken(SqlKeyword.ELSE);
		sqmlIf.getElseExpression().accept(this);
		builder.addToken(SqlKeyword.END);
	}

	@Override
	public void visit(ISqmlIfNull ifNull) {

		builder.addToken(SqlKeyword.IFNULL);
		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		ifNull.getTestExpression().accept(this);
		builder.addToken(SqlSymbol.COMMA);
		ifNull.getThenExpression().accept(this);
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
	}

	@Override
	public void visit(ISqmlMultiplication multiplication) {

		builder.pushCallArguments(new SqmlFunctionCallArguments(multiplication));
		visit(multiplication.getFunction());
		builder.popCallArguments();
	}

	@Override
	public void visit(ISqmlNegation negation) {

		builder.addToken(SqlSymbol.MINUS);
		negation.getExpression().accept(this);
	}

	@Override
	public void visit(ISqmlOr or) {

		generateBinaryOperation(or.getLeft(), SqlKeyword.OR, or.getRight());
	}

	@Override
	public void visit(ISqmlPath path) {

		throw new UnsupportedOperationException("not necessary");
	}

	@Override
	public void visit(ISqmlStaticVariableReference variableReference) {

		ISqmlStaticVariable variable = variableReference.getVariable();

		if (variable instanceof ISqmlFunctionParameter) {
			visit((ISqmlFunctionParameter) variable);
		} else if (variable instanceof ISqmlQueryParameter) {
			builder.addParameter((ISqmlQueryParameter) variable);
		} else {
			throw new SqmlLogicError(String.format("Illegal type '%s' of parameter.", variable.getClass().getSimpleName()));
		}
	}

	@Override
	public void visit(ISqmlRowConstructor rowConstructor) {

		if (rowConstructor.isExplicit()) {
			builder.addToken(SqlKeyword.ROW);
		}

		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		implode(rowConstructor.getExpressions(), SqlSymbol.COMMA);
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
	}

	@Override
	public void visit(ISqmlStaticIf staticIf) {

		// generate if cases
		int count = staticIf.getConditions().size();
		for (int i = 0; i < count; ++i) {
			if (i == 0) {
				builder.beginIf(staticIf.getConditions().get(i));
			} else {
				builder.beginElseIf(staticIf.getConditions().get(i));
			}

			staticIf.getExpressions().get(i).accept(this);
		}

		// generate else case
		builder.beginElse();
		if (staticIf.getElseExpression() != null) {
			staticIf.getElseExpression().accept(this);
		} else {
			builder.addToken(SqlKeyword.NULL);
		}

		builder.endIf();
	}

	@Override
	public void visit(ISqmlSubSelect subSelect) {

		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		builder.startSubSelect();
		subSelect.getSelect().accept(this);
		builder.finishSubSelect();
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
	}

	@Override
	public void visit(ISqmlValueReference valueReference) {

		ISqmlValue value = valueReference.getValue();
		if (value instanceof ISqmlEnumerator) {
			((ISqmlEnumerator) value).accept(this);
		} else {
			new ValueReferenceGenerator(builder, valueReference).generate();
		}
	}

	// -------------------- files -------------------- //

	@Override
	public void visit(ISqmlImport sqmlImport) {

		// nothing to generate
	}

	// -------------------- functions -------------------- //

	@Override
	public void visit(ISqmlFunction function) {

		function.generateSql(this);
	}

	@Override
	public void visit(ISqmlFunctionCall functionCall) {

		builder.pushCallArguments(new SqmlFunctionCallArguments(functionCall));
		visit(functionCall.getFunction());
		builder.popCallArguments();
	}

	@Override
	public void visit(ISqmlFunctionParameter functionParameter) {

		String parameterName = functionParameter.getName();
		ISqmlExpression argument = builder.getCallArguments().getArgument(parameterName);
		ISqmlFunctionCallArguments callArguments = builder.popCallArguments();
		argument.accept(this);
		builder.pushCallArguments(callArguments);
	}

	@Override
	public void visit(ISqmlSqlId id) {

		builder.addToken(new DbSqlRawToken(id.getIdentifier()));
	}

	@Override
	public void visit(ISqmlSqlKeyword keyword) {

		builder.addToken(keyword.getSqlKeyword());
	}

	@Override
	public void visit(ISqmlSqlNumberLiteral numberLiteral) {

		builder.addLiteral(numberLiteral.getValue());
	}

	@Override
	public void visit(ISqmlSqlStringLiteral stringLiteral) {

		builder.addLiteral(stringLiteral.getString());
	}

	@Override
	public void visit(ISqmlSqlSymbol symbol) {

		builder.addToken(symbol.getSqlSymbol());
	}

	// -------------------- literals -------------------- //

	@Override
	public void visit(ISqmlBooleanLiteral booleanLiteral) {

		if (booleanLiteral.getValue()) {
			builder.addLiteral(true);
		} else {
			builder.addLiteral(false);
		}
	}

	@Override
	public void visit(ISqmlDecimalLiteral decimalLiteral) {

		builder.addLiteral(decimalLiteral.getValue());
	}

	@Override
	public void visit(ISqmlDoubleLiteral doubleLiteral) {

		builder.addLiteral(doubleLiteral.getValue());
	}

	@Override
	public void visit(ISqmlFloatLiteral floatLiteral) {

		builder.addLiteral(floatLiteral.getValue());
	}

	@Override
	public void visit(ISqmlIntegerLiteral integerLiteral) {

		builder.addLiteral(integerLiteral.getValue());
	}

	@Override
	public void visit(ISqmlLongLiteral longLiteral) {

		builder.addLiteral(longLiteral.getValue());
	}

	@Override
	public void visit(ISqmlStringLiteral stringLiteral) {

		builder.addLiteral(stringLiteral.getValue());
	}

	// -------------------- selects -------------------- //

	@Override
	public void visit(ISqmlForeignKeyVariable variable) {

		variable.generateSql(this);
	}

	@Override
	public void visit(ISqmlFromClause fromClause) {

		builder.FROM();
		fromClause.getVariable().accept(this);
	}

	@Override
	public void visit(ISqmlGroupByClause groupByClause) {

		for (ISqmlExpression expression: groupByClause.getExpressions()) {
			builder.GROUP_BY();
			expression.accept(this);
		}
	}

	@Override
	public void visit(ISqmlHavingClause havingClause) {

		builder.HAVING();
		ISqmlExpression condition = havingClause.getCondition();
		if (condition instanceof ISqmlOr) {
			builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
			condition.accept(this);
			builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
		} else {
			condition.accept(this);
		}
	}

	@Override
	public void visit(ISqmlJoinClause joinClause) {

		// add [LEFT|RIGHT|FULL] JOIN keywords
		if (joinClause.isLeftJoin()) {
			builder.JOIN(SqlKeyword.LEFT);
		} else {
			builder.JOIN(null);
		}

		// add variable
		joinClause.getVariable().accept(this);

		// add conditions
		for (ISqmlExpression condition: joinClause.getConditions()) {
			builder.ON();
			if (condition instanceof ISqmlOr) {
				builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
				condition.accept(this);
				builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
			} else {
				condition.accept(this);
			}
		}
	}

	@Override
	public void visit(ISqmlOrderByClause orderByClause) {

		for (ISqmlOrderByExpression expression: orderByClause.getExpressions()) {
			builder.ORDER_BY();
			expression.accept(this);
		}
	}

	@Override
	public void visit(ISqmlOrderByExpression orderByExpression) {

		orderByExpression.getExpression().accept(this);
		if (orderByExpression.isDescending()) {
			builder.addToken(SqlKeyword.DESC);
		}
	}

	@Override
	public void visit(ISqmlSelect select) {

		for (ISqmlSelectPart selectPart: select.getParts()) {
			selectPart.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelectClause selectClause) {

		boolean first = true;
		for (ISqmlSelectColumn selectColumn: selectClause.getColumns()) {
			builder.SELECT(selectColumn);
			if (first && selectClause.isDistinct()) {
				builder.addToken(SqlKeyword.DISTINCT);
				first = false;
			}
			selectColumn.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelectColumn selectColumn) {

		ISqmlExpression expression = selectColumn.getExpression();
		if (expression instanceof ISqmlValueReference && ((ISqmlValueReference) expression).isVariableReference()) {
			ISqmlValueReference valueReference = (ISqmlValueReference) expression;
			expression.accept(this);
			if (!valueReference.isDotStar()) {
				builder.addToken(SqlKeyword.AS);
				builder.addIdentifier(selectColumn);
			}
		} else {
			expression.accept(this);
			builder.addToken(SqlKeyword.AS);
			builder.addIdentifier(selectColumn);
		}
	}

	@Override
	public void visit(ISqmlSelectElse selectElse) {

		builder.beginElse();

		for (ISqmlSelectPart part: selectElse.getParts()) {
			part.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelectElseIf selectElseIf) {

		builder.beginElseIf(selectElseIf.getCondition());

		for (ISqmlSelectPart part: selectElseIf.getParts()) {
			part.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelectIf selectIf) {

		builder.beginIf(selectIf.getCondition());

		for (ISqmlSelectPart part: selectIf.getParts()) {
			part.accept(this);
		}

		for (ISqmlSelectElseIf elseIf: selectIf.getElseIfs()) {
			elseIf.accept(this);
		}

		if (selectIf.getElse() != null) {
			selectIf.getElse().accept(this);
		}

		builder.endIf();
	}

	@Override
	public void visit(ISqmlSubSelectVariable variable) {

		variable.generateSql(this);
	}

	@Override
	public void visit(ISqmlTableVariable variable) {

		variable.generateSql(this);
	}

	@Override
	public void visit(ISqmlWhereClause whereClause) {

		// add AND/WHERE keyword
		builder.WHERE();

		// add condition
		ISqmlExpression condition = whereClause.getCondition();
		if (condition instanceof ISqmlOr) {
			builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
			condition.accept(this);
			builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
		} else {
			condition.accept(this);
		}
	}

	// -------------------- tables -------------------- //

	@Override
	public void visit(ISqmlRowConstructorDefaultValue defaultValue) {

		for (ISqmlValueReference valueReference: defaultValue.getValueReferences()) {
			valueReference.accept(this);
		}
	}

	@Override
	public void visit(ISqmlLiteralDefaultValue defaultValue) {

		if (defaultValue.isMinus()) {
			builder.addToken(SqlSymbol.MINUS);
		}
		defaultValue.getLiteral().accept(this);
	}

	@Override
	public void visit(ISqmlTable table) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlTableColumn tableColumn) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlTableKey tableKey) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlValueReferenceDefaultValue defaultValue) {

		defaultValue.getValueReference().accept(this);
	}

	// -------------------- types -------------------- //

	@Override
	public void visit(ISqmlEnum sqmlEnum) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlEnumerator enumerator) {

		builder.addLiteral(enumerator.getStringValue());
	}

	@Override
	public void visit(ISqmlTypeReference typeReference) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlValueType valueType) {

		// nothing to do
	}

	// -------------------- private -------------------- //

	private void implode(Iterable<? extends ISqmlModelElement> elements, ISqlToken delimiter) {

		boolean first = true;
		for (ISqmlModelElement element: elements) {
			if (first) {
				first = false;
			} else {
				builder.addToken(delimiter);
			}

			element.accept(this);
		}
	}

	private void generateBinaryOperation(ISqmlExpression left, ISqlToken operator, ISqmlExpression right) {

		left.accept(this);
		builder.addToken(operator);
		right.accept(this);
	}
}
