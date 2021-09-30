package com.softicar.sqml.test.utils;

import com.softicar.platform.common.core.logging.Log;
import com.softicar.platform.db.runtime.logic.IDbObject;

public class Test {

	public static void main(String[] args) {

		IDbObject<?>[] foo = new IDbObject<?>[2];
		Log.finfo(foo.getClass().getCanonicalName());
		Log.finfo(foo.getClass().isArray());
		Log.finfo(IDbObject.class.isAssignableFrom(foo.getClass().getComponentType()));
	}
}
