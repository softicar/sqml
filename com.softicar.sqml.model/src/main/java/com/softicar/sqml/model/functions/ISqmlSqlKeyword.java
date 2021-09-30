package com.softicar.sqml.model.functions;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;

public interface ISqmlSqlKeyword extends ISqmlModelElement {

	String getKeywordText();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	default SqlKeyword getSqlKeyword() {

		return SqlKeyword.getByText(getKeywordText());
	}
}
