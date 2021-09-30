package com.softicar.sqml.ui.action.table.download;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.softicar.platform.common.core.properties.SofticarConfiguration;
import java.util.Collection;
import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;

public class SqmlTableStructureDownloader {

	private final Injector injector;
	private final SqmlTablesCollector tablesCollector;

	@Inject
	public SqmlTableStructureDownloader(Injector injector, SqmlTablesCollector tablesCollector) {

		this.injector = injector;
		this.tablesCollector = tablesCollector;
	}

	public void download() {

		// reload database connection properties
		SofticarConfiguration.getSingleton().reload();

		// schedule download job
		SqmlTableStructureDownloadJob generationJob = new SqmlTableStructureDownloadJob(injector, tablesCollector);
		generationJob.setUser(true);
		generationJob.schedule();
	}

	public SqmlTableStructureDownloader addFiles(Collection<? extends IFile> files) {

		tablesCollector.addFiles(files);
		return this;
	}

	public SqmlTableStructureDownloader addProjects(Collection<? extends IJavaProject> projects) {

		tablesCollector.addProjects(projects);
		return this;
	}

	public SqmlTableStructureDownloader addPackage(IPackageFragment packageFragment) {

		tablesCollector.addPackage(packageFragment);
		return this;
	}

	public SqmlTableStructureDownloader addPackageTree(IPackageFragment packageFragment) {

		tablesCollector.addPackageTree(packageFragment);
		return this;
	}
}
