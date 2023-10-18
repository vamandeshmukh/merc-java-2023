package com.merc.demo.day2.misc;

import java.util.Random;

public class RandomDemo {

	public static void randomNums() {
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
//			int num = random.nextInt();
			int num = random.nextInt(100); // specify range 0 - 100 
			System.out.println(num);
		}
	}

	public static void main(String[] args) {

//		Random random = new Random();
//		int num = random.nextInt();
//		System.out.println(num);
		
		RandomDemo.randomNums();

	}

}
