package org.company;

public class CompanyInfo {

	public void companyName() {
		System.out.println("Equiniti India");

	}

	void companyId() {

		System.out.println("Company ID is: 87876");
	}

	protected void companyAddress() {
		System.out.println("Company Address is : Ramaburam");

	}

	public static void main(String[] args) {

		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();

	}




}
