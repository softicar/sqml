package com.softicar.sqml.generator.table.clazz.type;

import com.softicar.platform.db.runtime.enums.AbstractDbEnumTableRow;
import com.softicar.platform.db.runtime.logic.AbstractDbObject;
import com.softicar.platform.db.runtime.object.sub.AbstractDbSubObject;
import com.softicar.platform.db.runtime.record.AbstractDbRecord;
import com.softicar.sqml.generator.common.SqmlJavaCodePrinter;
import com.softicar.sqml.generator.table.clazz.printer.ISqmlTableClassPrinterSettings;

public class SqmlTableClassBaseTypesDeterminer extends AbstractSqmlTableClassTypesDeterminer {

	public SqmlTableClassBaseTypesDeterminer(SqmlJavaCodePrinter printer, ISqmlTableClassPrinterSettings settings) {

		super(printer, settings);
	}

	public String getAndImportBaseTypeOfGeneratedClass() {

		if (settings.isUseCustomBase()) {
			return settings.getCustomBaseClassName().getSimpleName();
		} else {
			return getAndImportDefaultBaseType();
		}
	}

	public String getAndImportDefaultBaseType() {

		return String
			.format(//
				"%s<%s%s>",
				getAndImportBaseClassOfGeneratedClass().getSimpleName(),
				settings.getSimpleClassName(),
				getAdditionalTypeParameters());
	}

	private String getAdditionalTypeParameters() {

		if (settings.isObject()) {
			return "";
		} else if (settings.isEnumTable()) {
			return ", " + settings.getTableRowEnumClassName().getSimpleName();
		} else {
			return ", " + keyTypeDeterminer.getAndImportType();
		}
	}

	private Class<?> getAndImportBaseClassOfGeneratedClass() {

		if (settings.isObject()) {
			return addImport(AbstractDbObject.class);
		} else if (settings.isSubObject()) {
			return addImport(AbstractDbSubObject.class);
		} else if (settings.isEnumTable()) {
			return addImport(AbstractDbEnumTableRow.class);
		} else {
			return addImport(AbstractDbRecord.class);
		}
	}
}
