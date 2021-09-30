package com.softicar.sqml.utils;

import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.sqml.model.files.ISqmlFile;
import java.util.Arrays;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * Determines the expected package path for an {@link IFile} an {@link IFolder}
 * or an {@link IPath}.
 *
 * @author Oliver Richers
 */
public class ExpectedPackageNameDeterminer {

	private final IProject project;
	private final IPath workspacePath;

	private ExpectedPackageNameDeterminer(IProject project, IPath workspacePath) {

		this.project = project;
		this.workspacePath = workspacePath;
	}

	public ExpectedPackageNameDeterminer(IFolder folder) {

		this(folder.getProject(), folder.getFullPath());
	}

	public ExpectedPackageNameDeterminer(IFile file) {

		this(file.getProject(), file.getFullPath().removeLastSegments(1));
	}

	public ExpectedPackageNameDeterminer(ISqmlFile sqmlFile) {

		this(getResourceFile(sqmlFile));
	}

	private static IFile getResourceFile(ISqmlFile sqmlFile) {

		URI fileUri = sqmlFile.eResource().getURI();
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		return workspaceRoot.getFile(new Path(fileUri.toPlatformString(true)));
	}

	public JavaPackageName getJavaPackageName() {

		return new JavaPackageName(determine());
	}

	public QualifiedName getQualifiedName() {

		return QualifiedName.create(determine());
	}

	private List<String> determine() {

		IJavaProject javaProject = getJavaProject();
		if (javaProject != null && javaProject.exists() && javaProject.isOpen()) {
			for (IPackageFragmentRoot root: getRoots(javaProject)) {
				if (!root.isArchive() && !root.isExternal()) {
					IResource rootResource = root.getResource();
					if (rootResource != null) {
						IPath sourceFolderPath = rootResource.getFullPath();
						if (sourceFolderPath.isPrefixOf(workspacePath)) {
							IPath relativeFilePath = workspacePath.makeRelativeTo(sourceFolderPath);
							String[] segments = relativeFilePath.segments();
							return Arrays.asList(segments);
						}
					}
				}
			}
		} else {
			if (javaProject != null) {
				String projectName = javaProject.getProject().getName();
				throw new RuntimeException(String.format("Cannot access java project '%s'.", projectName));
			} else {
				throw new RuntimeException(String.format("Cannot access unknown java project."));
			}
		}

		throw new RuntimeException(String.format("Failed to determine expected package name of SQML file '%s'.", workspacePath));
	}

	private IPackageFragmentRoot[] getRoots(IJavaProject javaProject) {

		try {
			return javaProject.getPackageFragmentRoots();
		} catch (JavaModelException exception) {
			throw new RuntimeException(exception);
		}
	}

	private IJavaProject getJavaProject() {

		return JavaCore.create(project);
	}
}
