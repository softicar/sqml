package com.softicar.sqml.model.files;

import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.sqml.model.files.validation.SqmlFileValidator;
import com.softicar.sqml.model.functions.ISqmlFunction;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;

public interface ISqmlFile extends ISqmlValidatable, EObject {

	@Override
	Resource eResource();

	ISqmlPackageDeclaration getPackageDeclaration();

	default QualifiedName getPackageName() {

		ISqmlPackageDeclaration packageDeclaration = getPackageDeclaration();
		return packageDeclaration != null? packageDeclaration.getQualifiedName() : null;
	}

	default JavaPackageName getJavaPackageName() {

		ISqmlPackageDeclaration packageDeclaration = getPackageDeclaration();
		return packageDeclaration != null? packageDeclaration.getPackageName() : null;
	}

	List<? extends ISqmlImport> getImports();

	List<? extends ISqmlFileElement> getElements();

	default boolean hasImport(QualifiedName qualifiedName) {

		return SqmlFiles.hasImport(this, qualifiedName);
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlFileValidator(this, context).validate();
	}

	// ---------- functions ---------- //

	default List<? extends ISqmlFunction> getFunctions() {

		return SqmlFiles.getFunctions(this);
	}

	default List<? extends ISqmlFunction> findFunctions(String functionName) {

		return SqmlFiles.findFunctions(this, functionName);
	}

	default ISqmlFunction getFunction(String functionName) {

		return SqmlFiles.getFunction(this, functionName);
	}

	// ---------- tables ---------- //

	default List<? extends ISqmlTable> getTables() {

		return SqmlFiles.getTables(this);
	}

	default ISqmlTable findTable(String tableName) {

		return SqmlFiles.findTable(this, tableName);
	}

	default ISqmlTable getTable(String tableName) {

		return SqmlFiles.getTable(this, tableName);
	}

	// ---------- queries ---------- //

	default List<? extends ISqmlQuery> getQueries() {

		return SqmlFiles.getQueries(this);
	}

	default ISqmlQuery findQuery(String queryName) {

		return SqmlFiles.findQuery(this, queryName);
	}

	default ISqmlQuery getQuery(String queryName) {

		return SqmlFiles.getQuery(this, queryName);
	}
}
