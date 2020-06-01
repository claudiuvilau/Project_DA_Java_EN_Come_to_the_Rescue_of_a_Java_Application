package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortList implements ISymptomSort {

	@Override
	public Map<String, Integer> sort_list(Map<String, Integer> fonction_list) {
		Map<String, Integer> fonctionlist = new HashMap<String, Integer>();
		fonctionlist = fonction_list;
		Map<String, Integer> tree_list_ordered = new TreeMap<String, Integer>(fonctionlist);
		return tree_list_ordered;
	}

}
