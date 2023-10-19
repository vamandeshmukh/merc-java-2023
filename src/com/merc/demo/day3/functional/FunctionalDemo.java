package com.merc.demo.day3.functional;

public class FunctionalDemo {

	public static void main(String[] args) {

		System.out.println("1. Use an abstract method in an interface by overriding it in a concrete class:");
		FunClass funClass = new FunClass();
		funClass.funMethod();
		System.out.println("2. Use an abstract method in an interface by overriding it in an anonymous inner class:");
		System.out.println("... self learning");
		System.out.println("3. Use an abstract method in a (functional) interface by lambda expression:");

		FunInterface obj = () -> {
			System.out.println("fun method implemented by lambda expression");
		};
		obj.funMethod();
	}

}
