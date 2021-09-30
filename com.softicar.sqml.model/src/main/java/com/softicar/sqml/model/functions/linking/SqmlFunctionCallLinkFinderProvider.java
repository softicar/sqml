package com.softicar.sqml.model.functions.linking;

import com.google.inject.Inject;
import com.softicar.sqml.model.utils.scoping.ISqmlFileScopeProvider;

public class SqmlFunctionCallLinkFinderProvider implements ISqmlFunctionCallLinkFinderProvider {

	private final ISqmlFileScopeProvider fileScopeProvider;

	@Inject
	public SqmlFunctionCallLinkFinderProvider(ISqmlFileScopeProvider fileScopeProvider) {

		this.fileScopeProvider = fileScopeProvider;
	}

	@Override
	public ISqmlFunctionCallLinkFinder getFinder() {

		return new SqmlFunctionCallLinkFinder(fileScopeProvider);
	}
}
