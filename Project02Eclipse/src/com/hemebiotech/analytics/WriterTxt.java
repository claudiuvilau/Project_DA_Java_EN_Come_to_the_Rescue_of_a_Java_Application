package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Claudiu VILAU
 *
 */
public class WriterTxt implements ISymptomWriter {

	private String filepath_out;

	/**
	 * 
	 * @param filepath
	 */
	public WriterTxt(String filepath) {
		this.filepath_out = filepath;
	}

	@Override
	public Map<String, Integer> WriteSymptoms(Map fonction_list_map) {
		try {
			FileWriter writer = new FileWriter(filepath_out);
			Map<String, Integer> list_ordered = new HashMap<String, Integer>();
			list_ordered = fonction_list_map;

			for (Map.Entry<String, Integer> listordered : list_ordered.entrySet()) {
				writer.write(listordered.getKey() + "=" + listordered.getValue() + "\n");
			}
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
