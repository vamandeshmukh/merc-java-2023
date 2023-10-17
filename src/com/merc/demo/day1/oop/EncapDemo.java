package com.merc.demo.day1.oop;

class Bank {

	// fields - characteristics
	int accNo;
	private double balance;

	// methods - functionalities
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

public class EncapDemo {

	public static void main(String[] args) {

		Bank obj = new Bank();
		obj.accNo = 101;
//		obj.balance = 100;
//		System.out.println(obj.balance);
//		obj.balance = 150;
//		System.out.println(obj.balance);
		
		System.out.println(obj.getBalance());
		obj.setBalance(100);
		System.out.println(obj.getBalance());
		obj.setBalance(150);
		System.out.println(obj.getBalance());

	}
}
