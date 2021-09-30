package com.softicar.sqml.generator.common;

import com.softicar.platform.common.io.reader.ManagedReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class SqmlImportOverridesParser {

	private final String overridesText;
	private int lineNumber;
	private Collection<String> errors;
	private SqmlImportOverrides overrides;

	public SqmlImportOverridesParser(String overridesText) {

		this.overridesText = overridesText;
	}

	public Collection<String> getErrors() {

		return Objects.requireNonNull(errors, "Need to call parse() method.");
	}

	public SqmlImportOverrides getOverrides() {

		return Objects.requireNonNull(overrides, "Need to call parse() method.");
	}

	public SqmlImportOverridesParser parse() {

		this.lineNumber = 1;
		this.errors = new ArrayList<>();
		this.overrides = new SqmlImportOverrides();

		for (String line: new ManagedReader(new StringReader(overridesText)).readLines()) {
			if (!line.isBlank()) {
				parseLine(line.trim());
			}
			lineNumber++;
		}

		return this;
	}

	private void parseLine(String line) {

		String[] parts = line.split("\\s+");
		if (parts.length == 2) {
			overrides.add(parts[0], parts[1]);
		} else {
			errors.add("Illegal import override rule in line %s.".formatted(lineNumber));
		}
	}
}
