package com.softicar.sqml.ui.highlighting;

import com.softicar.sqml.model.builtin.SqmlBuiltInType;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.types.SqmlTypeReference;
import com.softicar.sqml.model.types.TypesPackage;
import com.softicar.sqml.model.types.util.TypesSwitch;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;

public class SqmlTypesHighlightingSwitch extends TypesSwitch<Void> {

	private final IHighlightedPositionAcceptor acceptor;

	public SqmlTypesHighlightingSwitch(IHighlightedPositionAcceptor acceptor) {

		this.acceptor = acceptor;
	}

	@Override
	public Void caseSqmlTypeReference(SqmlTypeReference typeReference) {

		ISqmlType targetType = typeReference.getTypeDefinition();
		if (targetType instanceof SqmlBuiltInType) {
			INode node = HighlightingUtils.getFirstFeatureNode(typeReference, TypesPackage.eINSTANCE.getSqmlTypeReference_TypeDefinition());
			HighlightingUtils.highlightNode(acceptor, node, SqmlHighlightingConfigurator.SQML_BUILT_IN_TYPE);
		}
		return null;
	}
}
