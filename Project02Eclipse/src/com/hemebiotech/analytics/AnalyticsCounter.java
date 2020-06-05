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

		// the path and the name of the file .txt
		String filepath_in = "Project02Eclipse/symptoms.txt";

		// read the file .txt and the creation a list with the symptoms
		List<String> myTxt_symptoms = new ArrayList<String>();
		ReadSymptomDataFromFile readDataFromFile = new ReadSymptomDataFromFile(filepath_in);
		myTxt_symptoms = readDataFromFile.GetSymptoms();

		// create a HashMap with the symptoms and the occurrences
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		OccurrenceList list_from_txt = new OccurrenceList(myTxt_symptoms);
		list_ordered = list_from_txt.occurrence_list(myTxt_symptoms, list_ordered);

		// sort the list
		SortList sortlist_obj = new SortList();
		list_ordered = sortlist_obj.sort_list(list_ordered);

		// the name of the file resulted
		String filepath_out = "result.out";

		// write in the file
		WriterTxt wrt_txt = new WriterTxt(filepath_out);
		wrt_txt.WriteSymptoms(list_ordered);

		// message if the file is created
		success(filepath_out);
	}

	/**
	 * message if the file is created
	 * 
	 * @param filepath_out
	 * 
	 */
	private static void success(String filepath_out) {
		System.out.println("The file " + filepath_out + " is generated with success ! ");

	}
}
