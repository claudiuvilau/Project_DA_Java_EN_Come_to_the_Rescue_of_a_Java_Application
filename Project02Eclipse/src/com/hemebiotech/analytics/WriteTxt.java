package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteTxt {

	public static void write_txt(Map fonction_list_map, String filepath) throws IOException {
		FileWriter writer = new FileWriter(filepath);
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();
		list_ordered = fonction_list_map;
		for (Map.Entry<String, Integer> listordered : list_ordered.entrySet()) {
			writer.write(listordered.getKey() + "=" + listordered.getValue() + "\n");
		}
		writer.close();
	}

}
