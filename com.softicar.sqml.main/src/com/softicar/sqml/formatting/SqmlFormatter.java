package com.softicar.sqml.formatting;

import com.google.inject.Inject;
import com.softicar.sqml.services.SqmlGrammarAccess;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlEnumElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlFunctionCallElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlFunctionElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlGroupConcatElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlQueryElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlRowConstructorDefaultValueElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlRowConstructorElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlSelectElseElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlSelectElseIfElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlSelectIfElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlSqlElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlSubSelectElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlSubSelectVariableElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlTableColumnElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlTableElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlTypeReferenceElements;
import com.softicar.sqml.services.SqmlGrammarAccess.SqmlValueTypeElements;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.IFormatter;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

/**
 * Implementation of {@link IFormatter} for SQML.
 */
public class SqmlFormatter extends AbstractDeclarativeFormatter {

	@Inject private SqmlGrammarAccess grammar;

	@Override
	protected void configureFormatting(FormattingConfig config) {

		config.setAutoLinewrap(120);

		configure(config);
		configureComments(config);
		configureEnum(config);
		configureFile(config);
		configureFunction(config);
		configureFunctionCall(config);
		configureGroupConcat(config);
		configureIf(config);
		configureIfNull(config);
		configureQuery(config);
		configureRowConstructor(config);
		configureRowConstructorDefaultValue(config);
		configureSelect(config);
		configureSelectElse(config);
		configureSelectElseIf(config);
		configureSelectIf(config);
		configureSql(config);
		configureStaticParentheses(config);
		configureSubSelect(config);
		configureSubSelectVariable(config);
		configureTable(config);
		configureTableColumn(config);
		configureTypeReference(config);
		configureValueType(config);
	}

	private void configure(FormattingConfig config) {

		// spacing for brackets
		for (Pair<Keyword, Keyword> pair: grammar.findKeywordPairs("[", "]")) {
			config.setNoSpace().after(pair.getFirst());
			config.setNoSpace().before(pair.getSecond());
		}

		// spacing for brackets on type references
		SqmlTypeReferenceElements typeReference = grammar.getSqmlTypeReferenceAccess();
		config.setNoSpace().between(typeReference.getTypeDefinitionAssignment_0(), typeReference.getListLeftSquareBracketKeyword_2_0_0());
		config.setNoSpace().between(typeReference.getListLeftSquareBracketKeyword_2_0_0(), typeReference.getRightSquareBracketKeyword_2_1());

		// spacing for comma
		for (Keyword comma: grammar.findKeywords(",")) {
			config.setNoSpace().before(comma);
		}

		// spacing for dot
		for (Keyword dot: grammar.findKeywords(".")) {
			config.setNoSpace().around(dot);
		}

		// spacing for question marks
		for (Keyword questionMark: grammar.findKeywords("?")) {
			config.setNoSpace().before(questionMark);
		}

		// spacing for dollar
		for (Keyword dollar: grammar.findKeywords("$")) {
			config.setNoSpace().after(dollar);
		}
	}

	private void configureComments(FormattingConfig config) {

		config.setLinewrap(0, 1, 2).before(grammar.getSL_COMMENTRule());
		config.setLinewrap(0, 1, 2).before(grammar.getML_COMMENTRule());
		config.setLinewrap(0, 1, 1).after(grammar.getML_COMMENTRule());
	}

	private void configureEnum(FormattingConfig config) {

		SqmlEnumElements elements = grammar.getSqmlEnumAccess();
		config.setIndentation(elements.getLeftCurlyBracketKeyword_3(), elements.getRightCurlyBracketKeyword_5());
		config.setLinewrap(1).around(grammar.getSqmlEnumeratorRule());
	}

	private void configureFile(FormattingConfig config) {

		config.setLinewrap(2).after(grammar.getSqmlPackageDeclarationRule());
		config.setLinewrap(1).around(grammar.getSqmlImportRule());
		config.setLinewrap(2).between(grammar.getSqmlImportRule(), grammar.getSqmlFileElementRule());
		config.setLinewrap(2).around(grammar.getSqmlQueryRule());
		config.setLinewrap(2).around(grammar.getSqmlTableRule());
		config.setLinewrap(2).around(grammar.getSqmlFunctionRule());
		config.setLinewrap(2).around(grammar.getSqmlValueTypeRule());
	}

