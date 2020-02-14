package com.ito.assignment2.program2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctWordsInFile {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lokesh Kumar Nadella\\Desktop\\Assignment2-file reading.txt"));
		String st = br.readLine();
		if(st != null) {
			st = st.replaceAll("[^a-zA-Z0-9 ]", "");    // using regular expressions.
			System.out.println(st);
			String[] words = st.split(" ");
			LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
			for (int i = 0; i < words.length; i++) {
				if(lhm.containsKey(words[i])) {
					lhm.put(words[i], lhm.get(words[i])+1);
				} else {
					lhm.put(words[i], 1);
				}
			}
			for (Map.Entry<String, Integer> string : lhm.entrySet()) {
				System.out.println(string.getKey()+"\t"+string.getValue());
			}
		}
	}
}
