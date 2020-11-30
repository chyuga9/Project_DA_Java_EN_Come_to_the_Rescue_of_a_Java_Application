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
	 * occurrences
	 */
	public void SWriter(TreeMap<String, Integer> list) {

		try {
			File results = new File("results.out");
			if (results.createNewFile()) {
				FileWriter fileWriter = new FileWriter("results.out");
				System.out.println("File created: " + results.getName());
				for (Entry<String, Integer> entry : list.entrySet()) {
					fileWriter.write(entry + "\n");
				}
				fileWriter.close();
				System.out.println("Successfully wrote to the file.");
			} else {
				System.out.println("File alreadey exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

	}
}
