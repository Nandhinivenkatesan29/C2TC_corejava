package com.cg.day04;

public class Student {
	private String name;
	private int age;
	private String clgname;
	private String dept;
	public Student(){
		super();
	}
	public Student(String name, int age, String clgname, String dept) {
		super();
		this.name = name;
		this.age = age;
		this.clgname = clgname;
		this.dept = dept;
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
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", clgname=" + clgname + ", dept=" + dept + "]";
	}
	}
	
	