	private void configureFunction(FormattingConfig config) {

		SqmlFunctionElements functionElements = grammar.getSqmlFunctionAccess();
		config.setNoSpace().around(functionElements.getLeftParenthesisKeyword_3());
		config.setNoSpace().before(functionElements.getRightParenthesisKeyword_5());
		config.setLinewrap().after(functionElements.getLeftCurlyBracketKeyword_6());
		config.setIndentation(functionElements.getLeftCurlyBracketKeyword_6(), functionElements.getRightCurlyBracketKeyword_8());
		config.setLinewrap().before(functionElements.getRightCurlyBracketKeyword_8());
	}

	private void configureFunctionCall(FormattingConfig config) {

		SqmlFunctionCallElements functionCallElements = grammar.getSqmlFunctionCallAccess();
		config.setNoSpace().around(functionCallElements.getLeftParenthesisKeyword_1());
		config.setNoSpace().before(functionCallElements.getRightParenthesisKeyword_3());
	}

	private void configureGroupConcat(FormattingConfig config) {

		SqmlGroupConcatElements groupConcatElements = grammar.getSqmlGroupConcatAccess();
		config.setNoSpace().after(groupConcatElements.getLeftParenthesisKeyword_1());
		config.setNoSpace().before(groupConcatElements.getRightParenthesisKeyword_7());
	}

	private void configureIf(FormattingConfig config) {

		config.setNoSpace().after(grammar.getSqmlIfAccess().getLeftParenthesisKeyword_1());
		config.setNoSpace().before(grammar.getSqmlIfAccess().getRightParenthesisKeyword_7());
	}

	private void configureIfNull(FormattingConfig config) {

		config.setNoSpace().after(grammar.getSqmlIfNullAccess().getLeftParenthesisKeyword_1());
		config.setNoSpace().before(grammar.getSqmlIfNullAccess().getRightParenthesisKeyword_5());
	}

	private void configureQuery(FormattingConfig config) {

		SqmlQueryElements queryElements = grammar.getSqmlQueryAccess();
		config.setIndentation(queryElements.getLeftCurlyBracketKeyword_2(), queryElements.getRightCurlyBracketKeyword_5());
		config.setLinewrap(1).around(grammar.getSqmlQueryParameterRule());
		config.setLinewrap(2).between(grammar.getSqmlQueryParameterRule(), grammar.getSqmlSelectRule());
		config.setLinewrap(1).around(grammar.getSqmlSelectRule());
	}

	private void configureRowConstructor(FormattingConfig config) {

		SqmlRowConstructorElements rowConstructorElements = grammar.getSqmlRowConstructorAccess();
		config.setNoSpace().after(rowConstructorElements.getLeftParenthesisKeyword_1());
		config.setNoSpace().before(rowConstructorElements.getRightParenthesisKeyword_4());
	}

	private void configureRowConstructorDefaultValue(FormattingConfig config) {

		SqmlRowConstructorDefaultValueElements elements = grammar.getSqmlRowConstructorDefaultValueAccess();
		config.setNoSpace().after(elements.getLeftParenthesisKeyword_1());
		config.setNoSpace().before(elements.getCommaKeyword_2_1_0());
		config.setSpace(" ").after(elements.getCommaKeyword_2_1_0());
		config.setNoSpace().before(elements.getRightParenthesisKeyword_3());
	}

	private void configureSelect(FormattingConfig config) {

		config.setLinewrap(1, 1, 2).around(grammar.getSqmlFromClauseRule());
		config.setLinewrap(1, 1, 2).around(grammar.getSqmlJoinClauseRule());
		config.setLinewrap(1, 1, 2).around(grammar.getSqmlWhereClauseRule());
		config.setLinewrap(1, 1, 2).around(grammar.getSqmlGroupByClauseRule());
		config.setLinewrap(1, 1, 2).around(grammar.getSqmlHavingClauseRule());
		config.setLinewrap(1, 1, 2).around(grammar.getSqmlOrderByClauseRule());

		config.setLinewrap().before(grammar.getSqmlJoinClauseAccess().getONKeyword_3_0());
	}

	private void configureSelectElse(FormattingConfig config) {

		SqmlSelectElseElements elements = grammar.getSqmlSelectElseAccess();
		config.setLinewrap().after(elements.getLeftCurlyBracketKeyword_2());
		config.setIndentation(elements.getLeftCurlyBracketKeyword_2(), elements.getRightCurlyBracketKeyword_4());
		config.setLinewrap().before(elements.getRightCurlyBracketKeyword_4());
	}

