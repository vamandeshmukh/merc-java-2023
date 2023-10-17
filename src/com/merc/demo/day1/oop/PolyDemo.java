package com.merc.demo.day1.oop;

class Calc {

	static void addNums(int i, int j) {
		System.out.println(i + j);
	}

	static void addNums(int i, int j, int k) {
		System.out.println(i + j + k);
	}

	static void addNums(int i, int j, int k, int l) {
		System.out.println(i + j + k + l);
	}

	static void addNums(int i, byte j) {
		System.out.println(i + j);
	}

	static void addNums(byte i, int j) {
		System.out.println(i + j);
	}

}

public class PolyDemo {

	public static void main(String[] args) {

		Calc.addNums(10, 20);
		Calc.addNums(10, 20, 30);
		Calc.addNums(10, 20, 30, 40);

	}
}
