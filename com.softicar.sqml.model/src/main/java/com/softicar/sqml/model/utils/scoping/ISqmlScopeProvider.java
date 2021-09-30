package com.softicar.sqml.model.utils.scoping;

import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;

public interface ISqmlScopeProvider extends IScopeProvider {

	IScope getGlobalScope(Resource context, EReference reference);

	IScope getGlobalScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter);
}
