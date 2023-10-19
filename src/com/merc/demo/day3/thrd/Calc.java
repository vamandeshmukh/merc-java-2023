package com.merc.demo.day3.thrd;

public class Calc extends Thread {
//public class Calc implements Runnable {

	private String select;

	public Calc() {
		super();
	}

	public Calc(String select) {
		super();
		this.select = select;
	}

	@Override
	public void run() {
		if (select != null && select.equals("one"))
			printNums();
		else
			printNumsReverse();
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

	public void printNumsReverse() {
		for (int i = 10; i >= 1; i--) {
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
//public class Calc extends Thread {
////public class Calc implements Runnable {
//
//	@Override
//	public void run() {
//		printNums();
//	}
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
