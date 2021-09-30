package com.softicar.sqml.scoping;

import com.softicar.sqml.model.ISqmlGlobalObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * This class defines the fully qualified names for all globally visible SQML
 * objects.
 *
 * @author Oliver Richers
 */
public class SqmlQualifiedNameProvider extends IQualifiedNameProvider.AbstractImpl {

	@Override
	public QualifiedName getFullyQualifiedName(EObject object) {

		if (object instanceof ISqmlGlobalObject) {
			return ((ISqmlGlobalObject) object).getQualifiedName();
		} else {
			return null;
		}
	}
}
