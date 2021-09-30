package com.softicar.sqml.test.utils;

import com.softicar.sqml.test.parser.SqmlTestParser;

public class SqmlTestCases {

	public static SqmlDeliveryTestCase loadDeliveryTestCase(SqmlTestParser parser) {

		return new SqmlDeliveryTestCase(parser);
	}

	public static SqmlStockTestCase loadStockTestCase(SqmlTestParser parser) {

		return new SqmlStockTestCase(parser);
	}

	public static SqmlPricesTestCase loadPriceTestCase(SqmlTestParser parser) {

		return new SqmlPricesTestCase(parser);
	}
}
