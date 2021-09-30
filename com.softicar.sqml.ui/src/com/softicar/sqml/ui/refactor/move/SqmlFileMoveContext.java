package com.softicar.sqml.ui.refactor.move;

import com.softicar.sqml.model.builtin.SqmlBuiltInPackage;
import com.softicar.sqml.model.builtin.SqmlBuiltIns;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.utils.references.SqmlCrossReference;
import com.softicar.sqml.utils.ExpectedPackageNameDeterminer;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IReferenceDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;

class SqmlFileMoveContext {

	private final SqmlMoveContext context;
	private final IFile sourceFile;
	private final IFile targetFile;
	private final Resource resource;
	private final ISqmlFile sqmlFile;
	private final QualifiedName newPackageName;

	public SqmlFileMoveContext(SqmlMoveContext context, IFile sourceFile, IFolder targetFolder) {

		this.context = context;
		this.sourceFile = sourceFile;
		this.targetFile = targetFolder.getFile(sourceFile.getName());
		this.resource = determineResource();
		this.sqmlFile = determineSqmlFile();
		this.newPackageName = new ExpectedPackageNameDeterminer(targetFile).getQualifiedName();
	}

	public IFile getSourceFile() {

		return sourceFile;
	}

	public IFile getTargetFile() {

		return targetFile;
	}

	public ISqmlFile getSqmlFile() {

		return sqmlFile;
	}

	public QualifiedName getNewPackageName() {

		return newPackageName;
	}

	public List<SqmlCrossReference> getOutboundReferences() {

		ResourceSet resourceSet = resource.getResourceSet();
		List<SqmlCrossReference> references = new ArrayList<>();
		for (IReferenceDescription description: context.getDescriptionManager(resource).getResourceDescription(resource).getReferenceDescriptions()) {
			if (!SqmlBuiltIns.isBuiltIn(description.getTargetEObjectUri())) {
				SqmlCrossReference crossReference = new SqmlCrossReference(resourceSet, description);
				if (!SqmlBuiltInPackage.contains(crossReference.getTargetObject())) {
					references.add(crossReference);
				}
			}
		}
		return references;
	}

	public List<SqmlCrossReference> getInboundReferences() {

		ResourceSet resourceSet = resource.getResourceSet();
		List<SqmlCrossReference> references = new ArrayList<>();
		for (ISqmlTable table: sqmlFile.getTables()) {
			URI tableUri = EcoreUtil.getURI(table);
			for (IContainer container: getVisibleContainers()) {
				for (IResourceDescription resourceDescription: container.getResourceDescriptions()) {
					for (IReferenceDescription description: resourceDescription.getReferenceDescriptions()) {
						if (description.getTargetEObjectUri().equals(tableUri)) {
							references.add(new SqmlCrossReference(resourceSet, description));
						}
					}
				}
			}
		}
		return references;
	}

	private List<IContainer> getVisibleContainers() {

		Resource resource = SqmlNavigation.getResource(sqmlFile);
		IResourceDescription resourceDescription = context.getDescriptionManager(resource).getResourceDescription(resource);
		IResourceDescriptions resourceDescriptions = context.getResourceDescriptionsProvider().getResourceDescriptions(resource);
		return context.getContainerManager(resource).getVisibleContainers(resourceDescription, resourceDescriptions);
	}

	private Resource determineResource() {

		ResourceSet resourceSet = context.getResourceSetProvider().get(sourceFile.getProject());
		URI resourceURI = URI.createPlatformResourceURI(sourceFile.getFullPath().toString(), true);
		return resourceSet.getResource(resourceURI, true);
	}

	private ISqmlFile determineSqmlFile() {

		if (resource != null && !resource.getContents().isEmpty()) {
			EObject object = resource.getContents().get(0);
			return object instanceof ISqmlFile? (ISqmlFile) object : null;
		} else {
			return null;
		}
	}
}
