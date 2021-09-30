package com.softicar.sqml.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;

public class SqmlHighlightingConfiguration extends DefaultHighlightingConfiguration {

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {

		new SqmlHighlightingConfigurator(acceptor).configure();
		super.configure(acceptor);
	}
}
