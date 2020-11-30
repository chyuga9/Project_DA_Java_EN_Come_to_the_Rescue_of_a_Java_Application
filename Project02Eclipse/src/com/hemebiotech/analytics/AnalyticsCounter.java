package com.hemebiotech.analytics;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile liseur = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		liseur.GetSymptoms();
		SortSymptomslist trieur = new SortSymptomslist();
		trieur.Sort(liseur.GetSymptoms());
		SymptomsWriter ecriveur = new SymptomsWriter();
		ecriveur.SWriter(trieur.Sort(liseur.GetSymptoms()));
	}
}
