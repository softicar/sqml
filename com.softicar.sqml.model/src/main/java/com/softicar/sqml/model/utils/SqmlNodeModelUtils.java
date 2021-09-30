package com.softicar.sqml.model.utils;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class SqmlNodeModelUtils {

	public static INode findMatchingNode(EObject semanticObject, RuleCall ruleCall) {

		ICompositeNode objectNode = NodeModelUtils.getNode(semanticObject);
		return findMatchingNode(objectNode, ruleCall);
	}

	public static INode findMatchingNode(INode node, RuleCall ruleCall) {

		if (node.getGrammarElement() == ruleCall) {
			return node;
		}

		if (node instanceof ICompositeNode) {
			ICompositeNode compositeNode = (ICompositeNode) node;
			for (INode child: compositeNode.getChildren()) {
				INode matchingNode = findMatchingNode(child, ruleCall);
				if (matchingNode != null) {
					return matchingNode;
				}
			}
		}

		return null;
	}

	public static INode findNodeForFeature(EObject semanticObject, EStructuralFeature feature) {

		List<INode> nodes = NodeModelUtils.findNodesForFeature(semanticObject, feature);
		if (nodes.size() == 1) {
			return nodes.get(0);
		} else {
			return null;
		}
	}

	public static ILeafNode findNonHiddenLeafNodeToTheLeft(INode node) {

		if (node instanceof ILeafNode) {
			ILeafNode leafNode = (ILeafNode) node;
			if (!leafNode.isHidden()) {
				return leafNode;
			} else {
				return findNonHiddenLeafNodeToTheLeft(leafNode.getPreviousSibling());
			}
		} else {
			return null;
		}
	}
}
