package com.merc.demo.day2.col;

public class Blog {

	private int blogId;
	private String title;
	private String body;

	public Blog() {
		super();
	}

	public Blog(int blogId, String title, String body) {
		super();
		this.blogId = blogId;
		this.title = title;
		this.body = body;
	}

	public int getBlogId() {
		return blogId;
	}

	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", title=" + title + ", body=" + body + "]";
	}

}
