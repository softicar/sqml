package com.softicar.sqml.ui.contentassist;

import com.google.common.base.Function;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider.ReferenceProposalCreator;

public class SqmlReferenceProposalCreator extends ReferenceProposalCreator {

	@Override
	protected Function<IEObjectDescription, ICompletionProposal> getWrappedFactory(EObject model, EReference reference,
			final Function<IEObjectDescription, ICompletionProposal> proposalFactory) {

		return new SqmlReferenceProposalFactory(proposalFactory);
	}
}
