package com.softicar.sqml.ui.contentassist;

import com.google.inject.Inject;
import com.softicar.platform.common.code.java.WordFragment;
import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.selects.ISqmlForeignKeyVariable;
import com.softicar.sqml.model.selects.ISqmlTableVariable;
import com.softicar.sqml.model.selects.SelectsPackage;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.utils.SqmlNodeModelUtils;
import com.softicar.sqml.utils.ExpectedPackageNameDeterminer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

public class SqmlProposalProvider extends AbstractSqmlProposalProvider {

	@Inject private ResourceSet resourceSet;

	@Override
	protected String getDisplayString(EObject object, String qualifiedNameAsString, String shortName) {

		if (object instanceof ISqmlFunction) {
			if (object.eIsProxy()) {
				object = EcoreUtil.resolve(object, resourceSet);
			}
			ISqmlFunction function = (ISqmlFunction) object;
			return function.getName() + " - " + function.getDisplayName();
		} else {
			return super.getDisplayString(object, qualifiedNameAsString, shortName);
		}
	}

//	@Override
//	public void completeSqmlFunctionCall_Function(EObject functionCall, Assignment assignment, ContentAssistContext context,
//			ICompletionProposalAcceptor acceptor) {
//
//		IScope scope = getScopeProvider().getScope(functionCall, FunctionsPackage.eINSTANCE.getSqmlFunctionCall_Function());
//		for (IEObjectDescription objectDescription: scope.getAllElements()) {
//			ICompletionProposal completionProposal = getProposalFactory(null, context).apply(objectDescription);
//			acceptor.accept(completionProposal);
//		}
//	}

	@Override
	public void completeSqmlPackageDeclaration_Name(EObject packageDeclaration, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		ISqmlFile sqmlFile = SqmlNavigation.findOrThrow(ISqmlFile.class, packageDeclaration);
		if (sqmlFile != null) {
			JavaPackageName packageName = new ExpectedPackageNameDeterminer(sqmlFile).getJavaPackageName();
			acceptor.accept(createCompletionProposal(packageName.getName(), packageName.getName(), null, context));
		}
	}

	@Override
	public void completeSqmlQuery_Name(EObject query, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		Resource resource = SqmlNavigation.getResource(query);
		if (resource != null) {
			String queryName = resource.getURI().trimFileExtension().lastSegment();
			acceptor.accept(createCompletionProposal(queryName, queryName, null, context));
		}
	}

	@Override
	public void completeSqmlTable_Name(EObject table, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		Resource resource = SqmlNavigation.getResource(table);
		if (resource != null) {
			String tableName = resource.getURI().trimFileExtension().lastSegment();
			acceptor.accept(createCompletionProposal(tableName, tableName, null, context));
		}
	}

	@Override
	public void completeSqmlTableVariable_Name(EObject contextObject, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		if (contextObject instanceof ISqmlTableVariable) {
			INode node = SqmlNodeModelUtils.findNodeForFeature(contextObject, SelectsPackage.eINSTANCE.getSqmlTableVariable_Table());
			if (node != null && node.getText() != null) {
				createDerivedNameProposals(context, acceptor, node.getText());
			}
		} else {
			ILeafNode leafNode = SqmlNodeModelUtils.findNonHiddenLeafNodeToTheLeft(context.getCurrentNode());
			if (leafNode != null) {
				createDerivedNameProposals(context, acceptor, leafNode.getText());
			}
		}
	}

	@Override
	public void completeSqmlForeignKeyVariable_Name(EObject contextObject, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		if (contextObject instanceof ISqmlForeignKeyVariable) {
			INode node = SqmlNodeModelUtils.findNodeForFeature(contextObject, SelectsPackage.eINSTANCE.getSqmlForeignKeyVariable_Column());
			if (node != null && node.getText() != null) {
				createDerivedNameProposals(context, acceptor, node.getText());
			}
		}
	}

	private void createDerivedNameProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor, String templateName) {

		for (String name: new PossibleVariableNamesGenerator(WordFragment.parse(templateName)).generate()) {
			acceptor.accept(createCompletionProposal(name, name, null, context));
		}
	}
}
