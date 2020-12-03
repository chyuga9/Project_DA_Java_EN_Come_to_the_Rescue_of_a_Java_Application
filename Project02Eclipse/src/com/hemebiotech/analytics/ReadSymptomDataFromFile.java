package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Reading from the file indicated. Each string and their occurrences written in
	 * a Map
	 */
	public Map<String, Integer> getSymptoms() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();
				while (line != null) {
					if (!result.containsKey(line)) {
						result.put(line, 1);
						line = reader.readLine();
					} else {
						result.put(line, result.get(line) + 1);
						line = reader.readLine();
					}
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * TreeMap sorts alphabetically Map
	 */
	public TreeMap<String, Integer> sort(Map<String, Integer> list) {
		TreeMap<String, Integer> list1 = new TreeMap<>();
		list1.putAll(list);
		return list1;
	}

}
