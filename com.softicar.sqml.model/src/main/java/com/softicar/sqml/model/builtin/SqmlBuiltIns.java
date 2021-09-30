package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.builtin.functions.SqmlBuiltInFunctions;
import org.eclipse.emf.common.util.URI;

public class SqmlBuiltIns {

	public static boolean isBuiltIn(URI objectUri) {

		return SqmlBuiltInTypes.isBuiltIn(objectUri) || SqmlBuiltInFunctions.isBuiltIn(objectUri);
	}
}
