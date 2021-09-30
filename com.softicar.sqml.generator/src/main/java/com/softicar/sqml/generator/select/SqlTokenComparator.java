package com.softicar.sqml.generator.select;

import com.softicar.platform.db.sql.token.ISqlToken;
import java.util.Comparator;

public class SqlTokenComparator implements Comparator<ISqlToken> {

	private static SqlTokenComparator singleton = new SqlTokenComparator();

	private SqlTokenComparator() {

		// singleton
	}

	public static SqlTokenComparator get() {

		return singleton;
	}

	@Override
	public int compare(ISqlToken left, ISqlToken right) {

		return left.toString().compareToIgnoreCase(right.toString());
	}
}
