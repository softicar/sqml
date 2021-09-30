package com.softicar.sqml.ui.hover;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractSqmlElementHoverProvider<T> implements ISqmlElementHoverProvider {

	@Override
	public boolean isSupported(EObject object) {

		return getElementClass().isInstance(object);
	}

	@Override
	public String getFirstLine(EObject object) {

		return getFirstLine(getElementClass().cast(object));
	}

	protected abstract Class<T> getElementClass();

	protected abstract String getFirstLine(T object);
}
