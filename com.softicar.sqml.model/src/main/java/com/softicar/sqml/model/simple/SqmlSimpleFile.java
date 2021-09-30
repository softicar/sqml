package com.softicar.sqml.model.simple;

import com.softicar.sqml.model.files.impl.SqmlFileImpl;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlSimpleFile extends SqmlFileImpl {

	public SqmlSimpleFile(QualifiedName packageName) {

		setPackageDeclaration(new SqmlSimplePackageDeclaration(packageName));
	}
}
