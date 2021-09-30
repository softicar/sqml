package com.softicar.sqml.model.functions.linking;

import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.utils.LazyField;

public class SqmlFunctionCallLink {

	private final ISqmlFunctionCall functionCall;
	private final ISqmlFunction function;
	private final LazyField<Boolean> visible;
	private final LazyField<Boolean> matchingName;
	private final LazyField<Boolean> similarName;
	private final LazyField<Boolean> matchingArgumentCount;
	private final LazyField<Integer> argumentConversionCount;
	private final LazyField<Integer> callDistance;

	public SqmlFunctionCallLink(ISqmlFunctionCall functionCall, ISqmlFunction function) {

		this(functionCall, function, new SqmlFunctionCallLinkHelper(functionCall));
	}

	public SqmlFunctionCallLink(ISqmlFunctionCall functionCall, ISqmlFunction function, SqmlFunctionCallLinkHelper linkHelper) {

		this.functionCall = functionCall;
		this.function = function;
		this.visible = new LazyField<>(() -> linkHelper.isVisible(function));
		this.matchingName = new LazyField<>(() -> linkHelper.isMatchingName(function));
		this.similarName = new LazyField<>(() -> SqmlFunctionNames.isSimilarName(functionCall, function));
		this.matchingArgumentCount = new LazyField<>(() -> linkHelper.isMatchingArgumentCount(function));
		this.argumentConversionCount = new LazyField<>(() -> linkHelper.getArgumentConversionCount(function));
		this.callDistance = new LazyField<>(() -> linkHelper.getCallDistance(function));
	}

	public ISqmlFunctionCall getFunctionCall() {

		return functionCall;
	}

	public ISqmlFunction getFunction() {

		return function;
	}

	public boolean isValid() {

		return isMatchingName() && isMatchingArguments() && isVisible();
	}

	public boolean isVisible() {

		return visible.getValue();
	}

	public boolean isMatchingName() {

		return matchingName.getValue();
	}

	public boolean isSimilarName() {

		return similarName.getValue();
	}

	public boolean isMatchingArguments() {

		return isMatchingArgumentCount() && getArgumentConversionCount() < Integer.MAX_VALUE;
	}

	public boolean isMatchingArgumentCount() {

		return matchingArgumentCount.getValue();
	}

	public int getArgumentConversionCount() {

		return argumentConversionCount.getValue();
	}

	public int getCallDistance() {

		return callDistance.getValue();
	}
}
