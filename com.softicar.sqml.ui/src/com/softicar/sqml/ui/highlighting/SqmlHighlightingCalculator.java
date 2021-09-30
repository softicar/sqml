package com.softicar.sqml.ui.highlighting;

import java.util.Iterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

public class SqmlHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {

		if (resource == null) {
			return;
		}

		// TODO: use ISqmlModelVisitor here
		SqmlTypesHighlightingSwitch typesSwitch = new SqmlTypesHighlightingSwitch(acceptor);
		ExpressionsHighlightingSwitch expressionsSwitch = new ExpressionsHighlightingSwitch(acceptor);
		FunctionsHighlightingSwitch functionsSwitch = new FunctionsHighlightingSwitch(acceptor);
		Iterator<EObject> iter = EcoreUtil.getAllContents(resource, true);
		while (iter.hasNext()) {
			EObject current = iter.next();
			typesSwitch.doSwitch(current);
			expressionsSwitch.doSwitch(current);
			functionsSwitch.doSwitch(current);
		}
	}
}
