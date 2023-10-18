package com.merc.demo.day2.col;

import java.util.ArrayList;
import java.util.List;

public class BlogDemo {

	public static void main(String[] args) {

		List<Blog> blogList = new ArrayList<>();
		System.out.println(blogList);
		System.out.println(blogList.size());

		blogList.add(new Blog(11, "Some Title", "Some body"));
		blogList.add(new Blog(12, "Some Title 2", "Some body 2"));
		blogList.add(new Blog(13, "Some Title 3", "Some body 3"));
		blogList.add(new Blog(14, "Some Title 4", "Some body 4"));
		System.out.println("Print all blog objects");

		for (Blog blog : blogList) {
			System.out.println(blog.toString());
		}

		System.out.println("Find blog based on blogId:");
		int blogIdToSearch = 13;
		for (Blog blog : blogList) {
			if (blog.blogId == blogIdToSearch)
				System.out.println(blog.toString());
		}

	}

}
