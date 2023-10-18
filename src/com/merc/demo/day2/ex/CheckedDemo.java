package com.merc.demo.day2.ex;

public class CheckedDemo {

//	static void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//			System.out.println(i);
//		}
//	}

//	public static void main(String[] args) {
//		System.out.println("Start");
//		CheckedDemo.printNums();
//		System.out.println("End");
//	}

	static void printNums() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			CheckedDemo.printNums();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}

}
