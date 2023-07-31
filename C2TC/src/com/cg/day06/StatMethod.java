package com.cg.day06;

public class StatMethod {
	static int n=20;
	int m=30;
	void doMethod() {
		System.out.println(m);
		System.out.println(n);
	}
	static void Methodnmae() {
		System.out.println(n);
	}

	public static void main(String[] args) {
		StatMethod obj=new StatMethod();
		obj.Methodnmae();
		obj.doMethod();

	}

}
