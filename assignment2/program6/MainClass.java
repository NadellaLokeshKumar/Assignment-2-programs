package com.ito.assignment2.program6;

import java.time.LocalDate;
import java.time.Month;

public class MainClass {

	public static void main(String[] args) {
		DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 31));
		DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand db = new DateBand();
		if(db2.startDate.compareTo(db1.endDate) > 0) {
			try {
			throw new CustomException("NoOverlappingBandFound");
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else if(db1.endDate.compareTo(db1.startDate) < 0 || db2.endDate.compareTo(db2.startDate) < 0) {
			System.out.println("Not possible to compare, end date must be greater than start date");
		} else {
			DateBand db4 = db.findOverlappingBand(db1, db2);
			System.out.println(db4.startDate);
			System.out.println(db4.endDate);
			 }
	}
}
