package com.softicar.sqml.model.files;

import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.files.validation.SqmlImportValidator;
import com.softicar.sqml.model.utils.SqmlNodeModelUtils;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;

public interface ISqmlImport extends ISqmlModelElement, ISqmlValidatable {

	ISqmlFile getSqmlFile();

	ISqmlGlobalObject getTarget();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	default QualifiedName getQualifiedName() {

		INode node = SqmlNodeModelUtils.findNodeForFeature(this, FilesPackage.eINSTANCE.getSqmlImport_Target());
		return QualifiedName.create(node.getText().trim().split("\\."));
	}

	default QualifiedName getAlias() {

		return QualifiedName.create(getQualifiedName().getLastSegment());
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlImportValidator(this, context).validate();
	}
}
