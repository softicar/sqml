package com.softicar.sqml.model.utils;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import java.util.Collection;

public interface ISqmlJavaType {

	JavaClassName getClassName();

	String getCanonicalName();

	String getSimpleName();

	String getSimpleNameWithTypeParameters();

	Collection<JavaClassName> getImports();
}
