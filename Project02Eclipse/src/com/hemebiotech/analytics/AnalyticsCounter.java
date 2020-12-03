package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {
	/**
	 * Main class
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		/**
		 * Reading the file "symptoms.txt" with ReadSymptomDataFromFile instantiation
		 */
		ReadSymptomDataFromFile liseur = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		/**
		 * All the symptoms and their occurence put in map
		 */
		Map<String, Integer> map = liseur.getSymptoms();
		/**
		 * TreeMap sorts alphabetically map
		 */
		TreeMap<String, Integer> trieur = liseur.sort(map);
		/**
		 * Writing symptoms and their occurrence, sorted alphabetically, in
		 * "results.out" file
		 */
		SymptomsWriter scribe = new SymptomsWriter();
		scribe.sWriter(trieur);
	}
}
