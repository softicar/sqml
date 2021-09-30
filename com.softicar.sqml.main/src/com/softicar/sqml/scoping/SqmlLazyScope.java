package com.softicar.sqml.scoping;

import com.softicar.sqml.model.utils.LazyField;
import java.util.function.Supplier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlLazyScope extends LazyField<IScope> implements IScope {

	public SqmlLazyScope(Supplier<IScope> scopeSupplier) {

		super(scopeSupplier);
	}

	@Override
	public IEObjectDescription getSingleElement(QualifiedName name) {

		return getValue().getSingleElement(name);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName name) {

		return getValue().getElements(name);
	}

	@Override
	public IEObjectDescription getSingleElement(EObject object) {

		return getValue().getSingleElement(object);
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {

		return getValue().getElements(object);
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {

		return getValue().getAllElements();
	}
}
