package com.softicar.sqml.generation;

import com.google.inject.Inject;
import com.softicar.platform.common.container.iterable.IteratorIterable;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferencesProvider;
import com.softicar.sqml.generator.query.ISqmlQueryClassGenerator;
import com.softicar.sqml.generator.table.clazz.ISqmlTableClassGenerator;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.tables.ISqmlTable;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

public class SqmlGenerator implements IGenerator {

	@Inject private ISqmlGeneratorPreferencesProvider preferencesProvider;
	@Inject private ISqmlQueryClassGenerator queryGenerator;
	@Inject private ISqmlTableClassGenerator tableGenerator;

	@Override
	public void doGenerate(Resource resource, IFileSystemAccess fileSystemAccess) {

		ISqmlGeneratorPreferences generatorPreferences = preferencesProvider.getPreferences(resource);
		ISqmlFileSystemAccess sqmlFileSystemAccess = new SqmlFileSystemAccess(fileSystemAccess, "java");
		generateTables(resource, generatorPreferences, sqmlFileSystemAccess);
		generateQueries(resource, generatorPreferences, sqmlFileSystemAccess);
	}

	protected void generateQueries(Resource resource, ISqmlGeneratorPreferences generatorPreferences, ISqmlFileSystemAccess fileSystemAccess) {

		if (generatorPreferences.isGenerateQueries()) {
			TreeIterator<EObject> iterator = resource.getAllContents();
			for (EObject object: IteratorIterable.create(iterator)) {
				if (object instanceof ISqmlQuery) {
					ISqmlQuery query = (ISqmlQuery) object;
					queryGenerator.generateFile(query, fileSystemAccess);
				}
			}
		}
	}

	protected void generateTables(Resource resource, ISqmlGeneratorPreferences generatorPreferences, ISqmlFileSystemAccess fileSystemAccess) {

		if (generatorPreferences.isGenerateTables()) {
			TreeIterator<EObject> iterator = resource.getAllContents();
			for (EObject object: IteratorIterable.create(iterator)) {
				if (object instanceof ISqmlTable) {
					ISqmlTable table = (ISqmlTable) object;
					tableGenerator.generateFile(table, fileSystemAccess);
				}
			}
		}
	}
}
