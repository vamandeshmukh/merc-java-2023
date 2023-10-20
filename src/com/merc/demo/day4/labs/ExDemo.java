package com.merc.demo.day4.labs;

interface Inter {

	default void defaultMethod() {

	}
}

class Class1 implements Inter {

}

public class ExDemo {

	static void staticMethod() {

	}

	void nonStaticMethod() {

	}

	public static void main(String[] args) {

		Class1 obj = new Class1();
		obj.defaultMethod();
	}

}
