package org.college;

public class College {

	protected void collegeName() {
	
		System.out.println("college name is: Alpha");

	}

	static void collegeCode() {
		System.out.println("College code is Black color");

	}
	 void collegeRank() {
	 System.out.println("College rank is: 108");

	}
	 
	 
	 public void javat() {
		 
		 System.out.println(10+20+"Java");
		 System.out.println("Java"+10+20);
	 }
	 
	 
	public static void main(String[] args) {
		
		College c = new College();
		Student s = new Student();
		//Hostel h = new Hostel();
		Dept d = new Dept();
		
		c.javat();
		c.collegeCode();
		c.collegeName();
		//c.collegeRank();
		s.studentName();
		s.studentId();
		s.studentDept();
		//h.hostelName();
		d.deptName();
		
	}
	
}
