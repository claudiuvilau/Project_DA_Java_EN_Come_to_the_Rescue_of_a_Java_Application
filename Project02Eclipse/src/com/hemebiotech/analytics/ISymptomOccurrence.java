package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomOccurrence {
	/**
	 * 
	 * @param myTxt_symptoms2
	 * @param list_ordered2
	 * @return
	 */
	Map<String, Integer> occurrence_list(List<String> myTxt_symptoms2, Map<String, Integer> list_ordered2);

}
