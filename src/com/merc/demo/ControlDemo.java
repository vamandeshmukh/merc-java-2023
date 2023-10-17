package com.merc.demo;

public class ControlDemo {
	
	public static void main(String[] args) {

		System.out.println("Control structure demo");
		
		int num = 4; // 1, 2, 3, 4, ...
		
		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;

		default:
			System.out.println("Other");
			break;
		}	
		
	}
}
