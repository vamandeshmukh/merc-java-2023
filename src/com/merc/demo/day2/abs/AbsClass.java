package com.merc.demo.day2.abs;

interface SomeInterface {

	public abstract void absMethod();

	public abstract void absMethod2();

	public static void staticMethod() {
		System.out.println("static method");
	}

	public default void defaultMethod() {
		System.out.println("default method");
	}
}

interface IncomeTax {

	public abstract void deductTds();

}

interface FinMin {

//	void paySalary();
	public abstract void paySalary();

}

abstract class Rbi {

	abstract void doKyc();

	void payInterest() {
		System.out.println("Pay interest on deposts");
	}
}

class Hdfc extends Rbi implements FinMin, IncomeTax {

	@Override
	void doKyc() {
		System.out.println("Kyc with Aadhaar");
	}

	@Override
	public void paySalary() {
		System.out.println("Salary being paid in time");
	}

	@Override
	public void deductTds() {
		System.out.println("10% TDS is deducted");

	}
}

class Icici extends Rbi {

	@Override
	void doKyc() {
		System.out.println("Kyc with Pan card");
	}
}

public abstract class AbsClass {

	public void concreteMethod() // what
	{ // how
		// code
	}

	public abstract void abstractMethod(); // what

}
