package com.softicar.sqml.model.files;

import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlPackageDeclaration extends EObject {

	ISqmlFile getSqmlFile();

	String getName();

	default QualifiedName getQualifiedName() {

		String name = getName();
		return name != null? QualifiedName.create(name.split("\\.")) : QualifiedName.EMPTY;
	}

	default JavaPackageName getPackageName() {

		String name = getName();
		return name != null? new JavaPackageName(name) : JavaPackageName.getEmpty();
	}
}
