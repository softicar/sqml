package com.softicar.sqml.model.utils.scoping;

import com.google.common.base.Predicate;
import com.softicar.sqml.model.files.ISqmlFile;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;

public class SqmlImportScopeFilter implements Predicate<IEObjectDescription> {

	private final Set<QualifiedName> importedNames;

	public SqmlImportScopeFilter(ISqmlFile sqmlFile) {

		this.importedNames = sqmlFile
			.getImports()//
			.stream()
			.map(sqmlImport -> sqmlImport.getQualifiedName())
			.collect(Collectors.toCollection(TreeSet::new));
	}

	@Override
	public boolean apply(IEObjectDescription objectDescription) {

		return importedNames.contains(objectDescription.getQualifiedName());
	}
}
