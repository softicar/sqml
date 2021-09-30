package com.softicar.sqml.ui.hover;

import com.softicar.platform.common.core.logging.Log;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class SqmlHoverProvider extends DefaultEObjectHoverProvider {

	@Override
	protected boolean hasHover(EObject object) {

		boolean hover = SqmlElementHoverProviderMap.get().getHoverProvider(object) != null || super.hasHover(object);
		if (!hover) {
			Log.finfo("no hover support for %s", object.getClass().getCanonicalName());
		}
		return hover;
	}

	@Override
	protected String getFirstLine(EObject object) {

		ISqmlElementHoverProvider provider = SqmlElementHoverProviderMap.get().getHoverProvider(object);

		if (provider != null) {
			return provider.getFirstLine(object);
		} else {
			return super.getFirstLine(object);
		}
	}
}
