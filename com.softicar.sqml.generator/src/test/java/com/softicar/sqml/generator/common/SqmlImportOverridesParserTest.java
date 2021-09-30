package com.softicar.sqml.generator.common;

import org.junit.Assert;
import org.junit.Test;

public class SqmlImportOverridesParserTest extends Assert {

	@Test
	public void testWithEmptyText() {

		SqmlImportOverridesParser parser = new SqmlImportOverridesParser("").parse();

		assertTrue(parser.getErrors().isEmpty());
		assertTrue(parser.getOverrides().isEmpty());
	}

	@Test
	public void testWithRules() {

		SqmlImportOverridesParser parser = new SqmlImportOverridesParser("a\tb\n c d\t\n").parse();

		assertTrue(parser.getErrors().isEmpty());
		assertEquals("a b\nc d", parser.getOverrides().toString());
	}

	@Test
	public void testWithErrors() {

		SqmlImportOverridesParser parser = new SqmlImportOverridesParser("a b c\na b\na").parse();

		assertEquals("[Illegal import override rule in line 1., Illegal import override rule in line 3.]", parser.getErrors().toString());
		assertEquals("a b", parser.getOverrides().toString());
	}
}
