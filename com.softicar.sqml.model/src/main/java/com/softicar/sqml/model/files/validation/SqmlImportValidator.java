package com.softicar.sqml.model.files.validation;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterables;
import com.softicar.sqml.model.files.FilesPackage;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.files.ISqmlImport;
import com.softicar.sqml.model.utils.SqmlNavigation;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.Objects;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;

public class SqmlImportValidator {

	private final ISqmlImport sqmlImport;
	private final ISqmlValidationContext context;
	private final Resource resource;
	private final QualifiedName qualifiedName;

	public SqmlImportValidator(ISqmlImport sqmlImport, ISqmlValidationContext context) {

		this.sqmlImport = sqmlImport;
		this.context = context;
		this.resource = SqmlNavigation.getResource(sqmlImport);
		this.qualifiedName = sqmlImport.getQualifiedName();
	}

	public void validate() {

		checkForUnresolvableImports();
		checkForLocalPackageImports();
	}

	private void checkForUnresolvableImports() {

		IScope tableScope = getGlobalScope(FilesPackage.eINSTANCE.getSqmlImport_Target());
		if (Iterables.isEmpty(tableScope.getElements(qualifiedName))) {
			context.accept(new SqmlIssueUnresolvableImport(sqmlImport));
		}
	}

	private void checkForLocalPackageImports() {

		ISqmlFile sqmlFile = sqmlImport.getSqmlFile();
		QualifiedName packageName = sqmlFile.getPackageName();
		if (Objects.equals(packageName, sqmlImport.getQualifiedName().skipLast(1))) {
			context.accept(new SqmlIssueLocalPackageImport(sqmlImport));
		}
	}

	private IScope getGlobalScope(EReference reference) {

		return context.getScope(resource, reference, Predicates.alwaysTrue());
	}
}
