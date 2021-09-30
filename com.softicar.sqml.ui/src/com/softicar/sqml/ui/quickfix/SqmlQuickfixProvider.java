package com.softicar.sqml.ui.quickfix;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.ICaseInsensitivityHelper;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.ui.editor.quickfix.ReplaceModification;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;

public class SqmlQuickfixProvider extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {

	private static final Logger logger = Logger.getLogger(SqmlQuickfixProvider.class);

	@Inject private ICaseInsensitivityHelper caseInsensitivityHelper;

	@Inject private CrossRefResolutionConverter converter;

	@Override
	public void createLinkingIssueResolutions(final Issue issue, final IssueResolutionAcceptor issueResolutionAcceptor) {

		final IModificationContext modificationContext = getModificationContextFactory().createModificationContext(issue);
		final IXtextDocument xtextDocument = modificationContext.getXtextDocument();
		if (xtextDocument == null) {
			return;
		}
		xtextDocument.readOnly(new IUnitOfWork.Void<XtextResource>() {

			@Override
			public void process(XtextResource state) throws Exception {

				EObject target = state.getEObject(issue.getUriToProblem().fragment());
				EReference reference = getUnresolvedEReference(issue, target);
				if (reference == null) {
					return;
				}
				fixUnresolvedReference(issue, xtextDocument, target, reference);
			}

			protected void fixUnresolvedReference(final Issue issue, final IXtextDocument xtextDocument, EObject target, EReference reference)
					throws BadLocationException {

				boolean caseInsensitive = caseInsensitivityHelper.isIgnoreCase(reference);
				EObject crossReferenceTerminal = getCrossReference(issue, target);
				String ruleName = null;
				Keyword keyword = null;
				if (crossReferenceTerminal instanceof RuleCall) {
					RuleCall ruleCall = (RuleCall) crossReferenceTerminal;
					ruleName = ruleCall.getRule().getName();
				} else if (crossReferenceTerminal instanceof Keyword) {
					keyword = (Keyword) crossReferenceTerminal;
				}

				String issueString = xtextDocument.get(issue.getOffset(), issue.getLength());
				IScope scope = getScopeProvider().getScope(target, reference);

				for (IEObjectDescription object: findImportableObjects(scope, issueString)) {
					createImportResolution(object);
				}

				for (IEObjectDescription object: findSimilarlyNamedObjects(scope, issueString)) {
					createReplaceResolution(issueString, object, ruleName, keyword, caseInsensitive);
				}
			}

			protected AbstractElement getCrossReference(final Issue issue, EObject target) {

				final ICompositeNode node = NodeModelUtils.getNode(target);
				if (node == null) {
					throw new IllegalStateException("Cannot happen since we found a reference");
				}
				ICompositeNode rootNode = node.getRootNode();
				ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(rootNode, issue.getOffset());
				CrossReference crossReference = findCrossReference(target, leaf);
				return crossReference.getTerminal();
			}

			public void createReplaceResolution(String issueString, IEObjectDescription solution, String ruleName, Keyword keyword, boolean caseInsensitive) {

				String replacement = getQualifiedNameConverter().toString(solution.getName());
				String replaceLabel = fixCrossReferenceLabel(issueString, replacement);
				if (keyword != null) {
					if (caseInsensitive && !replacement.equalsIgnoreCase(keyword.getValue())) {
						return;
					}
					if (!caseInsensitive && !replacement.equals(keyword.getValue())) {
						return;
					}
				} else if (ruleName != null) {
					replacement = converter.convertToString(replacement, ruleName);
				} else {
					logger.error("either keyword or ruleName have to present", new IllegalStateException());
				}
				issueResolutionAcceptor
					.accept(//
						issue,
						replaceLabel,
						replaceLabel,
						fixCrossReferenceImage(issueString, replacement),
						new ReplaceModification(issue, replacement));
			}

			public void createImportResolution(IEObjectDescription solution) {

				new SqmlImportQuickfix(solution).addTo(issueResolutionAcceptor, issue);
			}

		});
	}

	private List<IEObjectDescription> findSimilarlyNamedObjects(IScope scope, String name) {

		List<IEObjectDescription> objects = new ArrayList<>();
		for (IEObjectDescription object: scope.getAllElements()) {
			if (getSimilarityMatcher().isSimilar(name, getQualifiedNameConverter().toString(object.getName()))) {
				objects.add(object);
			}
		}
		return objects;
	}

	private List<IEObjectDescription> findImportableObjects(IScope scope, String name) {

		List<IEObjectDescription> objects = new ArrayList<>();
		for (IEObjectDescription object: scope.getAllElements()) {
			if (object.getQualifiedName().getLastSegment().equals(name)) {
				objects.add(object);
			}
		}
		return objects;
	}

	private CrossReference findCrossReference(EObject context, INode node) {

		if (node == null || node.hasDirectSemanticElement() && context.equals(node.getSemanticElement())) {
			return null;
		}

		EObject grammarElement = node.getGrammarElement();
		if (grammarElement instanceof CrossReference) {
			return (CrossReference) grammarElement;
		} else {
			return findCrossReference(context, node.getParent());
		}
	}
}
