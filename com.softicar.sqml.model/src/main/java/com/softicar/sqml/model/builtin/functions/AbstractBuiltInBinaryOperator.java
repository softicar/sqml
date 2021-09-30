package com.softicar.sqml.model.builtin.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.impl.SqmlFunctionImpl;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.simple.SqmlSimpleFunctionParameter;
import com.softicar.sqml.model.simple.SqmlSimpleTypeReference;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeDefinition;
import java.util.List;

public abstract class AbstractBuiltInBinaryOperator extends SqmlFunctionImpl {

	protected final SqlSymbol operator;
	private final SqmlSimpleFunctionParameter parameterA;
	private final SqmlSimpleFunctionParameter parameterB;

	public AbstractBuiltInBinaryOperator(SqlSymbol operator, ISqmlTypeDefinition returnType, ISqmlTypeDefinition leftType, ISqmlTypeDefinition rightType) {

		this.operator = operator;
		this.parameterA = new SqmlSimpleFunctionParameter("a", leftType);
		this.parameterB = new SqmlSimpleFunctionParameter("b", rightType);

		setName(operator.getText());
		setReturnType(new SqmlSimpleTypeReference(returnType));
		getParameters().add(parameterA);
		getParameters().add(parameterB);
	}

	@Override
	public void generateSql(ISqmlSelectGenerator generator) {

		generator.visit(parameterA);
		generator.getBuilder().addToken(operator);
		generator.visit(parameterB);
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
		return getArgumentConversionCount(leftType, rightType);
	}

	protected abstract int getArgumentConversionCount(ISqmlType leftType, ISqmlType rightType);
}
