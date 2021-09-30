package com.softicar.sqml.ui.utils;

import com.softicar.sqml.model.files.ISqmlFile;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * Utility methods for the SQML user interface.
 * 
 * @author Oliver Richers
 */
public class SqmlUiUtils {

	public static URI getPlatformUri(IFile file) {

		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}

	public static Resource getResource(ResourceSet resourceSet, IFile file) {

		return resourceSet.getResource(SqmlUiUtils.getPlatformUri(file), true);
	}

	public static ISqmlFile getSqmlFile(ResourceSet resourceSet, IFile file) {

		Resource resource = SqmlUiUtils.getResource(resourceSet, file);
		if (resource != null && resource.getContents().size() == 1) {
			return (ISqmlFile) resource.getContents().get(0);
		} else {
			return null;
		}
	}
}
