package com.ito.assignment2.program4;

import java.util.Comparator;

public class SortByDept implements Comparator<StudentId>{

	SortById id = new SortById();
	@Override
	public int compare(StudentId o1, StudentId o2) {
		String dept1 = o1.deptCode;
		String dept2 = o2.deptCode;
		if(dept1 == dept2) {
			return id.compare(o1, o2);
		}else
		return dept1.compareTo(dept2);
	}

}
