package com.merc.demo.day4.design;

public class DesignDemo {

	public static void main(String[] args) {

		// Singleton

		Employee emp1 = Employee.getInstance();
		Employee emp2 = Employee.getInstance();

		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());

	}
}
