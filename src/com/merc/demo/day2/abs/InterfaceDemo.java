package com.merc.demo.day2.abs;

class ConcreteClass implements SomeInterface  {

	@Override
	public void absMethod() {
		System.out.println("abstract method 1");
	}

	@Override
	public void absMethod2() {
		System.out.println("abstract method 2");
	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
//		Hdfc bank1 = new Hdfc();
//		bank1.deductTds();
//		bank1.doKyc();
//		bank1.payInterest();
//		bank1.paySalary();
		
		ConcreteClass obj = new ConcreteClass();
		obj.absMethod();
		obj.absMethod2();
		obj.defaultMethod();
		SomeInterface.staticMethod();
		
	}

}
