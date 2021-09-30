package com.softicar.sqml.linking;

import com.google.inject.Inject;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.ISqmlFunctionCall;
import java.util.Collections;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;

public class SqmlLinkingService extends DefaultLinkingService {

	private final ISqmlFunctionCallLinker functionCallLinker;

	@Inject
	public SqmlLinkingService(ISqmlFunctionCallLinker functionCallLinker) {

		this.functionCallLinker = functionCallLinker;
	}

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node) throws IllegalNodeException {

		if (context instanceof ISqmlFunctionCall) {
			List<ISqmlFunction> functions = functionCallLinker.link((ISqmlFunctionCall) context);
			if (functions.size() > 1) {
				return Collections.emptyList();
			} else {
				return Collections.<EObject> unmodifiableList(functions);
			}
		} else {
			return super.getLinkedObjects(context, reference, node);
		}
	}
}
