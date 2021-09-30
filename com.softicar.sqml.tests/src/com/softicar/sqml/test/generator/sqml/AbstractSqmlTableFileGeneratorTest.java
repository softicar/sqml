package com.softicar.sqml.test.generator.sqml;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.sqml.SqmlFileGenerator;
import com.softicar.sqml.test.utils.GeneratedCodeAsserter;
import org.junit.Assert;

public abstract class AbstractSqmlTableFileGeneratorTest extends Assert {

	private static final JavaClassName CLASS_NAME = new JavaClassName("com.example.Foo");

	protected GeneratedCodeAsserter generateCode() {

		TestFileGeneratorConfig generatorConfig = new TestFileGeneratorConfig(getTableStructure(), CLASS_NAME);
		new SqmlFileGenerator(generatorConfig).generate();
		String generatedCode = generatorConfig.getFileSystemAccess().readFile(CLASS_NAME);
		return new GeneratedCodeAsserter(generatedCode.split("\n"));
	}

	protected abstract IDbTableStructure getTableStructure();
}
