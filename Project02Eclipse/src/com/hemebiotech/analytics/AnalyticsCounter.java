package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();

		List<String> myTxt_symptoms = new ArrayList<String>();
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		OccurrenceList list_from_txt = new OccurrenceList(myTxt_symptoms);

		list_ordered = list_from_txt.occurrence_list(myTxt_symptoms, list_ordered);

	}

}
