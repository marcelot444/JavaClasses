package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int time=8;
		if (time<12){// condtion is true
			System.out.println("Good Morning");
		}
			System.out.println("------------------------");
		while (time<12){// if condtion is true
			System.out.println("Good Morning");// code executes infinetly--> infinite loop
			time++;		
}
// I want to print good morning 5 times
		
		int i=0;
		
		while(i<=4) {
			System.out.println("Good afternoon");
			i++;

		}
			System.out.println("outside of the loop");
		
		
		
	}
}
