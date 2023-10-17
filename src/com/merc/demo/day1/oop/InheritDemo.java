package com.merc.demo.day1.oop;

class Animal {

	void sound() {
		System.out.println("Produce sound");
	}

	void numberOfLegs() {

	}

}

class Cat extends Animal {

	@Override
	void sound() {
		System.out.println("Produce sound = mew");
	}
}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("Produce sound = bark");
	}
}

class Cow extends Animal {

}

public class InheritDemo {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.sound();

		Dog dog1 = new Dog();
		dog1.sound();

		Cow cow1 = new Cow();
		cow1.sound();

	}

}
