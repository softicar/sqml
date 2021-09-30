package com.softicar.sqml.model.simple;

import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.functions.SqmlFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlSimpleResource extends ResourceImpl {

	private final SqmlSimpleFile file;
	private final Map<String, Collection<ISqmlFunction>> nameToFunctionMap;
	private final Map<String, ISqmlFunction> simpleSignatureToFunctionMap;

	public SqmlSimpleResource(QualifiedName packageName, String filename) {

		this.file = new SqmlSimpleFile(packageName);
		this.nameToFunctionMap = new TreeMap<>();
		this.simpleSignatureToFunctionMap = new TreeMap<>();

		setURI(URI.createURI(filename));
		getContents().add(getFile());
	}

	public SqmlSimpleFile getFile() {

		return file;
	}

	public void addFunction(SqmlFunction function) {

		file.getElements().add(function);
		nameToFunctionMap.computeIfAbsent(function.getName(), dummy -> new ArrayList<>()).add(function);

		ISqmlFunction previous = simpleSignatureToFunctionMap.put(function.getSimpleSignature(), function);
		if (previous != null) {
			throw new IllegalStateException(String.format("Multiple functions with equal signature added: %s", function.getSimpleSignature()));
		}
	}

	public Collection<ISqmlFunction> findFunctionsByName(String name) {

		return nameToFunctionMap.getOrDefault(name, Collections.emptyList());
	}

	public Optional<ISqmlFunction> findFunctionBySimpleSignature(String simpleSignature) {

		return Optional.ofNullable(simpleSignatureToFunctionMap.get(simpleSignature));
	}
}
