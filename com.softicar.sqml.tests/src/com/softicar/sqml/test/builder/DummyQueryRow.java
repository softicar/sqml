package com.softicar.sqml.test.builder;

import com.softicar.platform.db.runtime.query.AbstractDbQueryRow;
import com.softicar.platform.db.runtime.query.IDbQuery;

class DummyQueryRow extends AbstractDbQueryRow<DummyQueryRow> {

	protected DummyQueryRow(IDbQuery<DummyQueryRow> query) {

		super(query);
	}

	@Override
	public DummyQueryRow getThis() {

		return this;
	}
}
