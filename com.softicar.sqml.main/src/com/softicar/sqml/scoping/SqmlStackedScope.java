package com.softicar.sqml.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlStackedScope implements IScope {

	private SqmlSimpleScope scope = new SqmlSimpleScope(IScope.NULLSCOPE);

	protected void push() {

		this.scope = new SqmlSimpleScope(scope);
	}

	protected void addLocalElement(IEObjectDescription objectDescription) {

		scope.addLocalElement(objectDescription);
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {

		return scope.getSingleElement(name);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {

		return scope.getElements(name);
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {

		return scope.getSingleElement(object);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {

		return scope.getElements(object);
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {

		return scope.getAllElements();
	}
}
