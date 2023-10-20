package com.merc.demo.day4.labs;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*
Exercise 9: Create a method to accept date and print the duration 
in days, months and years with regards to current system date.
*/
public class DateDemo {

	static void findDuration(String inputDate) {

		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate anotherDate = LocalDate.parse(inputDate, formatter);
		Period duration = Period.between(anotherDate, currentDate);

		int years = duration.getYears();
		int months = duration.getMonths();
		int days = duration.getDays();
		System.out.println(years + " " + months + " " + days);

	}

	public static void main(String[] args) {

		String inputDate = "1947-08-15";
		String outputDuration = "";
		System.out.println(outputDuration);

		DateDemo.findDuration(inputDate);

	}

}
