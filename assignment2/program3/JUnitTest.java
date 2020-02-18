package com.ito.assignment2.program3;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void test1() {
		EvenOdd eo = new EvenOdd(1, 100);
		Thread even = new Thread(new EvenThread(eo));
		assertFalse(even.isAlive());
	}
	
	@Test
	public void test2() {
		EvenOdd eo = new EvenOdd(1, 100);
		Thread even = new Thread(new EvenThread(eo));
		assertFalse(even.isInterrupted());
	}
	
	@Test
	public void test3() {
		EvenOdd eo = new EvenOdd(1, 100);
		Thread even = new Thread(new EvenThread(eo));
		assertEquals("Thread-3",even.getName());
	}
	
	@Test
	public void test4() {
		EvenOdd eo = new EvenOdd(1, 100);
		Thread even = new Thread(new EvenThread(eo));
		assertEquals("Thread[main,5,main]", even.currentThread().toString());
	}

}
