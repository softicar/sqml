package com.softicar.sqml.model.utils;

import com.google.common.base.Predicate;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

public class SqmlQualifiedPhysicalTableNameDescriptionFilter implements Predicate<IEObjectDescription> {

	@Override
	public boolean apply(IEObjectDescription description) {

		QualifiedName qualifiedName = description.getQualifiedName();
		if (qualifiedName != null && !qualifiedName.isEmpty()) {
			if (qualifiedName.getFirstSegment().startsWith("$")) {
				// ignore object descriptions with physical table table
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
