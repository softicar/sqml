package com.softicar.sqml.model.utils;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.common.string.Imploder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class SqmlJavaType implements ISqmlJavaType {

	private final JavaClassName className;
	private final Collection<ISqmlJavaType> typeParameters;
	private final Collection<JavaClassName> imports;

	public SqmlJavaType(JavaClassName className, Collection<ISqmlJavaType> typeParameters) {

		this.className = className;
		this.typeParameters = typeParameters;
		this.imports = new TreeSet<>();

		collectImports();
	}

	private void collectImports() {

		imports.add(className);
		for (ISqmlJavaType parameterType: typeParameters) {
			imports.addAll(parameterType.getImports());
		}
	}

	public SqmlJavaType(JavaClassName className, ISqmlJavaType...typeParameters) {

		this(className, Arrays.asList(typeParameters));
	}

	public SqmlJavaType(Class<?> javaClass, ISqmlJavaType...typeParameters) {

		this(new JavaClassName(javaClass), typeParameters);
	}

	@Override
	public JavaClassName getClassName() {

		return className;
	}

	@Override
	public String getCanonicalName() {

		return className.getCanonicalName();
	}

	@Override
	public String getSimpleName() {

		return className.getSimpleName();
	}

	@Override
	public String getSimpleNameWithTypeParameters() {

		if (typeParameters.isEmpty()) {
			return getSimpleName();
		} else {
			return getSimpleName() + getParameterString();
		}
	}

	private String getParameterString() {

		List<String> parameterNames = new ArrayList<>();
		for (ISqmlJavaType javaType: typeParameters) {
			parameterNames.add(javaType.getSimpleNameWithTypeParameters());
		}
		return String.format("<%s>", Imploder.implode(parameterNames, ", "));
	}

	@Override
	public Collection<JavaClassName> getImports() {

		return imports;
	}
}
