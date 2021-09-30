package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.runtime.select.DbSqlRawToken;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.ISqmlFunctionParameter;
import com.softicar.sqml.model.functions.impl.SqmlFunctionImpl;
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.simple.SqmlSimpleFunctionParameter;
import com.softicar.sqml.model.simple.SqmlSimpleTypeReference;
import com.softicar.sqml.model.types.ISqmlEnum;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlFunctionCallArguments;
import java.util.List;

public class SqmlBuiltInConcat extends SqmlFunctionImpl {

	public SqmlBuiltInConcat(int count) {

		setName("concat");
		setReturnType(new SqmlSimpleTypeReference(SqmlBuiltInTypes.getStringType()));
		for (int i = 0; i < count; ++i) {
			getParameters().add(new SqmlSimpleFunctionParameter("x" + i, SqmlBuiltInTypes.getStringType()));
		}
	}

	@Override
	public void generateSql(ISqmlSelectGenerator generator) {

		ISqlBuilderBuilder builder = generator.getBuilder();

		builder.addToken(new DbSqlRawToken("concat"));
		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		generateSql(generator, builder.getCallArguments());
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
	}

	private void generateSql(ISqmlSelectGenerator generator, ISqmlFunctionCallArguments callArguments) {

		boolean first = true;
		for (ISqmlFunctionParameter parameter: getParameters()) {
			if (first) {
				first = false;
			} else {
				generator.getBuilder().addToken(SqlSymbol.COMMA);
			}
			callArguments.getArgument(parameter.getName()).accept(generator);
		}
	}

	@Override
	public boolean acceptsArguments(List<ISqmlExpression> arguments) {

		return getArgumentConversionCount(arguments) != Integer.MAX_VALUE;
	}

	@Override
	public int getArgumentConversionCount(List<ISqmlExpression> arguments) {

		if (arguments.size() != getParameters().size()) {
			return Integer.MAX_VALUE;
		}

		int conversionCount = 0;
		for (ISqmlExpression argument: arguments) {
			ISqmlType type = argument.getSqmlType();
			if (type.is(SqmlBuiltInTypes.getStringType())) {
				// okay
			} else if (type.isAssignableTo(SqmlBuiltInTypes.getStringType()) || type.isAssignableTo(SqmlBuiltInTypes.getDecimalType())) {
				conversionCount += 1;
			} else if (type instanceof ISqmlEnum) {
				ISqmlEnum enumType = (ISqmlEnum) type;
				ISqmlType literalsType = enumType.getLiteralValueType();
				if (literalsType.isAssignableTo(SqmlBuiltInTypes.getStringType()) || literalsType.isAssignableTo(SqmlBuiltInTypes.getDecimalType())) {
					conversionCount += 1;
				} else {
					return Integer.MAX_VALUE;
				}
			} else {
				return Integer.MAX_VALUE;
			}
		}
		return conversionCount;
	}
}
