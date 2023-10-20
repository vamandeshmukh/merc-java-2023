package com.merc.demo.day4.design;

// lazy loading 
public class Employee {

	private static Employee emp;

	private Employee() {
		super();
	}

	public static Employee getInstance() {
		if (null == emp)
			emp = new Employee();
		return emp;
	}
}

//eager loading / early loading
//package com.merc.demo.day4.design;
//
//public class Employee {
//
//	private static Employee emp = new Employee();
//
//	private Employee() {
//		super();
//	}
//
//	public static Employee getInstance() {
//		return emp;
//	}
//}
