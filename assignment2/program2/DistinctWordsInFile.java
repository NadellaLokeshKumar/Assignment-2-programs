/* WAP to read a file and print distinct words in the file and number of occurrences of it. 
	for example, if below is the content of the file,*/ 

package com.ito.assignment2.program2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctWordsInFile {
	
	static LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
	
	public Map<String, Integer> distincWords() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lokesh Kumar Nadella\\Desktop\\Assignment2-file reading.txt"));
		String st = br.readLine();
		if(st != null) {
			st = st.replaceAll("[^a-zA-Z0-9 ]", "");    // using regular expressions.
			String[] words = st.split(" ");
			
			for (int i = 0; i < words.length; i++) {
				if(lhm.containsKey(words[i])) {
					lhm.put(words[i], lhm.get(words[i])+1);
				} else {
					lhm.put(words[i], 1);
				}
			}
		}
		return lhm;
	}
	public static void main(String[] args) throws Exception  {
		DistinctWordsInFile file = new DistinctWordsInFile();
		file.distincWords();
		for (Map.Entry<String, Integer> string : lhm.entrySet()) {
			System.out.println(string.getKey()+"\t"+string.getValue());
		}
	}
}
