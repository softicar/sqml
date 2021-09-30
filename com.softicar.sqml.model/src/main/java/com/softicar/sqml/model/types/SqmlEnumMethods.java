package com.softicar.sqml.model.types;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.sqml.model.builtin.SqmlStringType;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.utils.ISqmlJavaType;
import com.softicar.sqml.model.utils.SqmlJavaType;
import com.softicar.sqml.model.utils.SqmlNavigation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

public class SqmlEnumMethods {

	public static ISqmlJavaType getJavaType(ISqmlEnum sqmlEnum) {

		ISqmlTable sqmlTable = SqmlNavigation.findOrThrow(ISqmlTable.class, sqmlEnum);
		JavaClassName tableClassName = sqmlTable.getJavaType().getClassName();
		JavaClassName className = new JavaClassName(tableClassName.getName() + "$" + sqmlEnum.getName());
		return new SqmlJavaType(className);
	}

	public static ISqmlType getLiteralValueType(ISqmlEnum sqmlEnum) {

		ISqmlTypeReference typeReference = sqmlEnum.getTypeReference();
		return typeReference != null? typeReference.getSqmlType() : SqmlStringType.get();
	}

	public static QualifiedName getQualifiedName(ISqmlEnum sqmlEnum) {

		EObject container = sqmlEnum.eContainer();
		if (container instanceof ISqmlTable) {
			ISqmlTable table = (ISqmlTable) container;
			return table.getQualifiedName().append(sqmlEnum.getName());
		} else {
			return null;
		}
	}
}
