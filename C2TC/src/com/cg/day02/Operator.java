package com.cg.day02;

public class Operator {

	public static void main(String[] args) {
		int a=56;
		int b=45;
		int f=34;
		int c=-98;
		boolean d=false;
		boolean e=true;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println("mod="+a%b);
		System.out.println("div="+a/b);
		System.out.println(a*b);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a++ + b++);
		System.out.println(a++ + ++a);
		System.out.println(b++ - ++b);
		System.out.println(++a + ++b);
		System.out.println(!d);
		System.out.println(e);
		System.out.println(~c);
		System.out.println(66+87*34%21-65/31);
		System.out.println(22<<4);
		System.out.println(22>>4);
		System.out.println(22>>>4);
		System.out.println(-86<<2);
		System.out.println(-86>>2);
		System.out.println(a<b&&b>c);
		System.out.println(c<a||a>b);
		int min=(a>b)?a:b;
		System.out.println(min);
		a+=5;
        System.out.println(a);
		
		
		

	}

}
