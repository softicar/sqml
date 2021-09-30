package com.softicar.sqml.model.utils.scoping;

import java.util.Collections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlPackageScope extends AbstractSqmlScope {

	private final IScope globalScope;
	private final QualifiedName packageName;

	public SqmlPackageScope(IScope globalScope, QualifiedName packageName) {

		this.globalScope = globalScope;
		this.packageName = packageName;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName qualifiedName) {

		if (qualifiedName.getSegmentCount() == 1) {
			String name = qualifiedName.getSegment(0);
			return filterAndTransform(globalScope.getElements(packageName.append(name)));
		} else {
			return Collections.emptyList();
		}
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {

		return filterAndTransform(globalScope.getElements(object));
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {

		return filterAndTransform(globalScope.getAllElements());
	}

	private Iterable<IEObjectDescription> filterAndTransform(Iterable<IEObjectDescription> descriptions) {

		return SqmlAliasEObjectDescriptions.filterAndTransform(descriptions, this::isInScope);
	}

	private boolean isInScope(IEObjectDescription description) {

		QualifiedName objectPackageName = description.getQualifiedName().skipLast(1);
		return objectPackageName.equals(packageName);
	}
}
