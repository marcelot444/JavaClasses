package com.class5;

public class Prompt {

	public static void main(String[] args) {
		
		int day = 1;
		
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a Weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a Weekend");
		}else {
			System.out.println("Day is invalid");
		}

	}

}
