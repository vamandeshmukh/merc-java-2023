package com.merc.demo.day1.oop;


public class ClassDemo {
	
	public static void main(String[] args) {
		
//		Employee emp = new Employee();		
//		Employee emp2 = new Employee(101, "Sonu", 90000);
//		Employee emp3 = new Employee(102, "Monu");
//		
//		System.out.println(emp.toString());
//		System.out.println(emp2.toString());
//		System.out.println(emp3.toString());
		
		Employee emp1 = new Employee(101, "Sonu", 90000);
		Employee emp2 = new Employee(101, "Sonu", 90000);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp1.equals(emp2));

	}

}
