package com.class3;

public class IfSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=100;
		int num2=99;
		
		if (num1>num2) {
			System.out.println("Num1 is larger than num2");
		}else if(num1==num2) {
		System.out.println("Num1 is equal num2");
		}else {
			System.out.println("Num1 is smaller than Num2");
		}
		
		int day=5;
		
		if (day==1) {
			System.out.println("Today is Monday. I have to go to work");
		}else if (day==2) {
			System.out.println("Today is Tusday. I have SDLC class");
		}else if (day==3) {
			System.out.println("Today is Wednesday. I have Java Review class");
		}else if (day==4) {
			System.out.println("Todays is Thursday. I have SDLC Review class");
		}else if (day==5) {
			System.out.println("Today is Friday. Weekend is here");
		}else if (day==6) {
			System.out.println("I love saturday. My favorite coding day");
		}else if (day==7) {
			System.out.println("I love spending sundays at syntax");
			//cntrl+shift+f for windows
	}
}
}


