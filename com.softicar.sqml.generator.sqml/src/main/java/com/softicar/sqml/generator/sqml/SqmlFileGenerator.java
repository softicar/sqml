package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.code.java.CodePrinter;
import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.platform.db.core.table.DbTableName;
import java.io.StringWriter;

public class SqmlFileGenerator {

	private final ISqmlFileGeneratorConfig config;
	private final DbTableName tableName;
	private final JavaClassName className;
	private final IDbTableStructure tableStructure;
	private final ImportsPrinter importsPrinter;
	private final CodePrinter headPrinter;
	private final CodePrinter bodyPrinter;
	private final ColumnsPrinter columnsPrinter;

	public SqmlFileGenerator(ISqmlFileGeneratorConfig config) {

		this.config = config;
		this.tableName = config.getTableName();
		this.className = config.getClassName();
		this.tableStructure = config.getTableStructure();
		this.importsPrinter = new ImportsPrinter(className);
		this.headPrinter = new CodePrinter();
		this.bodyPrinter = new CodePrinter();
		this.columnsPrinter = new ColumnsPrinter(config, importsPrinter);
	}

	public void generate() {

		// print body
		String enumPrefix = tableStructure.isEnumTable()? "ENUM " : "";
		bodyPrinter.println("%sTABLE %s '%s' {", enumPrefix, className.getSimpleName(), tableName.getCanonicalName());
		bodyPrinter.incrementIndentation();
		printColumns();
		printKeys();
		printEnums();
		printTableRows();
		bodyPrinter.decrementIndentation();
		bodyPrinter.println("}");

		// print head
		headPrinter.println("PACKAGE %s", className.getPackageName());
		headPrinter.println();
		printImports();

		// aggregate generated code
		StringWriter writer = new StringWriter();
		headPrinter.writeOut(writer);
		bodyPrinter.writeOut(writer);
		String generatedCode = writer.toString();

		// update file
		config.getFileSystemAccess().writeFileIfNecessary(className, generatedCode);
	}

	private void printColumns() {

		columnsPrinter.print(bodyPrinter);
	}

	private void printKeys() {

		new KeysPrinter(tableStructure, columnsPrinter).print(bodyPrinter);
	}

	private void printEnums() {

		new EnumsPrinter(tableStructure).print(bodyPrinter);
	}

	private void printTableRows() {

		new SqmlEnumTableRowsPrinter(tableStructure).print(bodyPrinter);
	}

	private void printImports() {

		importsPrinter.print(headPrinter);
	}
}
