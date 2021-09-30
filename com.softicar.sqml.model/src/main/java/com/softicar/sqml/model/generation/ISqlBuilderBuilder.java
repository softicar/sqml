package com.softicar.sqml.model.generation;

import com.softicar.platform.db.sql.token.ISqlToken;
import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.expressions.ISqmlStaticExpression;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.selects.ISqmlSelectColumn;
import com.softicar.sqml.model.selects.ISqmlVariable;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.ISqmlFunctionCallArguments;
import java.math.BigDecimal;
import java.util.List;

public interface ISqlBuilderBuilder {

	// -------------------- Sub-Selects -------------------- //

	void startSubSelect();

	void finishSubSelect();

	// -------------------- Function Calls -------------------- //

	void pushCallArguments(ISqmlFunctionCallArguments callArguments);

	ISqmlFunctionCallArguments popCallArguments();

	ISqmlFunctionCallArguments getCallArguments();

	// -------------------- Adding -------------------- //

	void addToken(ISqlToken token);

	void addIdentifier(String...identifierParts);

	void addIdentifier(List<String> identifierParts);

	void addIdentifier(ISqmlTable table);

	void addIdentifier(ISqmlSelectColumn column);

	void addIdentifier(ISqmlVariable variable);

	void addIdentifier(ISqmlVariable variable, String columnName);

	void addIdentifier(ISqmlVariable variable, ISqmlColumn column);

	void addParameter(ISqmlQueryParameter parameter);

	void addTableColumns(ISqmlVariable variable, ISqmlTable table, String columnAlias);

	void addLiteral(boolean literal);

	void addLiteral(int literal);

	void addLiteral(long literal);

	void addLiteral(BigDecimal literal);

	void addLiteral(String literal);

	// -------------------- Conditional -------------------- //

	void beginIf(ISqmlStaticExpression expression);

	void beginElseIf(ISqmlStaticExpression expression);

	void beginIfEmpty(ISqmlQueryParameter parameter);

	void beginElse();

	void endIf();

	// -------------------- Special Keywords -------------------- //

	void SELECT(ISqmlSelectColumn selectColumn);

	void FROM();

	void JOIN(SqlKeyword joinType);

	void ON();

	void WHERE();

	void GROUP_BY();

	void HAVING();

	void ORDER_BY();
}
