package com.softicar.sqml.generator.query;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.model.queries.ISqmlQueryParameter;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import java.util.Arrays;
import java.util.Collection;

class QueryParameterGenerator {

	private final SqmlQueryGenerator interfaceGenerator;
	private final SqmlJavaCodePrinter printer;
	private final ISqmlQueryParameter parameter;
	private final JavaIdentifier name;
	private final ISqmlType parameterType;
	private final ISqmlJavaType parameterJavaType;
	private final ISqmlJavaType elementJavaType;
	private QueryParameterGenerator nextParameterGenerator;

	public QueryParameterGenerator(SqmlQueryGenerator interfaceGenerator, ISqmlQueryParameter parameter) {

		this.interfaceGenerator = interfaceGenerator;
		this.printer = interfaceGenerator.getPrinter();
		this.parameter = parameter;
		this.name = new JavaIdentifier(parameter.getName());
		this.parameterType = parameter.getSqmlType();
		this.parameterJavaType = parameterType.getJavaType();
		this.elementJavaType = parameterType.isCollection()? parameterType.getElementType().getJavaType() : null;
	}

	public void setNextGenerator(QueryParameterGenerator nextParameterGenerator) {

		this.nextParameterGenerator = nextParameterGenerator;
	}

	public ISqmlQueryParameter getParameter() {

		return parameter;
	}

	public JavaIdentifier getParameterName() {

		return name;
	}

	public String getSetterInterfaceName() {

		return "I" + getParameterName().asClass() + "Setter";
	}

	public String getSetterClassName() {

		return getParameterName().asClass() + "Setter";
	}

	public void printField() {

		printer.addImports(parameterJavaType.getImports());
		if (parameter.getSqmlType().isCollection()) {
			ISqmlJavaType concreteJavaType = parameterType.getConcreteJavaType();
			printer.addImport(concreteJavaType.getClassName());
			printer
				.println(//
					"private %s %s = new %s<>();",
					parameterJavaType.getSimpleNameWithTypeParameters(),
					name.asField(),
					concreteJavaType.getSimpleName());
		} else {
			printer.println("private %s %s;", parameterJavaType.getSimpleNameWithTypeParameters(), name.asField());
		}
	}

	// -------------------- OPTIONAL PARAMETERS -------------------- //

	public void printInterfaceSetterMethodForOptionalParameter() {

		if (parameterType.isCollection()) {
			if (parameterType.isTuple()) {
				printer.println("@SuppressWarnings(\"unchecked\")");
			}
			printer
				.println(
					"%s add%s(%s...%s);",
					interfaceGenerator.getSimpleQueryInterfaceName(),
					name.asClass(),
					elementJavaType.getSimpleNameWithTypeParameters(),
					name.asParameter());
			printer
				.println(
					"%s add%s(Collection<? extends %s> %s);",
					interfaceGenerator.getSimpleQueryInterfaceName(),
					name.asClass(),
					elementJavaType.getSimpleNameWithTypeParameters(),
					name.asParameter());
		} else {
			printer.addImports(parameterJavaType.getImports());
			printer
				.println(
					"%s %s(%s %s);",
					interfaceGenerator.getSimpleQueryInterfaceName(),
					name.asSetter(),
					parameterJavaType.getSimpleName(),
					name.asParameter());
		}
	}

