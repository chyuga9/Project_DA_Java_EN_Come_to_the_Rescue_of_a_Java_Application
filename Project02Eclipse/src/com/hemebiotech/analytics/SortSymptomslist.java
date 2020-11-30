package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class SortSymptomslist {

	public TreeMap<String, Integer> Sort(Map<String, Integer> list) {
		TreeMap<String, Integer> list1 = new TreeMap<>();
		list1.putAll(list);
		System.out.println(list1);
		System.out.println();
		return list1;
	}
}
