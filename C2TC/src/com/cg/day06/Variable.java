package com.cg.day06;

public class Variable {
	String name;
	String rollno;
	static String clgname="ifet college of engineering";

	public Variable() {
		super();
		
	}

	public Variable(String name, String rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Variable [name=" + name + ", rollno=" + rollno + ",clgname="+ clgname +"]";
	}

	

	
	

}
