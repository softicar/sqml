package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.code.java.CodePrinter;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import java.util.HashMap;
import java.util.Map;

class ColumnsPrinter {

	private final ISqmlFileGeneratorConfig config;
	private final ColumnTypeGetter typeGetter;
	private final IDbTableStructure tableStructure;
	private final Map<IDbColumnStructure, ColumnPrinter> printers;

	public ColumnsPrinter(ISqmlFileGeneratorConfig config, ImportsPrinter importsPrinter) {

		this.config = config;
		this.typeGetter = new ColumnTypeGetter(config, importsPrinter);
		this.tableStructure = config.getTableStructure();
		this.printers = new HashMap<>();

		for (IDbColumnStructure columnStructure: tableStructure.getColumns()) {
			if (!columnStructure.isIgnored()) {
				this.printers.put(columnStructure, new ColumnPrinter(config, typeGetter, columnStructure));
			}
		}
	}

	public ISqmlFileGeneratorConfig getConfig() {

		return config;
	}

	public ColumnPrinter getColumnPrinter(IDbColumnStructure columnStructure) {

		return printers.get(columnStructure);
	}

	public void print(CodePrinter printer) {

		for (IDbColumnStructure columnStructure: tableStructure.getColumns()) {
			if (!columnStructure.isIgnored()) {
				getColumnPrinter(columnStructure).print(printer);
			}
		}
	}
}
