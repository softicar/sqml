package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.core.java.packages.name.JavaPackageName;
import com.softicar.platform.db.core.table.DbTableName;

public class SqmlFilesGenerator {

	private final ISqmlFilesGeneratorConfig config;

	public SqmlFilesGenerator(ISqmlFilesGeneratorConfig config) {

		this.config = config;
	}

	public void generateAll() {

		for (DbTableName tableName: config.getAllTableNames()) {
			new SqmlFileGenerator(config.getConfig(tableName)).generate();
		}
	}

	public void generate(JavaPackageName packageName) {

		for (DbTableName tableName: config.getAllTableNames()) {
			if (config.getConfig(tableName).getClassName().getPackageName().equals(packageName)) {
				new SqmlFileGenerator(config.getConfig(tableName)).generate();
			}
		}
	}

	public void generate(DbTableName tableName) {

		new SqmlFileGenerator(config.getConfig(tableName)).generate();
	}
}
