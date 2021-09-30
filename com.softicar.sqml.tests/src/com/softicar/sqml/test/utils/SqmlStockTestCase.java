package com.softicar.sqml.test.utils;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.test.parser.SqmlTestParser;

public class SqmlStockTestCase {

	private final ISqmlTable stockTable;

	public SqmlStockTestCase(SqmlTestParser parser) {

		this.stockTable = new SqmlTableTest("Stock", "db.stock", parser)//
			.add("PK Integer id = SERIAL")
			.add("String articleNumber")
			.add("Integer quantity")
			.getTable();
	}

	public ISqmlTable getStockTable() {

		return stockTable;
	}
}
