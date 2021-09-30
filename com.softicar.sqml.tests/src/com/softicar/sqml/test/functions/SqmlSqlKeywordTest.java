package com.softicar.sqml.test.functions;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.generator.sqml.keyword.SqmlKeyword;
import com.softicar.sqml.model.functions.SqmlSqlKeyword;
import com.softicar.sqml.services.SqmlGrammarAccess;
import com.softicar.sqml.test.utils.AbstractSqmlTest;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This test ensures that the grammar rule {@link SqmlSqlKeyword} contains all
 * keywords listed in {@link SqmlKeyword} enumeration class.
 *
 * @author Oliver Richers
 */
public class SqmlSqlKeywordTest extends AbstractSqmlTest {

	private Set<String> keywordsInEnum;
	private Set<String> keywordsInKeywordRule;

	@Inject private SqmlGrammarAccess grammarAccess;

	@Before
	public void before() {

		this.keywordsInEnum = new TreeSet<>();
		this.keywordsInKeywordRule = new TreeSet<>();

		// get SQL keywords from enumeration
		for (SqmlKeyword keyword: SqmlKeyword.values()) {
			keywordsInEnum.add(keyword.name());
		}

		// get SQL keywords from SQML grammar rule
		TreeIterator<EObject> iterator = grammarAccess.getSqmlSqlKeywordRule().eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof Keyword) {
				keywordsInKeywordRule.add(((Keyword) object).getValue());
			}
		}
	}

	@Test
	public void haveAllKeywordsInEnum() {

		Set<String> missingInEnum = Sets.difference(keywordsInKeywordRule, keywordsInEnum);
		if (!missingInEnum.isEmpty()) {
			Assert
				.fail(
					String
						.format(//
							"Missing the following keywords from enum %s: %s",
							SqmlKeyword.class.getSimpleName(),
							Imploder.implode(missingInEnum, ", ")));
		}
	}

	@Test
	public void haveAllKeywordsInGrammar() {

		Set<String> missingInGrammar = Sets.difference(keywordsInEnum, keywordsInKeywordRule);
		if (!missingInGrammar.isEmpty()) {
			Assert
				.fail(
					String
						.format(//
							"Missing the following SQML keywords from grammar rule %s: %s",
							SqmlSqlKeyword.class.getSimpleName(),
							Imploder.implode(missingInGrammar, ", ")));
		}
	}
}
