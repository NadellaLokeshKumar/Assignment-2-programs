package com.ito.assignment2.program4;

public class StudentDetail {

	public StudentId studentId;
	public String firstName;
	public String lastName;
	public int age;
	public String deptName;
	public String courseName;
	
	public StudentDetail(StudentId studentId, String firstName, String lastName, int age, String deptName,
			String courseName) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.deptName = deptName;
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "StudentDetail [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + ", deptName=" + deptName + ", courseName=" + courseName + "]";
	}
}
