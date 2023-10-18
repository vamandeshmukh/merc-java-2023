package com.merc.demo.day2.col;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();

		System.out.println(set.size());
		set.add(25);
		set.add(22);
		set.add(31);
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		

	}

}
