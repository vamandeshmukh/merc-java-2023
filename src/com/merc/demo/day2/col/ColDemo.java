package com.merc.demo.day2.col;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

// Collection framework in Java 
// Generics 

public class ColDemo {

	public static void main(String[] args) {

		int[] arr = { 22, 9, 31, 25 };
		
//		List<E>
//		Map<K, V>
//		Set<E>
//		Queue<E>
		
		List marksList = new ArrayList();
		marksList.add(10);
		marksList.add("abc");
		marksList.add(10.5);
		System.out.println(marksList);
		
	}

}
