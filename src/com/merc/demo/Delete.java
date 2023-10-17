package com.merc.demo;

public class Delete {

	static int addNums(int i, int j) {
		return i + j;
	}

	public static void main(String[] args) {

		int sum = Delete.addNums(10, 20);
//		int sum = addNums(10, 20); // Success has no shortcuts!

		System.out.println(sum);

	}

}
