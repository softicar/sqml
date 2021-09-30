package com.softicar.sqml.ui.action.custom.table.extraction;

import com.softicar.sqml.generator.table.clazz.ISqmlTableClassGenerator;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.generation.SqmlUiFileSystemAccess;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import java.util.Collection;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

class SqmlCustomTableClassExtrationJob extends Job {

	private final ISqmlTableClassGenerator tableClassGenerator;
	private final Collection<ISqmlTable> tables;

	public SqmlCustomTableClassExtrationJob(ISqmlTableClassGenerator tableClassGenerator, Collection<ISqmlTable> tables) {

		super("Custom Table Class Extraction");

		this.tableClassGenerator = tableClassGenerator;
		this.tables = tables;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {

		for (ISqmlTable table: tables) {
			IFile tableFile = SqmlEclipeWorkspace.getWorkspaceFile(table);
			IFolder sourceFolder = SqmlEclipeWorkspace.getSourceFolderOrThrow(tableFile);
			SqmlUiFileSystemAccess sqmlFileSystemAccess = new SqmlUiFileSystemAccess(sourceFolder, "java");
			tableClassGenerator.extractCustomTableClass(table, sqmlFileSystemAccess);
		}
		return Status.OK_STATUS;
	}
}
