package com.softicar.sqml;

import com.google.inject.Injector;
import com.softicar.platform.common.core.logging.Log;
import com.softicar.sqml.services.SqmlGrammarAccess;
import java.util.Set;
import java.util.TreeSet;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;

public class SqmlGrammar implements ISqmlGrammar {

	private final Grammar grammar;
	private Set<String> keywords;

	public static void main(String[] args) {

		Injector injector = new SqmlStandaloneSetup().createInjectorAndDoEMFRegistration();
		SqmlGrammarAccess grammarAccess = injector.getInstance(SqmlGrammarAccess.class);
		for (String keyword: new SqmlGrammar(grammarAccess.getGrammar()).getAllKeywords()) {
			Log.finfo(keyword);
		}
	}

	public SqmlGrammar(Grammar grammar) {

		this.grammar = grammar;
	}

	@Override
	public Set<String> getAllKeywords() {

		if (keywords == null) {
			keywords = new TreeSet<>();
			for (AbstractRule rule: grammar.getRules()) {
				TreeIterator<EObject> iterator = rule.eAllContents();
				while (iterator.hasNext()) {
					EObject object = iterator.next();
					if (object instanceof Keyword) {
						add((Keyword) object);
					}
				}
			}
		}
		return keywords;
	}

	private void add(Keyword keyword) {

		String keywordText = keyword.getValue();
		if (isIdentifier(keywordText)) {
			keywords.add(keywordText);
		}
	}

	private boolean isIdentifier(String text) {

		if (text.length() < 2 || !Character.isJavaIdentifierStart(text.charAt(0))) {
			return false;
		}

		for (int i = 0; i < text.length(); ++i) {
			if (!Character.isJavaIdentifierPart(text.charAt(i))) {
				return false;
			}
		}

		return true;
	}
}
