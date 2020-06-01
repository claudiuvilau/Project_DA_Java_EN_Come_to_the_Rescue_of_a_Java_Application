package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;

public class AnalyticsCounter {

	public static void main(String args[]) {


		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		String filepath_in = "Project02Eclipse/symptoms.txt"; // the path of the file .txt of symptoms and the name
		List<String> myTxt_symptoms = new ArrayList<String>(); // create the list of the symptoms from the .txt
		ReadSymptomDataFromFile readDataFromFile = new ReadSymptomDataFromFile(filepath_in);
		myTxt_symptoms = readDataFromFile.GetSymptoms();

    List<String> liste = new ArrayList<String>();
		SortList sortlist_obj = new SortList();
		liste = sortlist_obj.sort_list(liste);


	}

}
