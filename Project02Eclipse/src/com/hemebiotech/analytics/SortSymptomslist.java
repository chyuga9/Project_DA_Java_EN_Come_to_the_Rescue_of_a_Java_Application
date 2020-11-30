package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class SortSymptomslist {
	/*
	 * Sorting alphabetically Map (=array with symptoms).
	 */
	public TreeMap<String, Integer> Sort(Map<String, Integer> list) {
		TreeMap<String, Integer> list1 = new TreeMap<>();
		list1.putAll(list);
		return list1;
	}
}