	public void printSetterMethodForOptionalParameter() {

		if (parameter.getSqmlType().isCollection()) {
			printer.addImports(parameterJavaType.getImports());
			printer.addImport(Arrays.class);
			printer.addImport(Collection.class);
			printer.println("@SafeVarargs");
			printer
				.beginMethod(
					"public final %s add%s(%s...%s)",
					interfaceGenerator.getSimpleQueryInterfaceName(),
					name.asClass(),
					elementJavaType.getSimpleNameWithTypeParameters(),
					name.asParameter());
			printer.println("return this.add%s(Arrays.asList(%s));", name.asClass(), name.asParameter());
			printer.endMethod();
			printer
				.beginMethod(
					"public final %s add%s(Collection<? extends %s> %s)",
					interfaceGenerator.getSimpleQueryInterfaceName(),
					name.asClass(),
					elementJavaType.getSimpleNameWithTypeParameters(),
					name.asParameter());
			printer.println("this.parameters.%s.addAll(%s);", name.asField(), name.asParameter());
			printer.println("return this;");
			printer.endMethod();
		} else {
			printer.addImports(parameterJavaType.getImports());
			printer
				.beginMethod(
					"public %s %s(%s %s)",
					interfaceGenerator.getSimpleQueryInterfaceName(),
					name.asSetter(),
					parameterJavaType.getSimpleName(),
					name.asParameter());
			printer.println("this.parameters.%s = %s;", name.asField(), name.asParameter());
			printer.println("return this;");
			printer.endMethod();
		}
	}

	// -------------------- MANDATORY PARAMETERS -------------------- //

	public void printSetterInterfaceForMandatoryParameter() {

		printer.beginClass("interface %s", getSetterInterfaceName());
		if (parameter.getSqmlType().isCollection()) {
			if (parameter.getSqmlType().getElementType().isTuple()//
					&& !interfaceGenerator.getPreferences().isGenerateSuppressAllWarningsForQueries()) {
				// only generate suppress "unchecked" warnings if really necessary
				printer.println("@SuppressWarnings(\"unchecked\")");
			}
			printSetterInterfaceMethod(String.format("%s...", elementJavaType.getSimpleNameWithTypeParameters()));
			printSetterInterfaceMethod(String.format("Collection<? extends %s>", elementJavaType.getSimpleNameWithTypeParameters()));
		} else {
			printSetterInterfaceMethod(parameterJavaType.getSimpleNameWithTypeParameters());
		}
		printer.endClass();
	}

	private void printSetterInterfaceMethod(String parameterType) {

		printer.println("%s %s(%s %s);", getSetterResultType(), name.asSetter(), parameterType, name.asParameter());
	}

	public void printSetterClassForMandatoryParameter() {

		printer.beginClass("public class %s implements %s", getSetterClassName(), getSetterInterfaceName());

		printer.addImports(parameterJavaType.getImports());
		if (parameter.getSqmlType().isCollection()) {
			printer.addImport(Arrays.class);
			printer.addImport(Collection.class);

			printer.println("@Override");
			printer.println("@SafeVarargs");
			beginSetterClassMethod(String.format("%s...", elementJavaType.getSimpleNameWithTypeParameters()));
			printer.println("return this.%s(Arrays.asList(%s));", name.asSetter(), name.asParameter());
			printer.endMethod();

			printer.println("@Override");
			beginSetterClassMethod(String.format("Collection<? extends %s>", elementJavaType.getSimpleNameWithTypeParameters()));
			printer.println("%s.this.parameters.%s.addAll(%s);", QueryClassGenerator.QUERY_CLASS_NAME, name.asField(), name.asParameter());
			printer.println("return %s;", getSetterResultExpression());
			printer.endMethod();
		} else {
			printer.println("@Override");
			beginSetterClassMethod(parameterJavaType.getSimpleNameWithTypeParameters());
			printer.println("%s.this.parameters.%s = %s;", QueryClassGenerator.QUERY_CLASS_NAME, name.asField(), name.asParameter());
			printer.println("return %s;", getSetterResultExpression());
			printer.endMethod();
		}

		printer.endClass();
	}

	private void beginSetterClassMethod(String parameterType) {

		printer.beginMethod("public final %s %s(%s %s)", getSetterResultType(), name.asSetter(), parameterType, name.asParameter());
	}

	private String getSetterResultType() {

		if (nextParameterGenerator != null) {
			return nextParameterGenerator.getSetterInterfaceName();
		} else {
			return interfaceGenerator.getSimpleQueryInterfaceName();
		}
	}

	private String getSetterResultExpression() {

		if (nextParameterGenerator != null) {
			return String.format("Query.this.new %s()", nextParameterGenerator.getSetterClassName());
		} else {
			return "Query.this";
		}
	}
}
