package com.softicar.sqml.model.functions.linking;

import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

public class SqmlFunctionNames {

	// -------------------- matching name -------------------- //

	public static boolean isMatchingName(ISqmlFunctionCall functionCall, IEObjectDescription function) {

		return isMatchingName(functionCall.getFunctionName(), function.getQualifiedName());
	}

	public static boolean isMatchingName(QualifiedName sourceName, QualifiedName targetName) {

		return targetName.getLastSegment().equals(sourceName.getLastSegment());
	}

	// -------------------- similar name -------------------- //

	public static boolean isSimilarName(ISqmlFunctionCall functionCall, ISqmlFunction function) {

		return isSimilarName(functionCall.getFunctionName(), function.getQualifiedName());
	}

	public static boolean isSimilarName(ISqmlFunctionCall functionCall, IEObjectDescription function) {

		return isSimilarName(functionCall.getFunctionName(), function.getQualifiedName());
	}

	public static boolean isSimilarName(QualifiedName sourceName, QualifiedName targetName) {

		String normalizedTargetName = getNormalized(targetName.getLastSegment());
		String normalizedSourceName = getNormalized(sourceName.getLastSegment());
		return normalizedTargetName.startsWith(normalizedSourceName);
	}

	private static String getNormalized(String simpleName) {

		return simpleName.replace("_", "").toUpperCase();
	}
}
