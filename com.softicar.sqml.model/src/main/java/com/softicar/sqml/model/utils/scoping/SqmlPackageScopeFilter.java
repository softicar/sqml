package com.softicar.sqml.model.utils.scoping;

import com.google.common.base.Predicate;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

public class SqmlPackageScopeFilter implements Predicate<IEObjectDescription> {

	private final QualifiedName packageName;

	public SqmlPackageScopeFilter(QualifiedName packageName) {

		this.packageName = packageName;
	}

	@Override
	public boolean apply(IEObjectDescription objectDescription) {

		QualifiedName qualifiedName = objectDescription.getQualifiedName();
		QualifiedName prefix = qualifiedName.skipLast(1);
		return prefix.equals(packageName);
	}
}
