package com.softicar.sqml.generator.table.clazz.printer;

import com.softicar.platform.common.core.java.classes.name.JavaClassName;
import com.softicar.platform.db.core.table.DbTableName;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.table.clazz.field.printer.ISqmlTableClassFieldPrinter;
import com.softicar.sqml.generator.table.clazz.version.SqmlTableClassVersionEnum;

public interface ISqmlTableClassPrinterSettings {

	ISqmlTableClassPrinterConfig getConfig();

	DbTableName getTableName();

	IDbTableStructure getTableStructure();

	ISqmlTableClassFieldPrinter getFieldPrinter(IDbColumnStructure column);

	String getSimpleClassName();

	boolean isEnumTable();

	boolean isObject();

	boolean isSubObject();

	boolean isRecord();

	// -------------------- custom base class -------------------- //

	boolean isUseCustomBase();

	JavaClassName getCustomBaseClassName();

	// -------------------- custom child class -------------------- //

	boolean isUseGeneratedBase();

	JavaClassName getCustomChildClassName();

	JavaClassName getGeneratedBaseClassName();

	// -------------------- custom table class -------------------- //

	boolean isUseCustomTableClass();

	JavaClassName getCustomTableClassName();

	// -------------------- table enum class -------------------- //

	JavaClassName getTableRowEnumClassName();

	// -------------------- generation version -------------------- //

	default boolean isVersionEqualOrLater(SqmlTableClassVersionEnum versionEnum) {

		return getConfig().getVersion().isEqualOrLater(versionEnum);
	}

	default boolean isVersionBefore(SqmlTableClassVersionEnum versionEnum) {

		return !isVersionEqualOrLater(versionEnum);
	}
}
