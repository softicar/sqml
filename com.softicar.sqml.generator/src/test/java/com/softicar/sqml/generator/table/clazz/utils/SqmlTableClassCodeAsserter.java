package com.softicar.sqml.generator.table.clazz.utils;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.common.string.Imploder;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

public class SqmlTableClassCodeAsserter {

	private final List<String> codeLines;
	private int currentLine;

	public SqmlTableClassCodeAsserter(String codeText) {

		this(codeText.split("\n"));
	}

	public SqmlTableClassCodeAsserter(List<String> codeLines) {

		this.codeLines = codeLines;
		this.currentLine = 0;
	}

	public SqmlTableClassCodeAsserter(String[] codeLines) {

		this(Arrays.asList(codeLines));
	}

	public SqmlTableClassCodeAsserter assertLine(String expectedLine, Object...arguments) {

		return assertLine(String.format(expectedLine, arguments));
	}

	public SqmlTableClassCodeAsserter assertLine(String expectedLine) {

		int index = findLine(expectedLine, currentLine);
		if (index >= 0) {
			this.currentLine = index + 1;
		} else {
			String message = String
				.format(
					"Expected to find '%s' in the following:\n---\n%s\n---",
					expectedLine,
					Imploder.implode(codeLines.subList(currentLine, codeLines.size()), "\n"));
			Assert.fail(message);
		}
		return this;
	}

	public SqmlTableClassCodeAsserter assertNoLine(String unexpectedLine) {

		int index = findLine(unexpectedLine, currentLine);
		if (index >= 0) {
			String message = String
				.format(
					"Expected *not* to find '%s' in the following:\n---\n%s\n---",
					unexpectedLine,
					Imploder.implode(codeLines.subList(index, codeLines.size()), "\n"));
			Assert.fail(message);
		}
		return this;
	}

	public SqmlTableClassCodeAsserter assertForeignFieldDeclaration(String source, String target, String name, String additions) {

		return assertLine(
			new StringBuilder()//
				.append(String.format("public static final IDbForeignField<%s, %s> %s", source, target, new JavaIdentifier(name).asConstant()))
				.append(String.format(" = BUILDER.addForeignField(\"%s\", o->o.%s, (o,v)->o.%s=v, %s.ID)%s;", name, name, name, target, additions))
				.toString());
	}

	private int findLine(String line, int start) {

		SqmlTableClassCodeLineMatcher matcher = new SqmlTableClassCodeLineMatcher(line);

		for (int i = start; i < codeLines.size(); ++i) {
			String trimmedLine = codeLines.get(i).trim();
			if (matcher.matches(trimmedLine)) {
				return i;
			}
		}

		return -1;
	}
}
