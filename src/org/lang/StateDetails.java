package org.lang;

public class StateDetails {
	private void southIndia() {
		System.out.println("southIndia");

	}
	private void northIndia() {
		System.out.println("North India");

	}
	public static void main(String[] args) {
	StateDetails sd = new StateDetails();
	LanguageInfo li = new LanguageInfo();
	li.tamilLanguage();
	li.englishLanguage();
	li.hindiLanguage();
	sd.southIndia();
	sd.northIndia();
	
	
	}
}
