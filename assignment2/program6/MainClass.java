/*Consider below class 
		class name: DateBand 
		Fields: 	
				startDate 	(LocalDate)
				endDate		(LocalDate)

	a. Implement below method to find out overlapping dates between two DateBand objects.
	b. If there is no overlapping dates between two objects, it should throw a custom exception "NoOverlappingBandFound"

	c. Write at least 5 Junit test cases(of different scenarios) to test above program.*/

package com.ito.assignment2.program6;

import java.time.LocalDate;
import java.time.Month;

public class MainClass {

	public static void main(String[] args) throws CustomException {
		DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 31));
		DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand db = new DateBand();
		DateBand db4 = db.findOverlappingBand(db1, db2);
		System.out.println(db4);
	}
}
