package com.merc.demo.day3.thrd;

public class Calc extends Thread {
//public class Calc implements Runnable {

	@Override
	public void run() {
		printNums();
	}

	public void printNums() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}

//package com.merc.demo.day3.thrd;
//
//public class Calc {
//
//	public void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//	}
//}
