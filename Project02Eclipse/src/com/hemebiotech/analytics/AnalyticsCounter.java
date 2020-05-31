package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		try {
			String filepath_in = "Project02Eclipse/symptoms.txt"; // the path of the file .txt of symptoms and the name
																	// of the
			// file
			String filepath_out = "result.out"; // the path of the file .txt of symptoms and the name
												// of the
			List<String> myTxt_symptoms = new ArrayList<String>(); // create the list of the symptoms from the .txt

<<<<<<< HEAD
			ListTxt list_from_txt = new ListTxt(); // object ListTxt - class ListTxt
			myTxt_symptoms = list_from_txt.create_list(myTxt_symptoms, filepath_in); // list created

			Map<String, Integer> list_ordered = new HashMap<String, Integer>();// create a list of the symptoms, no
																				// double,
																				// with the number of occurrences
			MapTxt map_txt = new MapTxt(); // object MapTxt - class MapTxt
			list_ordered = map_txt.create_list_count(list_ordered, myTxt_symptoms); // end counts of the occurrences
			list_ordered = map_txt.order_list(list_ordered); // sort the list by key, so by symptom
=======
		AnalyticsCounter analyticsCounter = new AnalyticsCounter();
		String filepath_in = "Project02Eclipse/symptoms.txt"; // the path of the file .txt of symptoms and the name
		List<String> myTxt_symptoms = new ArrayList<String>(); // create the list of the symptoms from the .txt
		ReadSymptomDataFromFile readDataFromFile = new ReadSymptomDataFromFile(filepath_in);
		myTxt_symptoms = readDataFromFile.GetSymptoms();
>>>>>>> stash

			WriteTxt wrt_txt = new WriteTxt(); // object WriteTxt - class WriteTxt
			wrt_txt.write_txt(list_ordered, filepath_out); // create the file of the results : result.txt

			success(filepath_out);

		} catch (FileNotFoundException e) {
			System.out.println("File not found / Le fichier spécifié (nom ou le chemin) est introuvable : " + e);
		} catch (Exception e) {
			System.out.println("err.001 : " + e);
		}
	}

	private static void success(String filepath) {
		System.out.println("The file " + filepath + " is generated with success !");
	}

}
