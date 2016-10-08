package com.po;

public class Author {
	private String authorid;
	private String name;
	private int age;
	private String country;
	public String getAuthorid() {
		return authorid;
	}
	public void setAuthorid(String authorid) {
		this.authorid = authorid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", name=" + name + ", age=" + age + ", country=" + country + "]";
	}
}
