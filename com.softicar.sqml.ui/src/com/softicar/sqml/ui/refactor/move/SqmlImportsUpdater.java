package com.softicar.sqml.ui.refactor.move;

import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.utils.references.SqmlCrossReference;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlImportsUpdater {

	private final SqmlFileModificationMap modificationMap;
	private final SqmlMoveContext moveContext;

	public SqmlImportsUpdater(SqmlMoveContext moveContext) {

		this.modificationMap = new SqmlFileModificationMap();
		this.moveContext = moveContext;
	}

	public SqmlFileModificationMap getModificationMap() {

		return modificationMap;
	}

	public void addUpdateForReference(SqmlCrossReference reference) {

		if (reference.getTargetObject() instanceof ISqmlGlobalObject) {
			IFile fileAfterMove = moveContext.getFileAfterMove(SqmlEclipeWorkspace.getEclipseSourceFile(reference));

			// remove import to old qualified name
			QualifiedName targetNameBeforeMove = moveContext.getQualifiedNameBeforeMove(reference.getTargetObject());
			modificationMap//
				.get(fileAfterMove, reference.getSqmlSourceFile())
				.addImportToRemove(targetNameBeforeMove);

			// add import to new qualified name (if necessary)
			QualifiedName sourcePackageNameAfterMove = moveContext.getPackageNameAfterMove(reference.getSourceObject());
			QualifiedName targetPackageNameAfterMove = moveContext.getPackageNameAfterMove(reference.getTargetObject());
			if (!sourcePackageNameAfterMove.equals(targetPackageNameAfterMove)) {
				QualifiedName targetNameAfterMove = moveContext.getQualifiedNameAfterMove(reference.getTargetObject());
				modificationMap//
					.get(fileAfterMove, reference.getSqmlSourceFile())
					.addImportToAdd(targetNameAfterMove);
			}
		}
	}
}
