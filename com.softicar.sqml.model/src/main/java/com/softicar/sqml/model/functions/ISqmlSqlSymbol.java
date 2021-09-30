package com.softicar.sqml.model.functions;

import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlModelVisitor;

public interface ISqmlSqlSymbol extends ISqmlModelElement {

	String getSymbolText();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	default SqlSymbol getSqlSymbol() {

		return SqlSymbol.getByText(getSymbolText());
	}
}
