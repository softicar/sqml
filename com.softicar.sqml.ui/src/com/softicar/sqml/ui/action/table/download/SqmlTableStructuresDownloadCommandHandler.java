package com.softicar.sqml.ui.action.table.download;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.softicar.platform.common.core.logging.Log;
import com.softicar.sqml.ui.selection.SqmlUiSelection;
import java.util.Collection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.IJavaProject;

public class SqmlTableStructuresDownloadCommandHandler extends AbstractHandler {

	public static final String ID = SqmlTableStructuresDownloadCommandHandler.class.getCanonicalName();

	private final Provider<SqmlTableStructureDownloader> structureDownloaderProvider;

	@Inject
	public SqmlTableStructuresDownloadCommandHandler(Provider<SqmlTableStructureDownloader> structureDownloaderProvider) {

		this.structureDownloaderProvider = structureDownloaderProvider;
	}

	@Override
	public Object execute(ExecutionEvent event) {

		SqmlUiSelection selection = new SqmlUiSelection(event);

		// single project selection
		Collection<IJavaProject> javaProjects = selection.getElementsOfType(IJavaProject.class);
		if (!javaProjects.isEmpty()) {
			structureDownloaderProvider.get().addProjects(javaProjects).download();
			return null;
		}

		// table selection
		Collection<IFile> files = selection.getSelectedFiles();
		if (!files.isEmpty()) {
			structureDownloaderProvider.get().addFiles(files).download();
			return null;
		}

		Log.ferror("Invalid selection.");
		return null;
	}
}
