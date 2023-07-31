package com.cg.day02;

public class NestedFor {

	public static void main(String[] args) {
		System.out.println("printing number");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println("printing pyramid");
        for(int x=1;x<=5;x++)
        {
      	  for(int y=1;y<=x;y++) {
      		  System.out.print("* ");
      	  }
      	  System.out.println();
        }
        System.out.println("printing number in pyramid");
        for(int b=1;b<=5;b++)
        {
      	  for(int c=1;c<=b;c++) {
      		  System.out.print(c+" ");
      	  }
      	  System.out.println();
        }

	}

}
