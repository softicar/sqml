package com.softicar.sqml.test.utils;

import java.util.Arrays;
import java.util.List;

class GeneratedCodeLineMatcher {

	private final List<String> parts;

	public GeneratedCodeLineMatcher(String expectedLine) {

		this.parts = Arrays.asList(expectedLine.trim().split("\\.\\.\\.", -1));
	}

	public boolean matches(String actualLine) {

		if (parts.size() == 1) {
			return actualLine.equals(parts.get(0));
		} else {
			String expectedStart = parts.get(0);
			List<String> expectedParts = parts.subList(1, parts.size() - 1);
			String expectedEnd = parts.get(parts.size() - 1);
			return checkStart(expectedStart, actualLine) && checkParts(expectedParts, actualLine) && checkEnd(expectedEnd, actualLine);
		}
	}

	private boolean checkStart(String expectedStart, String actualLine) {

		return expectedStart.isEmpty() || actualLine.startsWith(expectedStart);
	}

	private boolean checkParts(List<String> expectedParts, String actualLine) {

		int startIndex = 0;
		for (String part: expectedParts) {
			int index = actualLine.indexOf(part, startIndex);
			if (index < 0) {
				return false;
			} else {
				startIndex = index + part.length();
			}
		}
		return true;
	}

	private boolean checkEnd(String expectedEnd, String actualLine) {

		return expectedEnd.isEmpty() || actualLine.endsWith(expectedEnd);
	}
}
