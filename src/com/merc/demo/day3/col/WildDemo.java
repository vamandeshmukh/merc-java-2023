package com.merc.demo.day3.col;

import java.util.ArrayList;
import java.util.List;

import com.merc.demo.day1.oop.Employee;
import com.merc.demo.day2.col.Blog;

public class WildDemo {

	static void printList(List<?> list) {
		// code to print list elements 
	}

	static void printList2(List<? extends Employee> list) {
		// code to print list elements 
	}

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();
		WildDemo.printList(blogList);

		List<Employee> empList = new ArrayList<>();
		WildDemo.printList(empList);

	}

}
