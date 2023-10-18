package com.merc.demo.day2.col;

import java.util.ArrayList;
import java.util.List;

public class GenDemo {

	public static void main(String[] args) {

		// collection without generics
//		List marksList = new ArrayList();

		// collection with generics
		List<Integer> marksList = new ArrayList<>();

//		marksList.add("abc"); // CE
//		marksList.add(10.5); // CE

		System.out.println(marksList.size());
		marksList.add(10);
		marksList.add(12);
		marksList.add(11);
		marksList.add(16);
		marksList.add(15);
		System.out.println(marksList);
		System.out.println(marksList.size());
		marksList.remove(0);
		System.out.println(marksList);
		System.out.println(marksList.size());
		marksList.add(1, 11);
		System.out.println(marksList);
		System.out.println(marksList.size());

		List<Integer> marksList2 = new ArrayList<>();

		marksList2.add(22);
		marksList2.add(25);
		marksList2.add(21);

		marksList.addAll(marksList2);
		System.out.println(marksList);
		System.out.println(marksList.size());
	}

}
