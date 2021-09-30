package com.softicar.sqml.test.queries;

import com.softicar.sqml.model.queries.validation.SqmlIssueIllegalSelectColumnTitle;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import org.junit.Test;

public class SqmlQueryColumnTitleTest extends AbstractSqmlTest {

	@Test
	public void testWithValidTitles() {

		createQueryTest()//
			.add("SELECT 1 AS a TITLE 'FooBar'")
			.add("SELECT 1 AS b TITLE 'Foo Bar'")
			.add("SELECT 1 AS c TITLE 'Foo-Bar'")
			.add("SELECT 1 AS d TITLE 'Foo_Bar'")
			.assertJava("...IRow::getA...TestI18n.FOOBAR...")
			.assertJava("...IRow::getB...TestI18n.FOO_BAR...")
			.assertJava("...IRow::getC...TestI18n.FOO_BAR...")
			.assertJava("...IRow::getD...TestI18n.FOO_BAR...");
	}

	@Test
	public void testWithEmptyTitles() {

		createQueryTest()//
			.add("SELECT 1 AS x TITLE ''")
			.add("SELECT 1 AS y TITLE ' '")
			.assertJava("...IRow::getX...IDisplayString.EMPTY...")
			.assertJava("...IRow::getY...IDisplayString.EMPTY...");
	}

	@Test
	public void testWithIllegalTitles() {

		assertIllegalTitle("Foo/Bar");
		assertIllegalTitle("Foo (Bar)");
		assertIllegalTitle("Foo [Bar]");
		assertIllegalTitle("Foo.Bar");
	}

	private void assertIllegalTitle(String title) {

		createQueryTest()//
			.add(String.format("SELECT 1 AS x TITLE '%s'", title))
			.assertIssue(SqmlIssueIllegalSelectColumnTitle.class, 3);
	}
}
