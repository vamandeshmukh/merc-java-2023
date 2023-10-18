package com.merc.demo.day2.abs;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		Hdfc bank1 = new Hdfc();
		bank1.deductTds();
		bank1.doKyc();
		bank1.payInterest();
		bank1.paySalary();
	}

}
