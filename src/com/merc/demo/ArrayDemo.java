package com.merc.demo;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] arr = { 63, 31, 81, 22, 40, 77, 95 };

//		System.out.println(arr[3]);
//		System.out.println(arr);

		System.out.println("Print array elements using for loop - ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Print array elements using for each loop - ");
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
