package com.ito.assignment2.program4;

import java.util.Comparator;

public class SortById implements Comparator<StudentId>{

	@Override
	public int compare(StudentId o1, StudentId o2) {
		Integer id1 = o1.id;
		Integer id2 = o2.id;
		return id1.compareTo(id2);
	}

}
