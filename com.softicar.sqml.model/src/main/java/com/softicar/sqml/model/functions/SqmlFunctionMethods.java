package com.softicar.sqml.model.functions;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.functions.validation.SqmlFunctionValidator;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlFunctionMethods {

	public static void validate(ISqmlFunction function, ISqmlValidationContext context) {

		new SqmlFunctionValidator(function, context).validate();
	}

	public static String getSimpleSignature(ISqmlFunction function) {

		return function.getName() + getParameterSignature(function);
	}

	public static QualifiedName getQualifiedSignature(ISqmlFunction function) {

		return function.getQualifiedPackageName().append(getSimpleSignature(function));
	}

	private static String getParameterSignature(ISqmlFunction function) {

		List<String> parameterSignatures = new ArrayList<>();
		for (ISqmlFunctionParameter parameter: function.getParameters()) {
			parameterSignatures.add(parameter.getSqmlType().getQualifiedName().toString("."));
		}
		return "(" + Imploder.implode(parameterSignatures, ",") + ")";
	}

	public static String getDisplayName(ISqmlFunction function) {

		List<String> parameterTypes = new ArrayList<>();
		for (ISqmlFunctionParameter parameter: function.getParameters()) {
			parameterTypes.add(parameter.getSqmlType().getDisplayName());
		}
		return function.getQualifiedName() + "(" + Imploder.implode(parameterTypes, ", ") + ")";
	}

	public static ISqmlType getSqmlType(ISqmlFunction function) {

		ISqmlTypeReference returnType = function.getReturnType();
		return returnType != null? returnType.getSqmlType() : null;
	}

	public static void generateSql(ISqmlFunction function, ISqmlSelectGenerator generator) {

		if (function.getSql() != null) {
			for (ISqmlModelElement sqlToken: function.getSql().getTokens()) {
				sqlToken.accept(generator);
			}
		} else if (function.getExpression() != null) {
			function.getExpression().accept(generator);
		} else {
			throw new IllegalArgumentException(
				String
					.format(//
						"Internal error: Function '%s' is neither an SQL function nor an expression function.",
						function.getDisplayName()));
		}
	}

	public static boolean acceptsArguments(ISqmlFunction function, List<ISqmlExpression> arguments) {

		return getArgumentConversionCount(function, arguments) != Integer.MAX_VALUE;
	}

	public static int getArgumentConversionCount(ISqmlFunction function, List<ISqmlExpression> arguments) {

		List<? extends ISqmlFunctionParameter> parameters = function.getParameters();

		// check argument count
		if (arguments.size() != parameters.size()) {
			return Integer.MAX_VALUE;
		}

		// check argument types
		int count = 0;
		for (int i = 0; i < arguments.size(); ++i) {
			ISqmlType argumentType = arguments.get(i).getSqmlType();
			ISqmlType parameterType = parameters.get(i).getSqmlType();

			if (argumentType == null) {
				return Integer.MAX_VALUE;
			} else if (argumentType.is(parameterType)) {
				// okay
			} else if (argumentType.isAssignableTo(parameterType)) {
				count += 1;
			} else {
				return Integer.MAX_VALUE;
			}
		}
		return count;
	}
}
