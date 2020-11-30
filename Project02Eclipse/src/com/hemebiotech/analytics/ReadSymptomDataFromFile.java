package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.List;

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

	public void SortSymptomsList(List<String> list) {
		Collections.sort(list);
		System.out.println();
		System.out.println(list);
	}

	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					System.out.println(line);
					line = reader.readLine();
				}
				System.out.println();
				System.out.println(result);
				reader.close();
				// Collections.sort(result);
				// System.out.println();
				// System.out.println(result);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
