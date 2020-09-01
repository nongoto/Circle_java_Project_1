package com.day1;

public class Person {

	String name;
	String address;
	int age;
	String contactNumber;
	String emailAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean validateAddress(String address) {
		int lenght = address.length();
		if(lenght >= 10 && lenght <= 250) {
			return true;
		}else {
			return false;
		}
		
//		public boolean validateEmailAddress(String emailAddress) {
//			if(emailAddress.contains(CharSequence)) {
//				return true;
//			}
//				else {
//					return false;
//				}
//			}
		
	}

}
