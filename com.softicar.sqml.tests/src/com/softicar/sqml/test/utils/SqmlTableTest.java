package com.softicar.sqml.test.utils;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.generator.table.clazz.SqmlTableClassGenerator;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.test.parser.SqmlTestParser;
import com.softicar.sqml.test.preferences.SqmlTestGeneratorPreferencesProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SqmlTableTest extends AbstractSqmlGenerationTest<ISqmlTable, SqmlTableTest> {

	private String tableName;
	private String physicalName;

	public SqmlTableTest(String tableName, String physicalName, SqmlTestParser parser) {

		super(tableName + ".sqml", parser);

		this.tableName = tableName;
		this.physicalName = physicalName;
	}

	public SqmlTableTest(SqmlTestParser parser, ISqmlTable table) {

		super(table.getName() + ".sqml", parser, table);
	}

	public ISqmlTable getTable() {

		return getObject();
	}

	// -------------------- Abstract -------------------- //

	@Override
	public ISqmlTable parseObject(List<String> lines, String filename) {

		List<String> all = new ArrayList<>();
		all.add("PACKAGE com.example");
		all.add(String.format("TABLE %s '%s' {", tableName, physicalName));
		all.addAll(lines);
		all.add("}");
		ISqmlFile file = getParser().parse(Imploder.implode(all, "\n"), filename);
		return (ISqmlTable) file.getElements().get(0);
	}

	@Override
	protected SqmlTableTest getThis() {

		return this;
	}

	@Override
	protected List<String> generateJava() {

		String java = new SqmlTableClassGenerator(new SqmlTestGeneratorPreferencesProvider()).generateCode(getTable());
		return Arrays.asList(java.split("\n"));
	}
}
