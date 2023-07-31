package com.cg.day02;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER(10-50):");
		int a=sc.nextInt();
		switch(a){
		   case 10:
				System.out.println("work hard");
		   case 20:
			   System.out.println("work smart");
		   case 30:
			   System.out.println("be positive");
		   case 40:
			   System.out.println("be strong");
		   case 50:
			   System.out.println("don't beleive others");
		}

	}

}
