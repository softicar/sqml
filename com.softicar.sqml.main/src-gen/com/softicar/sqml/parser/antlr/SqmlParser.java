/*
 * generated by Xtext
 */
package com.softicar.sqml.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import com.softicar.sqml.services.SqmlGrammarAccess;

public class SqmlParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SqmlGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected com.softicar.sqml.parser.antlr.internal.InternalSqmlParser createParser(XtextTokenStream stream) {
		return new com.softicar.sqml.parser.antlr.internal.InternalSqmlParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SqmlFile";
	}
	
	public SqmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SqmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}