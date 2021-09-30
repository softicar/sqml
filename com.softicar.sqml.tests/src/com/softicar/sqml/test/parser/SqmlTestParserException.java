package com.softicar.sqml.test.parser;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.utils.SqmlException;
import org.eclipse.emf.ecore.resource.Resource;

public class SqmlTestParserException extends SqmlException {

	private static final long serialVersionUID = 1L;
	private final Resource resource;

	public SqmlTestParserException(Resource resource) {

		super("Failed to parse Sqml file:\n%s", Imploder.implode(resource.getErrors(), "\n"));
		this.resource = resource;
	}

	public Resource getResource() {

		return resource;
	}
}
