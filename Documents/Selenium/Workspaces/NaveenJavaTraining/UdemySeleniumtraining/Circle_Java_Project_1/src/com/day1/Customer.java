package com.day1;

public class Customer extends Person{
	
	String KYCdocument;
	
	public String getKYCdocument() {
		return KYCdocument;
	}
	public void setKYCdocument(String kYCdocument) {
		KYCdocument = kYCdocument;
	}
		
	public boolean validateAge(int age) {
		if (age >= 2 && age <= 75) {
			return true;
		}else {
			return false;
		}
	}
	private boolean validateKYCdocument(String KYCdocument) {
		if (KYCdocument.equalsIgnoreCase("Passport") || KYCdocument.equalsIgnoreCase("PANCard")) {
			return true;
		} else {
			System.out.println("KYC document error!! [Pancard or Passport only]");
			return false;
		}

	}
	


}
