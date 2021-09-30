package com.softicar.sqml.ui.contentassist;

import com.softicar.platform.common.code.java.JavaIdentifier;
import com.softicar.platform.common.code.java.WordFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PossibleVariableNamesGenerator {

	private final List<WordFragment> wordFragments;

	public PossibleVariableNamesGenerator(List<WordFragment> wordFragments) {

		this.wordFragments = wordFragments;
	}

	public List<String> generate() {

		int size = wordFragments.size();
		List<String> possibleNames = new ArrayList<>();
		for (int i = 0; i < size; ++i) {
			List<WordFragment> fragments = wordFragments.subList(i, size);
			possibleNames.add(new JavaIdentifier(fragments).asParameter());
		}
		Collections.reverse(possibleNames);
		return possibleNames;
	}
}
