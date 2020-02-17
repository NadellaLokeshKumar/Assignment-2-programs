package com.ito.assignment2.program3;

public class EvenOdd {

	static String singleDigits[] = {"", "one ", "two ", "three ", "four ", 
			"five ", "six ", "seven ", "eight ", 
			"nine ", "ten ", "eleven ", "twelve ", 
			"thirteen ", "fourteen ", "fifteen ", 
			"sixteen ", "seventeen ", "eighteen ", 
	"nineteen "}; 

	static String tenMultiples[] = {"", "", "twenty ", "thirty ", "fourty ", 
			"fifty ", "sixty ", "seventy ", "eighty ", 
	"ninety "}; 
	static String str = "hundred";
	static String doubleDigit;

	int start, last;
	public EvenOdd(int start, int last) {
		this.start = start;
		this.last = last;
	}
	public void even() {
		if(last > 100 || last < 1 || start < 1) {
			System.out.println("enter the last number from 1 to 100 only");
		} else {
			while(this.start <= this.last) {
				synchronized (this) {
					if(this.start%2 == 0) {
						if(start < singleDigits.length) {
							System.out.println(Thread.currentThread().getName() + singleDigits[start]);
						} else if(start > 19 && start < 100) {
							doubleDigit = tenMultiples[start / 10] + singleDigits[start % 10]; 
							System.out.println(Thread.currentThread().getName() + doubleDigit);
						} else if(start == 100)
							System.out.println(Thread.currentThread().getName() + str);
						start++;
						this.notify();
					}else {
						try {
							this.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
	public void odd() {
		if(last > 100 || last < 1 || start < 1) {
			System.out.println("enter the last number from 1 to 100 only");
		} else {
			while(this.start <= this.last) {
				synchronized (this) {
					if(this.start%2 != 0) {
						if(start < singleDigits.length) {
							System.out.println(Thread.currentThread().getName() + singleDigits[start]);
						} else if(start > 19 && start < 100) {
							doubleDigit = tenMultiples[start / 10] + singleDigits[start % 10]; 
							System.out.println(Thread.currentThread().getName() + doubleDigit);
						} else if(start == 100)
							System.out.println(Thread.currentThread().getName() + str);
						start++;
						this.notify();
					}else {
						try {
							this.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
