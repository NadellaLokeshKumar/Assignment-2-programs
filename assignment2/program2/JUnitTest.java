package com.ito.assignment2.program2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test1() throws Exception {
		DistinctWordsInFile words = new DistinctWordsInFile();
		 Map<String, Integer> file = words.distincWords();
		 assertEquals(3, file.get("I"));
	}
	
	@Test
	void test2() throws Exception {
		DistinctWordsInFile words = new DistinctWordsInFile();
		 Map<String, Integer> file = words.distincWords();
		 assertEquals(11, file.size());
	}

	@Test
	void test3() throws Exception {
		DistinctWordsInFile words = new DistinctWordsInFile();
		 Map<String, Integer> file = words.distincWords();
		 assertTrue(file.containsKey("programming"));
	}

}
