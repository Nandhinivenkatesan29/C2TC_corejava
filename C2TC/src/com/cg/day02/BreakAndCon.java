package com.cg.day02;

public class BreakAndCon {

	public static void main(String[] args) {
		System.out.println("...........break.................");
		for(int i=0;i<50;i++) {
			if(i==25) {
				break;
			}
			System.out.println(i);
		}
		System.out.println(".............continue............");
		for(int j=0;j<=50;j++) {
			if(j==40) {
				continue;
			}
			System.out.println(j);
		}

	}

}
