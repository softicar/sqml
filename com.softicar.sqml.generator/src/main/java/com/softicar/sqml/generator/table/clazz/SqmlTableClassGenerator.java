package com.softicar.sqml.generator.table.clazz;

import com.google.inject.Inject;
import com.softicar.sqml.generator.common.ISqmlFileSystemAccess;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferences;
import com.softicar.sqml.generator.preferences.ISqmlGeneratorPreferencesProvider;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterConfig;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinterConfig;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.SqmlNavigation;

public class SqmlTableClassGenerator implements ISqmlTableClassGenerator {

	private final ISqmlGeneratorPreferencesProvider preferencesProvider;

	@Inject
	public SqmlTableClassGenerator(ISqmlGeneratorPreferencesProvider preferencesProvider) {

		this.preferencesProvider = preferencesProvider;
	}

	@Override
	public String generateCode(ISqmlTable table) {

		SqmlBufferedFileSystemAccess fileSystemAccess = new SqmlBufferedFileSystemAccess();
		generateFile(table, fileSystemAccess);
		return fileSystemAccess.getContent(table.getClassName());
	}

	@Override
	public void generateFile(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess) {

		generateFile(new SqmlTableClassPrinterConfig(getGeneratorPreferences(table), table, fileSystemAccess), table);
	}

	@Override
	public void extractCustomBaseClass(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess) {

		SqmlTableClassPrinterConfig config = new SqmlTableClassPrinterConfig(getGeneratorPreferences(table), table, fileSystemAccess);
		config.setExtractCustomBaseClass(true);
		generateFile(config, table);
	}

	@Override
	public void extractCustomTableClass(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess) {

		SqmlTableClassPrinterConfig config = new SqmlTableClassPrinterConfig(getGeneratorPreferences(table), table, fileSystemAccess);
		config.setExtractCustomTableClass(true);
		generateFile(config, table);
	}

	@Override
	public void extractGeneratedBaseClass(ISqmlTable table, ISqmlFileSystemAccess fileSystemAccess) {

		SqmlTableClassPrinterConfig config = new SqmlTableClassPrinterConfig(getGeneratorPreferences(table), table, fileSystemAccess);
		config.setExtractGeneratedBaseClass(true);
		generateFile(config, table);
	}

	private void generateFile(ISqmlTableClassPrinterConfig config, ISqmlTable table) {

		new SqmlTableClassPrinter(config, table.getDbTableName()).printClassFile();
	}

	private ISqmlGeneratorPreferences getGeneratorPreferences(ISqmlTable table) {

		return preferencesProvider.getPreferences(SqmlNavigation.getResource(table));
	}
}
