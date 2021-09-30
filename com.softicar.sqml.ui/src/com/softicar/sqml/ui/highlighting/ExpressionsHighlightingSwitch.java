package com.softicar.sqml.ui.highlighting;

import com.softicar.sqml.model.expressions.SqmlStaticVariableReference;
import com.softicar.sqml.model.expressions.util.ExpressionsSwitch;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;

class ExpressionsHighlightingSwitch extends ExpressionsSwitch<Void> {

	private final IHighlightedPositionAcceptor acceptor;

	public ExpressionsHighlightingSwitch(IHighlightedPositionAcceptor acceptor) {

		this.acceptor = acceptor;
	}

	@Override
	public Void caseSqmlStaticVariableReference(SqmlStaticVariableReference reference) {

		INode node = HighlightingUtils.getNode(reference);
		HighlightingUtils.highlightNode(acceptor, node, SqmlHighlightingConfigurator.SQML_STATIC_VARIABLE_REFERENCE);
		return null;
	}
}
