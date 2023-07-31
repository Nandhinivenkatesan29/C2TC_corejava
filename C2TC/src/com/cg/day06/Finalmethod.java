package com.cg.day06;

public class Finalmethod {
			final void myclass() {
				System.out.println("hi...");
			
		}
		}
		class Mainclass//if we make a base class as final then it will be not extended 
		{

			public static void main(String[] args) {
				Finalclass n=new Finalclass();
				n.myclass();
				
			}

	}

}
