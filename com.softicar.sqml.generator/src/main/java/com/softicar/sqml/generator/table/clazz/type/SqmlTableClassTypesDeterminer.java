package com.softicar.sqml.generator.table.clazz.type;

import com.softicar.platform.common.code.java.JavaClass;
import com.softicar.platform.db.runtime.enums.DbEnumTable;
import com.softicar.platform.db.runtime.logic.DbObjectTable;
import com.softicar.platform.db.runtime.object.DbObjectTableBuilder;
import com.softicar.platform.db.runtime.object.IDbObjectTableBuilder;
import com.softicar.platform.db.runtime.object.sub.DbSubObjectTable;
import com.softicar.platform.db.runtime.object.sub.DbSubObjectTableBuilder;
import com.softicar.platform.db.runtime.object.sub.IDbSubObjectTableBuilder;
import com.softicar.platform.db.runtime.record.DbRecordTable;
import com.softicar.platform.db.runtime.table.DbTableBuilder;
import com.softicar.platform.db.runtime.table.IDbTableBuilder;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterSettings;

public class SqmlTableClassTypesDeterminer extends AbstractSqmlTableClassTypesDeterminer {

	public SqmlTableClassTypesDeterminer(SqmlJavaCodePrinter printer, ISqmlTableClassPrinterSettings settings) {

		super(printer, settings);
	}

	// ------------------------------ table ------------------------------ //

	public String getAndImportTableType() {

		if (settings.isUseCustomTableClass()) {
			return settings.getCustomTableClassName().getSimpleName();
		} else {
			return getAndImportDefaultTableType();
		}
	}

	public String getAndImportTableAllocationType() {

		if (settings.isUseCustomTableClass()) {
			return settings.getCustomTableClassName().getSimpleName();
		} else {
			return getAndImportDefaultTableClass().getSimpleName() + "<>";
		}
	}

	public String getAndImportDefaultTableType() {

		return String
			.format(//
				"%s<%s%s>",
				getAndImportDefaultTableClass().getSimpleName(),
				settings.getSimpleClassName(),
				getAndImportAdditionalTypeParametersForTableType());
	}

	public Class<?> getAndImportDefaultTableClass() {

		if (settings.isObject()) {
			return addImport(DbObjectTable.class);
		} else if (settings.isSubObject()) {
			return addImport(DbSubObjectTable.class);
		} else if (settings.isEnumTable()) {
			return addImport(DbEnumTable.class);
		} else {
			return addImport(DbRecordTable.class);
		}
	}

	public String getAdditionalCreationParameters() {

		if (settings.isEnumTable()) {
			return ", " + settings.getTableRowEnumClassName().getSimpleName() + ".values()";
		} else {
			return "";
		}
	}

	// ------------------------------ table builder ------------------------------ //

	public String getAndImportTableBuilderType() {

		return String
			.format(//
				"%s<%s, %s%s>",
				getAndImportTableBuilderClass().getSimpleName(),
				settings.getSimpleClassName(),
				settings.isUseGeneratedBase()? settings.getGeneratedBaseClassName().getSimpleName() : settings.getSimpleClassName(),
				getAndImportAdditionalTypeParametersForStructureTableType());
	}

	public Class<?> getAndImportTableBuilderClass() {

		if (settings.isObject() || settings.isEnumTable()) {
			return addImport(DbObjectTableBuilder.class);
		} else if (settings.isSubObject()) {
			return addImport(DbSubObjectTableBuilder.class);
		} else {
			return addImport(DbTableBuilder.class);
		}
	}

	// ------------------------------ table structure interface ------------------------------ //

	public String getAndImportTableBuilderInterfaceType() {

		return String
			.format(//
				"%s<%s%s>",
				getAndImportTableBuilderInterface().getSimpleName(),
				settings.getSimpleClassName(),
				getAndImportAdditionalTypeParametersForStructureTableType());
	}

	public Class<?> getAndImportTableBuilderInterface() {

		if (settings.isObject() || settings.isEnumTable()) {
			return addImport(IDbObjectTableBuilder.class);
		} else if (settings.isSubObject()) {
			return addImport(IDbSubObjectTableBuilder.class);
		} else {
			return addImport(IDbTableBuilder.class);
		}
	}

	// ------------------------------ generic ------------------------------ //

	private String getAndImportAdditionalTypeParametersForTableType() {

		if (settings.isObject()) {
			return "";
		} else if (settings.isSubObject()) {
			JavaClass baseClass = addImport(getBaseColumnValueClass());
			JavaClass physicalBaseColumnClass = addImport(getPhysicalBaseColumnValueClass());
			return ", " + baseClass.getSimpleName() + ", " + physicalBaseColumnClass.getSimpleName();
		} else if (settings.isEnumTable()) {
			return ", " + settings.getTableRowEnumClassName().getSimpleName();
		} else {
			return ", " + keyTypeDeterminer.getAndImportType();
		}
	}

	private String getAndImportAdditionalTypeParametersForStructureTableType() {

		if (settings.isObject() || settings.isEnumTable()) {
			return "";
		} else if (settings.isSubObject()) {
			JavaClass baseClass = addImport(getBaseColumnValueClass());
			JavaClass physicalBaseColumnClass = addImport(getPhysicalBaseColumnValueClass());
			return ", " + baseClass.getSimpleName() + ", " + physicalBaseColumnClass.getSimpleName();
		} else {
			return ", " + keyTypeDeterminer.getAndImportType();
		}
	}

	private JavaClass getBaseColumnValueClass() {

		return settings.getFieldPrinter(getBaseColumn()).getFieldDefinition().getValueClass();
	}

	private JavaClass getPhysicalBaseColumnValueClass() {

		return getBaseColumn().getFieldType().getJavaClass();
	}

	private IDbColumnStructure getBaseColumn() {

		return settings.getTableStructure().getPkColumn().get();
	}
}
