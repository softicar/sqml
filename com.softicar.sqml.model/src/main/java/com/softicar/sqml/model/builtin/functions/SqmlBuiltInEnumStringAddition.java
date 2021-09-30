package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
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

public class SqmlBuiltInEnumStringAddition extends SqmlFunctionImpl {

	public SqmlBuiltInEnumStringAddition() {

		setName(SqlSymbol.PLUS.getText());
		setReturnType(new SqmlSimpleTypeReference(SqmlBuiltInTypes.getStringType()));
		getParameters().add(new SqmlSimpleFunctionParameter("a", SqmlBuiltInEnumType.get()));
		getParameters().add(new SqmlSimpleFunctionParameter("b", SqmlBuiltInTypes.getStringType()));
	}

	@Override
	public void generateSql(ISqmlSelectGenerator generator) {

		ISqlBuilderBuilder builder = generator.getBuilder();

		builder.addToken(SqlKeyword.CONCAT);
		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		builder.getCallArguments().getArgument("a").accept(generator);
		builder.addToken(SqlSymbol.COMMA);
		builder.getCallArguments().getArgument("b").accept(generator);
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);
	}

	@Override
	public boolean acceptsArguments(List<ISqmlExpression> arguments) {

		return getArgumentConversionCount(arguments) != Integer.MAX_VALUE;
	}

	@Override
	public int getArgumentConversionCount(List<ISqmlExpression> arguments) {

		if (arguments.size() != 2) {
			return Integer.MAX_VALUE;
		}

		ISqmlType leftType = arguments.get(0).getSqmlType();
		ISqmlType rightType = arguments.get(1).getSqmlType();
		if (leftType instanceof ISqmlEnum) {
			ISqmlEnum sqmlEnum = (ISqmlEnum) leftType;
			if (sqmlEnum.getLiteralValueType().is(SqmlBuiltInTypes.getStringType()) && rightType.is(SqmlBuiltInTypes.getStringType())) {
				return 0;
			} else {
				return Integer.MAX_VALUE;
			}
		} else {
			return Integer.MAX_VALUE;
		}
	}
}
