package com.merc.demo.day4.misc;

import java.util.ArrayList;
import java.util.List;

import com.merc.demo.day2.col.Blog;

public class LimitSkipDemo {

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();

		blogList.add(new Blog(22, "Abc", "Xre qwer"));
		blogList.add(new Blog(11, "Pqr", "Lash anlhf"));
		blogList.add(new Blog(31, "Ijk", "Poer adlre"));
		blogList.add(new Blog(25, "Def", "Swq asdf"));

		System.out.println("limit");
		blogList.stream().limit(2).forEach(b -> System.out.println(b));

		System.out.println("skip");
		blogList.stream().skip(2).forEach(b -> System.out.println(b));

		System.out.println("skip + limit");
		blogList.stream().skip(1).limit(2).forEach(b -> System.out.println(b));

	}

}
