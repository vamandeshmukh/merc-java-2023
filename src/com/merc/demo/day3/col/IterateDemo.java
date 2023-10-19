package com.merc.demo.day3.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.merc.demo.day2.col.Blog;

public class IterateDemo {

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();

		blogList.add(new Blog(11, "Abc", "Abc abc"));
		blogList.add(new Blog(12, "Def", "Def def"));
		blogList.add(new Blog(13, "Ghi", "Ghi ghi"));

//		for (Blog b : blogList)
//			System.out.println(b.toString());

		Iterator<Blog> iterator = blogList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
