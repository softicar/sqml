package com.softicar.sqml.generator.table.clazz.field.printer;

import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.key.IDbKeyStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import com.softicar.sqml.generator.table.clazz.field.utils.SqmlTableClassFieldUtils;
import com.softicar.sqml.generator.table.clazz.printer.SqmlTableClassPrinter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class SqmlTableClassFieldPrinterList {

	private final IDbTableStructure tableStructure;
	private final Optional<IDbKeyStructure> primaryKey;
	private final List<ISqmlTableClassFieldPrinter> fieldPrinters;
	private final List<ISqmlTableClassFieldPrinter> controlFieldPrinters;
	private final List<ISqmlTableClassFieldPrinter> dataFieldPrinters;
	private final Map<String, ISqmlTableClassFieldPrinter> fieldPrinterMap;

	public SqmlTableClassFieldPrinterList(SqmlTableClassPrinter classPrinter) {

		this.tableStructure = classPrinter.getTableStructure();
		this.primaryKey = tableStructure.getPrimaryKey();
		this.fieldPrinters = new ArrayList<>();
		this.controlFieldPrinters = new ArrayList<>();
		this.dataFieldPrinters = new ArrayList<>();
		this.fieldPrinterMap = new TreeMap<>();

		for (IDbColumnStructure column: tableStructure.getColumns()) {
			ISqmlTableClassFieldPrinter fieldPrinter = SqmlTableClassFieldUtils.createPrinter(classPrinter, column, classPrinter.getConfig());
			this.fieldPrinterMap.put(column.getNameOrThrow(), fieldPrinter);
			this.fieldPrinters.add(fieldPrinter);
			if (isControlField(column)) {
				this.controlFieldPrinters.add(fieldPrinter);
			} else {
				this.dataFieldPrinters.add(fieldPrinter);
			}
		}
	}

	public List<ISqmlTableClassFieldPrinter> getAllFieldPrinters() {

		return fieldPrinters;
	}

	public List<ISqmlTableClassFieldPrinter> getControlFieldPrinters() {

		return controlFieldPrinters;
	}

	public List<ISqmlTableClassFieldPrinter> getDataFieldPrinters() {

		return dataFieldPrinters;
	}

	public ISqmlTableClassFieldPrinter getFieldPrinter(IDbColumnStructure column) {

		return fieldPrinterMap.get(column.getNameOrThrow());
	}

	public boolean isControlField(IDbColumnStructure column) {

		return primaryKey//
			.map(primaryKey -> primaryKey.containsColumn(column))
			.orElse(false);
	}

	public boolean isControlField(ISqmlTableClassFieldPrinter fieldPrinter) {

		return isControlField(fieldPrinter.getFieldDefinition().getColumn());
	}
}
