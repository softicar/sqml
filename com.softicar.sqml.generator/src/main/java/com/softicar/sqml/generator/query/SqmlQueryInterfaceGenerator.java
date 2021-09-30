package com.softicar.sqml.generator.query;

import com.google.inject.Inject;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferencesProvider;
import com.softicar.sqml.model.queries.ISqmlQuery;
import com.softicar.sqml.model.utils.SqmlNavigation;

public class SqmlQueryInterfaceGenerator implements ISqmlQueryClassGenerator {

	private final ISqmlGeneratorPreferencesProvider preferencesProvider;

	@Inject
	public SqmlQueryInterfaceGenerator(ISqmlGeneratorPreferencesProvider preferencesProvider) {

		this.preferencesProvider = preferencesProvider;
	}

	@Override
	public String generateCode(ISqmlQuery query) {

		// generate code
		SqmlQueryGenerator generator = new SqmlQueryGenerator(getGeneratorPreferences(query), query);
		generator.printCode();

		// finish file header
		JavaPackageName packageName = query.getJavaPackageName();
		generator.getPrinter().prependFileHeader(packageName);

		// write the file
		StringBuilder builder = new StringBuilder();
		generator.getPrinter().writeOut(builder);
		return builder.toString();
	}

	@Override
	public void generateFile(ISqmlQuery query, ISqmlFileSystemAccess fileSystemAccess) {

		JavaClassName interfaceName = SqmlQueryGenerator.getInterfaceName(query);
		String generatedCode = generateCode(query);
		fileSystemAccess.writeFileIfNecessary(interfaceName, generatedCode);
	}

	private ISqmlGeneratorPreferences getGeneratorPreferences(ISqmlQuery query) {

		return preferencesProvider.getPreferences(SqmlNavigation.getResource(query));
	}
}
