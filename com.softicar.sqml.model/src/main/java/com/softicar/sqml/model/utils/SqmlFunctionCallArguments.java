package com.softicar.sqml.model.utils;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.ISqmlFunctionParameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SqmlFunctionCallArguments implements ISqmlFunctionCallArguments {

	private final ISqmlFunctionCall functionCall;
	private final Map<String, ISqmlExpression> parameterNameToArgument;

	public SqmlFunctionCallArguments(ISqmlFunctionCall functionCall) {

		this.functionCall = functionCall;
		this.parameterNameToArgument = new TreeMap<>();

		List<ISqmlExpression> arguments = functionCall.getArguments();
		int argumentCount = arguments.size();

		List<? extends ISqmlFunctionParameter> parameters = functionCall.getFunction().getParameters();
		int parameterCount = parameters.size();

		if (argumentCount == parameterCount) {
			for (int i = 0; i < parameterCount; ++i) {
				parameterNameToArgument.put(parameters.get(i).getName(), arguments.get(i));
			}
		} else {
			throw new SqmlException(
				"Number of arguments %d in call to function '%s' does not match number of parameters %d.",
				argumentCount,
				functionCall.getFunction().getName(),
				parameterCount);
		}
	}

	public ISqmlFunctionCall getFunctionCall() {

		return functionCall;
	}

	@Override
	public ISqmlExpression getArgument(String parameterName) {

		ISqmlExpression expression = parameterNameToArgument.get(parameterName);
		if (expression != null) {
			return expression;
		} else {
			throw new IllegalArgumentException(String.format("Function parameter '%s' does not exist.", parameterName));
		}
	}

	@Override
	public String toString() {

		List<String> arguments = new ArrayList<>();
		for (ISqmlFunctionParameter parameter: functionCall.getFunction().getParameters()) {
			arguments.add(parameter.getName() + ": " + parameterNameToArgument.get(parameter.getName()).getClass().getSimpleName());
		}
		return "(" + Imploder.implode(arguments, ", ") + ")";
	}
}
