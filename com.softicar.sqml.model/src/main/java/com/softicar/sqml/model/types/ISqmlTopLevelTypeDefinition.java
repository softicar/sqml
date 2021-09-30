package com.softicar.sqml.model.types;

import com.softicar.sqml.model.files.ISqmlFileElement;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlTopLevelTypeDefinition extends ISqmlTypeDefinition, ISqmlFileElement {

	@Override
	default QualifiedName getQualifiedName() {

		return ISqmlFileElement.super.getQualifiedName();
	}
}
