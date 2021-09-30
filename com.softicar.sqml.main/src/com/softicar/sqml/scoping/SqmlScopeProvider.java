package com.softicar.sqml.scoping;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.softicar.sqml.model.utils.SqmlException;
import com.softicar.sqml.model.utils.scoping.ISqmlScopeProvider;
import com.softicar.sqml.scoping.providers.ISqmlReferenceScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlBinaryOperationFunctionScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlComparisonFunctionScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlForeignKeyVariableColumnScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlForeignKeyVariableVariableScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlFunctionCallFunctionScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlImportTargetScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlPathScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlStaticVariableReferenceVariableScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlTableKeyColumnsScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlTableVariableScopeProvider;
import com.softicar.sqml.scoping.providers.SqmlTypeReferenceCustomTypeScopeProvider;
import java.util.IdentityHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.ImportedNamesAdapter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractGlobalScopeDelegatingScopeProvider;

/**
 * This class determines the complete scoping for SQML.
 * <p>
 * This scope provider is actually a map of {@link ISqmlReferenceScopeProvider}
 * which delegates the task to other classes, depending on the type of the
 * reference.
 * <p>
 * WARNING: This class must implement
 * {@link AbstractGlobalScopeDelegatingScopeProvider} to make the
 * {@link DefaultLinkingService} register a {@link ImportedNamesAdapter} on the
 * {@link Resource}, otherwise dependencies between resources cannot be computed
 * correctly.
 */
@Singleton
public class SqmlScopeProvider extends AbstractGlobalScopeDelegatingScopeProvider implements ISqmlScopeProvider {

	private final Map<EReference, ISqmlReferenceScopeProvider> providers = new IdentityHashMap<>();
	private final Injector injector;

	@Inject
	public SqmlScopeProvider(Injector injector) {

		this.injector = injector;

		add(SqmlBinaryOperationFunctionScopeProvider.class);
		add(SqmlComparisonFunctionScopeProvider.class);
		add(SqmlFunctionCallFunctionScopeProvider.class);
		add(SqmlForeignKeyVariableVariableScopeProvider.class);
		add(SqmlForeignKeyVariableColumnScopeProvider.class);
		add(SqmlImportTargetScopeProvider.class);
		add(SqmlPathScopeProvider.class);
		add(SqmlStaticVariableReferenceVariableScopeProvider.class);
		add(SqmlTableKeyColumnsScopeProvider.class);
		add(SqmlTableVariableScopeProvider.class);
		add(SqmlTypeReferenceCustomTypeScopeProvider.class);
	}

	private void add(Class<? extends ISqmlReferenceScopeProvider> scopeProviderClass) {

		ISqmlReferenceScopeProvider scopeProvider = injector.getInstance(scopeProviderClass);
		if (scopeProvider == null) {
			throw new RuntimeException(String.format(//
					"Failed to get instance of '%s'.",
					scopeProviderClass.getCanonicalName()));
		}
		providers.put(scopeProvider.getReference(), scopeProvider);
	}

	@Override
	public IScope getScope(EObject context, EReference reference) {

		ISqmlReferenceScopeProvider scopeProvider = providers.get(reference);
		if (scopeProvider != null) {
			return scopeProvider.getScope(context);
		} else {
			throw new SqmlException(//
					"No scope provider for %s.%s found.",
					reference.getContainerClass().getSimpleName(),
					reference.getName());
		}
	}

	@Override
	public IScope getGlobalScope(Resource context, EReference reference) {

		return super.getGlobalScope(context, reference);
	}

	@Override
	public IScope getGlobalScope(Resource context, EReference reference, Predicate<IEObjectDescription> filter) {

		return super.getGlobalScope(context, reference, filter);
	}
}
