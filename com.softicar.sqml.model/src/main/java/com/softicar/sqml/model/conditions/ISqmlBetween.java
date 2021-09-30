package com.softicar.sqml.model.conditions;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.expressions.ISqmlExpression;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;

public interface ISqmlBetween extends ISqmlCondition, ISqmlGeneratable {

	ISqmlExpression getOperand();

	ISqmlExpression getLeft();

	ISqmlExpression getRight();

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void generateSql(ISqmlSelectGenerator generator) {

		getOperand().accept(generator);
		generator.getBuilder().addToken(SqlKeyword.BETWEEN);
		getLeft().accept(generator);
		generator.getBuilder().addToken(SqlKeyword.AND);
		getRight().accept(generator);
	}
}
