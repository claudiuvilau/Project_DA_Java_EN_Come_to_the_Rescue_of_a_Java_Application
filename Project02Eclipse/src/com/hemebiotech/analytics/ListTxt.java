package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListTxt {

	public static List create_list(List fonction_list, String filepath) throws IOException {
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

}
