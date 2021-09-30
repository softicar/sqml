package com.softicar.sqml.generator.common;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class SqmlImportOverrides {

	private final Collection<Rule> rules;

	public SqmlImportOverrides() {

		this.rules = new ArrayList<>();
	}

	public void add(String pattern, String replacement) {

		rules.add(new Rule(pattern, replacement));
	}

	public JavaClassName applyTo(JavaClassName className) {

		return new JavaClassName(applyTo(className.getName()));
	}

	public String applyTo(String text) {

		for (Rule rule: rules) {
			text = rule.applyTo(text);
		}
		return text;
	}

	public boolean isEmpty() {

		return rules.isEmpty();
	}

	@Override
	public String toString() {

		return rules.stream().map(it -> it.toString()).collect(Collectors.joining("\n"));
	}

	private static class Rule {

		private final String pattern;
		private final String replacement;

		public Rule(String pattern, String replacement) {

			this.pattern = pattern;
			this.replacement = replacement;
		}

		public String applyTo(String text) {

			return text.replaceAll(pattern, replacement);
		}

		@Override
		public String toString() {

			return "%s %s".formatted(pattern, replacement);
		}
	}
}
