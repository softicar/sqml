package com.softicar.sqml.model.utils;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
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
import com.softicar.sqml.model.types.ISqmlTypeDefinition;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.types.ISqmlValueType;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class SqmlModelTreeWalker implements ISqmlModelVisitor {

	private final Set<JavaClassName> visitedTables = new TreeSet<>();

	// -------------------- conditions -------------------- //

	@Override
	public void visit(ISqmlBetween between) {

		between.getOperand().accept(this);
		between.getLeft().accept(this);
		between.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlComparison comparison) {

		comparison.getLeft().accept(this);
		comparison.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlExists exists) {

		exists.getSubSelect().accept(this);
	}

	@Override
	public void visit(ISqmlIn in) {

		in.getLeft().accept(this);
		in.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlIsNull isNull) {

		isNull.getOperand().accept(this);
	}

	@Override
	public void visit(ISqmlLike like) {

		like.getLeft().accept(this);
		like.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlNot not) {

		not.getCondition().accept(this);
	}

	@Override
	public void visit(ISqmlRegexp regexp) {

		regexp.getOperand().accept(this);
		regexp.getRegexp().accept(this);
	}

	// -------------------- expressions -------------------- //

	@Override
	public void visit(ISqmlAddition addition) {

		addition.getLeft().accept(this);
		addition.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlAnd and) {

		and.getLeft().accept(this);
		and.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlCase sqmlCase) {

		Optional//
			.ofNullable(sqmlCase.getOperand())
			.ifPresent(operand -> operand.accept(this));
		sqmlCase//
			.getWhens()
			.forEach(when -> when.accept(this));
		Optional//
			.ofNullable(sqmlCase.getElseExpression())
			.ifPresent(elseExpression -> elseExpression.accept(this));
	}

	@Override
	public void visit(ISqmlCaseWhen caseWhen) {

		caseWhen.getWhenExpression().accept(this);
		caseWhen.getThenExpression().accept(this);
	}

	@Override
	public void visit(ISqmlGroupConcat groupConcat) {

		for (ISqmlExpression expression: groupConcat.getExpressions()) {
			expression.accept(this);
		}

		for (ISqmlOrderByExpression orderByExpression: groupConcat.getOrderByExpressions()) {
			orderByExpression.accept(this);
		}
	}

	@Override
	public void visit(ISqmlIf sqmlIf) {

		sqmlIf.getCondition().accept(this);
		sqmlIf.getThenExpression().accept(this);
		sqmlIf.getElseExpression().accept(this);
	}

	@Override
	public void visit(ISqmlIfNull ifNull) {

		ifNull.getTestExpression().accept(this);
		ifNull.getThenExpression().accept(this);
	}

	@Override
	public void visit(ISqmlMultiplication multiplication) {

		multiplication.getLeft().accept(this);
		multiplication.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlNegation negation) {

		negation.getExpression().accept(this);
	}

	@Override
	public void visit(ISqmlOr or) {

		or.getLeft().accept(this);
		or.getRight().accept(this);
	}

	@Override
	public void visit(ISqmlStaticVariableReference reference) {

		// TODO
	}

	@Override
	public void visit(ISqmlPath path) {

		ISqmlPath parent = path.getParent();
		if (parent != null) {
			parent.accept(this);
		}

		ISqmlModelElement target = path.getTarget();
		if (target != null) {
			target.accept(this);
		}
	}

	@Override
	public void visit(ISqmlRowConstructor rowConstructor) {

		for (ISqmlExpression expression: rowConstructor.getExpressions()) {
			expression.accept(this);
		}
	}

	@Override
	public void visit(ISqmlStaticIf staticIf) {

		for (ISqmlExpression expression: staticIf.getExpressions()) {
			expression.accept(this);
		}

		if (staticIf.getElseExpression() != null) {
			staticIf.getElseExpression().accept(this);
		}
	}

	@Override
	public void visit(ISqmlSubSelect subSelect) {

		subSelect.getSelect().accept(this);
	}

	@Override
	public void visit(ISqmlValueReference valueReference) {

		valueReference.getPath().accept(this);
	}

	// -------------------- files -------------------- //

	@Override
	public void visit(ISqmlImport sqmlImport) {

		// nothing to do
	}

	// -------------------- functions -------------------- //

	@Override
	public void visit(ISqmlFunction function) {

		// TODO Go to function
	}

	@Override
	public void visit(ISqmlFunctionCall functionCall) {

		for (ISqmlExpression expression: functionCall.getArguments()) {
			expression.accept(this);
		}

		// TODO Go to function
	}

	@Override
	public void visit(ISqmlFunctionParameter functionParameter) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlSqlId id) {

		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ISqmlSqlKeyword keyword) {

		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ISqmlSqlNumberLiteral numberLiteral) {

		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ISqmlSqlStringLiteral stringLiteral) {

		// TODO Auto-generated method stub

	}

	@Override
	public void visit(ISqmlSqlSymbol symbol) {

		// TODO Auto-generated method stub

	}

	// -------------------- literals -------------------- //

	@Override
	public void visit(ISqmlBooleanLiteral booleanLiteral) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlDecimalLiteral decimalLiteral) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlDoubleLiteral doubleLiteral) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlFloatLiteral floatLiteral) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlIntegerLiteral integerLiteral) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlLongLiteral longLiteral) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlStringLiteral stringLiteral) {

		// nothing to do
	}

	// -------------------- selects -------------------- //

	@Override
	public void visit(ISqmlForeignKeyVariable variable) {

		variable.getTable().accept(this);
	}

	@Override
	public void visit(ISqmlFromClause fromClause) {

		fromClause.getVariable().accept(this);
	}

	@Override
	public void visit(ISqmlGroupByClause groupByClause) {

		for (ISqmlExpression expression: groupByClause.getExpressions()) {
			expression.accept(this);
		}
	}

	@Override
	public void visit(ISqmlHavingClause havingClause) {

		havingClause.getCondition().accept(this);
	}

	@Override
	public void visit(ISqmlJoinClause joinClause) {

		joinClause.getVariable().accept(this);

		for (ISqmlExpression expression: joinClause.getConditions()) {
			expression.accept(this);
		}
	}

	@Override
	public void visit(ISqmlOrderByClause orderByClause) {

		for (ISqmlOrderByExpression expression: orderByClause.getExpressions()) {
			expression.accept(this);
		}
	}

	@Override
	public void visit(ISqmlOrderByExpression orderByExpression) {

		orderByExpression.getExpression().accept(this);
	}

	@Override
	public void visit(ISqmlSelectClause selectClause) {

		for (ISqmlSelectColumn column: selectClause.getColumns()) {
			column.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelectColumn selectColumn) {

		selectColumn.getExpression().accept(this);
	}

	@Override
	public void visit(ISqmlSelectElse selectElse) {

		for (ISqmlSelectPart selectPart: selectElse.getParts()) {
			selectPart.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelectElseIf selectElseIf) {

		for (ISqmlSelectPart selectPart: selectElseIf.getParts()) {
			selectPart.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelectIf selectIf) {

		for (ISqmlSelectPart selectPart: selectIf.getParts()) {
			selectPart.accept(this);
		}

		for (ISqmlSelectElseIf selectElseIf: selectIf.getElseIfs()) {
			selectElseIf.accept(this);
		}

		if (selectIf.getElse() != null) {
			selectIf.getElse().accept(this);
		}
	}

	@Override
	public void visit(ISqmlSelect select) {

		for (ISqmlSelectPart selectPart: select.getParts()) {
			selectPart.accept(this);
		}
	}

	@Override
	public void visit(ISqmlSubSelectVariable variable) {

		variable.getSubSelect().accept(this);
	}

	@Override
	public void visit(ISqmlTableVariable variable) {

		variable.getTable().accept(this);
	}

	@Override
	public void visit(ISqmlWhereClause whereClause) {

		whereClause.getCondition().accept(this);
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

		defaultValue.getLiteral().accept(this);
	}

	@Override
	public void visit(ISqmlTable table) {

		// prevent running in circles
		JavaClassName className = table.getClassName();
		if (!visitedTables.contains(className)) {
			visitedTables.add(className);
			for (ISqmlTableColumn tableColumn: table.getColumns()) {
				tableColumn.accept(this);
			}

			for (ISqmlTableKey tableKey: table.getTableKeys()) {
				tableKey.accept(this);
			}

			// enum types already visited by columns
		}
	}

	@Override
	public void visit(ISqmlTableColumn tableColumn) {

		tableColumn.getTypeReference().accept(this);
	}

	@Override
	public void visit(ISqmlTableKey tableKey) {

		// nothing to do, columns already visited by table
	}

	@Override
	public void visit(ISqmlValueReferenceDefaultValue defaultValue) {

		defaultValue.getValueReference().accept(this);
	}

	// -------------------- types -------------------- //

	@Override
	public void visit(ISqmlEnum sqmlEnum) {

		for (ISqmlEnumerator enumerator: sqmlEnum.getEnumerators()) {
			enumerator.accept(this);
		}
	}

	@Override
	public void visit(ISqmlEnumerator enumerator) {

		// nothing to do
	}

	@Override
	public void visit(ISqmlTypeReference typeReference) {

		ISqmlTypeDefinition typeDefinition = typeReference.getTypeDefinition();
		if (typeDefinition != null) {
			typeDefinition.accept(this);
		}
	}

	@Override
	public void visit(ISqmlValueType valueType) {

		// nothing to do
	}
}
