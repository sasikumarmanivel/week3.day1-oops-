package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("Sasikumar");
	}
	
	public void studentDept()
	{
		System.out.println("cs");
	}
	
	public void studentId()
	{
		System.out.println("13cso038");
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.studentName();
		st.studentDept();
		st.studentId();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptNmae();
	}
	
	
}
