package com.day1;

public class Bank {

	// Member variables
	private int contactNumber;
	private boolean isWorking;
	private float rateOfInterest;
	private double carLoanRateOfInterest;
	private char IFSC = 'V';
	private String bankName;
	Employee employee;

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getCarLoanRateOfInterest() {
		return carLoanRateOfInterest;
	}

	public void setCarLoanRateOfInterest(double carLoanRateOfInterest) {
		this.carLoanRateOfInterest = carLoanRateOfInterest;
	}

	public char getIFSC() {
		return IFSC;
	}

	public void setIFSC(char iFSC) {
		IFSC = iFSC;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// Methods ...... Member functions
	public String createAccount(String KYCDocument, char accountType) {

		Account userAccount = new Account();
		String accountNumber = userAccount.createAccoount(KYCDocument, accountType);
		if (accountNumber.equalsIgnoreCase("0")) {
			System.out.println("Error!...[Account does not exist]");
			return null;
		} else {

			return accountNumber;
		}
	}

	public int withdrawMoney(int amount) {
		System.out.println("Processing..............");
		int bankBalance = 10000;
		if (amount > bankBalance) {
			System.out.println("Invalid amount!! Please check your balance");
		} else {
			if (amount > 0) {
				bankBalance = bankBalance - amount;
				return bankBalance;
			} else {
				System.out.println("Invalid amount!! [Cannot enter negative amount]");
			}
		}
		return 0;
	}
	
	// adding employee to the bank
	public void addEmployee(String name, String address, String emailAddress, String designation, String contactNumber, int age) {
		employee = new Employee();
		employee.setName(name);
		employee.setAddress(address);
		employee.setAge(age);
		employee.setContactNumber(contactNumber);
		employee.setDesignation(designation);
		employee.setEmailAddress(emailAddress);
		System.out.println("Employee added successfully!!");
	}
	
	public void getEmployeeDetails() {
		
		employee.printAllDetails();
	}

}
