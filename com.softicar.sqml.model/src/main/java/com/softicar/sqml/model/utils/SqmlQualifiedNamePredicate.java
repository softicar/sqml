package com.softicar.sqml.model.utils;

import com.google.common.base.Predicate;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

public class SqmlQualifiedNamePredicate implements Predicate<IEObjectDescription> {

	private final QualifiedName qualifiedName;

	public SqmlQualifiedNamePredicate(QualifiedName qualifiedName) {

		this.qualifiedName = qualifiedName;
	}

	@Override
	public boolean apply(IEObjectDescription objectDescription) {

		return objectDescription.getQualifiedName().equals(qualifiedName);
	}
}
