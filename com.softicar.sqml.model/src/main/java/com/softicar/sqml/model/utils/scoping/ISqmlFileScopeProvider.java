package com.softicar.sqml.model.utils.scoping;

import com.google.common.base.Predicate;
import com.softicar.sqml.model.files.ISqmlFile;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

/**
 * Provider scopes on the level of an {@link ISqmlFile}.
 *
 * @author Oliver Richers
 */
public interface ISqmlFileScopeProvider {

	IScope getImportScope(ISqmlFile sqmlFile, EReference reference);

	IScope getPackageScope(ISqmlFile sqmlFile, EReference reference);

	IScope getLanguageScope(ISqmlFile sqmlFile, EReference reference);

	IScope getGlobalScope(ISqmlFile sqmlFile, EReference reference);

	IScope getGlobalScope(ISqmlFile sqmlFile, EReference reference, Predicate<IEObjectDescription> filter);
}
