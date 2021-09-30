package com.softicar.sqml.ui.utils;

import com.softicar.sqml.model.utils.references.SqmlCrossReference;
import java.util.ArrayList;
import java.util.Collection;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public class SqmlEclipeWorkspace {

	// -------------------- IFile -------------------- //

	public static IFile getWorkspaceFile(EObject object) {

		return getWorkspaceFile(object.eResource());
	}

	public static IFile getWorkspaceFile(Resource resource) {

		return getWorkspaceFile(resource.getURI());
	}

	public static IFile getWorkspaceFile(URI objectUri) {

		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		String platformString = objectUri.trimFragment().toPlatformString(true);
		return platformString != null? workspaceRoot.getFile(new Path(platformString)) : null;
	}

	public static IFile getEclipseSourceFile(SqmlCrossReference reference) {

		URI sourceUri = reference.getReferenceDescription().getSourceEObjectUri();
		return SqmlEclipeWorkspace.getWorkspaceFile(sourceUri);
	}

	// -------------------- IFolder -------------------- //

	public static IFolder toFolder(IJavaElement element) {

		IResource resource = element.getResource();
		if (resource instanceof IFolder) {
			IFolder folder = (IFolder) resource;
			return folder;
		} else {
			throw new RuntimeException(String.format("Failed to get folder represented by Java element '%s'.", element.getElementName()));
		}
	}

	public static IJavaProject toJavaProject(IProject project) {

		return JavaCore.create(project);
	}

	// -------------------- source folders -------------------- //

	public static IPath getSourceFolderRelativePath(IFile file) {

		IPath filePath = file.getProjectRelativePath();
		IPath sourceFolderPath = getSourceFolderOrThrow(file).getProjectRelativePath();
		return filePath.makeRelativeTo(sourceFolderPath);
	}

	public static IFolder getSourceFolderOrThrow(IFile file) {

		IFolder sourceFolder = getSourceFolderOrNull(file);
		if (sourceFolder != null) {
			return sourceFolder;
		} else {
			throw new RuntimeException(String.format("Failed to get source folder containing '%s'.", file.getProjectRelativePath()));
		}
	}

	public static IFolder getSourceFolderOrNull(IFile file) {

		for (IFolder sourceFolder: getSourceFolders(toJavaProject(file.getProject()))) {
			if (sourceFolder.getProjectRelativePath().isPrefixOf(file.getProjectRelativePath())) {
				return sourceFolder;
			}
		}
		return null;
	}

	public static Collection<IFolder> getSourceFolders(IJavaProject project) {

		Collection<IFolder> sourceFolders = new ArrayList<>();
		try {
			for (IPackageFragmentRoot fragmentRoot: project.getPackageFragmentRoots()) {
				if (fragmentRoot.getKind() == IPackageFragmentRoot.K_SOURCE) {
					sourceFolders.add(toFolder(fragmentRoot));
				}
			}
		} catch (JavaModelException exception) {
			throw new RuntimeException(exception);
		}
		return sourceFolders;
	}
}
