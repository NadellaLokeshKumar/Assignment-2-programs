package com.ito.assignment2.program6;

import java.time.LocalDate;

public class DateBand {

	public LocalDate startDate;
	public LocalDate endDate;
	public DateBand() {}
	public DateBand(LocalDate startDate, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}
	LocalDate finalStart;
	LocalDate finalEnd;
	public DateBand findOverlappingBand(DateBand db1, DateBand db2){
		int startDifference = db1.startDate.compareTo(db2.startDate);
		int endDifference = db1.endDate.compareTo(db2.endDate);
		if(startDifference < 0) {
			finalStart = db2.startDate;
			if(endDifference < 0) {
				finalEnd = db1.endDate;
			} else {
				finalEnd = db2.endDate;
			}
		} else {
			finalStart = db1.startDate;
			if(endDifference < 0) {
				finalEnd = db1.endDate;
			} else {
				finalEnd = db2.endDate;
			}
		}
		DateBand db3 = new DateBand(finalStart, finalEnd);
		return db3;	
	}
}
