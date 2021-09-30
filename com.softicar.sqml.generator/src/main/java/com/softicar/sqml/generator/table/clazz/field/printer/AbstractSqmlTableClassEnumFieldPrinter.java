package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.generator.table.clazz.field.definition.ISqmlTableClassFieldDefinition;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldUtils;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersionEnum;
import java.util.ArrayList;
import java.util.List;

abstract class AbstractSqmlTableClassEnumFieldPrinter extends SqmlTableClassFieldPrinter {

	public AbstractSqmlTableClassEnumFieldPrinter(SqmlTableClassPrinter classPrinter, ISqmlTableClassFieldDefinition fieldDefinition) {

		super(classPrinter, fieldDefinition);
	}

	@Override
	protected String getFieldType() {

		classPrinter.addImport(getFieldClass());
		return String.format("%s<%s, %s>", getFieldClass().getSimpleName(), classPrinter.getSimpleClassName(), getEnumClassName());
	}

	@Override
	protected String getFieldFactoryParameters() {

		return ", " + getEnumClassName() + ".class";
	}

	@Override
	public void printEnumClass() {

		List<String> variableValueList = fieldDefinition.getColumn().getEnumValues();
		int n = variableValueList.size();

		// create list with names of enum variables
		boolean useDirectNames = true;
		List<String> variableNameList = new ArrayList<>(n);
		for (String value: fieldDefinition.getColumn().getEnumValues()) {
			String name = SqmlTableClassFieldUtils.getEnumVariableName(value);
			if (!name.equals(value)) {
				useDirectNames = false;
			}
			variableNameList.add(name);
		}

		// print enum class
		classPrinter.beginClass("public static enum %s", getEnumClassName());
		if (useDirectNames) {
			int i = n;
			for (String variableName: variableNameList) {
				classPrinter.println("%s%s", variableName, --i == 0? ";" : ",");
			}
			classPrinter.println();

			printEnumClassExtra();

			classPrinter.beginMethod("public static %s getByName(String name)", getEnumClassName());
			classPrinter.println("return name != null? valueOf(name) : null;");
			classPrinter.endBlock();
		} else {
			classPrinter.addImport(java.util.TreeMap.class);

			List<String> variableDeclarationList = new ArrayList<>(n);
			for (int i = 0; i < n; ++i) {
				variableDeclarationList.add(String.format("%s(\"%s\")", variableNameList.get(i), variableValueList.get(i)));
			}
			classPrinter.println("%s;", Imploder.implode(variableDeclarationList, ", "));
			classPrinter.println();

			printEnumClassExtra();

			classPrinter.println("@Override");
			classPrinter.beginMethod("public String toString()");
			classPrinter.println("return m_name;");
			classPrinter.endBlock();

			if (classPrinter.getConfig().getVersion().isBefore(SqmlTableClassVersionEnum.VERSION_20200922)) {
				JavaClassName i18nClass = new JavaClassName("com.softicar.platform.common.base.i18n.I18n");
				classPrinter.addImport(i18nClass);
				classPrinter.beginMethod("public String getDisplayName()");
				classPrinter.println("return %s.translate(m_name);", i18nClass.getSimpleName());
				classPrinter.endBlock();
			}

			classPrinter.beginMethod("public static %s getByName(String name)", getEnumClassName());
			classPrinter.println("return name != null? m_mapping.get(name) : null;");
			classPrinter.endBlock();

			classPrinter.beginMethod("private %s(String name)", getEnumClassName());
			classPrinter.println("m_name = name;");
			classPrinter.endBlock();

			classPrinter.println("private String m_name;");
			classPrinter.println("private static TreeMap<String, %s> m_mapping = new TreeMap<>();", getEnumClassName());

			classPrinter.beginBlock("static");
			classPrinter.beginBlock("for (%s tmp: values())", getEnumClassName());
			classPrinter.println("m_mapping.put(tmp.m_name, tmp);");
			classPrinter.endBlock();
			classPrinter.endBlock();
		}
		classPrinter.endBlock();
	}

	@Override
	public String getEnumClassName() {

		return nameDeterminer.getUpperCamelName();
	}

	protected abstract void printEnumClassExtra();
}
