package com.softicar.sqml.ui.action.clean.build;

import java.util.Collection;
import java.util.stream.Collectors;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.ui.XtextProjectHelper;

public class SqmlCleanBuildJob extends WorkspaceJob {

	private final Collection<IProject> projects;

	public SqmlCleanBuildJob(Collection<IJavaProject> javaProjects) {

		super("Sqml Clean Build");
		this.projects = javaProjects//
			.stream()
			.map(IJavaProject::getProject)
			.collect(Collectors.toList());
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {

		// clean Xtext nature of projects
		for (IProject project: projects) {
			project.build(IncrementalProjectBuilder.CLEAN_BUILD, XtextProjectHelper.BUILDER_ID, null, monitor);
		}

		// trigger incremental build of workspace
		// (we cannot build given projects explicitly since we don't know the correct build order)
		ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.INCREMENTAL_BUILD, monitor);

		return Status.OK_STATUS;
	}
}
