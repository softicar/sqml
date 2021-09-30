package com.softicar.sqml.ui.action.table.download;

import com.google.inject.Inject;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceProxy;
import org.eclipse.core.resources.IResourceProxyVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class SqmlTablesCollector {

	private final IResourceSetProvider resourceSetProvider;
	private final Set<IFolder> folderTrees;
	private final Set<IFolder> folders;
	private final Set<IFile> files;
	private Map<IFolder, Set<ISqmlTable>> tables;
	private IProgressMonitor monitor;

	@Inject
	public SqmlTablesCollector(IResourceSetProvider resourceSetProvider) {

		this.resourceSetProvider = resourceSetProvider;
		this.folderTrees = new HashSet<>();
		this.folders = new HashSet<>();
		this.files = new HashSet<>();
	}

	public SqmlTablesCollector addFile(IFile file) {

		this.files.add(file);
		return this;
	}

	public SqmlTablesCollector addFiles(Collection<? extends IFile> files) {

		this.files.addAll(files);
		return this;
	}

	public SqmlTablesCollector addProjects(Collection<? extends IJavaProject> projects) {

		for (IJavaProject project: projects) {
			folderTrees.addAll(SqmlEclipeWorkspace.getSourceFolders(project));
		}
		return this;
	}

	public SqmlTablesCollector addPackage(IPackageFragment packageFragment) {

		folders.add(toFolder(packageFragment));
		return this;
	}

	public SqmlTablesCollector addPackageTree(IPackageFragment packageFragment) {

		folderTrees.add(toFolder(packageFragment));
		return this;
	}

	public Map<IFolder, Set<ISqmlTable>> collectTables(IProgressMonitor monitor) {

		this.tables = new HashMap<>();
		this.monitor = monitor;
		try {
			for (IFolder folder: folderTrees) {
				folder.accept(new ResourceCollector(), IResource.DEPTH_INFINITE, IContainer.DO_NOT_CHECK_EXISTENCE);
			}
			for (IFolder folder: folders) {
				folder.accept(new ResourceCollector(), IResource.DEPTH_ONE, IContainer.DO_NOT_CHECK_EXISTENCE);
			}
			for (IFile file: files) {
				file.accept(new ResourceCollector(), IResource.DEPTH_ZERO, IContainer.DO_NOT_CHECK_EXISTENCE);
			}
		} catch (CoreException exception) {
			throw new RuntimeException(exception);
		}
		return tables;
	}

	private ISqmlFile getSqmlFile(IFile file) {

		ResourceSet resourceSet = resourceSetProvider.get(file.getProject());
		URI resourceURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		return (ISqmlFile) resourceSet.getResource(resourceURI, true).getContents().get(0);
	}

	private static IFolder toFolder(IJavaElement element) {

		return SqmlEclipeWorkspace.toFolder(element);
	}

	private class ResourceCollector implements IResourceProxyVisitor {

		@Override
		public boolean visit(IResourceProxy proxy) {

			if (monitor.isCanceled()) {
				return false;
			}

			if (proxy.getType() == IResource.FILE && proxy.getName().endsWith(".sqml")) {
				addTables((IFile) proxy.requestResource());
				monitor.subTask(String.format("Collecting Sqml Table File: %s", ((IFile) proxy.requestResource()).getProjectRelativePath()));
				return false;
			} else if (proxy.getType() == IResource.FOLDER) {
				return true;
			} else {
				return false;
			}
		}
	}

	private void addTables(IFile file) {

		IFolder sourceFolder = SqmlEclipeWorkspace.getSourceFolderOrThrow(file);
		for (ISqmlTable table: getSqmlFile(file).getTables()) {
			addTable(sourceFolder, table);
		}
	}

	private void addTable(IFolder sourceFolder, ISqmlTable table) {

		Set<ISqmlTable> tableSet = tables.get(sourceFolder);
		if (tableSet == null) {
			tables.put(sourceFolder, tableSet = new HashSet<>());
		}
		tableSet.add(table);
	}
}
