package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurrenceList implements ISymptomOccurrence {

	private List<String> fonction_list = new ArrayList<String>();

	public OccurrenceList(List fonction_list) {
		this.fonction_list = fonction_list;
	}

	@Override
	public Map<String, Integer> occurrence_list(List<String> myTxt_symptoms2, Map<String, Integer> list_ordered2) {

		List<String> myTxt_symptoms = new ArrayList<String>();
		myTxt_symptoms = fonction_list;
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		for (String list1 : myTxt_symptoms) {
			list_ordered.put(list1, Collections.frequency(myTxt_symptoms, list1));
		}

		return list_ordered;
	}

}
