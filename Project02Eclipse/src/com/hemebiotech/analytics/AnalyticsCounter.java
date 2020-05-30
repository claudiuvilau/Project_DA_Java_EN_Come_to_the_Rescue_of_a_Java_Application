package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) {

		AnalyticsCounter analyticsCounter = new AnalyticsCounter();

		String filepath_out = "result.out";

		WriterTxt wrt_txt = new WriterTxt(filepath_out);
		Map<String, Integer> list_ordered = new HashMap<String, Integer>();

		wrt_txt.WriteSymptoms(list_ordered);

		success(filepath_out);

	}

	private static void success(String filepath_out) {
		System.out.println("The file " + filepath_out + " is generated with success ! ");
	}

}
