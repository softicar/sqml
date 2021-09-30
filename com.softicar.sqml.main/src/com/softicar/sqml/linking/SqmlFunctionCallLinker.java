package com.softicar.sqml.linking;

import com.google.inject.Inject;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import com.softicar.sqml.model.functions.linking.ISqmlFunctionCallLinkFinderProvider;
import com.softicar.sqml.model.functions.linking.SqmlFunctionCallLink;
import java.util.Collections;
import java.util.List;

public class SqmlFunctionCallLinker implements ISqmlFunctionCallLinker {

	private final ISqmlFunctionCallLinkFinderProvider finderProvider;

	@Inject
	public SqmlFunctionCallLinker(ISqmlFunctionCallLinkFinderProvider finderProvider) {

		this.finderProvider = finderProvider;
	}

	@Override
	public List<ISqmlFunction> link(ISqmlFunctionCall functionCall) {

		List<SqmlFunctionCallLink> links = getLinks(functionCall);
		if (links.isEmpty()) {
			return Collections.emptyList();
		} else {
			// link to first best match
			// validation will check for ambiguous calls later
			return Collections.singletonList(links.get(0).getFunction());
		}
	}

	private List<SqmlFunctionCallLink> getLinks(ISqmlFunctionCall functionCall) {

		List<SqmlFunctionCallLink> links = finderProvider//
				.getFinder()
				.findLinks(functionCall)
				.getSortedList();
		if (!links.isEmpty()) {
			return links;
		} else {
			// link to invisible methods
			return finderProvider//
					.getFinder()
					.setIncludeInvisibleFunctions(true)
					.setIncludeFunctionsWithMismatchingArguments(true)
					.findLinks(functionCall)
					.getSortedList();
		}
	}
}
