package com.softicar.sqml.model.conditions;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlSubSelect;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;

public interface ISqmlExists extends ISqmlCondition, ISqmlGeneratable {

	ISqmlSubSelect getSubSelect();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void generateSql(ISqmlSelectGenerator generator) {

		generator.getBuilder().addToken(SqlKeyword.EXISTS);
		generator.visit(getSubSelect());
	}
}
