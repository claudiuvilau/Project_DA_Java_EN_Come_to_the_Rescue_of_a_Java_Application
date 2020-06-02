package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Claudiu VILAU
 *
 */
public class AnalyticsCounter {

	public static void main(String args[]) {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();

		String filepath_in = "Project02Eclipse/symptoms.txt";
		List<String> myTxt_symptoms = new ArrayList<String>();
		ReadSymptomDataFromFile readDataFromFile = new ReadSymptomDataFromFile(filepath_in);
		myTxt_symptoms = readDataFromFile.GetSymptoms();

		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		OccurrenceList list_from_txt = new OccurrenceList(myTxt_symptoms);

		list_ordered = list_from_txt.occurrence_list(myTxt_symptoms, list_ordered);

		SortList sortlist_obj = new SortList();
		list_ordered = sortlist_obj.sort_list(list_ordered);

		String filepath_out = "result.out";

		WriterTxt wrt_txt = new WriterTxt(filepath_out);
		wrt_txt.WriteSymptoms(list_ordered);

		success(filepath_out);
	}

	/**
	 * 
	 * @param filepath_out
	 */
	private static void success(String filepath_out) {
		System.out.println("The file " + filepath_out + " is generated with success ! ");

	}
}
