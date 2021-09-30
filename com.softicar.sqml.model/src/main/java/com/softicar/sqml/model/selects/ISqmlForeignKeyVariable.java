package com.softicar.sqml.model.selects;

import com.softicar.platform.db.sql.token.SqlKeyword;
import com.softicar.platform.db.sql.token.SqlSymbol;
import com.softicar.sqml.model.ISqmlColumn;
import com.softicar.sqml.model.ISqmlModelVisitor;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.generation.ISqlBuilderBuilder;
import com.softicar.sqml.model.generation.ISqmlSelectGenerator;
import com.softicar.sqml.model.tables.ISqmlTable;
import com.softicar.sqml.model.types.ISqmlType;
import com.softicar.sqml.model.validation.ISqmlValidatable;
import com.softicar.sqml.model.validation.ISqmlValidationContext;

/**
 * Represents the declaration of a select variable using a foreign key.
 * <p>
 * TODO: rename to ISqmlForeignKeyVariableDeclaration or
 * ISqmlForeignKeyAliasDeclaration
 * <p>
 * For example:
 *
 * <pre>
 * FROM Foo AS foo
 * JOIN foo.bar AS bar
 * </pre>
 *
 * Here <i>foo.bar AS bar</i> is the {@link ISqmlForeignKeyVariable}.
 *
 * @author Oliver Richers
 */
public interface ISqmlForeignKeyVariable extends ISqmlValidatable, ISqmlVariable {

	@Override
	default void accept(ISqmlModelVisitor visitor) {

		visitor.visit(this);
	}

	@Override
	default void generateSql(ISqmlSelectGenerator generator) {

		ISqlBuilderBuilder builder = generator.getBuilder();
		builder.addIdentifier(getTable());
		builder.addToken(SqlKeyword.AS);
		builder.addIdentifier(this);
		builder.ON();
		builder.addIdentifier(getVariable(), getColumn());
		builder.addToken(SqlSymbol.EQUAL);
		builder.addIdentifier(this, getTable().getPrimarKeyColumn());
	}

	@Override
	default ISqmlType getSqmlType() {

		return getColumn().getSqmlType();
	}

	@Override
	default ISqmlTabular getTabular() {

		return getTable();
	}

	@Override
	default void validate(ISqmlValidationContext context) {

		new SqmlForeignKeyVariableValidator(this, context).validate();
	}

	/**
	 * Returns the referenced variable declaration, representing the source
	 * table of the foreign key.
	 *
	 * @return the referenced source table variable
	 */
	ISqmlVariable getVariable();

	/**
	 * Returns the foreign key column of the source table.
	 *
	 * @return the foreign key column
	 */
	ISqmlColumn getColumn();

	/**
	 * Returns the target table that the foreign key points to.
	 *
	 * @return the target table or null if malformed
	 */
	default ISqmlTable getTable() {

		if (getColumn() != null && getColumn().getSqmlType() instanceof ISqmlTable) {
			return (ISqmlTable) getColumn().getSqmlType();
		} else {
			return null;
		}
	}
}
