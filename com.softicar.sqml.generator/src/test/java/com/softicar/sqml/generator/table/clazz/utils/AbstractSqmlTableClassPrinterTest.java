package com.softicar.sqml.generator.table.clazz.utils;

import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.mysql.parser.DbMysqlCreateTableStatementParser;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import java.util.Arrays;
import org.junit.Assert;

public abstract class AbstractSqmlTableClassPrinterTest extends Assert {

	protected final DbTableName tableName;
	protected final SqmlTableClassPrinterTestConfig config;

	public AbstractSqmlTableClassPrinterTest() {

		this(new DbTableName("db", "foo"));
	}

	public AbstractSqmlTableClassPrinterTest(DbTableName tableName) {

		this.tableName = tableName;
		this.config = new SqmlTableClassPrinterTestConfig(tableName);
	}

	protected void addTable(String tableDefinition) {

		config.addTableStructure(new DbMysqlCreateTableStatementParser(tableDefinition).parse());
	}

	protected SqmlTableClassCodeAsserter generateCode(String tableDefinition) {

		return generateCode(new DbMysqlCreateTableStatementParser(tableDefinition).parse());
	}

	protected SqmlTableClassCodeAsserter generateCode(IDbTableStructure tableStructure, IDbTableStructure...additionalStructures) {

		config.addTableStructure(tableStructure);
		Arrays.asList(additionalStructures).stream().forEach(s -> config.addTableStructure(s));

		new SqmlTableClassPrinter(config, tableName).printClassFile();
		return new SqmlTableClassCodeAsserter(config.getGeneratedCode());
	}
}
