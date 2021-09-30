package com.softicar.sqml.ui.refactor.move;

import com.google.inject.Inject;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.ui.utils.SqmlEclipeWorkspace;
import com.softicar.sqml.ui.utils.SqmlFileExtension;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class SqmlMoveContext {

	private final IResourceServiceProvider.Registry serviceProviderRegistry;
	private final ResourceDescriptionsProvider resourceDescriptionsProvider;
	private final IResourceSetProvider resourceSetProvider;
	private final IQualifiedNameProvider qualifiedNameProvider;
	private final Map<IFile, SqmlFileMoveContext> sqmlFileMap;
	private final Set<IFile> javaFiles;

	@Inject
	public SqmlMoveContext(IResourceServiceProvider.Registry serviceProviderRegistry, ResourceDescriptionsProvider resourceDescriptionsProvider,
			IResourceSetProvider resourceSetProvider, IQualifiedNameProvider qualifiedNameProvider) {

		this.serviceProviderRegistry = serviceProviderRegistry;
		this.resourceDescriptionsProvider = resourceDescriptionsProvider;
		this.resourceSetProvider = resourceSetProvider;
		this.qualifiedNameProvider = qualifiedNameProvider;
		this.sqmlFileMap = new HashMap<>();
		this.javaFiles = new HashSet<>();
	}

	public void add(IFile sourceFile, IFolder targetFolder) {

		String filename = sourceFile.getName();
		if (SqmlFileExtension.isSqmlFileExtension(filename)) {
			sqmlFileMap.put(sourceFile, new SqmlFileMoveContext(this, sourceFile, targetFolder));
		} else if (SqmlFileExtension.isJavaFileExtension(filename)) {
			javaFiles.add(sourceFile);
		}
	}

	public boolean containsFile(IFile file) {

		return sqmlFileMap.containsKey(file) || javaFiles.contains(file);
	}

	public Collection<SqmlFileMoveContext> getFileMoveContexts() {

		return sqmlFileMap.values();
	}

	public IFile getFileAfterMove(IFile file) {

		SqmlFileMoveContext fileMoveContext = sqmlFileMap.get(file);
		return fileMoveContext != null? fileMoveContext.getTargetFile() : file;
	}

	public QualifiedName getQualifiedNameBeforeMove(EObject object) {

		return qualifiedNameProvider.getFullyQualifiedName(object);
	}

	public QualifiedName getQualifiedNameAfterMove(EObject object) {

		return getPackageNameAfterMove(object).append(getRealtiveName(object));
	}

	public QualifiedName getPackageNameAfterMove(EObject object) {

		SqmlFileMoveContext fileMoveContext = sqmlFileMap.get(SqmlEclipeWorkspace.getWorkspaceFile(object));
		if (fileMoveContext != null) {
			return fileMoveContext.getNewPackageName();
		} else {
			return SqmlNavigation.findOrThrow(ISqmlFile.class, object).getPackageName();
		}
	}

	private QualifiedName getRealtiveName(EObject object) {

		QualifiedName qualifiedName = getQualifiedNameBeforeMove(object);
		QualifiedName packageName = SqmlNavigation.findOrThrow(ISqmlFile.class, object).getPackageName();
		if (qualifiedName.startsWith(packageName)) {
			return qualifiedName.skipFirst(packageName.getSegmentCount());
		} else {
			throw new IllegalStateException(String.format("Qualified name of object '%s' does not match file package name '%s'.", qualifiedName, packageName));
		}
	}

	public IResourceSetProvider getResourceSetProvider() {

		return resourceSetProvider;
	}

	public IResourceDescription.Manager getDescriptionManager(Resource resource) {

		return serviceProviderRegistry//
			.getResourceServiceProvider(resource.getURI())
			.getResourceDescriptionManager();
	}

	public IContainer.Manager getContainerManager(Resource resource) {

		return serviceProviderRegistry//
			.getResourceServiceProvider(resource.getURI())
			.getContainerManager();
	}

	public ResourceDescriptionsProvider getResourceDescriptionsProvider() {

		return resourceDescriptionsProvider;
	}
}
