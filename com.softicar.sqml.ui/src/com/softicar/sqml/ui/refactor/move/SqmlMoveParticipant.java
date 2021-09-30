package com.softicar.sqml.ui.refactor.move;

import com.google.inject.Inject;
import com.softicar.sqml.model.utils.references.SqmlCrossReference;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.ISharableParticipant;
import org.eclipse.ltk.core.refactoring.participants.MoveArguments;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.eclipse.ltk.core.refactoring.participants.RefactoringArguments;

public class SqmlMoveParticipant extends MoveParticipant implements ISharableParticipant {

	private final SqmlMoveContext context;
	private final SqmlMoveAssociatedFilesChecker associatedFilesChecker;

	@Inject
	public SqmlMoveParticipant(SqmlMoveContext context, SqmlMoveAssociatedFilesChecker associatedFilesChecker) {

		this.context = context;
		this.associatedFilesChecker = associatedFilesChecker;
	}

	@Override
	protected boolean initialize(Object element) {

		Object destination = getArguments().getDestination();
		if (element instanceof IFile && destination instanceof IFolder) {
			this.context.add((IFile) element, (IFolder) destination);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void addElement(Object element, RefactoringArguments arguments) {

		Object destination = ((MoveArguments) arguments).getDestination();
		if (element instanceof IFile && destination instanceof IFolder) {
			this.context.add((IFile) element, (IFolder) destination);
		}
	}

	@Override
	public String getName() {

		return "Sqml File Move Participant";
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext conditionsContext) throws OperationCanceledException {

		RefactoringStatus status = new RefactoringStatus();

		// check associated files
		associatedFilesChecker.check(context, status);

		// check cross references
		for (SqmlFileMoveContext fileMoveContext: context.getFileMoveContexts()) {
			for (SqmlCrossReference reference: fileMoveContext.getInboundReferences()) {
				new SqmlCrossReferenceValidator(reference).validate(status);
			}
			for (SqmlCrossReference reference: fileMoveContext.getOutboundReferences()) {
				new SqmlCrossReferenceValidator(reference).validate(status);
			}
		}

		return status;
	}

	@Override
	public Change createChange(IProgressMonitor pm) {

		CompositeChange compositeChange = new CompositeChange("Sqml File Move Adaptions");

		// update imports
		SqmlImportsUpdater updater = new SqmlImportsUpdater(context);
		for (SqmlFileMoveContext fileMoveContext: context.getFileMoveContexts()) {
			for (SqmlCrossReference reference: fileMoveContext.getInboundReferences()) {
				updater.addUpdateForReference(reference);
			}
			for (SqmlCrossReference reference: fileMoveContext.getOutboundReferences()) {
				updater.addUpdateForReference(reference);
			}
		}
		compositeChange.add(updater.getModificationMap().createChange());

		// update package name
		for (SqmlFileMoveContext fileMoveContext: context.getFileMoveContexts()) {
			compositeChange.add(new SqmlPackageNameChange(fileMoveContext));
		}

		return compositeChange;
	}
}
