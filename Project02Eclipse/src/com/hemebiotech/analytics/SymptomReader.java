package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SymptomReader {
	String ah = "jijio";

	public SymptomReader(String filepath) {

		try {

			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();
			ArrayList<String> tabsymptoms = new ArrayList<>();
			ArrayList<Symptoms> listsymptoms = new ArrayList<>();
			Symptoms symptom = null;
			while (line != null) {
				// System.out.println(line);

				if (!tabsymptoms.contains(line)) {

					symptom = new Symptoms(line, 1);
					listsymptoms.add(symptom);
					tabsymptoms.add(line);

				} else {
					for (Symptoms l : listsymptoms) {
						if (l.getSname().equals(line)) {
							l.snboccurence++;
						}
					}
				}
				line = reader.readLine();

			}

			reader.close();

			Collections.sort(listsymptoms);
			for (Symptoms l : listsymptoms) {
				System.out.println(l.getSname() + "=" + l.getSnboccurence());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
