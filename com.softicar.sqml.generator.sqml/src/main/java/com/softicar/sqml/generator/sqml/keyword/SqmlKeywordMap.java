package com.softicar.sqml.generator.sqml.keyword;

import java.util.Map;
import java.util.TreeMap;

class SqmlKeywordMap {

	private static Map<String, SqmlKeyword> keywordMap = new TreeMap<>();

	public SqmlKeywordMap() {

		for (SqmlKeyword keyword: SqmlKeyword.values()) {
			keywordMap.put(keyword.name(), keyword);
		}
	}

	public boolean contains(String keyword) {

		return keywordMap.containsKey(keyword);
	}

	public SqmlKeyword get(String keywordText) {

		return keywordMap.get(keywordText);
	}
}
