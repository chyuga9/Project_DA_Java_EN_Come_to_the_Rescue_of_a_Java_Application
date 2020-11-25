package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public Writer(String truc) {

		try {
			File results = new File("results.out");
			if (results.createNewFile()) {
				System.out.println("File created: " + results.getName());
				FileWriter fileWriter = new FileWriter("results.out");
				fileWriter.write(truc);
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