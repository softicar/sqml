package com.softicar.sqml.ui.refactor.move;

import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlImport;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.eclipse.core.resources.IFile;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.ITextRegion;

public class SqmlFileModification {

	private final IFile eclipseFile;
	private final ISqmlFile sqmlFile;
	private final Set<QualifiedName> importsToAdd;
	private final Set<QualifiedName> importsToRemove;

	public SqmlFileModification(IFile eclipseFile, ISqmlFile sqmlFile) {

		this.eclipseFile = eclipseFile;
		this.sqmlFile = sqmlFile;
		this.importsToAdd = new TreeSet<>();
		this.importsToRemove = new TreeSet<>();
	}

	public void addImportToAdd(QualifiedName qualifiedName) {

		importsToAdd.add(qualifiedName);
	}

	public void addImportToRemove(QualifiedName qualifiedName) {

		importsToRemove.add(qualifiedName);
	}

	public Change createChange() {

		// get imported names
		ITextRegion importRegion = ITextRegion.EMPTY_REGION;
		Set<QualifiedName> importedNames = new TreeSet<>();
		for (ISqmlImport sqmlImport: sqmlFile.getImports()) {
			importedNames.add(sqmlImport.getQualifiedName());
			ICompositeNode importNode = NodeModelUtils.getNode(sqmlImport);
			importRegion = importRegion.merge(importNode.getTextRegion());
		}
		importedNames.removeAll(importsToRemove);
		importedNames.addAll(importsToAdd);

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

		// create change
		TextFileChange change = new TextFileChange("Update Imports", eclipseFile);
		change.setEdit(new ReplaceEdit(importOffset, importLength, importText));
		return change;
	}
}
