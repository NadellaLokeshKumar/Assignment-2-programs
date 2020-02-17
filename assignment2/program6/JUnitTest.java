package com.ito.assignment2.program6;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test1() throws CustomException {
		DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 31));
		DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand db = new DateBand();
		DateBand db3 = db.findOverlappingBand(db1, db2);
		assertEquals(LocalDate.of(2020, Month.JANUARY, 15), db3.startDate);
		assertEquals(LocalDate.of(2020, Month.JANUARY, 31), db3.endDate);
	}
	
	@Test
	void test2() throws CustomException {
		DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 31), LocalDate.of(2020, Month.JANUARY, 1));
		DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 15), LocalDate.of(2020, Month.FEBRUARY, 20));
		DateBand db = new DateBand();
		DateBand db3 = db.findOverlappingBand(db1, db2);
		assertNull(db3);
	}
	
	@Test
	public void shouldRaiseAnException() throws CustomException {
	    Assertions.assertThrows(CustomException.class, () -> {
	    	DateBand db1 = new DateBand(LocalDate.of(2020, Month.JANUARY, 1), LocalDate.of(2020, Month.JANUARY, 15));
			DateBand db2 = new DateBand(LocalDate.of(2020, Month.JANUARY, 16), LocalDate.of(2020, Month.FEBRUARY, 20));
			DateBand db = new DateBand();
			DateBand db3 = db.findOverlappingBand(db1, db2);
	    });
	}
	
}
