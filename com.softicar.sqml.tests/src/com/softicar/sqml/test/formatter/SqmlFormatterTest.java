package com.softicar.sqml.test.formatter;

import com.google.inject.Inject;
import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlFileTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.junit.Test;

public class SqmlFormatterTest extends AbstractSqmlTest {

	@Inject private ISerializer serializer;

	@Test
	public void testBitsAttribute() {

		assertFormattedText(
			createFileTest("T.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("TABLE T 'db.t' {")
				.add("	PK Integer id = SERIAL")
				.add("	Integer number [BITS=16]")
				.add("}"));
	}

	@Test
	public void testFunctionAndFunctionCall() {

		assertFormattedText(
			createFileTest("Foo.sqml")//
				.add("PACKAGE com.example")
				.add()
				.add("FUNCTION Long foo(Integer i, Long l) {")
				.add("	SQL {$i + $l}")
				.add("}"));

		assertFormattedText(createFileTest("Query.sqml").add("PACKAGE com.example").add().add("QUERY Query {").add("	SELECT foo(2, 4L) AS x").add("}"));
	}

	@Test
	public void testGenericTypes() {

		assertFormattedText(
			createFileTest("Query.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("QUERY Query {")
				.add("	Set<Integer> ids")
				.add()
				.add("	SELECT 1 AS x")
				.add("	WHERE 1 IN $ids")
				.add("}"));
	}

	@Test
	public void testJoin() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		assertFormattedText(
			createFileTest("Query.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("QUERY Query {")
				.add("	SELECT d.id")
				.add("	FROM Delivery d")
				.add("	JOIN Item i")
				.add("	ON i.delivery = d")
				.add("	ON i.charge IS NOT NULL")
				.add("	JOIN d.supplier supplier")
				.add("	WHERE d.number = '44'")
				.add("}"));
	}

	@Test
	public void testMaxLengthAttribute() {

		assertFormattedText(
			createFileTest("T.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("TABLE T 'db.t' {")
				.add("	PK Integer id = SERIAL")
				.add("	String text [MAXLENGTH=33]")
				.add("}"));
	}

	@Test
	public void testPrecisionAttribute() {

		assertFormattedText(
			createFileTest("T.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("TABLE T 'db.t' {")
				.add("	PK Integer id = SERIAL")
				.add("	Decimal number [PRECISION=8,3]")
				.add("}"));
	}

	@Test
	public void testRowConstructor() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		assertFormattedText(
			createFileTest("Query.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("QUERY Query {")
				.add("	SELECT 1 AS x")
				.add("	FROM Delivery d")
				.add("	WHERE (d.id, d.number) = (1, 'foo')")
				.add("}"));
	}

	@Test
	public void testRowConstructorDefaultValue() {

		assertFormattedText(
			createFileTest("T.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("TABLE T 'db.t' {")
				.add("	PK Integer id = SERIAL")
				.add("	Set<State> state = (State.BOOKED, State.PRODUCED)")
				.add()
				.add("	ENUM State ON String {")
				.add("		BOOKED = 'BOOKED'")
				.add("		PRODUCED = 'PRODUCED'")
				.add("		SCANNED = 'SCANNED'")
				.add("	}")
				.add("}"));
	}

	@Test
	public void testSubSelect() {

		parser.loadLanguagePackage();
		SqmlTestCases.loadDeliveryTestCase(parser);

		assertFormattedText(
			createFileTest("Query.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("QUERY Query {")
				.add("	SELECT x.deliveryId")
				.add("	SELECT x.supplierId")
				.add("	FROM (")
				.add("		SELECT d.id AS deliveryId, d.supplier.id AS supplierId")
				.add("		FROM Delivery d")
				.add("		JOIN d.supplier AS supplier")
				.add("		JOIN Item i")
				.add("		ON i.delivery = d")
				.add("		ON i.id = 55")
				.add("		WHERE i.id IN (")
				.add("			SELECT 1 AS one)")
				.add("		ORDER BY d.id) x")
				.add("	WHERE x.deliveryId = 77")
				.add("}"));
	}

	@Test
	public void testSelectIfBlocks() {

		assertFormattedText(
			createFileTest("Query.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("QUERY Query {")
				.add("	Boolean flag")
				.add("")
				.add("	SELECT 1 AS x1")
				.add("	#IF $flag {")
				.add("		SELECT 2 AS x2")
				.add("	} ELSE IF NOT $flag {")
				.add("		SELECT 3 AS x3")
				.add("	} ELSE {")
				.add("		SELECT 4 AS x4")
				.add("	}")
				.add("	WHERE TRUE")
				.add("")
				// TODO: find out, why this empty is necessary?
				.add("}"));
	}

	@Test
	public void testTableAndEnum() {

		assertFormattedText(
			createFileTest("Table.sqml")
				.add("PACKAGE com.example")
				.add()
				.add("TABLE Table 'db.tab' {")
				.add("	PK Integer id = SERIAL")
				.add("	String name")
				.add("	Integer index")
				.add("	Blob uuid")
				.add("	State state = NULL [NULLABLE]")
				.add("")
				.add("	UK name index")
				.add("	UK uuid")
				.add("")
				.add("	ENUM State ON String {")
				.add("		OPEN = 'OPEN'")
				.add("		CLOSED = 'CLOSED'")
				.add("	}")
				.add("")
				.add("	ENUM Type ON String {")
				.add("		BIG = 'BIG'")
				.add("		SMALL = 'SMALL'")
				.add("	}")
				.add("}"));
	}

	private void assertFormattedText(SqmlFileTest fileTest) {

		String expectedText = Imploder.implode(fileTest.getLines(), "\n");
		assertFormattedText(expectedText, fileTest.getFile());
	}

	private void assertFormattedText(String expectedText, EObject object) {

		String formattedText = serializer.serialize(object, SaveOptions.newBuilder().format().getOptions());
		assertEquals(expectedText, formattedText);
	}
}
