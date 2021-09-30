package com.softicar.sqml.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlGlobalObject extends EObject {

	String getName();

	QualifiedName getQualifiedName();
}
