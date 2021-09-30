package com.softicar.sqml.test.parser;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.softicar.sqml.model.files.ISqmlFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

public class SqmlTestParser {

	private ResourceSet resourceSet = null;
	private Resource resource = null;
	private List<Issue> issues;

	@Inject private Provider<XtextResourceSet> resourceSetProvider;

	public Collection<Resource> loadLanguagePackage() {

		return new SqmlRuntimeLanguageFilesLoader<>(this::loadResource).loadAll();
	}

	public ISqmlFile parse(String text, String filename) {

		ISqmlFile file = tryToParse(text, filename);
		if (file != null) {
			return file;
		} else {
			throw new SqmlTestParserException(resource);
		}
	}

	private ISqmlFile tryToParse(String text, String filename) {

		// load resource
		this.resource = loadResourceFromString(text, filename);
		if (resource.getContents().isEmpty()) {
			return null;
		}

		// validate resource
		IResourceValidator resourceValidator = ((XtextResource) resource).getResourceServiceProvider().getResourceValidator();
		this.issues = resourceValidator.validate(resource, CheckMode.ALL, null);

		return (ISqmlFile) resource.getContents().get(0);
	}

	public boolean hasErrors() {

		return !getErrors().isEmpty();
	}

	public List<Diagnostic> getErrors() {

		return resource.getErrors();
	}

	public List<Diagnostic> getWarnings() {

		return resource.getWarnings();
	}

	public Collection<Issue> getIssues() {

		return issues;
	}

	// -------------------- private -------------------- //

	private URI computeUnusedUri(String filename) {

		String folder = "__synthetic";
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			URI syntheticUri = URI.createURI(folder + i + "/" + filename);
			if (getResourceSet().getResource(syntheticUri, false) == null) {
				return syntheticUri;
			}
		}
		throw new IllegalStateException();
	}

	private Resource loadResourceFromString(String content, String filename) {

		try (StringInputStream inputStream = new StringInputStream(content)) {
			return loadResourceFromStream(inputStream, filename);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
	}

	private Resource loadResource(SqmlRuntimeLanguageFile file) {

		try (InputStream inputStream = file.getInputStream()) {
			return loadResourceFromStream(inputStream, file.getFilename());
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
	}

	private Resource loadResourceFromStream(InputStream stream, String filename) {

		try {
			Resource resource = createResource(computeUnusedUri(filename));
			resource.load(stream, null);
			return resource;
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
	}

	private Resource createResource(URI uri) {

		return getResourceSet().createResource(uri);
	}

	private ResourceSet getResourceSet() {

		if (this.resourceSet == null) {
			this.resourceSet = resourceSetProvider.get();
		}

		return this.resourceSet;
	}
}
