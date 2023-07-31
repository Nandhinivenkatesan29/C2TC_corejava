package com.cg.day02;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks: ");
		int m=sc.nextInt();
		if(m<50) {
			System.out.println("fail");
		}
		else if(m>=50&&m<60) {
			System.out.println("D grade");
		}
		else if(m>=60&&m<70) {
			System.out.println("c grade");
		}
		else if(m>=70&&m<80) {
			System.out.println("b grade");
		}
		else if(m>=80&&m<90) {
			System.out.println("a grade");
		}
		else if(m>=90&&m<=100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("invalid");
		}

	}

}
