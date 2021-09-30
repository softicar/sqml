package com.softicar.sqml.model.functions.linking;

import com.softicar.sqml.model.functions.ISqmlFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SqmlFunctionCallLinks {

	private final HashMap<ISqmlFunction, SqmlFunctionCallLink> links;

	public SqmlFunctionCallLinks() {

		this.links = new HashMap<>();
	}

	public void add(SqmlFunctionCallLink link) {

		links.put(link.getFunction(), link);
	}

	public List<SqmlFunctionCallLink> getSortedList() {

		List<SqmlFunctionCallLink> list = new ArrayList<>(links.values());
		Collections.sort(list, SqmlFunctionCallLinkComparator.get());
		return list;
	}

	public static List<ISqmlFunction> toFunctions(Collection<SqmlFunctionCallLink> links) {

		List<ISqmlFunction> functions = new ArrayList<>(links.size());
		for (SqmlFunctionCallLink link: links) {
			functions.add(link.getFunction());
		}
		return functions;
	}

	public boolean isAmbiguous() {

		List<SqmlFunctionCallLink> list = getSortedList();
		if (list.size() > 1) {
			SqmlFunctionCallLink first = list.get(0);
			SqmlFunctionCallLink second = list.get(1);
			return first.isValid() && second.isValid() && first.getArgumentConversionCount() == second.getArgumentConversionCount()
					&& first.getCallDistance() == second.getCallDistance();
		} else {
			return false;
		}
	}
}
