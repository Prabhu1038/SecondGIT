package org.client;
import org.college.College;
import org.college.Dept;
import org.college.Hostel;
import org.college.Student;

public class Client {
	public void clientName() {
		System.out.println("Client Name is: Phoenix");

	}
	
	  public void clientNumber() 
	  { 
		  System.out.println("client Number is: 9");
		  
		  System.out.println("Apple");
	  }
	 
	  
	  public static void main(String[] args) {
		
		  College c = new College();
			Student s = new Student();
			Hostel h = new Hostel();
			Dept d = new Dept();
			
			c.collegeCode();
			c.collegeName();
			c.collegeRank();
			s.studentName();
			s.studentId();
			s.studentDept();
			h.hostelName();
			d.deptName();

			
		  
	}
	  
	  

}
