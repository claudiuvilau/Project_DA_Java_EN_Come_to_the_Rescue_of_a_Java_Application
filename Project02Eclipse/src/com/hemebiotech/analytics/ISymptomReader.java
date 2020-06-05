package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomReader {
	/**
	 * read the file .txt and the creation a list with the symptoms
	 * 
	 * @return
	 */
	List<String> GetSymptoms();
}
