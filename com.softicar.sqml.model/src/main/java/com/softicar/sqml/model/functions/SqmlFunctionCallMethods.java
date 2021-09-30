package com.softicar.sqml.model.functions;

import com.softicar.platform.common.core.utils.DevNull;
import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.SqmlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class SqmlFunctionCallMethods {

	public static ISqmlType getSqmlType(ISqmlFunctionCall functionCall) {

		ISqmlFunction function = functionCall.getFunction();
		if (!function.eIsProxy()) {
			return function.getSqmlType();
		} else {
			return null;
		}
	}

	public static QualifiedName getFunctionName(ISqmlFunctionCall functionCall) {

		List<INode> nodes = NodeModelUtils.findNodesForFeature(functionCall, FunctionsPackage.eINSTANCE.getSqmlFunctionCall_Function());
		if (nodes.size() == 1) {
			String[] nameParts = NodeModelUtils.getTokenText(nodes.get(0)).split("\\.");
			return QualifiedName.create(Arrays.asList(nameParts));
		} else {
			return null;
		}
	}

	public static String getDisplayName(ISqmlFunctionCall functionCall) {

		// get function name
		QualifiedName functionName = functionCall.getFunctionName();
		if (functionName == null || functionName.toString(".").isEmpty()) {
			functionName = QualifiedName.create("<unknown>");
		}

		// get type names of arguments
		List<String> argumentTypeNames = new ArrayList<>();
		for (ISqmlExpression expression: functionCall.getArguments()) {
			if (expression == null || expression.getSqmlType() == null) {
				argumentTypeNames.add("<unknown>");
			} else {
				argumentTypeNames.add(expression.getSqmlType().getDisplayName());
			}
		}

		return String.format("%s(%s)", functionName.toString("."), Imploder.implode(argumentTypeNames, ", "));
	}

	public static boolean isWellDefined(ISqmlFunctionCall functionCall) {

		try {
			QualifiedName functionName = functionCall.getFunctionName();
			if (functionName == null || functionName.isEmpty()) {
				return false;
			}

			for (ISqmlExpression expression: functionCall.getArguments()) {
				if (expression == null || expression.getSqmlType() == null) {
					return false;
				}
			}
		} catch (SqmlException exception) {
			DevNull.swallow(exception);
			return false;
		}

		return true;
	}
}
