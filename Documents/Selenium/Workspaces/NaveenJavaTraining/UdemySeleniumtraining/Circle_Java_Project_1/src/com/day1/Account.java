package com.day1;

public class Account {

	private char accountType;
	private String accountNumber;

	public String createAccoount(String KYCdocument, char accountType) {

		// KYCdocument(Passport or PANcard)
		// AccountType(S or C)
		if (validateKYCdocument(KYCdocument) && validateAccountType(accountType)) {
			accountNumber = accountType + "123123";
			return accountNumber;
		} else {
			System.out.println("Account cannot be created!!!!");
			return null;
		}
	}

	private boolean validateKYCdocument(String KYCdocument) {
		if (KYCdocument.equalsIgnoreCase("Passport") || KYCdocument.equalsIgnoreCase("PANCard")) {
			return true;
		} else {
			return false;
		}

	}

	private boolean validateAccountType(char accountType) {

		if (accountType == 'S' || accountType == 'C') {
			return true;
		} else {
			return false;
		}
	}

}
