package com.softicar.sqml.generator.sqml.keyword;

import com.softicar.platform.common.string.formatting.Formatting;

public enum SqmlKeyword {

	ACTION,
	AND,
	AS,
	ASC,
	BASE,
	BETWEEN,
	BITS,
	BY,
	CASCADE,
	CASE,
	CHARACTER,
	COLLATION,
	COMMENT,
	CONSTRAINT_NAME,
	DEFAULT,
	DELETE,
	DESC,
	DISTINCT,
	ELSE,
	EMPTY,
	END,
	ENUM,
	ESCAPE,
	EXISTS,
	FALSE,
	FOR,
	FROM,
	FUNCTION,
	GROUP,
	GROUP_CONCAT,
	HAVING,
	IF,
	IFNULL,
	IK,
	IMPORT,
	IN,
	IS,
	JOIN,
	LEFT,
	LENGTHBITS,
	LIKE,
	MAXLENGTH,
	NEXT,
	NO_ACTION,
	NOT,
	NOW,
	NULL,
	NULLABLE,
	ON,
	OPTIONAL,
	OR,
	ORDER,
	PACKAGE,
	PK,
	PRECISION,
	QUERY,
	REGEXP,
	RESTRICT,
	ROW,
	SELECT,
	SEPARATOR,
	SERIAL,
	SET,
	SET_DEFAULT,
	SET_NULL,
	SQL,
	STATIC,
	TABLE,
	THEN,
	TIMESTAMP,
	TITLE,
	TRUE,
	UK,
	UNSIGNED,
	UPDATE,
	VALUETYPE,
	WHEN,
	WHERE,
	//
	;

	private static final SqmlKeywordMap map = new SqmlKeywordMap();

	public static boolean isKeyword(String text) {

		return map.get(text) != null;
	}

	public static SqmlKeyword getByText(String text) {

		SqmlKeyword keyword = map.get(text);
		if (keyword != null) {
			return keyword;
		} else {
			throw new IllegalArgumentException(Formatting.format("No SQML keyword '%s' found.", text));
		}
	}
}
