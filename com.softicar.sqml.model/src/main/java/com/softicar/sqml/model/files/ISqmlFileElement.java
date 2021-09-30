package com.softicar.sqml.model.files;

import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.sqml.model.ISqmlGlobalObject;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlFileElement extends ISqmlGlobalObject {

	public static final String UNKNOWN = "UNKNOWN";

	@Override
	String getName();

	default ISqmlFile getSqmlFile() {

		return (ISqmlFile) eContainer();
	}

	@Override
	default QualifiedName getQualifiedName() {

		String name = getName();
		return getQualifiedPackageName().append(name != null? name : UNKNOWN);
	}

	default JavaPackageName getJavaPackageName() {

		ISqmlFile sqmlFile = getSqmlFile();
		ISqmlPackageDeclaration packageDeclaration = sqmlFile != null? sqmlFile.getPackageDeclaration() : null;
		return packageDeclaration != null? packageDeclaration.getPackageName() : new JavaPackageName(UNKNOWN);
	}

	default QualifiedName getQualifiedPackageName() {

		ISqmlFile sqmlFile = getSqmlFile();
		ISqmlPackageDeclaration packageDeclaration = sqmlFile != null? sqmlFile.getPackageDeclaration() : null;
		return packageDeclaration != null? packageDeclaration.getQualifiedName() : QualifiedName.create(UNKNOWN);
	}
}
