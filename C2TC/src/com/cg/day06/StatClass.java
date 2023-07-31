package com.cg.day06;

public class StatClass {
     static String s="helloJava...";
	
	static class Staticclass {
		
	public  void dis1() {
		System.out.println(s);
	}
	}

	public static void main(String[] args) {
        StatClass.Staticclass sd=new StatClass.Staticclass();
        sd.dis1();        

	}
}
