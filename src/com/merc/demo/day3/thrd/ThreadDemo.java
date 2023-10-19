package com.merc.demo.day3.thrd;

public class ThreadDemo {

	// process - main app process
	// thread - sub process within a process

	public static void main(String[] args) throws InterruptedException {

		Calc calc = new Calc();
		calc.start();
//		calc.join();
		Calc calc2 = new Calc();
		calc2.start();
		Calc calc3 = new Calc();
		calc3.start();
		

	}
}

//package com.merc.demo.day3.thrd;
//
//public class ThreadDemo {
//
//	// process - main app process
//	// thread - sub process within a process
//
//	public static void main(String[] args) {
//
//		Calc calc = new Calc();
//		calc.printNums();
//		Calc calc2 = new Calc();
//		calc2.printNums();
//
//	}
//}
