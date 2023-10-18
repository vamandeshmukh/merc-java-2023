package com.merc.demo.day2.ex;

public class ThrowDemo {

	static void checkAge(int age) {
		if (age >= 18) {
			System.out.println("Drive cars");
		} else {
			throw new RuntimeException("You can not drive!");
		}
	}

	public static void main(String[] args) {

		try {
			ThrowDemo.checkAge(17);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
