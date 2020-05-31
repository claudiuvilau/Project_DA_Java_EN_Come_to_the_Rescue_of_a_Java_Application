package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {

	Map<String, Integer> WriteSymptoms(Map fonction_list_map) throws IOException;

}
