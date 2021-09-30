package com.softicar.sqml.model.utils.scoping;

import com.google.common.collect.Iterables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public abstract class AbstractSqmlScope implements IScope {

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {

		return Iterables.getFirst(getElements(name), null);
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {

		return Iterables.getFirst(getElements(object), null);
	}
}
