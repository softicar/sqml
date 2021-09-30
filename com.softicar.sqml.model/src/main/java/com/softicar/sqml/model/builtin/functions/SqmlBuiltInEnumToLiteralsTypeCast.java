package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInType;
import com.softicar.sqml.model.builtin.types.SqmlBuiltInEnumType;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.impl.SqmlFunctionImpl;
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.simple.SqmlSimpleFunctionParameter;
import com.softicar.sqml.model.simple.SqmlSimpleTypeReference;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.List;

public class SqmlBuiltInEnumToLiteralsTypeCast extends SqmlFunctionImpl {

	private final SqmlBuiltInType sqmlTargetType;
	private final SqlKeyword sqlTargetType;

	public SqmlBuiltInEnumToLiteralsTypeCast(String name, SqmlBuiltInType sqmlTargetType, SqlKeyword sqlTargetType) {

		this.sqmlTargetType = sqmlTargetType;
		this.sqlTargetType = sqlTargetType;

		setName(name);
		setReturnType(new SqmlSimpleTypeReference(sqmlTargetType));
		getParameters().add(new SqmlSimpleFunctionParameter("value", SqmlBuiltInEnumType.get()));
	}

	@Override
	public void generateSql(ISqmlSelectGenerator generator) {

		ISqlBuilderBuilder builder = generator.getBuilder();

		builder.addToken(SqlKeyword.CAST);
		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		builder.getCallArguments().getArgument("value").accept(generator);
		builder.addToken(SqlKeyword.AS);
		builder.addToken(sqlTargetType);
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
	}

	@Override
	public boolean acceptsArguments(List<ISqmlExpression> arguments) {

		return getArgumentConversionCount(arguments) != Integer.MAX_VALUE;
	}

	@Override
	public int getArgumentConversionCount(List<ISqmlExpression> arguments) {

		if (arguments.size() != 1) {
			return Integer.MAX_VALUE;
		}

		ISqmlType type = arguments.get(0).getSqmlType();
		if (type instanceof ISqmlEnum) {
			ISqmlEnum enumType = (ISqmlEnum) type;
			return enumType.getLiteralValueType().is(sqmlTargetType)? 0 : Integer.MAX_VALUE;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
