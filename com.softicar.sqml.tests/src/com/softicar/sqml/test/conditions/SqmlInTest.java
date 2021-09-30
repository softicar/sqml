package com.softicar.sqml.test.conditions;

import com.softicar.platform.common.container.tuple.Tuple2;
import com.softicar.sqml.model.conditions.validation.SqmlIssueInOperandsNotCompatible;
import com.softicar.sqml.model.conditions.validation.SqmlIssueInconsistenElementTypeInRowConstructor;
import com.softicar.sqml.model.conditions.validation.SqmlIssueRightInOperandIsNotACollection;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import com.softicar.sqml.test.utils.SqmlTestCases;
import java.util.Arrays;
import java.util.Collections;
import org.junit.Before;
import org.junit.Test;

public class SqmlInTest extends AbstractSqmlTest {

	@Before
	public void before() {

		SqmlTestCases.loadDeliveryTestCase(parser);

		createTableTest("Foo", "db.foo")//
			.add("PK Integer id = SERIAL")
			.add("String name")
			.add("Integer count")
			.assertNoIssues();
	}

	// -------------------- query parameters -------------------- //

	@Test
	public void testIntegerInParameterList() {

		createQueryTest()//
			.add("Integer[] ids")
			.add("SELECT i.id FROM Item i")
			.add("WHERE i.id IN $ids")
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE FALSE", Collections.emptyList())
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id IN (1, 2, 3)", Arrays.asList(1, 2, 3));
	}

	@Test
	public void testTupleInParameterList() {

		createQueryTest()//
			.add("Tuple<String, Integer>[] list")
			.add("SELECT f.id FROM Foo f")
			.add("WHERE (f.name, f.count) IN $list")
			.assertGeneratedSelect("SELECT f.id AS id FROM db.foo AS f WHERE FALSE", Collections.emptyList())
			.assertGeneratedSelect(
				"SELECT f.id AS id FROM db.foo AS f WHERE (f.name, f.`count`) IN (('a', 1), ('b', 2))",
				Arrays.asList(new Tuple2<>("a", 1), new Tuple2<>("b", 2)));
	}

	@Test
	public void testIntegerNotInParameterList() {

		createQueryTest()//
			.add("Integer[] ids")
			.add("SELECT i.id FROM Item i")
			.add("WHERE i.id NOT IN $ids")
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE TRUE", Collections.emptyList())
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id NOT IN (1, 2, 3)", Arrays.asList(1, 2, 3));
	}

	@Test
	public void testTableReferenceInIntegerList() {

		createQueryTest()//
			.add("Integer[] ids")
			.add("SELECT i.id FROM Item i")
			.add("WHERE i IN $ids")
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id IN (1, 2, 3)", Arrays.asList(1, 2, 3));
	}

	@Test
	public void testTableReferenceInObjectList() {

		createQueryTest()//
			.add("Item[] items")
			.add("SELECT i.id FROM Item i")
			.add("WHERE i IN $items")
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id IN (1, 2)", Arrays.asList(1, 2));
	}

	@Test
	public void prohibitsNonListParameter() {

		createQueryTest()//
			.add("Integer ids")
			.add("SELECT i.id AS id FROM Item i")
			.add("WHERE i.id NOT IN $ids")
			.assertIssue(SqmlIssueRightInOperandIsNotACollection.class, 5);
	}

	@Test
	public void prohibitsIncompatibleListParameter() {

		createQueryTest()//
			.add("String[] ids")
			.add("SELECT i.id AS id FROM Item i")
			.add("WHERE i.id NOT IN $ids")
			.assertIssue(SqmlIssueInOperandsNotCompatible.class, 5);
	}

	// -------------------- tuples -------------------- //

	@Test
	public void testIntegerInRowConstructor() {

		createQueryTest()//
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("WHERE i.id IN (1,2,3,4)")
			.assertNoIssues()
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id IN (1, 2, 3, 4)");
	}

	@Test
	public void prohibitsRowConstructorWithInconsistentElementTypes() {

		createQueryTest()//
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("WHERE i.id IN (1,2,'3',4)")
			.assertIssue(SqmlIssueInconsistenElementTypeInRowConstructor.class, 5)
			.assertNoMoreIssues();
	}

	@Test
	public void prohibitsRowConstructorWithIncompatibleElementTypes() {

		createQueryTest()//
			.add("SELECT i.id")
			.add("FROM Item i")
			.add("WHERE i.id IN ('1','2','3','4')")
			.assertIssue(SqmlIssueInOperandsNotCompatible.class, 5)
			.assertNoMoreIssues();
	}

	// -------------------- sub-selects -------------------- //

	@Test
	public void testIntegerInIntegerSubSelect() {

		createQueryTest()//
			.add("SELECT i.id AS id FROM Item i")
			.add("WHERE i.id IN (SELECT i.id FROM Item i)")
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE i.id IN (SELECT i.id AS id FROM db.item AS i)");
	}

	@Test
	public void testTupleInTupleSubSelect() {

		createQueryTest()//
			.add("SELECT i.id AS id FROM Item i")
			.add("WHERE (i.id, i.charge) IN (SELECT i.id, i.charge FROM Item i)")
			.assertGeneratedSelect("SELECT i.id AS id FROM db.item AS i WHERE (i.id, i.charge) IN (SELECT i.id AS id, i.charge AS charge FROM db.item AS i)");
	}

	@Test
	public void forbidTupleInIntegerSubSelect() {

		createQueryTest()//
			.add("SELECT i.id AS id FROM Item i")
			.add("WHERE (i.id, i.charge) IN (SELECT i.id FROM Item i)")
			.assertIssue(SqmlIssueInOperandsNotCompatible.class, 4);
	}

	@Test
	public void forbidTupleInDifferentTupleSubSelect() {

		createQueryTest()//
			.add("SELECT i.id AS id FROM Item i")
			.add("WHERE (i.id, i.charge) IN (SELECT i.id, i.delivery FROM Item i)")
			.assertIssue(SqmlIssueInOperandsNotCompatible.class, 4);
	}
}
