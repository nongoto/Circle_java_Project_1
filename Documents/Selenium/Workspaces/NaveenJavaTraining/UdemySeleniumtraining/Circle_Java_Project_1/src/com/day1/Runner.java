package com.day1;

public class Runner {

	static Bank icici; 
	public static void main(String[] args) {
		Bank hdfc = new Bank();
		hdfc.setBankName("HDFC Bank");
		System.out.println("Welcome...."+hdfc.getBankName());
		int newBalance = hdfc.withdrawMoney(500);
		System.out.println("The new balance is: "+newBalance);
		

	}

}
