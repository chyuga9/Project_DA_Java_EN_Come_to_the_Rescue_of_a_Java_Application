package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

	public void SortSymptomsList(Map<String, Integer> list) {
		System.out.println();
		System.out.println(list);
	}

	public Map<String, Integer> GetSymptoms() {
		Map<String, Integer> result = new HashMap<String, Integer>();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();
				while (line != null) {
					if (!result.containsKey(line)) {
						result.put(line, 1);
						System.out.println(line);
						line = reader.readLine();
					} else {
						result.put(line, result.get(line) + 1);
						line = reader.readLine();
					}
				}
				System.out.println();
				System.out.println(result);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}
