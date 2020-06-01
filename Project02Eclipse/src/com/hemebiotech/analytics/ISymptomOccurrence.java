package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface ISymptomOccurrence {

	Map<String, Integer> occurrence_list(List<String> myTxt_symptoms2, Map<String, Integer> list_ordered2);

}
