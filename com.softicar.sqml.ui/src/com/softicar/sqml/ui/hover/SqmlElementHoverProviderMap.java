package com.softicar.sqml.ui.hover;

import com.softicar.sqml.ui.hover.providers.SqmlEnumHoverProvider;
import com.softicar.sqml.ui.hover.providers.SqmlTableColumnHoverProvider;
import com.softicar.sqml.ui.hover.providers.SqmlTableVariableHoverProvider;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

public class SqmlElementHoverProviderMap {

	private static final SqmlElementHoverProviderMap SINGLETON = new SqmlElementHoverProviderMap();
	private final List<ISqmlElementHoverProvider> providers = new ArrayList<>();

	public SqmlElementHoverProviderMap() {

		providers.add(new SqmlEnumHoverProvider());
		providers.add(new SqmlTableColumnHoverProvider());
		providers.add(new SqmlTableVariableHoverProvider());
	}

	public static SqmlElementHoverProviderMap get() {

		return SINGLETON;
	}

	public ISqmlElementHoverProvider getHoverProvider(EObject object) {

		for (ISqmlElementHoverProvider provider: providers) {
			if (provider.isSupported(object)) {
				return provider;
			}
		}

		return null;
	}
}
