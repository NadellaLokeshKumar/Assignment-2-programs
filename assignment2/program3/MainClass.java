package com.ito.assignment2.program3;

public class MainClass {

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd(1, 100);
		
		Thread even = new Thread(new EvenThread(eo));
		Thread odd = new Thread(new OddThread(eo));
		even.setName("Even Thread is running: ");
		odd.setName("Odd Thread is running: ");
		even.start();
		odd.start();
	}
}
