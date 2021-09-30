package com.softicar.sqml.model.functions.linking;

import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class SqmlFunctionCallLinkComparator implements Comparator<SqmlFunctionCallLink> {

	private static final SqmlFunctionCallLinkComparator SINGLETON = new SqmlFunctionCallLinkComparator();

	private SqmlFunctionCallLinkComparator() {

		// singleton
	}

	public static SqmlFunctionCallLinkComparator get() {

		return SINGLETON;
	}

	@Override
	public int compare(SqmlFunctionCallLink left, SqmlFunctionCallLink right) {

		return ComparisonChain
			.start()
			.compareTrueFirst(left.isValid(), right.isValid())
			.compareTrueFirst(left.isMatchingName(), right.isMatchingName())
			.compareTrueFirst(left.isSimilarName(), right.isSimilarName())
			.compareTrueFirst(left.isMatchingArguments(), right.isMatchingArguments())
			.compareTrueFirst(left.isVisible(), right.isVisible())
			.compare(left.getArgumentConversionCount(), right.getArgumentConversionCount())
			.compare(left.getCallDistance(), right.getCallDistance())
			.result();
	}
}
