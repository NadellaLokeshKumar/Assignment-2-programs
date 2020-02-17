package com.ito.assignment2.program4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test() {
		MainClass student = new MainClass();
		TreeMap<StudentId, StudentDetail> details = student.studentDetails();
		assertEquals(10, details.size());
	}
	
	@Test
	void test2() {
		MainClass student = new MainClass();
		TreeMap<StudentId, StudentDetail> details = student.studentDetails();
		assertEquals("StudentId [deptCode=CSE1, year=1, id=107]", details.firstKey().toString());
	}
	
	@Test
	void test3() {
		MainClass student = new MainClass();
		TreeMap<StudentId, StudentDetail> details = student.studentDetails();
		assertFalse(details.isEmpty());
	}

}
