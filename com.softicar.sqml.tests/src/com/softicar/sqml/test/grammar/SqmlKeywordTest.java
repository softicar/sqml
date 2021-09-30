package com.softicar.sqml.test.grammar;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.SqmlGrammar;
import com.softicar.sqml.generator.sqml.keyword.SqmlKeyword;
import com.softicar.sqml.services.SqmlGrammarAccess;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Before;
import org.junit.Test;

/**
 * This test ensures that the {@link SqmlKeyword} enumeration class lists all
 * keywords of the SQML grammar.
 *
 * @author Oliver Richers
 */
public class SqmlKeywordTest extends AbstractSqmlTest {

	@Inject private SqmlGrammarAccess grammarAccess;
	private Set<String> keywordsInGrammar;
	private Set<String> keywordsInEnum;

	@Before
	public void before() {

		// get keywords in complete grammar
		SqmlGrammar grammar = new SqmlGrammar(grammarAccess.getGrammar());
		this.keywordsInGrammar = grammar.getAllKeywords();

		// keywords in enum
		this.keywordsInEnum = new TreeSet<>();
		for (SqmlKeyword keyword: SqmlKeyword.values()) {
			keywordsInEnum.add(keyword.name());
		}
	}

	@Test
	public void testKeywordsInGrammer() {

		// missing in grammar
		Set<String> missingInGrammar = Sets.difference(keywordsInEnum, keywordsInGrammar);
		if (!missingInGrammar.isEmpty()) {
			fail(String.format("The following keywords are is missing from the grammar: %s", Imploder.implode(missingInGrammar, ", ")));
		}
	}

	@Test
	public void testKeywordsInEnum() {

		// missing in enum
		Set<String> missingInEnum = Sets.difference(keywordsInGrammar, keywordsInEnum);
		if (!missingInEnum.isEmpty()) {
			fail(String.format("The following keywords are is missing from %s: %s", SqmlKeyword.class.getSimpleName(), Imploder.implode(missingInEnum, ", ")));
		}
	}
}
