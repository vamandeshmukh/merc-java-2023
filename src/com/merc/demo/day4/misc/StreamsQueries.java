package com.merc.demo.day4.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.merc.demo.day2.col.Blog;

public class StreamsQueries {

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();

		blogList.add(new Blog(22, "Abc", "Xre qwer"));
		blogList.add(new Blog(11, "Pqr", "Lash anlhf"));
		blogList.add(new Blog(31, "Ijk", "Poer adlre"));
		blogList.add(new Blog(25, "Def", "Swq asdf"));

		// traverse -- iterate
//		blogList.forEach(blog -> System.out.println(blog));

		blogList.stream().flatMap(Stream::of).collect(Collectors.toList()).forEach(System.out::println);

	}

}
