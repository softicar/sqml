package com.softicar.sqml.model.simple;

import com.softicar.sqml.model.files.impl.SqmlPackageDeclarationImpl;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlSimplePackageDeclaration extends SqmlPackageDeclarationImpl {

	public SqmlSimplePackageDeclaration(QualifiedName packageName) {

		setName(packageName.toString("."));
	}
}
