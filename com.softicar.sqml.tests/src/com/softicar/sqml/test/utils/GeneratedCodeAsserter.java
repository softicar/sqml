package com.softicar.sqml.test.utils;

import com.softicar.platform.common.string.Imploder;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;

public class GeneratedCodeAsserter {

	private final List<String> codeLines;
	private int currentLine;

	public GeneratedCodeAsserter(List<String> codeLines) {

		this.codeLines = codeLines;
		this.currentLine = 0;
	}

	public GeneratedCodeAsserter(String[] codeLines) {

		this(Arrays.asList(codeLines));
	}

	public GeneratedCodeAsserter assertLine(String expectedLine) {

		GeneratedCodeLineMatcher matcher = new GeneratedCodeLineMatcher(expectedLine);

		// search for expected line
		for (int i = currentLine; i < codeLines.size(); ++i) {
			String trimmedLine = codeLines.get(i).trim();
			if (matcher.matches(trimmedLine)) {
				this.currentLine = i + 1;
				return this;
			}
		}

		// not found
		String message = String
			.format(
				"Expected to find '%s' in the following:\n---\n%s\n---",
				expectedLine,
				Imploder.implode(codeLines.subList(currentLine, codeLines.size()), "\n"));
		Assert.fail(message);
		return this;
	}
}
