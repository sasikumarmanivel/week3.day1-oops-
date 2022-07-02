package org.system;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("student id is : "+id);
	}

	public void getStudentInfo(int id,String name)
	{
		System.out.println("student id :"+id+ " Student name :"+name);
	}
	
	public void getStudentInfo(String email,int phno)
	{
		System.out.println("student email id: "+email+ " phone number :"+phno);
	}

	public static void main(String[] args) {
		
	Students std = new Students();
	std.getStudentInfo(370285);
	std.getStudentInfo(370285, "Sasikumar");
	std.getStudentInfo("sasikumar@gmail.com", 848905865);
	
	}
	
}
