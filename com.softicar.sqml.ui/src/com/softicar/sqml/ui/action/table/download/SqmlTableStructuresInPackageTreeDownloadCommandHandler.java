package com.softicar.sqml.ui.action.table.download;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.softicar.sqml.ui.selection.SqmlUiSelection;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jdt.core.IPackageFragment;

public class SqmlTableStructuresInPackageTreeDownloadCommandHandler extends AbstractHandler {

	public static final String ID = SqmlTableStructuresInPackageTreeDownloadCommandHandler.class.getCanonicalName();

	private final Provider<SqmlTableStructureDownloader> structureDownloaderProvider;

	@Inject
	public SqmlTableStructuresInPackageTreeDownloadCommandHandler(Provider<SqmlTableStructureDownloader> structureDownloaderProvider) {

		this.structureDownloaderProvider = structureDownloaderProvider;
	}

	@Override
	public Object execute(ExecutionEvent event) {

		SqmlUiSelection selection = new SqmlUiSelection(event);
		IPackageFragment packageFragment = selection.getSingleElementOrNull(IPackageFragment.class);
		if (packageFragment != null) {
			structureDownloaderProvider.get().addPackageTree(packageFragment).download();
		}
		return null;
	}
}
