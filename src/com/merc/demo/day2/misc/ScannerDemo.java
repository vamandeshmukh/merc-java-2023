package com.merc.demo.day2.misc;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your name:");
		String userName = sc.next();
		System.out.println("Hi " + userName + "!");
		System.out.println("Please enter your employee id:");
		int eid = sc.nextInt();
		System.out.println("Employee id: " + eid);
		System.out.println("Please enter your salary:");
		double salary = sc.nextDouble();
		System.out.println("Salary: " + salary);
		
		sc.close();

	}

}
