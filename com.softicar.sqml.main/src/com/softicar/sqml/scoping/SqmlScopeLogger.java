package com.softicar.sqml.scoping;

import com.softicar.platform.common.core.logging.Log;
import com.softicar.sqml.model.functions.ISqmlFunction;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;

public class SqmlScopeLogger {

	private final IScope scope;

	public SqmlScopeLogger(IScope scope) {

		this.scope = scope;
	}

	public void log() {

		Log.finfo("<%s>", scope.getClass().getSimpleName());
		for (IEObjectDescription objectDescription: scope.getAllElements()) {
			Log.finfo("'%s' -> '%s'", objectDescription.getName(), getDescription(objectDescription));
		}
		Log.finfo("</%s>", scope.getClass().getSimpleName());
	}

	private String getDescription(IEObjectDescription objectDescription) {

		EObject object = objectDescription.getEObjectOrProxy();
		if (object instanceof ISqmlFunction && !object.eIsProxy()) {
			ISqmlFunction function = (ISqmlFunction) object;
			return function.getDisplayName();
		} else {
			return objectDescription.getQualifiedName().toString();
		}
	}
}
