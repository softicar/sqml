package com.softicar.sqml.model.builtin;

import com.softicar.platform.common.string.Imploder;
import com.softicar.sqml.model.types.ISqmlType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * An immutable list of {@link ISqmlType} elements.
 *
 * @author Oliver Richers
 */
public class SqmlTypeList implements ISqmlTypeList {

	private final List<ISqmlType> types;

	public SqmlTypeList(Collection<ISqmlType> types) {

		this.types = new ArrayList<>(types);
	}

	public SqmlTypeList(ISqmlType...types) {

		this(Arrays.asList(types));
	}

	@Override
	public boolean is(ISqmlTypeList other) {

		if (types.size() != other.size()) {
			return false;
		}

		for (int i = 0; i < types.size(); ++i) {
			if (!types.get(i).is(other.get(i))) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String getDisplayName() {

		List<String> displayNames = new ArrayList<>();
		for (ISqmlType type: types) {
			displayNames.add(type.getDisplayName());
		}
		return String.format("<%s>", Imploder.implode(displayNames, ", "));
	}

	@Override
	public boolean isEmpty() {

		return types.isEmpty();
	}

	@Override
	public int size() {

		return types.size();
	}

	@Override
	public ISqmlType get(int index) {

		return types.get(index);
	}

	@Override
	public Iterator<ISqmlType> iterator() {

		return types.iterator();
	}
}
