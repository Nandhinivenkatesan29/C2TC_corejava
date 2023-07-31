package com.cg.day02;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		System.out.println("enter your weight: ");
		int weight=sc.nextInt();
		if(age<=18) {
			if(weight<75)
			System.out.println("your health is stable");
		}
		else{
			System.out.println("your health is unstable");
		}
	}

}
