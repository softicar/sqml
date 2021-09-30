package com.softicar.sqml.model.utils;

import com.softicar.sqml.model.files.SqmlFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class SqmlNavigation {

	public static Resource getResource(EObject object) {

		return findOrThrow(SqmlFile.class, object).eResource();
	}

	public static <T> T find(Class<T> classToFind, EObject context) {

		while (context != null) {
			if (classToFind.isInstance(context)) {
				return classToFind.cast(context);
			}

			context = context.eContainer();
		}

		return null;
	}

	public static <T> T findOrThrow(Class<T> classToFind, EObject context) {

		T foundObject = find(classToFind, context);
		if (foundObject != null) {
			return foundObject;
		} else {
			String simpleName = context.getClass().getSimpleName();
			throw new IllegalArgumentException(
				String
					.format(//
						"Object of type '%s' is not part of any '%s'.",
						simpleName,
						classToFind.getSimpleName()));
		}
	}
}
