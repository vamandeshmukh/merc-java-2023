package com.merc.demo.day1.oop;


class Body {
	
	int muscles;
	
	void workout() {

	}	
	
	
}


class Bank {
	
	// fields - characteristics 
	int accNo;
	private double balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// methods - functionalities 
	
	
	
}

public class EncapDemo {

	public static void main(String[] args) {

		Bank obj = new Bank();
		obj.accNo = 101;
		obj.balance = 100;
		System.out.println(obj.balance);
		obj.balance = 150;
		System.out.println(obj.balance);

	}
}
