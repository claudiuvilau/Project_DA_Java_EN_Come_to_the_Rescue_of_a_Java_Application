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

		SortList sortlist_obj = new SortList();
		myTxt_symptoms = sortlist_obj.sort_list(myTxt_symptoms);
		System.out.println("Ma liste triée est : " + myTxt_symptoms);

 		List<String> myTxt_symptoms = new ArrayList<String>();
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		OccurrenceList list_from_txt = new OccurrenceList(myTxt_symptoms);

		list_ordered = list_from_txt.occurrence_list(myTxt_symptoms, list_ordered);


	}

}
