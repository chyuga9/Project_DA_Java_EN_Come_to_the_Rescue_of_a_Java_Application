package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SymptomsWriter {

	/*
	 * Creating file ("results.out") and writing on it each symptoms with its
	 * occurrences (sort alphabetically)
	 */
	public void sWriter(TreeMap<String, Integer> list) {

		try {
			// Creating file "results.out"
			File results = new File("results.out");
			// Writing in file "results.out"
			FileWriter fileWriter = new FileWriter("results.out");
			System.out.println("File created: " + results.getName());
			// Writing each element in the TreeMap, the key and the value
			for (Entry<String, Integer> entry : list.entrySet()) {
				fileWriter.write(entry + "\n");
			}
			fileWriter.close();
			System.out.println("Successfully written to the file.");
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}
}
