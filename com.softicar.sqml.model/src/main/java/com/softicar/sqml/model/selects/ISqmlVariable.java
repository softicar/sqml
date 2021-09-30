package com.softicar.sqml.model.selects;

import com.softicar.sqml.model.ISqmlGeneratable;
import com.softicar.sqml.model.ISqmlModelElement;
import com.softicar.sqml.model.ISqmlTabular;
import com.softicar.sqml.model.ISqmlValue;

public interface ISqmlVariable extends ISqmlGeneratable, ISqmlValue, ISqmlModelElement {

	/**
	 * Returns the logical name of this variable.
	 * <p>
	 * The returned name is either specified directly using the AS keyword, or
	 * was derived implicitly.
	 *
	 * @return the logical name of this variable
	 */
	String getName();

	/**
	 * Returns the {@link ISqmlTabular} object referenced by this variable.
	 *
	 * @return the referenced {@link ISqmlTabular}, never null
	 */
	ISqmlTabular getTabular();

	/**
	 * Returns the path to the referenced {@link ISqmlTabular}, if any.
	 *
	 * @return the path or null, if this is a sub-select
	 */
	// ISqmlPath getPath();

	/**
	 * Returns the defined sub-select, if any.
	 *
	 * @return the defined sub-select, or null if this is a path
	 */
	// ISqmlSelect getSubSelect();
}
