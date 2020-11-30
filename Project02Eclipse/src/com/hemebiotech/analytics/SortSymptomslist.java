package com.hemebiotech.analytics;

import java.util.Map;
//import java.util.List;
//import java.util.Map;
import java.util.TreeMap;

public class SortSymptomslist {

	public TreeMap<String, Integer> Sort(Map<String, Integer> list) {
		TreeMap<String, Integer> list1 = new TreeMap<>();
		list1.putAll(list);
		System.out.println(list1);
		System.out.println();
		// for (Map.Entry<String, Integer> entry : list1.entrySet());
		return list1;
	}
}
