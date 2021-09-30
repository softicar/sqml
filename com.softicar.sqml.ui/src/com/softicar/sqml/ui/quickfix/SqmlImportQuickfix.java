package com.softicar.sqml.ui.quickfix;

import com.softicar.sqml.model.files.SqmlFile;
import com.softicar.sqml.model.utils.SqmlNavigation;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

public class SqmlImportQuickfix implements ISemanticModification {

	private final IEObjectDescription objectDescription;

	public SqmlImportQuickfix(IEObjectDescription objectDescription) {

		this.objectDescription = objectDescription;
	}

	public void addTo(IssueResolutionAcceptor issueResolutionAcceptor, Issue issue) {

		issueResolutionAcceptor.accept(issue, getLabel(), getDescription(), getIcon(), this);
	}

	public String getIcon() {

		return null;
	}

	public String getLabel() {

		return String.format("Import %s", objectDescription.getQualifiedName());
	}

	public String getDescription() {

		return getLabel();
	}

	@Override
	public void apply(EObject element, IModificationContext context) throws Exception {

		// gather currently imported names
		SqmlFile sqmlFile = SqmlNavigation.findOrThrow(SqmlFile.class, element);
		TreeSet<QualifiedName> importedNames = sqmlFile//
			.getImports()
			.stream()
			.map(sqmlImport -> sqmlImport.getQualifiedName())
			.collect(Collectors.toCollection(TreeSet::new));

		// add new import
		importedNames.add(objectDescription.getQualifiedName());

		// get text region to replace
		ICompositeNode packageNode = NodeModelUtils.getNode(sqmlFile.getPackageDeclaration());
		ICompositeNode elementNode = NodeModelUtils.getNode(sqmlFile.getElements().get(0));
		int importOffset = packageNode.getEndOffset();
		int importLength = elementNode.getOffset() - importOffset;

		// get replacement text
		String importText = importedNames//
			.stream()
			.map(importedName -> "IMPORT " + importedName.toString())
			.collect(Collectors.joining("\n"));
		importText = importText.isEmpty()? "\n\n" : "\n\n" + importText + "\n\n";

		// replace text
		context.getXtextDocument().replace(importOffset, importLength, importText);
	}
}
