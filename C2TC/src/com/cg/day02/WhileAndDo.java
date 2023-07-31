package com.cg.day02;

public class WhileAndDo {

	public static void main(String args[]) {
		int i=0,n=10;
		System.out.println("while");
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		System.out.println("do while");
		int j=0;
		do {
			System.out.println(j);
			j++;
		}
		while(j<=n);
	}

}
