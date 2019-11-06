package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
	
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		// if traffic--> late, else --> on time
		if (!traffic) { // using ! we are reverting condition
			System.out.println("On time");
		}else {
			System.out.println("Late");
		}
		
		boolean isRain=true;
		
		if (!isRain) {
			System.out.println("Take umbrella");
		}else {
			System.out.println("");
		}
		
		//lets compare 2 numbers using NOT operators
		int num1=10;
		int num2=10;
		
		if (num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		
		if (!(num1==2)) {
			System.out.println("Numbers are NOT equal");
		}else {
			System.out.println("Numbers are equal");
		}
		//if name is not marry or anna then you are not my sister		
		String name="Mary";
		String name2="Anna";
		
		if (!(name.equals("Mary") || name.equals("Anna"))) {
			System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
		}
	

	}

}
