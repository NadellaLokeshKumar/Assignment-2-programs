package com.ito.assignment2.program1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test1() {
		String word1 = NumberToWords.conversion(100000000);
		assertEquals("ten crore ", word1);
	}
	
	@Test
	void test2() {
		String word2 = NumberToWords.conversion(-101);
		assertEquals("pass number in between (0 - 100000000)", word2);
	}
	
	@Test 
	void test3() {
		String word3 = NumberToWords.conversion(100000001);
		assertEquals("pass number in between (0 - 100000000)", word3);
	}

}
