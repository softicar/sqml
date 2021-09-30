package com.softicar.sqml.generator.table.clazz.field.utils;

public class SqmlTableClassFieldDeclarationBuilder {

	private final StringBuilder builder;

	public SqmlTableClassFieldDeclarationBuilder() {

		this.builder = new StringBuilder();
	}

	public SqmlTableClassFieldDeclarationBuilder append(String text, Object...arguments) {

		builder.append(String.format(text, arguments));
		return this;
	}

	@Override
	public String toString() {

		return builder.toString();
	}
}
