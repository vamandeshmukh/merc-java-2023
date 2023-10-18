package com.merc.demo.day2.ex;

public class ExDemo {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 0; // do not enter 0
		int num3;

		try {
			num3 = num1 / num2;
		} 
		catch (ArithmeticException ex) {
			System.out.println("Do not divide by 0.");
			num3 = 0;
		}
		finally {
			System.out.println("finally done");
		}

		System.out.println(num3);

	}

}
