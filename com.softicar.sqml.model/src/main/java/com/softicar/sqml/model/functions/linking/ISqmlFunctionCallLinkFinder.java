package com.softicar.sqml.model.functions.linking;

import com.softicar.sqml.model.functions.ISqmlFunctionCall;

public interface ISqmlFunctionCallLinkFinder {

	ISqmlFunctionCallLinkFinder setIncludeFunctionsWithSimilarName(boolean includeSimilarName);

	ISqmlFunctionCallLinkFinder setIncludeInvisibleFunctions(boolean includeInvisible);

	ISqmlFunctionCallLinkFinder setIncludeFunctionsWithMismatchingArguments(boolean includeMismatchingArguments);

	SqmlFunctionCallLinks findLinks(ISqmlFunctionCall functionCall);
}