	private void configureSelectElseIf(FormattingConfig config) {

		SqmlSelectElseIfElements elements = grammar.getSqmlSelectElseIfAccess();
		config.setLinewrap().after(elements.getLeftCurlyBracketKeyword_3());
		config.setIndentation(elements.getLeftCurlyBracketKeyword_3(), elements.getRightCurlyBracketKeyword_5());
		config.setLinewrap().before(elements.getRightCurlyBracketKeyword_5());
	}

	private void configureSelectIf(FormattingConfig config) {

		SqmlSelectIfElements elements = grammar.getSqmlSelectIfAccess();
		config.setNoSpace().between(elements.getNumberSignKeyword_0(), elements.getIFKeyword_1());
		config.setLinewrap().after(elements.getLeftCurlyBracketKeyword_3());
		config.setIndentation(elements.getLeftCurlyBracketKeyword_3(), elements.getRightCurlyBracketKeyword_5());
		config.setLinewrap().before(elements.getRightCurlyBracketKeyword_5());
	}

	private void configureSql(FormattingConfig config) {

		SqmlSqlElements sqlElements = grammar.getSqmlSqlAccess();
		config.setNoSpace().after(sqlElements.getLeftCurlyBracketKeyword_1());
		config.setNoSpace().before(sqlElements.getRightCurlyBracketKeyword_3());
	}

	private void configureStaticParentheses(FormattingConfig config) {

		config.setNoSpace().after(grammar.getSqmlStaticParenthesesAccess().getLeftParenthesisKeyword_0());
		config.setNoSpace().before(grammar.getSqmlStaticParenthesesAccess().getRightParenthesisKeyword_2());
	}

	private void configureSubSelect(FormattingConfig config) {

		SqmlSubSelectElements subSelectElements = grammar.getSqmlSubSelectAccess();
		config.setIndentation(subSelectElements.getLeftParenthesisKeyword_0(), subSelectElements.getRightParenthesisKeyword_2());
		config.setLinewrap().after(subSelectElements.getLeftParenthesisKeyword_0());
		config.setNoSpace().before(subSelectElements.getRightParenthesisKeyword_2());
	}

	private void configureSubSelectVariable(FormattingConfig config) {

		SqmlSubSelectVariableElements variableElements = grammar.getSqmlSubSelectVariableAccess();
		config.setIndentation(variableElements.getLeftParenthesisKeyword_0(), variableElements.getRightParenthesisKeyword_2());
		config.setLinewrap().after(variableElements.getLeftParenthesisKeyword_0());
		config.setNoSpace().before(variableElements.getRightParenthesisKeyword_2());
	}

	private void configureTable(FormattingConfig config) {

		SqmlTableElements tableElements = grammar.getSqmlTableAccess();
		config.setIndentation(tableElements.getLeftCurlyBracketKeyword_4(), tableElements.getRightCurlyBracketKeyword_9());
		config.setLinewrap(1).around(grammar.getSqmlTableColumnRule());
		config.setLinewrap(2).between(grammar.getSqmlTableColumnRule(), grammar.getSqmlTableKeyRule());
		config.setLinewrap(1).around(grammar.getSqmlTableKeyRule());
		config.setLinewrap(2).before(grammar.getSqmlEnumRule());
		config.setLinewrap(1).after(grammar.getSqmlEnumRule());
	}

	private void configureTableColumn(FormattingConfig config) {

		SqmlTableColumnElements elements = grammar.getSqmlTableColumnAccess();
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_7_1());
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_8_1());
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_9_1());
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_10_1());
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_11_2());
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_12_1());
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_13_1());
		config.setNoSpace().around(elements.getEqualsSignKeyword_4_1_14_1());
		config.setNoSpace().around(elements.getCommaKeyword_4_1_8_3());
	}

	private void configureTypeReference(FormattingConfig config) {

		SqmlTypeReferenceElements elements = grammar.getSqmlTypeReferenceAccess();
		config.setNoSpace().around(elements.getLessThanSignKeyword_1_0());
		config.setNoSpace().before(elements.getGreaterThanSignKeyword_1_3());
	}

	private void configureValueType(FormattingConfig config) {

		SqmlValueTypeElements elements = grammar.getSqmlValueTypeAccess();
		config.setIndentation(elements.getLeftCurlyBracketKeyword_2(), elements.getRightCurlyBracketKeyword_3());
	}
}
