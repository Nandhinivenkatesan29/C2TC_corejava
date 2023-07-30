package com.cg.day01;

import java.util.Arrays;

public class Character {

	public static void main(String[] args) {
         char a='a';
         char ch1=102;
         char ch2=78;
         int num=97;
         char char1=(char)(num+2);
         char c1='\u0069';
         char c2='\u0076';
         String str="hellojava";
         char[] ch=str.toCharArray();
         System.out.println("charValue="+a+",char of ch1="+ch1+",char of ch2="+ch2+",character="+char1+",c1="+c1+",c2="+c2);
         System.out.println("string to char="+Arrays.toString(ch));
		

	}

}
