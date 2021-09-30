package com.softicar.sqml.ui.refactor.move;

import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.SqmlPackageDeclaration;
import com.softicar.sqml.model.utils.SqmlNodeModelUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.xtext.nodemodel.INode;

public class SqmlPackageNameChange extends Change {

	private final RefactoringStatus status;
	private final SqmlFileMoveContext context;

	public SqmlPackageNameChange(SqmlFileMoveContext context) {

		this.status = new RefactoringStatus();
		this.context = context;
	}

	@Override
	public String getName() {

		return "Package Name Change";
	}

	@Override
	public void initializeValidationData(IProgressMonitor pm) {

		// nothing to do yet
	}

	@Override
	public RefactoringStatus isValid(IProgressMonitor pm) throws OperationCanceledException {

		return status;
	}

	@Override
	public Change perform(IProgressMonitor pm) throws CoreException {

		SqmlPackageDeclaration packageDeclaration = (SqmlPackageDeclaration) context.getSqmlFile().getPackageDeclaration();
		INode packageNameNode = SqmlNodeModelUtils.findNodeForFeature(packageDeclaration, FilesPackage.eINSTANCE.getSqmlPackageDeclaration_Name());

		TextFileChange change = new TextFileChange(getName(), context.getTargetFile());
		change.setEdit(new ReplaceEdit(packageNameNode.getOffset(), packageNameNode.getLength(), context.getNewPackageName().toString()));
		change.perform(pm);

		return new SqmlPackageNameChange(context);
	}

	@Override
	public Object getModifiedElement() {

		return context.getTargetFile();
	}
}
