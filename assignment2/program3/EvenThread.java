package com.ito.assignment2.program3;

public class EvenThread implements Runnable{
	
	EvenOdd eo;
	
	public EvenThread(EvenOdd eo) {
		super();
		this.eo = eo;
	}

	@Override
	public void run() {
		eo.even();
	}
}
