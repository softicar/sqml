package com.softicar.sqml.formatting2;

import com.softicar.sqml.model.files.SqmlFile;
import com.softicar.sqml.model.files.SqmlFileElement;
import com.softicar.sqml.model.files.SqmlImport;
import com.softicar.sqml.model.types.ISqmlTypeReference;
import com.softicar.sqml.model.types.SqmlTypeReference;
import org.eclipse.xtext.formatting2.AbstractJavaFormatter;
import org.eclipse.xtext.formatting2.IFormattableDocument;

public class SqmlFormatter extends AbstractJavaFormatter {

	protected void format(SqmlFile sqmlFile, IFormattableDocument doc) {

		// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
		doc.format(sqmlFile.getPackageDeclaration());
		for (SqmlImport sqmlImport: sqmlFile.getImports()) {
			doc.format(sqmlImport);
		}
		for (SqmlFileElement sqmlFileElement: sqmlFile.getElements()) {
			doc.format(sqmlFileElement);
		}
	}

	protected void format(SqmlTypeReference sqmlTypeReference, IFormattableDocument doc) {

		// TODO: format HiddenRegions around keywords, attributes, cross references, etc.
		for (ISqmlTypeReference iSqmlTypeReference: sqmlTypeReference.getTypeParameters()) {
			doc.format(iSqmlTypeReference);
		}
	}

	// TODO: implement for SqmlEnum, SqmlEnumerator, SqmlTable, SqmlTableColumn, SqmlTableRow, SqmlTableRowValue, SqmlRowConstructorDefaultValue, SqmlLiteralDefaultValue, SqmlValueReferenceDefaultValue, SqmlQuery, SqmlQueryParameter, SqmlFunction, SqmlFunctionParameter, SqmlSql, SqmlSelect, SqmlSelectIf, SqmlSelectElseIf, SqmlSelectElse, SqmlSelectClause, SqmlSelectColumn, SqmlFromClause, SqmlSubSelectVariable, SqmlJoinClause, SqmlWhereClause, SqmlGroupByClause, SqmlHavingClause, SqmlOrderByClause, SqmlOrderByExpression, SqmlOr, SqmlAnd, SqmlNot, SqmlExists, SqmlComparison, SqmlLike, SqmlBetween, SqmlIn, SqmlRegexp, SqmlAddition, SqmlMultiplication, SqmlSubSelect, SqmlRowConstructor, SqmlNegation, SqmlFunctionCall, SqmlGroupConcat, SqmlCase, SqmlCaseWhen, SqmlIf, SqmlIfNull, SqmlStaticIf, SqmlStaticOr, SqmlStaticAnd, SqmlStaticIsEmpty, SqmlStaticIsNull, SqmlStaticIsTrue, SqmlStaticParentheses, SqmlValueReference, SqmlIsNull, SqmlPath
}
