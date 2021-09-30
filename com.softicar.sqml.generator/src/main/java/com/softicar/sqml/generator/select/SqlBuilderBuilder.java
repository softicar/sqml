package com.softicar.sqml.generator.select;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.runtime.select.DbSqlRawToken;
import com.softicar.platform.db.sql.token.ISqlToken;
import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.query.SqmlQueryColumnGenerator;
import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.expressions.ISqmlStaticExpression;
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.tables.ISqmlTableColumn;
import com.softicar.sqml.model.utils.ISqmlFunctionCallArguments;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SqlBuilderBuilder implements ISqlBuilderBuilder {

	private final SqmlJavaCodePrinter printer;
	private final Stack<ISqmlFunctionCallArguments> callArgumentStack;
	private final Stack<Boolean> subSelectStack;

	public SqlBuilderBuilder(SqmlJavaCodePrinter printer) {

		this.printer = printer;
		this.callArgumentStack = new Stack<>();
		this.subSelectStack = new Stack<>();
	}

	// -------------------- State -------------------- //

	@Override
	public void startSubSelect() {

		printer.println("startSubSelect();");
		this.subSelectStack.push(true);
	}

	@Override
	public void finishSubSelect() {

		printer.println("finishSubSelect();");
		this.subSelectStack.pop();
	}

	// -------------------- Function Calls -------------------- //

	@Override
	public void pushCallArguments(ISqmlFunctionCallArguments callArguments) {

		callArgumentStack.push(callArguments);
	}

	@Override
	public ISqmlFunctionCallArguments popCallArguments() {

		return callArgumentStack.pop();
	}

	@Override
	public ISqmlFunctionCallArguments getCallArguments() {

		return callArgumentStack.peek();
	}

	// -------------------- Adding -------------------- //

	@Override
	public void addToken(ISqlToken token) {

		if (token instanceof SqlKeyword) {
			addKeyword((SqlKeyword) token);
		} else if (token instanceof SqlSymbol) {
			addSymbol((SqlSymbol) token);
		} else if (token instanceof DbSqlRawToken) {
			addRawToken((DbSqlRawToken) token);
		} else {
			throw new IllegalArgumentException(String.format("The token type %s is not supported.", token.getClass().getCanonicalName()));
		}
	}

	private void addKeyword(SqlKeyword keyword) {

		printer.addImport(SqlKeyword.class);
		printer.println("addToken(%s.%s);", SqlKeyword.class.getSimpleName(), keyword.name());
	}

	private void addSymbol(SqlSymbol symbol) {

		printer.addImport(SqlSymbol.class);
		printer.println("addToken(%s.%s);", SqlSymbol.class.getSimpleName(), symbol.name());
	}

	private void addRawToken(DbSqlRawToken rawToken) {

		printer.addImport(DbSqlRawToken.class);
		printer.println("addToken(new %s(\"%s\"));", DbSqlRawToken.class.getSimpleName(), rawToken.toString());
	}

	@Override
	public void addIdentifier(String...identifierParts) {

		addIdentifier(Arrays.asList(identifierParts));
	}

	@Override
	public void addIdentifier(List<String> identifierParts) {

		printer.println("addIdentifier(%s);", Imploder.implodeQuoted(identifierParts, ", ", "\""));
	}

	@Override
	public void addIdentifier(ISqmlTable table) {

		printer.addImport(table.getClassName());
		printer.println("addIdentifier(%s.TABLE);", table.getClassName().getSimpleName());
	}

	@Override
	public void addIdentifier(ISqmlVariable variable, String columnName) {

		printer.println("addIdentifier(%s, \"%s\");", getNameExpression(variable), columnName);
	}

	@Override
	public void addIdentifier(ISqmlVariable variable, ISqmlColumn column) {

		if (column instanceof ISqmlTableColumn) {
			ISqmlTable table = ((ISqmlTableColumn) column).getTable();
			String nameExpression = getNameExpression(variable);
			printer.addImport(table.getClassName());
			printer.println("addIdentifier(%s, %s.%s);", nameExpression, table.getClassName().getSimpleName(), getJavaIdentifier(column).asConstant());
		} else {
			addIdentifier(variable, column.getName());
		}
	}

	@Override
	public void addIdentifier(ISqmlSelectColumn column) {

		printer.println("addIdentifier(%s);", getNameExpression(column));
	}

	@Override
	public void addIdentifier(ISqmlVariable variable) {

		printer.println("addIdentifier(%s);", getNameExpression(variable));
	}

	private String getNameExpression(ISqmlVariable variable) {

		return getNameExpression(variable.getName());
	}

	private String getNameExpression(ISqmlSelectColumn column) {

		return getNameExpression(column.getName());
	}

	private String getNameExpression(String name) {

		return String.format("\"%s\"", name);
	}

	@Override
	public void addParameter(ISqmlQueryParameter parameter) {

		if (parameter.getSqmlType().isCollection()) {
			addToken(SqlSymbol.LEFT_PARENTHESIS);
			printer.println("addParameters(parameters.%s);", getJavaIdentifier(parameter).asField());
			addToken(SqlSymbol.RIGHT_PARENTHESIS);
		} else {
			printer.println("addParameter(parameters.%s);", getJavaIdentifier(parameter).asField());
		}
	}

	@Override
	public void addTableColumns(ISqmlVariable variable, ISqmlTable table, String columnAlias) {

		String simpleName = table.getClassName().getSimpleName();
		String aliasNameExpression = getNameExpression(columnAlias);
		printer.addImport(table.getClassName());
		printer.println("addTableColumns(%s, %s.TABLE, %s);", getNameExpression(variable), simpleName, aliasNameExpression);
	}

	@Override
	public void addLiteral(boolean literal) {

		printer.println("addLiteral(%s);", literal? "true" : "false");
	}

	@Override
	public void addLiteral(int literal) {

		printer.println("addLiteral(%s);", literal);
	}

	@Override
	public void addLiteral(long literal) {

		printer.println("addLiteral(%sL);", literal);
	}

	@Override
	public void addLiteral(BigDecimal literal) {

		printer.addImport(BigDecimal.class);
		printer.println("addLiteral(new BigDecimal(\"%s\"));", literal.toString());
	}

	@Override
	public void addLiteral(String literal) {

		printer.println("addLiteral(\"%s\");", literal);
	}

	// -------------------- Conditional -------------------- //

	@Override
	public void beginIf(ISqmlStaticExpression expression) {

		printer.beginIf(expression.getJavaCode());
	}

	@Override
	public void beginElseIf(ISqmlStaticExpression expression) {

		printer.beginElseIf(expression.getJavaCode());
	}

	@Override
	public void beginIfEmpty(ISqmlQueryParameter parameter) {

		if (parameter.getSqmlType().isCollection()) {
			printer.beginBlock("if(parameters.%s.isEmpty())", getJavaIdentifier(parameter).asField());
		} else {
			throw new IllegalArgumentException(String.format("Parameter '%s' is not a list.", parameter.getName()));
		}
	}

	@Override
	public void beginElse() {

		printer.beginElse();
	}

	@Override
	public void endIf() {

		printer.endBlock();
	}

	private JavaIdentifier getJavaIdentifier(ISqmlQueryParameter parameter) {

		return new JavaIdentifier(parameter.getName());
	}

	private JavaIdentifier getJavaIdentifier(ISqmlColumn column) {

		return new JavaIdentifier(column.getName());
	}

	// -------------------- Special Keywords -------------------- //

	@Override
	public void SELECT(ISqmlSelectColumn selectColumn) {

		if (subSelectStack.isEmpty()) {
			printer.println("SELECT(%s);", SqmlQueryColumnGenerator.getNameOfColumnConstant(selectColumn).asConstant());
		} else {
			printer.println("SELECT();");
		}
	}

	@Override
	public void FROM() {

		printer.println("FROM();");
	}

	@Override
	public void JOIN(SqlKeyword joinType) {

		if (joinType == null) {
			printer.println("JOIN(null);");
		} else {
			printer.addImport(SqlKeyword.class);
			printer.println("JOIN(%s.%s);", SqlKeyword.class.getSimpleName(), joinType.name());
		}
	}

	@Override
	public void ON() {

		printer.println("ON();");
	}

	@Override
	public void WHERE() {

		printer.println("WHERE();");
	}

	@Override
	public void GROUP_BY() {

		printer.println("GROUP_BY();");
	}

	@Override
	public void HAVING() {

		printer.println("HAVING();");
	}

	@Override
	public void ORDER_BY() {

		printer.println("ORDER_BY();");
	}
}
