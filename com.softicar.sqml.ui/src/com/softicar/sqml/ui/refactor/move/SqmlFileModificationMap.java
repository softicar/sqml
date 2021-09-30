package com.softicar.sqml.ui.refactor.move;

import com.softicar.sqml.model.files.ISqmlFile;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;

public class SqmlFileModificationMap {

	private final Map<IFile, SqmlFileModification> modifications;

	public SqmlFileModificationMap() {

		this.modifications = new HashMap<>();
	}

	public SqmlFileModification get(IFile eclipseFile, ISqmlFile sqmlFile) {

		SqmlFileModification modification = modifications.get(eclipseFile);
		if (modification == null) {
			modifications.put(eclipseFile, modification = new SqmlFileModification(eclipseFile, sqmlFile));
		}
		return modification;
	}

	public Change createChange() {

		CompositeChange compositeChange = new CompositeChange("Sqml File Move Adaptions");
		for (SqmlFileModification modification: modifications.values()) {
			compositeChange.add(modification.createChange());
		}
		return compositeChange;
	}
}
