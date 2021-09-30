package com.softicar.sqml.test.utils;

import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.test.parser.SqmlTestParser;

public class SqmlDeliveryTestCase {

	private final ISqmlTable supplierTable;
	private final ISqmlTable deliveryTable;
	private final ISqmlTable itemTable;

	public SqmlDeliveryTestCase(SqmlTestParser parser) {

		this.supplierTable = new SqmlTableTest("Supplier", "db.supplier", parser)//
			.add("PK Integer id = SERIAL")
			.add("String supplierName")
			.add("Supplier parentSupplier [NULLABLE]")
			.getTable();

		this.deliveryTable = new SqmlTableTest("Delivery", "db.delivery", parser)//
			.add("PK Integer id = SERIAL")
			.add("String number")
			.add("Supplier supplier")
			.getTable();

		this.itemTable = new SqmlTableTest("Item", "db.item", parser)//
			.add("PK Integer id = SERIAL")
			.add("Delivery delivery")
			.add("Integer charge [NULLABLE]")
			.getTable();
	}

	public ISqmlTable getSupplierTable() {

		return supplierTable;
	}

	public ISqmlTable getDeliveryTable() {

		return deliveryTable;
	}

	public ISqmlTable getItemTable() {

		return itemTable;
	}
}
