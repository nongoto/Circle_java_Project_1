package com.day1;

public class Employee extends Person{

	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean validateAge(int age) {
		if (age >= 22 && age <= 45) {
			return true;
		}else {
			return false;
		}
	}

	public boolean validateDesignation(String designation) {
		if (designation.equalsIgnoreCase("Bank Manager") || designation.equalsIgnoreCase("support")
				|| designation.equalsIgnoreCase("support")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printAllDetails() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Email Address: " + getEmailAddress());
		System.out.println("Contact Number: " + getContactNumber());
		System.out.println("Designation: " + getDesignation());
	}

}
