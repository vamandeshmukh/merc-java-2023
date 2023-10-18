package com.merc.demo.day2.col;

public class Blog {

	int blogId;
	String title;
	String body;

	public Blog() {
		super();
	}

	public Blog(int blogId, String title, String body) {
		super();
		this.blogId = blogId;
		this.title = title;
		this.body = body;
	}

	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", title=" + title + ", body=" + body + "]";
	}

}
