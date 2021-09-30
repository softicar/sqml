package com.softicar.sqml.generator.sqml;

import com.softicar.platform.common.code.java.CodePrinter;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.structure.column.IDbColumnStructure;
import com.softicar.platform.db.structure.enums.IDbEnumTableRowStructure;
import com.softicar.platform.db.structure.enums.value.converter.DbEnumTableRowValueToIntegerConverter;
import com.softicar.platform.db.structure.table.IDbTableStructure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class SqmlEnumTableRowsPrinter {

	private final IDbTableStructure tableStructure;

	public SqmlEnumTableRowsPrinter(IDbTableStructure tableStructure) {

		this.tableStructure = tableStructure;
	}

	public void print(CodePrinter printer) {

		if (tableStructure.isEnumTable()) {
			List<IDbEnumTableRowStructure> tableRows = tableStructure.getEnumTableRows();
			if (!tableRows.isEmpty()) {
				printer.println();
				tableRows//
					.stream()
					.sorted(Comparator.comparing(this::getId))
					.forEach(structure -> printRow(printer, structure));
			}
		}
	}

	private Integer getId(IDbEnumTableRowStructure tableRowStructure) {

		Optional<IDbColumnStructure> idColumn = tableStructure.getIdColumn();
		if (idColumn.isPresent()) {
			return tableRowStructure.getValue(idColumn.get()).convert(new DbEnumTableRowValueToIntegerConverter());
		} else {
			return 0;
		}
	}

	private void printRow(CodePrinter printer, IDbEnumTableRowStructure tableRowStructure) {

		Collection<String> values = new ArrayList<>();
		for (IDbColumnStructure columnStructure: tableStructure.getColumns()) {
			values
				.add(
					tableRowStructure//
						.getValue(columnStructure)
						.convert(new SqmlEnumTableRowValueToSqmlConverter()));
		}
		printer.println("ROW (%s)", Imploder.implode(values, ", "));
	}
}
