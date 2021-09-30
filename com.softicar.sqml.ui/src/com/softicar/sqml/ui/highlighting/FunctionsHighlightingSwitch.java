package com.softicar.sqml.ui.highlighting;

import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.SqmlFunctionCall;
import com.softicar.sqml.model.functions.util.FunctionsSwitch;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;

class FunctionsHighlightingSwitch extends FunctionsSwitch<Void> {

	private final IHighlightedPositionAcceptor acceptor;

	public FunctionsHighlightingSwitch(IHighlightedPositionAcceptor acceptor) {

		this.acceptor = acceptor;
	}

	@Override
	public Void caseSqmlFunctionCall(SqmlFunctionCall methodCall) {

		INode node = HighlightingUtils.getFirstFeatureNode(methodCall, FunctionsPackage.eINSTANCE.getSqmlFunctionCall_Function());
		HighlightingUtils.highlightNode(acceptor, node, SqmlHighlightingConfigurator.SQML_FUNCTION_CALL);
		return null;
	}
}
