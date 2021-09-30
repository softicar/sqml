package com.softicar.sqml.test.utils;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.test.parser.SqmlTestParser;

public class SqmlPricesTestCase {

	private final ISqmlTable itemTable;
	private final ISqmlTable sourceTable;
	private final ISqmlTable priceTable;

	public SqmlPricesTestCase(SqmlTestParser parser) {

		this.itemTable = //
				new SqmlTableTest("Item", "db.item", parser)//
					.add("PK Integer id = SERIAL")
					.add("String priceKey")
					.getTable();

		this.sourceTable = //
				new SqmlTableTest("Source", "db.source", parser)//
					.add("PK Integer id = SERIAL")
					.add("String name")
					.getTable();

		this.priceTable = //
				new SqmlTableTest("Price", "db.price", parser)//
					.add("PK Integer id = SERIAL")
					.add("String priceKey")
					.add("Source source")
					.add("Integer value")
					.getTable();
	}

	public ISqmlTable getItemTable() {

		return itemTable;
	}

	public ISqmlTable getSourceTable() {

		return sourceTable;
	}

	public ISqmlTable getPriceTable() {

		return priceTable;
	}
}
