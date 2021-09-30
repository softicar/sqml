package com.softicar.sqml.ui.highlighting;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

class HighlightingUtils {

	public static void highlightNode(IHighlightedPositionAcceptor acceptor, INode node, String id) {

		if (node == null) {
			return;
		}
		if (node instanceof ILeafNode) {
			acceptor.addPosition(node.getOffset(), node.getLength(), id);
		} else {
			for (ILeafNode leaf: node.getLeafNodes()) {
				if (!leaf.isHidden()) {
					acceptor.addPosition(leaf.getOffset(), leaf.getLength(), id);
				}
			}
		}
	}

	public static INode getNode(EObject semantic) {

		return NodeModelUtils.findActualNodeFor(semantic);
	}

	public static INode getFirstFeatureNode(EObject semantic, EStructuralFeature feature) {

		if (feature == null) {
			return NodeModelUtils.findActualNodeFor(semantic);
		}
		List<INode> nodes = NodeModelUtils.findNodesForFeature(semantic, feature);
		if (!nodes.isEmpty()) {
			return nodes.get(0);
		}
		return null;
	}
}
