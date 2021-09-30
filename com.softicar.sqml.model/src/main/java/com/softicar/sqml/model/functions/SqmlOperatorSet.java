package com.softicar.sqml.model.functions;

import java.util.Set;
import java.util.TreeSet;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlOperatorSet {

	private static SqmlOperatorSet SINGLETON = new SqmlOperatorSet();
	private final Set<String> names = new TreeSet<>();

	private SqmlOperatorSet() {

		add("=");
		add("!=");
		add(">");
		add(">=");
		add("<");
		add("<=");

		add("+");
		add("-");
		add("*");
		add("/");
		add("%");
	}

	public static boolean isOperator(QualifiedName qualifiedName) {

		return SINGLETON.names.contains(qualifiedName.getLastSegment());
	}

	private void add(String name) {

		names.add(name);
	}
}
