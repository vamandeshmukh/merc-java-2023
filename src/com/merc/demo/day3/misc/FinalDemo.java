package com.merc.demo.day3.misc;

// final class - can not be extended 
//final class Animal {
class Animal {

	// final field / variable - can not be reassigned another value
//	final int TIMES = 2;
	int times = 2;

	public void eatFood() {
		final int numberOfLegs = 4;
		System.out.println(numberOfLegs);
//		numberOfLegs = 2; // not possible 
//		System.out.println(numberOfLegs);		
		times = 3;
		System.out.println("Eat food " + times + " times");
	}

//  final method - can not be overridden 
//	public final void eatFood() {
//		System.out.println("Eat food");
//	}
}

class Cat extends Animal {

//	@Override
//	public void eatFood() {
//		System.out.println("Eat non veg food");
//	}
}

public class FinalDemo {

	public static void main(String[] args) {

		Cat cat = new Cat();
		cat.eatFood();

	}

}
