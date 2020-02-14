package com.ito.assignment2.program4;

import java.util.Comparator;

public class SortByYear implements Comparator<StudentId> {
	
	SortByDept dept = new SortByDept();
	@Override
	public int compare(StudentId o1, StudentId o2) {
		Integer year1 = o1.year;
		Integer year2 = o2.year;
		if(year1 == year2) {
			return dept.compare(o1, o2);
		} else 
		return year1.compareTo(year2);
	}

}
