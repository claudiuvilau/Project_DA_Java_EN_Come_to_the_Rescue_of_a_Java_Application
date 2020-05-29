package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapTxt {

	public static Map create_list_count(Map fonction_list_map, List fonction_list) throws IOException {
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

	public static Map order_list(Map fonction_list_map) {
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		list_ordered = fonction_list_map;
		Map<String, Integer> tree_list_ordered = new TreeMap<String, Integer>(list_ordered);
		return tree_list_ordered;
	}

}
