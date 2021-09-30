package com.softicar.sqml.model.builtin;

import com.softicar.sqml.model.ISqmlGlobalObject;
import com.softicar.sqml.model.files.ISqmlFile;
import com.softicar.sqml.model.utils.SqmlNavigation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * Dedicated package for built-in types and functions of the SQML language.
 * <p>
 * TODO The {@link #getLegacyName()} method only exists to provide backwards
 * compatibility for legacy code. The method and all associated code should be
 * removed as soon as backwards compatibility is not necessary anymore.
 *
 * @author Oliver Richers
 */
public class SqmlBuiltInPackage {

	private static final QualifiedName PACKAGE = QualifiedName.create("com", "softicar", "platform", "db", "sqml", "builtin");
	private static final QualifiedName LEGACY_PACKAGE = QualifiedName.create("com", "softicar", "db", "ag", "runtime", "sqml", "language");

	public static boolean contains(EObject object) {

		ISqmlFile sqmlFile = SqmlNavigation.find(ISqmlFile.class, object);
		QualifiedName packageName = sqmlFile != null? sqmlFile.getPackageName() : null;
		return packageName != null && isContained(packageName);
	}

	public static boolean contains(ISqmlGlobalObject object) {

		QualifiedName qualifiedName = object.getQualifiedName();
		if (qualifiedName != null) {
			QualifiedName packageName = qualifiedName.skipLast(1);
			return isContained(packageName);
		} else {
			return false;
		}
	}

	public static QualifiedName getQualifiedName() {

		return PACKAGE;
	}

	public static QualifiedName getLegacyName() {

		return LEGACY_PACKAGE;
	}

	private static boolean isContained(QualifiedName packageName) {

		return packageName.startsWith(PACKAGE) || packageName.startsWith(LEGACY_PACKAGE);
	}
}
