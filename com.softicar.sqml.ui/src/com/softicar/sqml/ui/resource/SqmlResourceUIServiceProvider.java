package com.softicar.sqml.ui.resource;

import com.google.inject.Inject;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.ui.resource.DefaultResourceUIServiceProvider;

public class SqmlResourceUIServiceProvider extends DefaultResourceUIServiceProvider {

	@Inject
	public SqmlResourceUIServiceProvider(IResourceServiceProvider delegate) {

		super(delegate);
	}

	@Override
	public boolean canBuild(URI uri, IStorage storage) {

		if (isFileOutsideSourceFolder(storage)) {
			return false;
		} else {
			return super.canBuild(uri, storage);
		}
	}

	private boolean isFileOutsideSourceFolder(IStorage storage) {

		if (storage instanceof IFile) {
			IFolder sourceFolder = SqmlEclipeWorkspace.getSourceFolderOrNull((IFile) storage);
			return sourceFolder == null;
		} else {
			return false;
		}
	}
}
