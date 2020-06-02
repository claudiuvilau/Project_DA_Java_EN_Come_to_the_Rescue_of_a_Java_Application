package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
	/**
	 * 
	 * @param fonction_list_map
	 * @return
	 * @throws IOException
	 */
	Map<String, Integer> WriteSymptoms(Map fonction_list_map) throws IOException;

}
