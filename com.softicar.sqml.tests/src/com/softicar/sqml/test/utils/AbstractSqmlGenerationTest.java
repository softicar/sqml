package com.softicar.sqml.test.utils;

import com.softicar.sqml.test.parser.SqmlTestParser;
import java.util.List;

abstract class AbstractSqmlGenerationTest<O, T extends AbstractSqmlGenerationTest<O, T>> extends AbstractSqmlObjectTest<O, T> {

	private GeneratedCodeAsserter codeAsserter = null;

	protected AbstractSqmlGenerationTest(String filename, SqmlTestParser parser) {

		super(filename, parser);
	}

	protected AbstractSqmlGenerationTest(String filename, SqmlTestParser parser, O object) {

		super(filename, parser, object);
	}

	public T assertJava() {

		return assertJava("");
	}

	public T assertJava(String expectedJavaLine, Object...formatArguments) {

		return assertJava(String.format(expectedJavaLine, formatArguments));
	}

	public T assertJava(String expectedJavaLine) {

		getCodeAsserter().assertLine(expectedJavaLine);
		return getThis();
	}

	private GeneratedCodeAsserter getCodeAsserter() {

		if (codeAsserter == null) {
			this.codeAsserter = new GeneratedCodeAsserter(generateJava());
		}

		return codeAsserter;
	}

	protected abstract List<String> generateJava();
}
