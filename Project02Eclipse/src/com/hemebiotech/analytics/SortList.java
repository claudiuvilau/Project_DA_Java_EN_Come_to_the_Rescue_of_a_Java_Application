package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList implements ISymptomSort {

	@Override
	public List sort_list(List fonction_list) {
		List<String> fonctionlist = new ArrayList<String>(fonction_list);
		Collections.sort(fonctionlist);
		return fonctionlist;
	}

}
