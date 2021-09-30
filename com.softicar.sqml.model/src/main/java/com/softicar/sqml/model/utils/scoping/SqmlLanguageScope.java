package com.softicar.sqml.model.utils.scoping;

import com.google.common.collect.Iterables;
import com.softicar.sqml.model.builtin.SqmlBuiltInPackage;
import java.util.Collections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlLanguageScope extends AbstractSqmlScope {

	private final IScope globalScope;

	public SqmlLanguageScope(IScope globalScope) {

		this.globalScope = globalScope;
	}

	@Override
	public Iterable<IEObjectDescription> getElements(QualifiedName qualifiedName) {

		if (qualifiedName.getSegmentCount() == 1) {
			String name = qualifiedName.getSegment(0);
			return Iterables
				.concat(//
					globalScope.getElements(SqmlBuiltInPackage.getQualifiedName().append(name)),
					globalScope.getElements(SqmlBuiltInPackage.getLegacyName().append(name)));
		} else {
			return Collections.emptyList();
		}
	}

	@Override
	public Iterable<IEObjectDescription> getElements(EObject object) {

		return globalScope.getElements(object);
	}

	@Override
	public Iterable<IEObjectDescription> getAllElements() {

		return globalScope.getAllElements();
	}
}
