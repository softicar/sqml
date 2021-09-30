package com.softicar.sqml.model.selects;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.builtin.SqmlBuiltInTypes;
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.types.ISqmlType;

/**
 * Represents the declaration of a sub-select variable.
 * <p>
 * TODO: rename to ISqmlSubSelectVariableDeclaration or
 * ISqmlSubSelectAliasDeclaration
 * <p>
 * For example:
 *
 * <pre>
 * FROM (SELECT...) AS foo
 * </pre>
 *
 * Here <i>(SELECT...) AS foo</i> is the {@link ISqmlSubSelectVariable}.
 *
 * @author Oliver Richers
 */
public interface ISqmlSubSelectVariable extends ISqmlVariable {

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void generateSql(ISqmlSelectGenerator generator) {

		ISqlBuilderBuilder builder = generator.getBuilder();

		builder.addToken(SqlSymbol.LEFT_PARENTHESIS);
		builder.startSubSelect();
		getSubSelect().accept(generator);
		builder.finishSubSelect();
		builder.addToken(SqlSymbol.RIGHT_PARENTHESIS);

		builder.addToken(SqlKeyword.AS);
		builder.addIdentifier(this);
	}

	@Override
	default ISqmlType getSqmlType() {

		return SqmlBuiltInTypes.getUnknownType();
	}

	@Override
	default ISqmlTabular getTabular() {

		return getSubSelect();
	}

	ISqmlSelect getSubSelect();
}
