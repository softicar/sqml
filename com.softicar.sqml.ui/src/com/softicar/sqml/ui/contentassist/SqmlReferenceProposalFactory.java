package com.softicar.sqml.ui.contentassist;

import com.google.common.base.Function;
import com.softicar.sqml.model.functions.FunctionsPackage;
import com.softicar.sqml.model.functions.SqmlOperatorSet;
import com.softicar.sqml.model.tables.TablesPackage;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;

public class SqmlReferenceProposalFactory implements Function<IEObjectDescription, ICompletionProposal> {

	private final Function<IEObjectDescription, ICompletionProposal> defaultFactory;
	private final Set<QualifiedName> proposals;

	public SqmlReferenceProposalFactory(Function<IEObjectDescription, ICompletionProposal> defaultFactory) {

		this.defaultFactory = defaultFactory;
		this.proposals = new TreeSet<>();
	}

	@Override
	public ICompletionProposal apply(IEObjectDescription objectDescription) {

		if (proposals.add(objectDescription.getQualifiedName())) {
			ConfigurableCompletionProposal proposal = createProposal(objectDescription);
			if (proposal != null) {
				adjustPriority(proposal, objectDescription);
			}
			return proposal;
		} else {
			return null;
		}
	}

	private void adjustPriority(ConfigurableCompletionProposal proposal, IEObjectDescription objectDescription) {

		int priorityAdjustment = 0;

		// aliased object name
		if (objectDescription.getName().getSegmentCount() > 1) {
			priorityAdjustment -= 10;
			proposal.setDisplayString(proposal.getDisplayString() + " (import)");
		}

		// table reference
		if (TablesPackage.eINSTANCE.getSqmlTable().isSuperTypeOf(objectDescription.getEClass())) {
			priorityAdjustment -= 1;
		}

		// function reference
		if (FunctionsPackage.eINSTANCE.getSqmlFunction().isSuperTypeOf(objectDescription.getEClass())) {
			priorityAdjustment -= 1;
			if (SqmlOperatorSet.isOperator(objectDescription.getName())) {
				priorityAdjustment -= 5;
			}
		}

		proposal.setPriority(proposal.getPriority() + priorityAdjustment);
	}

	private ConfigurableCompletionProposal createProposal(IEObjectDescription objectDescription) {

		QualifiedName objectName = objectDescription.getName();
		if (objectName.getSegmentCount() > 1) {
			return createAliasedProposal(objectDescription);
		} else {
			return createDirectProposal(objectDescription);
		}
	}

	private ConfigurableCompletionProposal createAliasedProposal(IEObjectDescription objectDescription) {

		// create aliased object description
		QualifiedName alias = QualifiedName.create(objectDescription.getQualifiedName().getLastSegment());
		objectDescription = new AliasedEObjectDescription(alias, objectDescription);

		return createDirectProposal(objectDescription);
	}

	private ConfigurableCompletionProposal createDirectProposal(IEObjectDescription objectDescription) {

		return (ConfigurableCompletionProposal) defaultFactory.apply(objectDescription);
	}
}
