package com.softicar.sqml.test.functions;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.softicar.platform.common.string.Imploder;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.functions.SqmlSqlSymbol;
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

public class SqmlSqlSymbolTest extends AbstractSqmlTest {

	private Set<String> symbolsInEnum;
	private Set<String> symbolsInGrammar;

	@Inject private SqmlGrammarAccess grammarAccess;

	@Before
	public void before() {

		this.symbolsInEnum = new TreeSet<>();
		this.symbolsInGrammar = new TreeSet<>();

		// get SQL symbols from enumeration
		for (SqlSymbol symbol: SqlSymbol.values()) {
			symbolsInEnum.add(symbol.getText());
		}

		// get SQL symbols from SQML grammar rule
		TreeIterator<EObject> iterator = grammarAccess.getSqmlSqlSymbolRule().eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (object instanceof Keyword) {
				symbolsInGrammar.add(((Keyword) object).getValue());
			}
		}
	}

	@Test
	public void haveAllSymbolsInEnum() {

		Set<String> missingInEnum = Sets.difference(symbolsInGrammar, symbolsInEnum);
		if (!missingInEnum.isEmpty()) {
			Assert
				.fail(
					String
						.format("Missing the following SQL symbols from enum %s: %s", SqlSymbol.class.getSimpleName(), Imploder.implode(missingInEnum, ", ")));
		}
	}

	@Test
	public void haveAllSqlSymbolsInGrammarRule() {

		Set<String> missingInGrammar = Sets.difference(symbolsInEnum, symbolsInGrammar);
		if (!missingInGrammar.isEmpty()) {
			Assert
				.fail(
					String
						.format(
							"Missing the following SQL symbols from SQML grammar rule %s: %s",
							SqmlSqlSymbol.class.getSimpleName(),
							Imploder.implode(missingInGrammar, ", ")));
		}
	}
}
