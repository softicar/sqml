package com.softicar.sqml.scoping;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;

public class SqmlSimpleScope extends AbstractScope {

	private final List<IEObjectDescription> elements = new ArrayList<>();

	public SqmlSimpleScope(IScope parentScope) {

		super(parentScope, false);
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {

		return elements;
	}

	protected void addLocalElement(IEObjectDescription objectDescription) {

		elements.add(objectDescription);
	}
}
