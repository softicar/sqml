package com.softicar.sqml.ui.hover;

import org.eclipse.emf.ecore.EObject;

public interface ISqmlElementHoverProvider {

	boolean isSupported(EObject object);

	String getFirstLine(EObject object);
}
