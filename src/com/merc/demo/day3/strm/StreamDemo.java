package com.merc.demo.day3.strm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.merc.demo.day2.col.Blog;

public class StreamDemo {

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();

		blogList.add(new Blog(22, "Abc", "Xre qwer"));
		blogList.add(new Blog(11, "Def", "Lash anlhf"));
		blogList.add(new Blog(31, "Ghi", "Poer adlre"));
		blogList.add(new Blog(25, "Sew", "Swq asdf"));

		System.out.println("Iterate list elements using for each loop:");
		for (Blog blog : blogList)
			System.out.println(blog.toString());

		System.out.println("Iterate list elements using forEach method:");
		blogList.forEach((blog) -> {
			System.out.println(blog.toString());
		});

		System.out.println("Convert a Collection object to Stream object:");
		Stream<Blog> blogStream = blogList.stream();

//		System.out.println("Convert Stream object to Collection object:");
//		blogStream.collect(Collectors.toList());

//		blogStream.filter((blog) -> {
//			return blog.getBlogId() > 20;
//		});

		System.out.println("Filter the blogs with id > 20:");
//		Stream<Blog> selectedBlogs = blogStream.filter(blog -> blog.getBlogId() > 20);
//		selectedBlogs.forEach(b -> System.out.println(b.toString()));

		blogStream.filter(blog -> blog.getBlogId() > 20).forEach(b -> System.out.println(b.toString()));

		System.out.println("self learning : use skip, limit methods");

		System.out.println("Make the blog title in uppercase:");

		blogList // get collection object
				.stream() // convert to stream
				.map(blog -> blog.getTitle().toUpperCase()) // apply necessary functionality
				.collect(Collectors.toList()) // convert to collection
				.forEach(blg -> System.out.println(blg.toString())); // process the output
	}

}

