package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SymptomsWriter {

	public void SWriter(TreeMap<String, Integer> list) {

		try {
			File results = new File("results.out");
			if (results.createNewFile()) {
				System.out.println("File created: " + results.getName());
				FileWriter fileWriter = new FileWriter("results.out");
				for (Entry<String, Integer> entry : list.entrySet()) {
					// String ju = l.getSname() + "=" + l.getSnboccurence();
					System.out.println(entry);
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
