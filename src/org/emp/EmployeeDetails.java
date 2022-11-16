package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class EmployeeDetails {
	public void empName() {
		System.out.println("Employee Name: Vikram");

	}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		Company c = new Company();
		Client cn = new Client();
		Project p = new Project();
		
		e.empName();
		c.companyName();
		cn.clientNumber();
		cn.clientName();
		p.projectName();
		
	}

}
