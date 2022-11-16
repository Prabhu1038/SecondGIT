package org.phone;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("Phone Name is: Oneplus");

	}
	private void phoneIMEI() {

		System.out.println("IMEI: 989876765656");

	}
	private void camera() {
		System.out.println("camera spec = 48MP");

	}
	private void storage() {

		System.out.println("Storage is: 48 gb");

	}
	private void osName() {
		System.out.println("OS Name is: Iphone");
	}
	public static void main(String[] args) {
	
		PhoneInfo ph = new PhoneInfo();
		ph.phoneName();
		ph.phoneIMEI();
		ph.camera();
		ph.storage();
		ph.osName();
	}
}
