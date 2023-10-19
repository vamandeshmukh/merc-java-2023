package com.merc.demo.day3.misc;

import java.util.logging.Logger;

class NotEligibleException extends RuntimeException { // to create an unchecked exception
//class NotEligibleException extends Exception {  // to create a checked exception 

	private static final long serialVersionUID = -2759888481217562106L;

	public NotEligibleException() {
		super();
	}

	public NotEligibleException(String message) {
		super(message);
	}
}

public class LoggingDemo {
	
	private static final Logger LOG = Logger.getLogger(LoggingDemo.class.getName());

	static void checkAge(int age) throws NotEligibleException {
		if (age >= 18) {
			LOG.info("All is well!");
			System.out.println("Drive cars");
		} else {
			LOG.warning("Something is not right!");
			throw new NotEligibleException("You can not drive!");
		}
	}

	public static void main(String[] args) {

		LoggingDemo.checkAge(18);

//		try {
//			LoggingDemo.checkAge(17);
//		} catch (RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
	}
}
