/*WAP To convert any number to into words. The program will take input n as number (can be anything between 0 to 100000000) and print the words equivalent of it.
	input: 125
	output: One hundred twenty five
	
	input 2074
	output: Two thousand seventy four*/ 
	

package com.ito.assignment2.program1;

public class NumberToWords {

	static String singleDigits[] = {"", "one ", "two ", "three ", "four ", 
			"five ", "six ", "seven ", "eight ", 
			"nine ", "ten ", "eleven ", "twelve ", 
			"thirteen ", "fourteen ", "fifteen ", 
			"sixteen ", "seventeen ", "eighteen ", 
			"nineteen "}; 

	static String tenMultiples[] = {"", "", "twenty ", "thirty ", "fourty ", 
			"fifty ", "sixty ", "seventy ", "eighty ", 
			"ninety "}; 

	public static String conversion(int number) {
		String out = ""; 

		if(number == 0) {
			return "zero";
		}
		if(number > 100000000 || number < 0) {
			return "pass number in between (0 - 100000000)"; 
			}

		out = out + numToWords((int) (number / 10000000), "crore "); 
		out = out + numToWords((int) ((number / 100000) % 100), "lakh "); 
		out = out +  numToWords((int) ((number / 1000) % 100), "thousand "); 
		out = out + numToWords((int) ((number / 100) % 10), "hundred "); 
		out = out + numToWords((int) (number % 100), ""); 
		return out; 
	}

	static String numToWords(int n, String s) { 
		String str = ""; 

		if (n > 19) { 
			str = str + tenMultiples[n / 10] + singleDigits[n % 10]; 
		} else { 
			str = str + singleDigits[n]; 
		} 
		if (n != 0) { 
			str = str + s; 
		} 
		return str; 
	} 

	public static void main(String[] args) {
		int number = 100000000;
		System.out.println(conversion(number));
	}
}

