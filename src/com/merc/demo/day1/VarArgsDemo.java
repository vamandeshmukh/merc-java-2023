package com.merc.demo.day1;

public class VarArgsDemo {

	static void addNums(int... args) {
		int sum = 0;
		for (int i : args) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		VarArgsDemo.addNums();
		VarArgsDemo.addNums(10, 20);
		VarArgsDemo.addNums(10, 20, 30, 40, 50);

	}

}
