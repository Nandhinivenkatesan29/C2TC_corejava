package com.cg.day02;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		System.out.println("using number");
		int arr[]= {60,30,50,70,10,20,40};
		for(int i:arr) {
			System.out.print(i+" ");
			
		}
		System.out.println("using string");
		ArrayList<String>list=new ArrayList<String>();
		list.add("soona");
		list.add("pauna");
		list.add("thana");
		for(String s:list) {
			System.out.println(s);
		}

	}

}
