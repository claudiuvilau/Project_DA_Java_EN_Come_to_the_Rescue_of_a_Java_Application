package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		try {

			List<String> myTxt_symptoms = new ArrayList<String>(); // create the list of the symptoms from the .txt
			String filepath_in = "Project02Eclipse/symptoms.txt";
			String filepath_out = "result.out";
			myTxt_symptoms = create_list(myTxt_symptoms, filepath_in); // end

			Map<String, Integer> list_ordered = new HashMap<String, Integer>();// create a list of the symptoms, no
																				// double,
																				// with the number of occurrences
			list_ordered = create_list_count(list_ordered, myTxt_symptoms); // end

			list_ordered = order_list(list_ordered);

			write_txt(list_ordered, filepath_out);

			success(filepath_out);

		} catch (FileNotFoundException e) {
			System.out.println("File not found / Le fichier spécifié (nom ou le chemin) est introuvable : " + e);
		} catch (Exception e) {
			System.out.println("err.001 : " + e);
		}
	}

	private static List create_list(List fonction_list, String filepath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(filepath));
		String line = reader.readLine();
		// create list of the symptoms
		List<String> myTxt_symptoms = new ArrayList<String>();
		while (line != null) {
			myTxt_symptoms.add(line);
			line = reader.readLine(); // get another symptom
		}
		reader.close();
		// the list of the .TXT is created
		return myTxt_symptoms;
	}

	private static Map create_list_count(Map fonction_list_map, List fonction_list) throws IOException {
		int nothing = 0; // manage the put in the list
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();

		List<String> myTxt_symptoms = new ArrayList<String>();
		myTxt_symptoms = fonction_list;

		for (String list1 : myTxt_symptoms) {
			if (nothing == 0) {
				list_ordered.put(list1, 0);
			}
			nothing = 1;
			for (Map.Entry<String, Integer> listordered : list_ordered.entrySet()) {
				if (listordered.getKey().contains(list1)) {
					listordered.setValue(listordered.getValue() + 1);
					nothing = 2;
				}
			}
			if (nothing == 1) {
				list_ordered.put(list1, 1);
			}
		}
		return list_ordered;
	}

	private static void write_txt(Map fonction_list_map, String filepath) throws IOException {
		FileWriter writer = new FileWriter(filepath);
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		list_ordered = fonction_list_map;
		for (Map.Entry<String, Integer> listordered : list_ordered.entrySet()) {
			writer.write(listordered.getKey() + "=" + listordered.getValue() + "\n");
		}
		writer.close();
	}

	private static Map order_list(Map fonction_list_map) {
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		list_ordered = fonction_list_map;
		Map<String, Integer> tree_list_ordered = new TreeMap<String, Integer>(list_ordered);
		return tree_list_ordered;
	}

	private static void success(String filepath) {
		System.out.println("The file " + filepath + " is generated with success !");
	}
}
