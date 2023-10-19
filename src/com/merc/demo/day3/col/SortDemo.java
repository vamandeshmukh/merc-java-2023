package com.merc.demo.day3.col;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import com.merc.demo.day2.col.Blog;

public class SortDemo {

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();

		blogList.add(new Blog(11, "Abc", "Abc abc"));
		blogList.add(new Blog(12, "Def", "Def def"));
		blogList.add(new Blog(13, "Ghi", "Ghi ghi"));
		
		System.out.println(blogList);
		
//		Collections.sort(null); // self learning 		
//		TreeSet<Blog> obj; // self learning 

	}

}
