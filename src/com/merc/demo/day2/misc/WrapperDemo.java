package com.merc.demo.day2.misc;

public class WrapperDemo {

	public static void main(String[] args) {

//		// byte short int long
////		int num = 2147483647; // 2.14 
//		int num = -2147483648; // 2.14 
//		System.out.println(num);
////		System.out.println(Integer.MAX_VALUE);		
//		byte b1 = 127;
//		System.out.println(b1);

//		byte - Byte, short - Short, int - Integer,  long - Long
//		float - Float, double - Double, 
//		char - Character 
//		boolean - Boolean 

//		int num = 10;
//		num.

//		Integer num = 10;

		String input = "10";
		String input2 = "20";
		String output; 
				
		Integer num1, num2, num3;
		num1 = Integer.parseInt(input);
		num2 = Integer.parseInt(input2);
		num3 = num1 + num2;
		output = num3.toString();
		
//		Integer.
//		Integer obj = 20;
//		obj.
		
		System.out.println(output);

	}

}
