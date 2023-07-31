package com.cg.day06;

public class Finalvar {
	final int n=10;
	int m=20;
	void finvar() {
		m=25;
		System.out.println(n);//n is final but i am trying to change,so,the compilation error is occur
		System.out.println(m);
	}

	public static void main(String[] args) {
		Finalvar fn=new Finalvar();
		fn.finvar();

	}

}
